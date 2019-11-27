package xyz.kholdy;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame{

    private String operation;
    private double x1 = 0, x2 = 0;
    private JLabel labVar = new JLabel(), labDisplay = new JLabel();
    private Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
    private JButton b1 = new JButton("1"), b2 = new JButton("2"), b3 = new JButton("3"),
                    b4 = new JButton("4"), b5 = new JButton("5"), b6 = new JButton("6"),
                    b7 = new JButton("7"), b8 = new JButton("8"), b9 = new JButton("9"),
                    b0 = new JButton("0");
    private JButton bPlus = new JButton("+"), bDifference = new JButton("-"),
                    bMultiplication = new JButton("*"), bDivision = new JButton("/");
    private JButton bC = new JButton("C"), bBackspace = new JButton("<");
    private JButton bResult = new JButton("=");

    public View() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 300);
        setResizable(false);
        setLayout(new FlowLayout());

        labDisplay.setHorizontalAlignment(JLabel.RIGHT);
        labDisplay.setFont(new Font("Serif", Font.BOLD, 14));
        labDisplay.setPreferredSize(new Dimension(180, 20));
        labDisplay.setBorder(border);

        labVar.setHorizontalAlignment(JLabel.RIGHT);
        labVar.setFont(new Font("Serif", Font.BOLD, 14));
        labVar.setPreferredSize(new Dimension(180, 20));
        labVar.setBorder(border);

        b1.addActionListener(b1Listener); b2.addActionListener(b2Listener); b3.addActionListener(b3Listener);
        b4.addActionListener(b4Listener); b5.addActionListener(b5Listener); b6.addActionListener(b6Listener);
        b7.addActionListener(b7Listener); b8.addActionListener(b8Listener); b9.addActionListener(b9Listener);
        b0.addActionListener(b0Listener);

        bPlus.addActionListener(bPlusListener); bDifference.addActionListener(bDifferenceListener);
        bMultiplication.addActionListener(bMultiplicationListener); bDivision.addActionListener(bDivisionListener);
        bC.addActionListener(bCListener); bBackspace.addActionListener(bBackspaceListener);
        bResult.addActionListener(bResultListener);

        add(labDisplay); add(labVar); add(bPlus); add(b1); add(b2); add(b3); add(bDifference); add(b4);
        add(b5); add(b6); add(bMultiplication); add(b7); add(b8); add(b9);  add(bDivision);
        add(bC); add(b0); add(bBackspace); add(bResult);

        setVisible(true);
    }

    private ActionListener b1Listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            labDisplay.setText(labDisplay.getText() + b1.getText());
            labVar.setText(labVar.getText() + b1.getText());
        }
    };

    private ActionListener b2Listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            labDisplay.setText(labDisplay.getText() + b2.getText());
            labVar.setText(labVar.getText() + b2.getText());
        }
    };

    private ActionListener b3Listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            labDisplay.setText(labDisplay.getText() + b3.getText());
            labVar.setText(labVar.getText() + b3.getText());
        }
    };

    private ActionListener b4Listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            labDisplay.setText(labDisplay.getText() + b4.getText());
            labVar.setText(labVar.getText() + b4.getText());
        }
    };

    private ActionListener b5Listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            labDisplay.setText(labDisplay.getText() + b5.getText());
            labVar.setText(labVar.getText() + b5.getText());
        }
    };

    private ActionListener b6Listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            labDisplay.setText(labDisplay.getText() + b6.getText());
            labVar.setText(labVar.getText() + b6.getText());
        }
    };

    private ActionListener b7Listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            labDisplay.setText(labDisplay.getText() + b7.getText());
            labVar.setText(labVar.getText() + b7.getText());
        }
    };

    private ActionListener b8Listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            labDisplay.setText(labDisplay.getText() + b8.getText());
            labVar.setText(labVar.getText() + b8.getText());
        }
    };

    private ActionListener b9Listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            labDisplay.setText(labDisplay.getText() + b9.getText());
            labVar.setText(labVar.getText() + b9.getText());
        }
    };

    private ActionListener b0Listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            labDisplay.setText(labDisplay.getText() + b0.getText());
            labVar.setText(labVar.getText() + b0.getText());
        }
    };

    private ActionListener bPlusListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            x1 = Double.parseDouble(labVar.getText());
            labVar.setText("");
            labDisplay.setText(labDisplay.getText() + "+");
            operation = "+";
        }
    };

    private ActionListener bDifferenceListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            x1 = Double.parseDouble(labVar.getText());
            labVar.setText("");
            labDisplay.setText(labDisplay.getText() + "-");
            operation = "-";
        }
    };

    private ActionListener bMultiplicationListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            x1 = Double.parseDouble(labVar.getText());
            labVar.setText("");
            labDisplay.setText(labDisplay.getText() + "*");
            operation = "*";
        }
    };

    private ActionListener bDivisionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            x1 = Double.parseDouble(labVar.getText());
            labVar.setText("");
            labDisplay.setText(labDisplay.getText() + "/");
            operation = "/";
        }
    };

    private ActionListener bCListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            labDisplay.setText("");
            labVar.setText("");
        }
    };

    private ActionListener bBackspaceListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (labDisplay.getText().length() > 0)
                labDisplay.setText(labDisplay.getText().substring(0,labDisplay.getText().length() - 1));
            if (labVar.getText().length() > 0)
                labVar.setText(labVar.getText().substring(0,labVar.getText().length() - 1));
        }
    };

    private ActionListener bResultListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            x2 = Double.parseDouble(labVar.getText());
            labVar.setText("");

            if (operation.equals("+")) {
                labDisplay.setText(labDisplay.getText() + "=" + operations(new Plus(x1, x2)));
                labVar.setText("" + operations(new Plus(x1, x2)));
            } else if (operation.equals("-")) {
                labDisplay.setText(labDisplay.getText() + "=" + operations(new Difference(x1, x2)));
                labVar.setText("" + operations(new Difference(x1, x2)));
            } else if (operation.equals("*")) {
                labDisplay.setText(labDisplay.getText() + "=" + operations(new Multiplication(x1, x2)));
                labVar.setText("" + operations(new Multiplication(x1, x2)));
            } else if (operation.equals("/")) {
                labDisplay.setText(labDisplay.getText() + "=" + operations(new Division(x1, x2)));
                labVar.setText("" + operations(new Division(x1, x2)));
            }
        }
    };

    private String operations(Operations operations) {
       return operations.run();
    }
}
