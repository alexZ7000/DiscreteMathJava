package DiscreteMath;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.sound.sampled.*;


public class MainScreen {
    private final JFrame frame = new JFrame();
    private final JButton calcButton = new JButton("Calcular");
    private final JButton exitButton = new JButton("Fechar DiscreteMath");
    private final JButton conjuncaoButton = new JButton("∧");
    private final JButton disjuncaoButton = new JButton("∨");
    private final JButton negacaoButton = new JButton("¬");
    private final JButton disjuncaoExclusivaButton = new JButton("⊕");
    private final JButton condicionalButton = new JButton("→");
    private final JButton bicondicionalButton = new JButton("↔");
    private final JButton implicacaoButton = new JButton("⇒");
    private final JButton equivalenciaButton = new JButton("≡");
    private final JButton proposicaoPButton = new JButton("P");
    private final JButton proposicaoQButton = new JButton("Q");
    private final JButton proposicaoRButton = new JButton("R");
    private final JButton proposicaoSButton = new JButton("S");
    private final JButton leftParenthesisButton = new JButton("(");
    private final JButton rightParenthesisButton = new JButton(")");
    private final JButton deleteButton = new JButton("Apagar");
    private final JLabel label = new JLabel();
    private final JLabel resultLabel = new JLabel();
    private final ArrayList<String> characters = new ArrayList<>();
    private final Font font = new Font("serif", Font.PLAIN, 40);
    private final Operations operations = new Operations(MainScreen.this);
    private final ArrayList<String> propositions = new ArrayList<>(Arrays.asList("P", "Q", "R", "S"));
    private final ArrayList<String> logicalOperators = new ArrayList<>(Arrays.asList("∧", "∨", "¬", "⊕", "→", "↔", "⇒", "⇔", "≡", "("));

    public static void main (String[] args){
        new MainScreen();
    }

    private void playSound(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./DiscreteMath/pop.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            throw new IllegalCallerException("Este arquivo não existe: ", ex);

        }
    }

    public MainScreen() {
        playSound();
        defineDefaultFrameProperties();
        defineButtonsProperties();
        detectButtonsActions();
    }

    private void detectButtonsActions() {
        exitButton.addActionListener(e -> {
            playSound();
            if ((JOptionPane.showConfirmDialog(
                    frame,
                    "Deseja realmente fechar o DiscreteMath?",
                    "DiscreteMath",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION))
                System.exit(0);
            else playSound();
        });

        conjuncaoButton.addActionListener(e -> {
            playSound();
            if (characters.size() == 1 || propositions.contains(characters.get(characters.size() - 1))) {
                characters.add("∧");
                updateUI();
                System.out.println(characters);
            }
        });

        disjuncaoButton.addActionListener(e -> {
            playSound();
            if (characters.size() == 1 || propositions.contains(characters.get(characters.size() - 1))) {
                characters.add("∨");
                updateUI();
                System.out.println(characters);
            }
        });

        calcButton.addActionListener(e -> {
            playSound();
            if (!characters.isEmpty() && !logicalOperators.contains(characters.get(characters.size() - 1)))
                calculateOperations();
            else{
                JOptionPane.showMessageDialog(
                        frame,
                        "Insira uma expressão VÁLIDA para calcular",
                        "DiscreteMath",
                        JOptionPane.INFORMATION_MESSAGE
                );
                playSound();
            }
        });

        negacaoButton.addActionListener(e -> {
            playSound();
            characters.add("¬");
            updateUI();
            System.out.println(characters);
        });

        disjuncaoExclusivaButton.addActionListener(e -> {
            playSound();
            if (characters.size() == 1 || propositions.contains(characters.get(characters.size() - 1))) {
                characters.add("⊕");
                updateUI();
                System.out.println(characters);
            }
        });

        condicionalButton.addActionListener(e -> {
            playSound();
            if (characters.size() == 1 || propositions.contains(characters.get(characters.size() - 1))) {
                characters.add("→");
                updateUI();
                System.out.println(characters);
            }
        });

        bicondicionalButton.addActionListener(e -> {
            playSound();
            if (characters.size() == 1 || propositions.contains(characters.get(characters.size() - 1))) {
                characters.add("↔");
                updateUI();
                System.out.println(characters);
            }
        });

        implicacaoButton.addActionListener(e -> {
            playSound();
            if (!characters.contains("⇒") && !characters.contains("⇔")) {
                characters.add("⇒");
                updateUI();
                System.out.println(characters);
            }
        });

        equivalenciaButton.addActionListener(e -> {
            playSound();
            if (!characters.contains("⇔") && !characters.contains("⇔")) {
                characters.add("⇔");
                updateUI();
                System.out.println(characters);
            }
        });

        proposicaoPButton.addActionListener(e -> {
            playSound();
            if (characters.isEmpty() || !propositions.contains(characters.get(characters.size() - 1))) {
                characters.add("P");
                updateUI();
                System.out.println(characters);
            }
        });

        proposicaoQButton.addActionListener(e -> {
            playSound();
            if (characters.isEmpty() || !propositions.contains(characters.get(characters.size() - 1))) {
                characters.add("Q");
                updateUI();
                System.out.println(characters);
            }
        });

        proposicaoRButton.addActionListener(e -> {
            playSound();
            if (characters.isEmpty() || !propositions.contains(characters.get(characters.size() - 1))) {
                characters.add("R");
                updateUI();
                System.out.println(characters);
            }
        });

        proposicaoSButton.addActionListener(e -> {
            playSound();
            if (characters.isEmpty() || !propositions.contains(characters.get(characters.size() - 1))) {
                characters.add("S");
                updateUI();
                System.out.println(characters);
            }
        });

        leftParenthesisButton.addActionListener(e -> {
            playSound();
            characters.add("(");
            updateUI();
            rightParenthesisButton.setEnabled(true);
            System.out.println(characters);
        });

        rightParenthesisButton.addActionListener(e -> {
            playSound();
            if (characters.contains("(")) {
                characters.add(")");
                updateUI();
                System.out.println(characters);
            }
        });

        deleteButton.addActionListener(e -> {
            playSound();
            if (!characters.isEmpty()) {
                characters.remove(characters.size() - 1);
                updateUI();
                System.out.println(characters);
            }
        });
    }

    private void defineDefaultFrameProperties(){
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
    }

    private void defineButtonsProperties() {
        int x = 1900;

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
                x/2-300, 600, 220,
                50
        );


        exitButton.setBounds(
                x/2-300, 700, 220,
                50
        );



        conjuncaoButton.setBounds(
                x/2-600, 400, 100,
                50
        );

        disjuncaoButton.setBounds(
                x/2-500, 400, 100,
                50
        );

        negacaoButton.setBounds(
                x/2-400, 400, 100,
                50
        );

        disjuncaoExclusivaButton.setBounds(
                x/2-300, 400, 100,
                50
        );

        condicionalButton.setBounds(
                x/2-200, 400, 100,
                50
        );

        bicondicionalButton.setBounds(
                x/2-100, 400, 100,
                50
        );

        implicacaoButton.setBounds(
                x/2, 400, 100,
                50
        );

        deleteButton.setBounds(
                x/2+100, 400, 100,
                50
        );

        proposicaoPButton.setBounds(
                x/2-600, 450, 100,
                50
        );

        proposicaoQButton.setBounds(
                x/2-500, 450, 100,
                50
        );

        proposicaoRButton.setBounds(
                x/2-400, 450, 100,
                50
        );

        proposicaoSButton.setBounds(
                x/2-300, 450, 100,
                50
        );

        leftParenthesisButton.setBounds(
                x/2-200, 450, 100,
                50
        );

        rightParenthesisButton.setBounds(
                x/2-100, 450, 100,
                50
        );

        equivalenciaButton.setBounds(
                x/2, 450, 100,
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
    }

    private void calculateOperations(){
        operations.resultOperation(String.valueOf(characters));
    }

    public void showCalculationInInterface(String result){
        JOptionPane.showMessageDialog(
                frame,
                result,
                "DiscreteMath",
                JOptionPane.INFORMATION_MESSAGE
        );
        resultLabel.setFont(new Font("serif", Font.PLAIN, 20));
        resultLabel.setBounds(
                1900/2+205, -5, 1600,
                1000
        );
        frame.add(resultLabel);
        resultLabel.setText(result);
    }

    private void updateUI(){
        label.setFont(font);
        label.setBounds(
                1900/2-500, 290, 800,
                100
        );
        frame.add(label);
        String strCaracters = characters.toString().substring(1, characters.toString().length() - 1);
        strCaracters = strCaracters.replaceAll(",", "");
        label.setText(strCaracters);
    }
}
