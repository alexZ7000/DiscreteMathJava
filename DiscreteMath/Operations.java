package DiscreteMath;



public class Operations {
    private final Interface interface1;

    public Operations(Interface instanciaClasseA) {
        this.interface1 = instanciaClasseA;
    }

    private void numberOfLines(String characters) {
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
                lines++;
            }
        }
        StringBuilder letras = new StringBuilder();

        for (int i = 0; i < characters.length(); i++) {
            char caractere = characters.charAt(i);
            if (Character.isLetter(caractere)) {
                letras.append(caractere);
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
        TitleConstructor(lines, letras);
    }

    private void TitleConstructor(int lines, StringBuilder letras) {
        StringBuilder title = new StringBuilder();
        for (int j = 0; j < letras.length(); j++) {
            // Obter a letra na posição j
            char l = letras.charAt(j);
            // Concatenar os title "<th>"+letra+"</th>" e adicionar ao StringBuilder title
            title.append("<th>").append(l).append("</th>");
        }
        TableConstructor(title);
    }

    private void TableConstructor(StringBuilder title){
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
        htmlText.append(title); // td table data (colunas), tr table row (linhas), th table head (cabeçalho da tabela)
        htmlText.append("</table></body></html> ");
        interface1.exibirCalculoDaInterface(htmlText.toString());
        //TODO: Arrumar a tabela que só exibe suas letras e não exibe a operação
        // O alinhamento da tabela é sempre a esquerda, o alinhamento do titulo é sempre ao centro
        //thead, tbody e tfoot
    }

    public void resultOperation(String characters){
        String strCaracters = characters.substring(1, characters.length() - 1);
        System.out.print(strCaracters);
        strCaracters = strCaracters.replaceAll(",", "");
        numberOfLines(strCaracters);
    }

    public void Conjuncao(){
        System.out.print("chamou aq");
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
