package DiscreteMath;

import java.util.ArrayList;
import java.util.Arrays;

public class Operations {
    public void numberOfLines(String characters) {
        int lines = 0;
        String title = null, expression = null;
        for (int i = 0; i < characters.length(); i++) {
            if (
                    characters.charAt(i) == 'P' ||
                    characters.charAt(i) == 'Q' ||
                    characters.charAt(i) == 'R' ||
                    characters.charAt(i) == 'S' ||
                    characters.charAt(i) == 'T'
            ) {
                title = "<th>" + characters.charAt(i) + "</th>";
                expression = "<td>" + characters + "</td>";
                lines++;
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
        else{
            System.out.println("Erro");
        }
        TitleConstructor(lines, title, expression);
    }

    public String TitleConstructor(int lines, String title, String expression) {
        String title1 = "<h1>" + title + "</h1>";
        StringBuilder subtitle = new StringBuilder();

        return title;
    }

    public String TableConstructor(String title){
        StringBuilder htmlText = new StringBuilder("""
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
                            
                            
                            
                         
                    """);
        htmlText.append(title).append("<tr>V</tr>\n".repeat(Math.max(0, 4))); // td table data (colunas), tr table row (linhas), th table head (cabeçalho da tabela)
        htmlText.append("</table></body></html> "); // O alinhamento da tabela é sempre a esquerda, o alinhamento do titulo é sempre ao centro
        return htmlText.toString(); //thead, tbody e tfoot
    }
    public void Conjuncao(){
        System.out.print("chamou aq");
    }

    public String resultOperation(String characters){
        String strCaracters = characters.substring(1, characters.length() - 1);
        strCaracters = strCaracters.replaceAll(",", "");
        numberOfLines(strCaracters);
        String title = TitleConstructor(4, "separator", characters);
        return TableConstructor(title);
    }


    public void DisjuncaoInclusiva(){
        System.out.print("chamou aq");
    }

    public void Negacao(){
        System.out.print("chamou aq");
    }

    public Object DisjuncaoExclusiva(){
        System.out.print("chamou aq");
        return null;
    }

    public void Condicional(){
        System.out.print("chamou aq");
    }

    public void Bicondicional(){
        System.out.print("chamou aq");
    }

    public void Tautologia(){
        System.out.print("chamou aq");
    }

    public void Contradiacao(){
        System.out.print("chamou aq");
    }

    public void Contingencia(){
        System.out.print("chamou aq");
    }

    public void Equivalencia(){
        System.out.print("chamou aq");
    }

    public void Validade(){
        System.out.print("chamou aq");
    }

    public void Satisfativel(){
        System.out.print("chamou aq");
    }

    public void Insatisfativel(){
        System.out.print("chamou aq");
    }
}
