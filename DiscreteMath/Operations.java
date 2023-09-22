package DiscreteMath;
import java.util.Scanner;

public class Operations {
    static Scanner leitor = new Scanner(System.in);
    String conjuncao = "e", disjuncaoInclusiva = "ou", negacao = "não", disjuncaoExclusiva = "ou {} ou {}", condicional = "se {} então {}", bicondicional = "se, e somente se";
    boolean[] valores = {true, false}, tautologia = {true, true}, contradiacao = {false, false}, contingencia = {true, false};
    static int p = 0, q = 0, r = 0, s = 0;
    public static void main(String[] args) {
        p = 1;
        q = 1;
        if (p ==1 && q==0 && r==0 && s ==0)
            System.out.print("V\nF");
        else if (p ==0 && q==1 && r==0 && s ==0)
            System.out.print("V\nF");
        else if (p ==0 && q==0 && r==1 && s ==0)
            System.out.print("V\nF");
        else if (p ==0 && q==0 && r==0 && s ==1)
            System.out.print("V\nF");
        else if (p ==1 && q==1 && r==0 && s ==0) {
            System.out.println("\nV".repeat(2) + "\nF".repeat(2));
            System.out.print("  *******************  ");
            System.out.println("\nV\nF".repeat(2));
        }
        else if (p ==1 && q==0 && r==1 && s ==0) {
            System.out.println("\nV".repeat(2) + "\nF".repeat(2));
            System.out.print("  *******************  ");
            System.out.print("\nV\nF".repeat(2));
        }
        else if (p ==1 && q==0 && r==0 && s ==1) {
            System.out.println("\nV".repeat(2) + "\nF".repeat(2));
            System.out.print("  *******************  ");
            System.out.print("\nV\nF".repeat(2));
        }
    }


}
