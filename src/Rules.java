// package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start;
    JButton back;

    Rules(String name) {
        this.name = name;

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.BOLD, 16));
        rules.setText(
                "<html>" +
                        "1. There are 10 questions in this quiz, each question carries 10 points"
                        + "<br><br>" +
                        "2. You will get 15 seconds to answer each question"
                        + "<br><br>" +
                        "3. There will be a lifeline option which will erase two wrong answers" + "<br><br>"
                        +
                        "4. There is no negative marking" + "<br><br>" +
                        "5. All questions are from java and which are covered in your syllabus" + "<br><br>" +
                        "6. Submit button will be enabled after ninth question"
                        + "<br><br>" +
                        "7. If you will not select any option in 15 seconds, the question will be automatically skipped" + "<br><br>" +
                        "8. Do not try to cheat, Good luck!" + "<br><br>" +
                        "<html>");
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(800, 650);
        setLocation(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            this.setVisible(false);
            new Quiz(name);
        } else if (ae.getSource() == back) {
            this.setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");

    }
}
