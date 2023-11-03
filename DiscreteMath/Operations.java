package DiscreteMath;


import java.util.ArrayList;
import java.util.Arrays;

public class Operations {
    private final StringBuilder letrasEncontradas = new StringBuilder();
    private final StringBuilder vAndF = new StringBuilder();
    private final StringBuilder title = new StringBuilder();
    private final ArrayList<String> logicalOperators = new ArrayList<>(Arrays.asList("∧", "∨", "¬", "⊕", "→", "↔", "⇒", "⇔", "≡", "(", ")"));
    private final Interface instanceInterface;
    private final ArrayList<Integer> binariesColumnOne = new ArrayList<>();
    private final ArrayList<Integer> binariesColumnTwo = new ArrayList<>();
    private final ArrayList<Integer> binariesColumnThree = new ArrayList<>();
    private final ArrayList<Integer> binariesColumnFour = new ArrayList<>();

    public Operations(Interface instanciaInterface) {
        this.instanceInterface = instanciaInterface;
    }

    private void calculateNumberOfLines(final String characters) {
        letrasEncontradas.setLength(0);
        for (int i = 0; i < characters.length(); i++) {
            char c = characters.charAt(i);
            if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                if (!(letrasEncontradas.toString()).contains(String.valueOf(c))) {
                    letrasEncontradas.append(c);
                }
            }
        }
        if (letrasEncontradas.length() == 1){
            clearAllBinariesColumns();
            getBinariesColumnOne(2);
        }
        else if (letrasEncontradas.length() == 2){
            //00
            clearAllBinariesColumns();
            getBinariesColumnOne(4);
            getBinariesColumnTwo(4);
        }
        else if (letrasEncontradas.length() == 3) {
            //000
            clearAllBinariesColumns();
            getBinariesColumnOne(8);
            getBinariesColumnTwo(8);
            getBinariesColumnThree(8);
        }
        else if (letrasEncontradas.length() == 4) {
            //0000
            clearAllBinariesColumns();
            getBinariesColumnOne(16);
            getBinariesColumnTwo(16);
            getBinariesColumnThree(16);
            getBinariesColumnFour();
        }
        convertBinariesToTrueOrFalse(binariesColumnOne, binariesColumnTwo, binariesColumnThree, binariesColumnFour);
        System.out.println(vAndF);
        TitleConstructor(letrasEncontradas, vAndF);
    }

    private void convertBinariesToTrueOrFalse(ArrayList<Integer> binariesColumnOne, ArrayList<Integer> binariesColumnTwo, ArrayList<Integer> binariesColumnThree, ArrayList<Integer> binariesColumnFour) {
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

    private void getBinariesColumnOne(int quantityOfBinaries) {
        for (int i = 0; i < quantityOfBinaries; ++i) {
            if (i >= quantityOfBinaries / 2) binariesColumnOne.add(0);
            else binariesColumnOne.add(1);
        }
        System.out.println("1:" + binariesColumnOne);
    }

    private void getBinariesColumnTwo(int quantityOfBinaries) {
        for (int i = 0; i < quantityOfBinaries; i++) {
            if (i >= quantityOfBinaries / 2) binariesColumnTwo.add(1);
            else binariesColumnTwo.add(0);
        }
        System.out.println("2:" + binariesColumnTwo);
    }

    private void getBinariesColumnThree(int quantityOfBinaries) {
        for (int i = 0; i < quantityOfBinaries / 4; i++) {
            binariesColumnThree.add(1);
            binariesColumnThree.add(1);
            binariesColumnThree.add(0);
            binariesColumnThree.add(0);
        }
        System.out.println("3:" + binariesColumnThree);
    }

    private void getBinariesColumnFour() {
        for (int i = 1; i <= 8; i++) {
            binariesColumnFour.add(1);
            binariesColumnFour.add(0);
        }
        System.out.println("4:" + binariesColumnFour);
    }

    private void clearAllBinariesColumns() {
        binariesColumnOne.clear();
        binariesColumnTwo.clear();
        binariesColumnThree.clear();
        binariesColumnFour.clear();
    }

    private void TitleConstructor(final StringBuilder letras, final StringBuilder vAndF){
        title.setLength(0);
        title.append("<tr>");
        for (int j = 0; j < letras.length(); j++) {
            char l = letras.charAt(j);
            title.append("<th>").append(l).append("</th>");
        }
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
        instanceInterface.showCalculationInInterface(htmlTable);
        //TODO: Arrumar a tabela que só exibe suas letras e não exibe a operação
        // O alinhamento da tabela é sempre a esquerda, o alinhamento do titulo é sempre ao centro
        //thead, tbody e tfoot
    }

    public void resultOperation(final String characters) {
        final String strCaracters = (characters.substring(1, characters.length() - 1)).replaceAll(",", "");
        calculateNumberOfLines(strCaracters);
    }
}