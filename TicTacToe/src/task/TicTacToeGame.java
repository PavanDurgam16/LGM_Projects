package task;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToeGame {

  private JFrame frame;
  private JTextField xCountField;
  private JTextField oCountField;
  private int x_CountNum = 0;
  private int o_CountNum = 0;
  private String currentPlayer = "X";
  private int cell1 = 10;
  private int cell2 = 10;
  private int cell3 = 10;
  private int cell4 = 10;
  private int cell5 = 10;
  private int cell6 = 10;
  private int cell7 = 10;
  private int cell8 = 10;
  private int cell9 = 10;
  private int movesCount = 0;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          TicTacToeGame window = new TicTacToeGame();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public TicTacToeGame() {
    initialize();
  }

  private void winningGame() {
    String message = "";
    if ((cell1 == 1 && cell2 == 1 && cell3 == 1) ||
        (cell4 == 1 && cell5 == 1 && cell6 == 1) ||
        (cell7 == 1 && cell8 == 1 && cell9 == 1) ||
        (cell1 == 1 && cell4 == 1 && cell7 == 1) ||
        (cell2 == 1 && cell5 == 1 && cell8 == 1) ||
        (cell3 == 1 && cell6 == 1 && cell9 == 1) ||
        (cell1 == 1 && cell5 == 1 && cell9 == 1) ||
        (cell3 == 1 && cell5 == 1 && cell7 == 1)) {
      message = "Player X Wins";
      x_CountNum++;
      xCountField.setText(String.valueOf(x_CountNum));
    } else if ((cell1 == 0 && cell2 == 0 && cell3 == 0) ||
        (cell4 == 0 && cell5 == 0 && cell6 == 0) ||
        (cell7 == 0 && cell8 == 0 && cell9 == 0) ||
        (cell1 == 0 && cell4 == 0 && cell7 == 0) ||
        (cell2 == 0 && cell5 == 0 && cell8 == 0) ||
        (cell3 == 0 && cell6 == 0 && cell9 == 0) ||
        (cell1 == 0 && cell5 == 0 && cell9 == 0) ||
        (cell3 == 0 && cell5 == 0 && cell7 == 0)) {
      message = "Player O Wins";
      o_CountNum++;
      oCountField.setText(String.valueOf(o_CountNum));
    } else if (movesCount == 9) {
      message = "No One Wins";
    }

    if (!message.isEmpty()) {
      JOptionPane.showMessageDialog(frame, message, "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
    }
  }

  private void choosePlayer() {
    if (currentPlayer.equalsIgnoreCase("X")) {
      currentPlayer = "O";
    } else {
      currentPlayer = "X";
    }
  }

  // Initialize the contents of the frame

  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 820, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new BorderLayout(0, 0));

    JPanel panel = new JPanel();
    panel.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    panel.setLayout(new GridLayout(3, 5, 0, 0));

    JPanel panel1 = new JPanel();
    panel1.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel1);
    panel1.setLayout(new BorderLayout(0, 0));

    JButton button1 = new JButton("");
    button1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        button1.setText(currentPlayer);
        if (currentPlayer.equalsIgnoreCase("X")) {
          button1.setForeground(Color.GREEN);
          cell1 = 1;
          movesCount++;
        } else {
          button1.setForeground(Color.PINK);
          cell1 = 0;
          movesCount++;
        }
        choosePlayer();
        winningGame();
      }
    });
    button1.setFont(new Font("Tahoma", Font.BOLD, 80));
    panel1.add(button1, BorderLayout.CENTER);

    JPanel panel2 = new JPanel();
    panel2.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel2);
    panel2.setLayout(new BorderLayout(0, 0));

    JButton button2 = new JButton("");
    button2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        button2.setText(currentPlayer);
        if (currentPlayer.equalsIgnoreCase("X")) {
          button2.setForeground(Color.GREEN);
          cell2 = 1;
          movesCount++;
        } else {
          button2.setForeground(Color.PINK);
          cell2 = 0;
          movesCount++;
        }
        choosePlayer();
        winningGame();
      }
    });
    button2.setFont(new Font("Tahoma", Font.BOLD, 80));
    panel2.add(button2, BorderLayout.CENTER);

    JPanel panel3 = new JPanel();
    panel3.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel3);
    panel3.setLayout(new BorderLayout(0, 0));

    JButton button3 = new JButton("");
    button3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        button3.setText(currentPlayer);
        if (currentPlayer.equalsIgnoreCase("X")) {
          button3.setForeground(Color.GREEN);
          cell3 = 1;
          movesCount++;
        } else {
          button3.setForeground(Color.PINK);
          cell3 = 0;
          movesCount++;
        }
        choosePlayer();
        winningGame();
      }
    });
    button3.setFont(new Font("Tahoma", Font.BOLD, 80));
    panel3.add(button3, BorderLayout.CENTER);

    JPanel panel4 = new JPanel();
    panel4.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel4);
    panel4.setLayout(new BorderLayout(0, 0));

    JLabel lblNewLabel = new JLabel("Player X");
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
    panel4.add(lblNewLabel, BorderLayout.CENTER);

    JPanel panel5 = new JPanel();
    panel5.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel5);
    panel5.setLayout(new BorderLayout(0, 0));

    xCountField = new JTextField();
    xCountField.setFont(new Font("Tahoma", Font.BOLD, 40));
    xCountField.setHorizontalAlignment(SwingConstants.CENTER);
    xCountField.setText("0");
    panel5.add(xCountField, BorderLayout.CENTER);
    xCountField.setColumns(10);

    JPanel panel7 = new JPanel();
    panel7.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel7);
    panel7.setLayout(new BorderLayout(0, 0));

    JButton button4 = new JButton("");
    button4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        button4.setText(currentPlayer);
        if (currentPlayer.equalsIgnoreCase("X")) {
          button4.setForeground(Color.GREEN);
          cell4 = 1;
          movesCount++;
        } else {
          button4.setForeground(Color.PINK);
          cell4 = 0;
          movesCount++;
        }
        choosePlayer();
        winningGame();
      }
    });
    button4.setFont(new Font("Tahoma", Font.BOLD, 80));
    panel7.add(button4, BorderLayout.CENTER);

    JPanel panel8 = new JPanel();
    panel8.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel8);
    panel8.setLayout(new BorderLayout(0, 0));

    JButton button5 = new JButton("");
    button5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        button5.setText(currentPlayer);
        if (currentPlayer.equalsIgnoreCase("X")) {
          button5.setForeground(Color.GREEN);
          cell5 = 1;
          movesCount++;
        } else {
          button5.setForeground(Color.PINK);
          cell5 = 0;
          movesCount++;
        }
        choosePlayer();
        winningGame();
      }
    });
    button5.setFont(new Font("Tahoma", Font.BOLD, 80));
    panel8.add(button5, BorderLayout.CENTER);

    JPanel panel6 = new JPanel();
    panel6.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel6);
    panel6.setLayout(new BorderLayout(0, 0));

    JButton button6 = new JButton("");
    button6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        button6.setText(currentPlayer);
        if (currentPlayer.equalsIgnoreCase("X")) {
          button6.setForeground(Color.GREEN);
          cell6 = 1;
          movesCount++;
        } else {
          button6.setForeground(Color.PINK);
          cell6 = 0;
          movesCount++;
        }
        choosePlayer();
        winningGame();
      }
    });
    button6.setFont(new Font("Tahoma", Font.BOLD, 80));
    panel6.add(button6, BorderLayout.CENTER);

    JPanel panel9 = new JPanel();
    panel9.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel9);
    panel9.setLayout(new BorderLayout(0, 0));

    JLabel label1 = new JLabel("Player O");
    label1.setFont(new Font("Tahoma", Font.BOLD, 25));
    label1.setHorizontalAlignment(SwingConstants.CENTER);
    panel9.add(label1, BorderLayout.CENTER);

    JPanel panel10 = new JPanel();
    panel10.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel10);
    panel10.setLayout(new BorderLayout(0, 0));

    oCountField = new JTextField();
    oCountField.setText("0");
    oCountField.setHorizontalAlignment(SwingConstants.CENTER);
    oCountField.setFont(new Font("Tahoma", Font.BOLD, 40));
    panel10.add(oCountField, BorderLayout.CENTER);
    oCountField.setColumns(10);

    JPanel panel11 = new JPanel();
    panel11.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel11);
    panel11.setLayout(new BorderLayout(0, 0));

    JButton button7 = new JButton("");
    button7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        button7.setText(currentPlayer);
        if (currentPlayer.equalsIgnoreCase("X")) {
          button7.setForeground(Color.GREEN);
          cell7 = 1;
          movesCount++;
        } else {
          button7.setForeground(Color.PINK);
          cell7 = 0;
          movesCount++;
        }
        choosePlayer();
        winningGame();
      }
    });
    button7.setFont(new Font("Tahoma", Font.BOLD, 80));
    panel11.add(button7, BorderLayout.CENTER);

    JPanel panel12 = new JPanel();
    panel12.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel12);
    panel12.setLayout(new BorderLayout(0, 0));

    JButton button8 = new JButton("");
    button8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        button8.setText(currentPlayer);
        if (currentPlayer.equalsIgnoreCase("X")) {
          button8.setForeground(Color.GREEN);
          cell8 = 1;
          movesCount++;
        } else {
          button8.setForeground(Color.PINK);
          cell8 = 0;
          movesCount++;
        }
        choosePlayer();
        winningGame();
      }
    });
    button8.setFont(new Font("Tahoma", Font.BOLD, 80));
    panel12.add(button8, BorderLayout.CENTER);

    JPanel panel13 = new JPanel();
    panel13.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel13);
    panel13.setLayout(new BorderLayout(0, 0));

    JButton button9 = new JButton("");
    button9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        button9.setText(currentPlayer);
        if (currentPlayer.equalsIgnoreCase("X")) {
          button9.setForeground(Color.GREEN);
          cell9 = 1;
          movesCount++;
        } else {
          button9.setForeground(Color.PINK);
          cell9 = 0;
          movesCount++;
        }
        choosePlayer();
        winningGame();
      }
    });
    button9.setFont(new Font("Tahoma", Font.BOLD, 80));
    panel13.add(button9, BorderLayout.CENTER);

    JPanel panel14 = new JPanel();
    panel14.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel14);
    panel14.setLayout(new BorderLayout(0, 0));

    JButton btnReset = new JButton("RESET");
    btnReset.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        button1.setText(null);
        button2.setText(null);
        button3.setText(null);
        button4.setText(null);
        button5.setText(null);
        button6.setText(null);
        button7.setText(null);
        button8.setText(null);
        button9.setText(null);
        cell1 = 10;
        cell2 = 10;
        cell3 = 10;
        cell4 = 10;
        cell5 = 10;
        cell6 = 10;
        cell7 = 10;
        cell8 = 10;
        cell9 = 10;
        movesCount = 0;
      }
    });
    btnReset.setFont(new Font("Tahoma", Font.BOLD, 28));
    panel14.add(btnReset, BorderLayout.CENTER);

    JPanel panel15 = new JPanel();
    panel15.setBorder(new LineBorder(new Color(0, 0, 0), 0));
    panel.add(panel15);
    panel15.setLayout(new BorderLayout(0, 0));

    JButton btnExit = new JButton("EXIT");
    btnExit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {

        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Do you want to exit?", "Tic Tac Toe",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
          System.exit(0);

        }

      }
    });
    btnExit.setFont(new Font("Tahoma", Font.BOLD, 28));
    panel15.add(btnExit, BorderLayout.CENTER);
  }

}