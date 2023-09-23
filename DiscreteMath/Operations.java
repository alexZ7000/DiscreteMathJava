package DiscreteMath;

import java.util.ArrayList;

public class Operations {

    public void getElements(ArrayList<String> caracters) {
        for (String caracter : caracters) {
            if (caracter.contains("v")) {
                System.out.println(caracter);
            }
        }
    }
    public void Conjuncao(){
        System.out.print("chamou aq");
    }

    public static String resultOperation(ArrayList<String> caracters){
        System.out.print("chamou aq");
        return """
                V       V
                V       F
                F       V
                F       F
                """;
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
