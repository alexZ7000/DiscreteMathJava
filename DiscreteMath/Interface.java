package DiscreteMath;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class Interface extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JButton calcButton = new JButton("Calcular");
    JButton exitButton = new JButton("Fechar DiscreteMath");
    JButton conjuncaoButton = new JButton("∧");
    JButton disjuncaoButton = new JButton("∨");
    ArrayList<String>caracters = new ArrayList<String>();


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
        exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));;
        exitButton.setFocusPainted(false);
        exitButton.setFont(new Font("serif", Font.PLAIN, 20));

        calcButton.setBackground(new Color(123,178,221));
        calcButton.setForeground(Color.white);
        calcButton.setCursor(new Cursor(Cursor.HAND_CURSOR));;
        calcButton.setFocusPainted(false);
        calcButton.setFont(new Font("serif", Font.PLAIN, 20));

        conjuncaoButton.setBackground(new Color(123,178,221));
        conjuncaoButton.setForeground(Color.white);
        conjuncaoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));;
        conjuncaoButton.setFocusPainted(false);
        conjuncaoButton.setFont(new Font("serif", Font.PLAIN, 20));

        disjuncaoButton.setBackground(new Color(123,178,221));
        disjuncaoButton.setForeground(Color.white);
        disjuncaoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));;
        disjuncaoButton.setFocusPainted(false);
        disjuncaoButton.setFont(new Font("serif", Font.PLAIN, 20));


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

        // adição dos meus botões
        frame.add(calcButton);
        frame.add(exitButton);
        frame.add(conjuncaoButton);
        frame.add(disjuncaoButton);
        exitButton.addActionListener(this);
        calcButton.addActionListener(this);
        conjuncaoButton.addActionListener(this);
        disjuncaoButton.addActionListener(this);
    }

    void ConjuncaoInterface(){
        if (caracters.size() > 0 && caracters.get(caracters.size() - 1).equals("p")) {
            System.out.print("Nao adicionamos nada");
        }
        else{
            caracters.add("p");
        }
        System.out.print(caracters);
    }

    void DisjuncaoInclusivaInterface(){
        if (caracters.size() > 0 && caracters.get(caracters.size() - 1).equals("q")) {
            System.out.print("Nao adicionamos nada");
        }
        else{
            caracters.add("q");
        }
        System.out.print(caracters);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitButton) {
            if (JOptionPane.showConfirmDialog(
                    frame,
                    "Deseja realmente fechar o DiscreteMath?",
                    "DiscreteMath",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                System.exit(0);
        }
        else if (e.getSource() == conjuncaoButton){
            ConjuncaoInterface();
        }
        else if (e.getSource() == disjuncaoButton){
            DisjuncaoInclusivaInterface();
        }
    }
}