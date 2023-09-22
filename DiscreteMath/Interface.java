package DiscreteMath;

import javax.swing.*;
import java.awt.*;

public class Interface {

    JFrame frame = new JFrame();

    public static void main(String[] args)
    {
        new Interface();
    }

    public void Calcular(String expressao){

    }

    public Interface() {

        // definindo propriedades do meu frame
        frame.setSize(1080, 720);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("DiscreteMath");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel label1 = new JLabel("DiscreteMath");
        label1.setBounds(
                590, 100, 220,
                50
        );

        frame.add(label1);

        JButton button1 = new JButton("Calcular");
        JButton button2 = new JButton("Fechar DiscreteMath");
        JButton button3 = new JButton("∧");
        button3.setFont(new Font("serif", Font.PLAIN, 40));

        // localização dos meus botões
        button1.setBounds(
                590, 360, 220,
                50
        );


        button2.setBounds(
                590, 480, 220,
                50
        );

        button3.setBounds(
                590, 540, 220,
                50
        );

        button1.addActionListener(e -> {
            Operations expressao = new Operations();
            System.out.println(expressao);
        });

        button2.addActionListener(e -> {
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Você tem certeza que deseja fechar o DiscreteMath?",
                    "DiscreteMath",
                    JOptionPane.YES_NO_OPTION
            );
            if (resposta == JOptionPane.YES_OPTION)
            {
                System.exit(1);
            }
            else
            {
                System.out.println("O usuário não quis sair da aplicação");
            }
        });

        // adição dos meus botões
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
    }


}