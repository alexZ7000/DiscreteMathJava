package DiscreteMath;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Interface extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JButton calcButton = new JButton("Calcular");
    JButton exitButton = new JButton("Fechar DiscreteMath");
    JButton conjuncaoButton = new JButton("∧");
    JButton disjuncaoButton = new JButton("∨");
    JButton negacaoButton = new JButton("¬");
    JButton disjuncaoExclusivaButton = new JButton("⊕");
    JButton condicionalButton = new JButton("→");
    JButton bicondicionalButton = new JButton("↔");
    JButton implicacaoButton = new JButton("⇒");
    JButton equivalenciaButton = new JButton("≡");
    JButton proposicaoPButton = new JButton("P");
    JButton proposicaoQButton = new JButton("Q");
    JButton proposicaoRButton = new JButton("R");
    JButton proposicaoSButton = new JButton("S");
    JButton leftParenthesisButton = new JButton("(");
    JButton rightParenthesisButton = new JButton(")");
    JButton deleteButton = new JButton("Apagar");

    ArrayList<String>caracters = new ArrayList<>();


    public static void main(String[] args)
    {
        new Interface();
    }


    Interface() {

        // definindo propriedades do meu frame
        int x = 1900, y = 1000;
        frame.setSize(x, y);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("DiscreteMath");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(new Color(0,0,0));


        JLabel label1 = new JLabel("DiscreteMath");
        label1.setFont(new Font("serif", Font.PLAIN, 80));
        label1.setBounds(
                x/2-200, 80, 800,
                100
        );

        frame.add(label1);

        conjuncaoButton.setFont(new Font("serif", Font.PLAIN, 40));

        //personalização dos meus Botões
        exitButton.setBackground(new Color(255,114,118));
        exitButton.setForeground(Color.white);
        exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exitButton.setFocusPainted(false);
        exitButton.setFont(new Font("serif", Font.PLAIN, 20));

        calcButton.setBackground(new Color(123,178,221));
        calcButton.setForeground(Color.white);
        calcButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        calcButton.setFocusPainted(false);
        calcButton.setFont(new Font("serif", Font.PLAIN, 20));

        conjuncaoButton.setBackground(new Color(123,178,221));
        conjuncaoButton.setForeground(Color.white);
        conjuncaoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        conjuncaoButton.setFocusPainted(false);
        conjuncaoButton.setFont(new Font("serif", Font.PLAIN, 20));

        disjuncaoButton.setBackground(new Color(123,178,221));
        disjuncaoButton.setForeground(Color.white);
        disjuncaoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        disjuncaoButton.setFocusPainted(false);
        disjuncaoButton.setFont(new Font("serif", Font.PLAIN, 20));

        negacaoButton.setBackground(new Color(123,178,221));
        negacaoButton.setForeground(Color.white);
        negacaoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        negacaoButton.setFocusPainted(false);
        negacaoButton.setFont(new Font("serif", Font.PLAIN, 20));

        disjuncaoExclusivaButton.setBackground(new Color(123,178,221));
        disjuncaoExclusivaButton.setForeground(Color.white);
        disjuncaoExclusivaButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        disjuncaoExclusivaButton.setFocusPainted(false);
        disjuncaoButton.setFont(new Font("serif", Font.PLAIN, 20));

        condicionalButton.setBackground(new Color(123,178,221));
        condicionalButton.setForeground(Color.white);
        condicionalButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        condicionalButton.setFocusPainted(false);
        condicionalButton.setFont(new Font("serif", Font.PLAIN, 20));

        bicondicionalButton.setBackground(new Color(123,178,221));
        bicondicionalButton.setForeground(Color.white);
        bicondicionalButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bicondicionalButton.setFocusPainted(false);
        bicondicionalButton.setFont(new Font("serif", Font.PLAIN, 20));

        implicacaoButton.setBackground(new Color(123,178,221));
        implicacaoButton.setForeground(Color.white);
        implicacaoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        implicacaoButton.setFocusPainted(false);
        implicacaoButton.setFont(new Font("serif", Font.PLAIN, 20));

        equivalenciaButton.setBackground(new Color(123,178,221));
        equivalenciaButton.setForeground(Color.white);
        equivalenciaButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        equivalenciaButton.setFocusPainted(false);
        equivalenciaButton.setFont(new Font("serif", Font.PLAIN, 20));

        proposicaoPButton.setBackground(new Color(123,178,221));
        proposicaoPButton.setForeground(Color.white);
        proposicaoPButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        proposicaoPButton.setFocusPainted(false);
        proposicaoPButton.setFont(new Font("serif", Font.PLAIN, 20));

        proposicaoQButton.setBackground(new Color(123,178,221));
        proposicaoQButton.setForeground(Color.white);
        proposicaoQButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        proposicaoQButton.setFocusPainted(false);
        proposicaoQButton.setFont(new Font("serif", Font.PLAIN, 20));

        proposicaoRButton.setBackground(new Color(123,178,221));
        proposicaoRButton.setForeground(Color.white);
        proposicaoRButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        proposicaoRButton.setFocusPainted(false);
        proposicaoRButton.setFont(new Font("serif", Font.PLAIN, 20));

        proposicaoSButton.setBackground(new Color(123,178,221));
        proposicaoSButton.setForeground(Color.white);
        proposicaoSButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        proposicaoSButton.setFocusPainted(false);
        proposicaoSButton.setFont(new Font("serif", Font.PLAIN, 20));

        leftParenthesisButton.setBackground(new Color(123,178,221));
        leftParenthesisButton.setForeground(Color.white);
        leftParenthesisButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        leftParenthesisButton.setFocusPainted(false);
        leftParenthesisButton.setFont(new Font("serif", Font.PLAIN, 20));

        rightParenthesisButton.setBackground(new Color(123,178,221));
        rightParenthesisButton.setForeground(Color.white);
        rightParenthesisButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rightParenthesisButton.setFocusPainted(false);
        rightParenthesisButton.setFont(new Font("serif", Font.PLAIN, 20));

        deleteButton.setBackground(new Color(255,114,118));
        deleteButton.setForeground(Color.white);
        deleteButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        deleteButton.setFocusPainted(false);
        deleteButton.setFont(new Font("serif", Font.PLAIN, 20));

        // localização dos meus botões
        calcButton.setBounds(
                x/2-100, 600, 220,
                50
        );


        exitButton.setBounds(
                x/2-100, 800, 220,
                50
        );

        conjuncaoButton.setBounds(
                x/2-600, 300, 100,
                50
        );

        disjuncaoButton.setBounds(
                x/2-500, 300, 100,
                50
        );

        negacaoButton.setBounds(
                x/2-400, 300, 100,
                50
        );

        disjuncaoExclusivaButton.setBounds(
                x/2-300, 300, 100,
                50
        );

        condicionalButton.setBounds(
                x/2-200, 300, 100,
                50
        );

        bicondicionalButton.setBounds(
                x/2-100, 300, 100,
                50
        );

        implicacaoButton.setBounds(
                x/2, 300, 100,
                50
        );

        equivalenciaButton.setBounds(
                x/2+100, 300, 100,
                50
        );

        proposicaoPButton.setBounds(
                x/2-600, 400, 100,
                50
        );

        proposicaoQButton.setBounds(
                x/2-500, 400, 100,
                50
        );

        proposicaoRButton.setBounds(
                x/2-400, 400, 100,
                50
        );

        proposicaoSButton.setBounds(
                x/2-300, 400, 100,
                50
        );

        leftParenthesisButton.setBounds(
                x/2-200, 400, 100,
                50
        );

        rightParenthesisButton.setBounds(
                x/2-100, 400, 100,
                50
        );

        deleteButton.setBounds(
                x/2, 400, 100,
                50
        );


        // adição dos meus botões
        frame.add(calcButton);
        frame.add(exitButton);
        frame.add(conjuncaoButton);
        frame.add(disjuncaoButton);
        frame.add(negacaoButton);
        frame.add(disjuncaoExclusivaButton);
        frame.add(condicionalButton);
        frame.add(bicondicionalButton);
        frame.add(implicacaoButton);
        frame.add(equivalenciaButton);
        frame.add(proposicaoPButton);
        frame.add(proposicaoQButton);
        frame.add(proposicaoRButton);
        frame.add(proposicaoSButton);
        frame.add(leftParenthesisButton);
        frame.add(rightParenthesisButton);
        frame.add(deleteButton);


        // Adicionando escutadores de eventos nos botões
        exitButton.addActionListener(this);
        calcButton.addActionListener(this);
        conjuncaoButton.addActionListener(this);
        disjuncaoButton.addActionListener(this);
        negacaoButton.addActionListener(this);
        disjuncaoExclusivaButton.addActionListener(this);
        condicionalButton.addActionListener(this);
        bicondicionalButton.addActionListener(this);
        implicacaoButton.addActionListener(this);
        equivalenciaButton.addActionListener(this);
        proposicaoPButton.addActionListener(this);
        proposicaoQButton.addActionListener(this);
        proposicaoRButton.addActionListener(this);
        proposicaoSButton.addActionListener(this);
        leftParenthesisButton.addActionListener(this);
        rightParenthesisButton.addActionListener(this);
        deleteButton.addActionListener(this);
    }

    private void CalcularInterface(){
        String result = Operations.resultOperation(caracters);
        System.out.println(result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<String> prop = new ArrayList<>();
        prop.add("P");
        prop.add("Q");
        prop.add("R");
        prop.add("S");
        if (e.getSource() == exitButton) {
            if (JOptionPane.showConfirmDialog(
                    frame,
                    "Deseja realmente fechar o DiscreteMath?",
                    "DiscreteMath",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                System.exit(0);
        }
        else if (e.getSource() == conjuncaoButton){
            if (caracters.size() == 1 || prop.contains(caracters.get(caracters.size() - 1))) {
                caracters.add("∧");
                System.out.println(caracters);
            }
        }
        else if (e.getSource() == disjuncaoButton){
            if (caracters.size() == 1 || prop.contains(caracters.get(caracters.size() - 1))) {
                caracters.add("∨");
                System.out.println(caracters);
            }
        }
        else if (e.getSource() == calcButton){
            CalcularInterface();
        }
        else if (e.getSource() == negacaoButton){
            caracters.add("¬");
            System.out.println(caracters);
        }
        else if (e.getSource() == disjuncaoExclusivaButton){

            if (caracters.size() == 1 || prop.contains(caracters.get(caracters.size() - 1))) {
                caracters.add("⊕");
                System.out.println(caracters);
            }
        }
        else if (e.getSource() == condicionalButton){
            if (caracters.size() == 1 || prop.contains(caracters.get(caracters.size() - 1))) {
                caracters.add("→");
                System.out.println(caracters);
            }
        }
        else if (e.getSource() == bicondicionalButton){
            if (caracters.size() == 1 || prop.contains(caracters.get(caracters.size() - 1))) {
                caracters.add("↔");
                System.out.println(caracters);
            }
        }
        else if (e.getSource() == implicacaoButton){
            if (!caracters.contains("⇒") && !caracters.contains("⇔")) {
                caracters.add("⇒");
                System.out.println(caracters);
            }

        }
        else if (e.getSource() == equivalenciaButton){
            if (!caracters.contains("⇔") && !caracters.contains("⇔")) {
                caracters.add("⇔");
                System.out.println(caracters);
            }
        }
        else if (e.getSource() == proposicaoPButton){
            if (caracters.size() == 0 || !prop.contains(caracters.get(caracters.size() - 1))) {
                caracters.add("P");
                System.out.println(caracters);
            }
        }
        else if (e.getSource() == proposicaoQButton){
            if (caracters.size() == 0 || !prop.contains(caracters.get(caracters.size() - 1))) {
                caracters.add("Q");
                System.out.println(caracters);
            }
        }
        else if (e.getSource() == proposicaoRButton){
            if (caracters.size() == 0 || !prop.contains(caracters.get(caracters.size() - 1))) {
                caracters.add("R");
                System.out.println(caracters);
            }
        }
        else if (e.getSource() == proposicaoSButton){
            if (caracters.size() == 0 || !prop.contains(caracters.get(caracters.size() - 1))) {
                caracters.add("S");
                System.out.println(caracters);
            }
        }
        else if (e.getSource() == leftParenthesisButton){
            if (caracters.size() > 0) {
                caracters.add("(");
                System.out.println(caracters);
            }
        }
        else if (e.getSource() == rightParenthesisButton) {
            if (caracters.contains("(")) {
                caracters.add(")");
                System.out.println(caracters);
            }
        }
        else if (e.getSource() == deleteButton){
            if (caracters.size() > 0) {
                caracters.remove(caracters.size() - 1);
                System.out.println(caracters);
            }
        }
    }
}
