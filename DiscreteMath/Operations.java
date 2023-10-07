package DiscreteMath;


import java.util.HashSet;
import java.util.Set;

public class Operations {
    private final Interface interface1;

    public Operations(Interface instanciaClasseA) {
        this.interface1 = instanciaClasseA;
    }

    private void numberOfLines(final String characters) {
        int lines = 0;
        // Criar um conjunto vazio
        StringBuilder letrasEncontradas = new StringBuilder();
        for (int i = 0; i < characters.length(); i++) {
            // Obter o caractere na posição i
            char c = characters.charAt(i);
            // Verificar se o caractere é P, Q, R ou S
            if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                // Verificar se o caractere já está no conjunto
                if (!(letrasEncontradas.toString()).contains(String.valueOf(c))) {
                    // Se não estiver, adicionar ao conjunto e incrementar a contagem
                    letrasEncontradas.append(c);
                    lines++;
                }
            }
        }

        if (lines == 1)
            lines = 2;
        else if (lines == 2)
            lines = 4;
        else if (lines == 3)
            lines = 8;
        else if (lines == 4)
            lines = 16;
        System.out.println("\n" + lines);
        TitleConstructor(letrasEncontradas, lines);
    }

    private void TitleConstructor(final StringBuilder letras, final int lines) {
        StringBuilder title = new StringBuilder();
        for (int j = 0; j < letras.length(); j++) {
            // Obter a letra na posição j
            char l = letras.charAt(j);
            // Concatenar os title "<th>"+letra+"</th>" e adicionar ao StringBuilder title
            title.append("<th>").append(l).append("</th>");
        }
        TableConstructor(title);
    }

    private void TableConstructor(final StringBuilder title){
        final String htmlText = """
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
                          th, td {
                              padding: 10px;
                          }
                      </style>
                  </head>
                  <body>
                      <table>
                 """ + title + // td table data (colunas), tr table row (linhas), th table head (cabeçalho da tabela)
                "</table></body></html> ";
        interface1.exibirCalculoDaInterface(htmlText);
        //TODO: Arrumar a tabela que só exibe suas letras e não exibe a operação
        // O alinhamento da tabela é sempre a esquerda, o alinhamento do titulo é sempre ao centro
        //thead, tbody e tfoot
    }

    public void resultOperation(final String characters){
        final String strCaracters = (characters.substring(1, characters.length() - 1)).replaceAll(",", "");
        System.out.print(strCaracters);
        numberOfLines(strCaracters);
    }
}
