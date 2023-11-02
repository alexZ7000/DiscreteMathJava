package DiscreteMath;


import java.util.ArrayList;
import java.util.Arrays;

public class Operations {
    private final StringBuilder letrasEncontradas = new StringBuilder();
    private final StringBuilder vAndF = new StringBuilder();
    private final StringBuilder title = new StringBuilder();
    private final ArrayList<String> logicalOperators = new ArrayList<>(Arrays.asList("∧", "∨", "¬", "⊕", "→", "↔", "⇒", "⇔", "≡", "(", ")"));
    private final Interface instanceInterface;

    public Operations(Interface instanciaInterface) {
        this.instanceInterface = instanciaInterface;
    }

    private void calculateNumberOfLines(final String characters, final ArrayList<String> arrayCharacters) {
        int lines = 0;
        letrasEncontradas.setLength(0);
        for (int i = 0; i < characters.length(); i++) {
            char c = characters.charAt(i);
            if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                if (!(letrasEncontradas.toString()).contains(String.valueOf(c))) {
                    letrasEncontradas.append(c);
                    lines++;
                }
            }
        }

        if (lines == 1){
            lines = 2;
        }
        else if (lines == 2) {
            lines = 4;
        }
        else if (lines == 3) {
            lines = 8;
        }
        else if (lines == 4) {
            lines = 16;
        }
        detectLogicalOperator(arrayCharacters, letrasEncontradas);
        TitleConstructor(letrasEncontradas, lines, vAndF);
    }

    private void TitleConstructor(final StringBuilder letras, final int lines, final StringBuilder vAndF){
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

    public void resultOperation(final String characters, final ArrayList<String> arrayCharacters) {
        final String strCaracters = (characters.substring(1, characters.length() - 1)).replaceAll(",", "");
        calculateNumberOfLines(strCaracters, arrayCharacters);
    }

    private void detectLogicalOperator(final ArrayList<String> arrayCharacters, final StringBuilder letrasEncontradas){
        vAndF.setLength(0);
        for (String c : arrayCharacters) {
            if (logicalOperators.contains(c)) {
                System.out.println("O caractere " + c + " foi encontrado no ArrayList lgc.");
                //TODO: Adicionar a tabela da operação, a tabela das respostas (assim será possivel calcular a negação de P por exemplo)
                //TODO: Fazer a lógica de contagem binária reversa
            }
            simpleProposition(letrasEncontradas);
            return;
        }
    }

    private void simpleProposition(final StringBuilder characters) {
        int numberOfPropositions = characters.length();
        if (numberOfPropositions == 1){
            vAndF.append("""
                            <tr>
                                <td>V</td>
                            </tr>
                            <tr>
                                <td>F</td>
                            </tr>
                    """);
        }
    }
}