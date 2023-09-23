package DiscreteMath;

import java.util.ArrayList;

public class teste {
    public int numberOfLines(ArrayList<String> caracters) {
        int lines = 0;
        if (caracters.contains("P")) {
            lines = 2;
            if (caracters.contains("Q")) {
                lines = 4;
                if (caracters.contains("R")) {
                    lines = 8;
                    if (caracters.contains("S")) {
                        lines = 16;
                    }
                }
            }
        }
        return lines;
    }

    public String TableConstructor(int lines){
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
                            <tr class="proposicoes">
                            </tr>
                            {}
                         </table>
                     </body>
                </html>
                    """);
        htmlText.append("            <tr></tr>\n".repeat(Math.max(0, lines)));

        return """
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
                         <tr>
                             <th>P</th>
                             <th>Q</th>
                             <th>P ∧ Q</th>
                         </tr>
                         <tr>
                             <td>V</td>
                             <td>V</td>
                             <td>V</td>
                         </tr>
                         <tr>
                             <td>V</td>
                             <td>F</td>
                             <td>F</td>
                         </tr>
                         <tr>
                             <td>F</td>
                             <td>V</td>
                             <td>F</td>
                         </tr>
                         <tr>
                             <td>F</td>
                             <td>F</td>
                             <td>F</td>
                         </tr>
                     </table>
                 </body>
            </html>
            """;
    }

    public void Conjuncao(){
        System.out.print("chamou aq");
    }

    public void resultOperation(ArrayList<String> caracters){
        int cuzin = numberOfLines(caracters);
        String table = TableConstructor(cuzin);
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

