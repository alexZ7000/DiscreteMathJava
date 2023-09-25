package DiscreteMath;

import java.util.ArrayList;

public class Operations {
    public int numberOfLines(String characters) {
        int lines = 0;
        if (characters.contains("P")) {
            lines = 2;
            if (characters.contains("Q")) {
                lines = 4;
                if (characters.contains("R")) {
                    lines = 8;
                    if (characters.contains("S")) {
                        lines = 16;
                    }
                }
            }
        }
        System.out.println(lines);
        return lines;
    }

    public String TitleConstructor(int lines, String separator, String characters) {
        String title = "<h1>" + characters + "</h1>";
        StringBuilder subtitle = new StringBuilder();

        return title;
    }

    public String TableConstructor(int lines, String title){
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
        htmlText.append(title).append("            <tr>V</tr>\n".repeat(Math.max(0, lines))); // td table data (colunas), tr table row (linhas), th table head (cabeçalho da tabela)
        htmlText.append("</table></body></html> ");
        return htmlText.toString();
    }

    public String SeparateOperation(String characters){
        return null;
    }

    public void Conjuncao(){
        System.out.print("chamou aq");
    }

    public String resultOperation(String characters){
        int lines = numberOfLines(characters);
        String separator = SeparateOperation(characters);
        String title = TitleConstructor(lines,separator, characters);
        return TableConstructor(lines, title);
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
