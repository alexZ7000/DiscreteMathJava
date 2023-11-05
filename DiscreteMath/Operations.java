package DiscreteMath;

import java.util.ArrayList;
import java.util.Arrays;


public class Operations {
    private final StringBuilder letrasEncontradas = new StringBuilder();
    private final StringBuilder negacoesEncontradas = new StringBuilder();
    private final StringBuilder vAndF = new StringBuilder();
    private final StringBuilder title = new StringBuilder();

    boolean isSinglePropositon = false;
    private final ArrayList<String> logicalOperators = new ArrayList<>(Arrays.asList("∧", "∨", "¬", "⊕", "→", "↔", "⇒", "⇔", "≡", "(", ")"));
    private final ArrayList<Integer> binariesColumnOne = new ArrayList<>();
    private final ArrayList<Integer> binariesColumnTwo = new ArrayList<>();
    private final ArrayList<Integer> binariesColumnThree = new ArrayList<>();
    private final ArrayList<Integer> binariesColumnFour = new ArrayList<>();
    private final Calculation calculation = new Calculation(
            binariesColumnOne,
            binariesColumnTwo,
            binariesColumnThree,
            binariesColumnFour,
            vAndF
    );
    private final MainScreen instanceMainScreen;

    public Operations(MainScreen instanciaMainScreen) {
        this.instanceMainScreen = instanciaMainScreen;
    }

    private void calculateNumberOfPrepositions(final String characters, final String entireOperationCharacters) {
        letrasEncontradas.setLength(0);
        boolean isNegation = false;
        for (int i = 0; i < characters.length(); i++) {
            char c = characters.charAt(i);
            if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                if (!(letrasEncontradas.toString()).contains(String.valueOf(c))) {
                    letrasEncontradas.append(c);
                }
            }
        }
        getAllBinariesColumns(characters, isNegation);
        calculation.detectLogicalOperators(entireOperationCharacters, logicalOperators);
        TitleConstructor(letrasEncontradas, vAndF, entireOperationCharacters, isSinglePropositon);
    }

    private void getAllBinariesColumns(final String characters, boolean isNegation) {
        if (this.letrasEncontradas.length() == 1){
            if (characters.contains("¬")) isNegation = true;
            calculation.clearAllBinariesColumns();
            calculation.getBinariesColumnOne(2, isNegation);
            isSinglePropositon = true;
        }
        else if (this.letrasEncontradas.length() == 2){
            //00
            calculation.clearAllBinariesColumns();
            calculation.getBinariesColumnOne(4, false);
            calculation.getBinariesColumnTwo(4);
        }
        else if (this.letrasEncontradas.length() == 3) {
            //000
            calculation.clearAllBinariesColumns();
            calculation.getBinariesColumnOne(8, false);
            calculation.getBinariesColumnTwo(8);
            calculation.getBinariesColumnThree(8);
        }
        else if (this.letrasEncontradas.length() == 4) {
            //0000
            calculation.clearAllBinariesColumns();
            calculation.getBinariesColumnOne(16, false);
            calculation.getBinariesColumnTwo(16);
            calculation.getBinariesColumnThree(16);
            calculation.getBinariesColumnFour();
        }
        calculation.convertBinariesToTrueOrFalse();
    }

    private void TitleConstructor(final StringBuilder letras, final StringBuilder vAndF, final String entireOperationCharacters, final boolean isSingleProposition){
        title.setLength(0);
        title.append("<tr>");
        for (int j = 0; j < letras.length(); j++) {
            char l = letras.charAt(j);
            title.append("<th>").append(l).append("</th>");
        }
        if (!(isSingleProposition)) title.append("<th>").append(entireOperationCharacters).append("</th>");
        title.append("</tr>");
        title.append(vAndF);
        // TODO: Melhorar a lógica de adicionar V e F na tabela
        TableConstructor(title);
    }

    private void TableConstructor(final StringBuilder title){
        final String htmlTable = """
                <html>
                  <head>
                      <style>
                          table {
                              border-collapse: collapse;
                          }
                          table, th, td {
                              border: 1px solid black;
                              text-align: center;
                          }
                          th, td, tr {
                              padding: 10px;
                          }
                      </style>
                  </head>
                  <body>
                      <table>
                 """ + title +// td table data (colunas), tr table row (linhas), th table head (cabeçalho da tabela)
                "</table></body></html> ";
        instanceMainScreen.showCalculationInInterface(htmlTable);
        //TODO: Arrumar a tabela que só exibe suas letras e não exibe a operação
        // O alinhamento da tabela é sempre a esquerda, o alinhamento do titulo é sempre ao centro
        //thead, tbody e tfoot
    }

    public void resultOperation(final String characters) {
        final String strCharacters = (characters.substring(1, characters.length() - 1)).replaceAll(",", "");
        final String entireOperationCharacters = (characters.substring(1, characters.length() - 1).replaceAll(",", " "));
        calculateNumberOfPrepositions(strCharacters, entireOperationCharacters);
    }
}


class Calculation {

    private final ArrayList<Integer> binariesColumnOne;
    private final ArrayList<Integer> binariesColumnTwo;
    private final ArrayList<Integer> binariesColumnThree;
    private final ArrayList<Integer> binariesColumnFour;
    private final StringBuilder vAndF;

    public Calculation(
            final ArrayList<Integer> binariesColumnOne,
            final ArrayList<Integer> binariesColumnTwo,
            final ArrayList<Integer> binariesColumnThree,
            final ArrayList<Integer> binariesColumnFour,
            final StringBuilder vAndF
    ) {
        this.binariesColumnOne = binariesColumnOne;
        this.binariesColumnTwo = binariesColumnTwo;
        this.binariesColumnThree = binariesColumnThree;
        this.binariesColumnFour = binariesColumnFour;
        this.vAndF = vAndF;
    }

    public void convertBinariesToTrueOrFalse() {
        vAndF.setLength(0);
        for (int i = 0; i < binariesColumnOne.size(); i++) {
            if (binariesColumnOne.get(i) == 1) vAndF.append("<tr><td>V</td>");
            else vAndF.append("<tr><td>F</td>");
            if (!binariesColumnTwo.isEmpty()) {
                if (binariesColumnTwo.get(i) == 1) vAndF.append("<td>V</td>");
                else vAndF.append("<td>F</td>");
            }
            if (!binariesColumnThree.isEmpty()) {
                if (binariesColumnThree.get(i) == 1) vAndF.append("<td>V</td>");
                else vAndF.append("<td>F</td>");
            }
            if (!binariesColumnFour.isEmpty()) {
                if (binariesColumnFour.get(i) == 1) vAndF.append("<td>V</td>");
                else vAndF.append("<td>F</td>");
            }
            vAndF.append("</tr>");
        }
    }

    public void getBinariesColumnOne(final int quantityOfBinaries, boolean isNegation) {
        if (isNegation){
            for (int i = 0; i < quantityOfBinaries; ++i) {
                if (i >= quantityOfBinaries / 2) binariesColumnOne.add(1);
                else binariesColumnOne.add(0);
            }
        }
        else {
            for (int i = 0; i < quantityOfBinaries; ++i) {
                if (i >= quantityOfBinaries / 2) binariesColumnOne.add(0);
                else binariesColumnOne.add(1);
            }
        }
        System.out.println("1:" + binariesColumnOne);
    }

    public void getBinariesColumnTwo(final int quantityOfBinaries) {
        for (int i = 0; i < quantityOfBinaries; i++) {
            if (i >= quantityOfBinaries / 2) binariesColumnTwo.add(1);
            else binariesColumnTwo.add(0);
        }
        System.out.println("2:" + binariesColumnTwo);
    }

    public void getBinariesColumnThree(final int quantityOfBinaries) {
        for (int i = 0; i < quantityOfBinaries / 4; i++) {
            binariesColumnThree.add(1);
            binariesColumnThree.add(1);
            binariesColumnThree.add(0);
            binariesColumnThree.add(0);
        }
        System.out.println("3:" + binariesColumnThree);
    }

    public void getBinariesColumnFour() {
        for (int i = 1; i <= 8; i++) {
            binariesColumnFour.add(1);
            binariesColumnFour.add(0);
        }
        System.out.println("4:" + binariesColumnFour);
    }

    public void clearAllBinariesColumns() {
        binariesColumnOne.clear();
        binariesColumnTwo.clear();
        binariesColumnThree.clear();
        binariesColumnFour.clear();
    }

    public void detectLogicalOperators(final String entireOperationCharacters, final ArrayList<String> logicalOperators) {
        for (int i = 0; i < entireOperationCharacters.length(); i++) {
            char c = entireOperationCharacters.charAt(i);
            if (logicalOperators.contains(String.valueOf(c))) {
                if (c == '(') parenthesisMethod(entireOperationCharacters);
                else if (c == '∧') conjunction(entireOperationCharacters);
                else if (c == '∨') disjunction(entireOperationCharacters);
                else if (c == '⊕') exclusiveDisjunction(entireOperationCharacters);
                else if (c == '→') conditional(entireOperationCharacters);
                else if (c == '↔') biconditional(entireOperationCharacters);
                else if (c == '⇒') materialConditional(entireOperationCharacters);
                else if (c == '⇔') materialBiconditional(entireOperationCharacters);
                else if (c == '≡') equivalence(entireOperationCharacters);
            }
        }
    }

    private void conjunction(final String entireOperationCharacters) {
        System.out.println("Conjunção");
    }

    private void disjunction(final String entireOperationCharacters) {
        System.out.println("Disjunção");
    }

    private void exclusiveDisjunction(final String entireOperationCharacters) {
        System.out.println("Disjunção Exclusiva");
    }

    private void conditional(final String entireOperationCharacters) {
        System.out.println("Condicional");
    }

    private void biconditional(final String entireOperationCharacters) {
        System.out.println("Bicondicional");
    }

    private void materialConditional(final String entireOperationCharacters) {
        System.out.println("Condicional Material");
    }

    private void materialBiconditional(final String entireOperationCharacters) {
        System.out.println("Bicondicional Material");
    }

    private void equivalence(final String entireOperationCharacters) {
        System.out.println("Equivalência");
    }

    private void parenthesisMethod(final String entireOperationCharacters) {
        System.out.println("Parênteses Aberto");
    }

    private void negation(final String entireOperationCharacters) {
        System.out.println("Negação");
    }
}
