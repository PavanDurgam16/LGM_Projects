import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ScientificCalculator {

	private JFrame frame;
	private JTextField textField;

	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ScientificCalculator() {
		initialize();
	}

	private void initialize() {
		try {
			frame = new JFrame();
			frame.getContentPane().setBackground(new Color(128, 128, 128));
			frame.setForeground(Color.WHITE);
			frame.getContentPane().setForeground(Color.BLACK);
			frame.setBounds(100, 100, 685, 436);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);

			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.RIGHT);
			textField.setFont(new Font("Tahoma", Font.BOLD, 18));
			textField.setBounds(28, 27, 616, 102);
			frame.getContentPane().add(textField);
			textField.setColumns(10);

			JButton btn2 = new JButton("2");
			btn2.setBackground(new Color(128, 128, 255));
			btn2.setForeground(new Color(0, 0, 128));
			btn2.setSize(new Dimension(40, 40));
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String number = textField.getText() + btn2.getText();
					textField.setText(number);
				}
			});
			btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
			btn2.setBounds(438, 295, 64, 50);
			frame.getContentPane().add(btn2);

			JButton btn5 = new JButton("5");
			btn5.setBackground(new Color(128, 128, 255));
			btn5.setForeground(new Color(0, 0, 128));
			btn5.setSize(new Dimension(40, 40));
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String number = textField.getText() + btn5.getText();
					textField.setText(number);
				}
			});
			btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
			btn5.setBounds(438, 243, 64, 50);
			frame.getContentPane().add(btn5);

			JButton btn8 = new JButton("8");
			btn8.setBackground(new Color(128, 128, 255));
			btn8.setForeground(new Color(0, 0, 128));
			btn8.setSize(new Dimension(40, 40));
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String number = textField.getText() + btn8.getText();
					textField.setText(number);
				}
			});
			btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
			btn8.setBounds(438, 191, 64, 50);
			frame.getContentPane().add(btn8);

			JButton btnC = new JButton("C");
			btnC.setBackground(new Color(128, 128, 255));
			btnC.setForeground(new Color(255, 0, 0));
			btnC.setSize(new Dimension(40, 40));
			btnC.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textField.setText(null);
				}
			});
			btnC.setBounds(290, 139, 64, 50);
			frame.getContentPane().add(btnC);

			JButton btnLn = new JButton("sinh");
			btnLn.setBackground(new Color(128, 128, 255));
			btnLn.setForeground(new Color(0, 0, 128));
			btnLn.setSize(new Dimension(40, 40));
			btnLn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double value = Math.sinh(Double.parseDouble(textField.getText()));
			        textField.setText(String.valueOf(value));
				}
			});
			btnLn.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnLn.setBounds(28, 243, 78, 50);
			frame.getContentPane().add(btnLn);

			JButton btn0 = new JButton("0");
			btn0.setBackground(new Color(128, 128, 255));
			btn0.setForeground(new Color(0, 0, 128));
			btn0.setSize(new Dimension(40, 40));
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String number = textField.getText() + btn0.getText();
					textField.setText(number);
				}
			});
			btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
			btn0.setBounds(364, 347, 138, 50);
			frame.getContentPane().add(btn0);

			JButton btnSin = new JButton("sin");
			btnSin.setBackground(new Color(128, 128, 255));
			btnSin.setForeground(new Color(0, 0, 128));
			btnSin.setSize(new Dimension(40, 40));
			btnSin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double value = Math.sin(Double.parseDouble(textField.getText()));
			        textField.setText(String.valueOf(value));


				}
			});
			btnSin.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnSin.setBounds(28, 191, 78, 50);
			frame.getContentPane().add(btnSin);

			JButton btnDot = new JButton(".");
			btnDot.setBackground(new Color(128, 128, 255));
			btnDot.setForeground(new Color(0, 0, 128));
			btnDot.setSize(new Dimension(40, 40));
			btnDot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String number = textField.getText() + btnDot.getText();
					textField.setText(number);
				}
			});
			btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnDot.setBounds(504, 347, 78, 50);
			frame.getContentPane().add(btnDot);

			JButton btnEqual = new JButton("=");
			btnEqual.setBackground(new Color(0, 128, 0));
			btnEqual.setForeground(new Color(0, 0, 128));
			btnEqual.setSize(new Dimension(40, 40));
			btnEqual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String answer;
					second = Double.parseDouble(textField.getText());
					if (operation == "+") {
						result = first + second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					} else if (operation == "-") {
						result = first - second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					} else if (operation == "*") {
						result = first * second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					} else if (operation == "/") {
						result = first / second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					} else if (operation == "%") {
						result = first % second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					} else if (operation == "X^Y") {
						double resultt = 1;
						for (int i = 0; i < second; i++) {
							resultt = first * resultt;
							answer = String.format("%.2f", resultt);
							textField.setText(answer);
						}
					}

				}
			});
			btnEqual.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnEqual.setBounds(592, 295, 64, 102);
			frame.getContentPane().add(btnEqual);

			JButton btnXrx = new JButton("X^Y");
			btnXrx.setBackground(new Color(128, 128, 255));
			btnXrx.setForeground(new Color(0, 0, 128));
			btnXrx.setSize(new Dimension(40, 40));
			btnXrx.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "xrx";

				}
			});
			btnXrx.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnXrx.setBounds(28, 295, 78, 50);
			frame.getContentPane().add(btnXrx);

			JButton btnLog = new JButton("log");
			btnLog.setBackground(new Color(128, 128, 255));
			btnLog.setForeground(new Color(0, 0, 128));
			btnLog.setSize(new Dimension(40, 40));
			btnLog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double value = Math.log(Double.parseDouble(textField.getText()));
			        textField.setText(String.valueOf(value));

				}
			});
			btnLog.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnLog.setBounds(111, 347, 78, 50);
			frame.getContentPane().add(btnLog);

			JButton btnCe = new JButton("CE");
			btnCe.setBackground(new Color(128, 128, 255));
			btnCe.setForeground(new Color(0, 0, 128));
			btnCe.setSize(new Dimension(40, 40));
			btnCe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textField.setText(null);
				}
			});
			btnCe.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnCe.setBounds(290, 191, 64, 50);
			frame.getContentPane().add(btnCe);

			JButton btn7 = new JButton("7");
			btn7.setBackground(new Color(128, 128, 255));
			btn7.setForeground(new Color(0, 0, 128));
			btn7.setSize(new Dimension(40, 40));
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String number = textField.getText() + btn7.getText();
					textField.setText(number);
				}
			});
			btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
			btn7.setBounds(364, 191, 64, 50);
			frame.getContentPane().add(btn7);

			JButton btn4 = new JButton("4");
			btn4.setBackground(new Color(128, 128, 255));
			btn4.setForeground(new Color(0, 0, 128));
			btn4.setSize(new Dimension(40, 40));
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String number = textField.getText() + btn4.getText();
					textField.setText(number);
				}
			});
			btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
			btn4.setBounds(364, 243, 64, 50);
			frame.getContentPane().add(btn4);

			JButton btn1 = new JButton("1");
			btn1.setBackground(new Color(128, 128, 255));
			btn1.setForeground(new Color(0, 0, 128));
			btn1.setSize(new Dimension(40, 40));
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String number = textField.getText() + btn1.getText();
					textField.setText(number);
				}
			});
			btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
			btn1.setBounds(364, 295, 64, 50);
			frame.getContentPane().add(btn1);

			JButton btnX = new JButton("x3");
			btnX.setBackground(new Color(128, 128, 255));
			btnX.setForeground(new Color(0, 0, 128));
			btnX.setSize(new Dimension(40, 40));
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double a = (Double.parseDouble(textField.getText()));
					a = a * a * a;
					textField.setText("");
					textField.setText(textField.getText() + a);

				}
			});
			btnX.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnX.setBounds(189, 295, 78, 50);
			frame.getContentPane().add(btnX);

			JButton btnEx = new JButton("ex");
			btnEx.setBackground(new Color(128, 128, 255));
			btnEx.setForeground(new Color(0, 0, 128));
			btnEx.setSize(new Dimension(40, 40));
			btnEx.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double value = Math.exp(Double.parseDouble(textField.getText()));
			        textField.setText(String.valueOf(value));

				}
			});
			btnEx.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnEx.setBounds(28, 347, 78, 50);
			frame.getContentPane().add(btnEx);

			JButton btnx = new JButton("1/x");
			btnx.setBackground(new Color(128, 128, 255));
			btnx.setForeground(new Color(0, 0, 128));
			btnx.setSize(new Dimension(40, 40));
			btnx.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double a = 1 / Math.sqrt(Double.parseDouble(textField.getText()));
					textField.setText("");
					textField.setText(textField.getText() + a);

				}
			});
			btnx.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnx.setBounds(189, 347, 78, 50);
			frame.getContentPane().add(btnx);

			JButton btnSqrt = new JButton("\u221A");
			btnSqrt.setBackground(new Color(128, 128, 255));
			btnSqrt.setForeground(new Color(0, 0, 128));
			btnSqrt.setSize(new Dimension(40, 40));
			btnSqrt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double value = Math.sqrt(Double.parseDouble(textField.getText()));
			        textField.setText(String.valueOf(value));

				}
			});
			btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnSqrt.setBounds(290, 243, 64, 50);
			frame.getContentPane().add(btnSqrt);

			JButton btnCos = new JButton("cos");
			btnCos.setBackground(new Color(128, 128, 255));
			btnCos.setForeground(new Color(0, 0, 128));
			btnCos.setSize(new Dimension(40, 40));
			btnCos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double value = Math.cos(Double.parseDouble(textField.getText()));
			        textField.setText(String.valueOf(value));
				}
			});
			btnCos.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnCos.setBounds(111, 191, 78, 50);
			frame.getContentPane().add(btnCos);

			JButton btnCos_1 = new JButton("cosh");
			btnCos_1.setBackground(new Color(128, 128, 255));
			btnCos_1.setForeground(new Color(0, 0, 128));
			btnCos_1.setSize(new Dimension(40, 40));
			btnCos_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double value = Math.cosh(Double.parseDouble(textField.getText()));
			        textField.setText(String.valueOf(value));
				}
			});
			btnCos_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnCos_1.setBounds(111, 243, 78, 50);
			frame.getContentPane().add(btnCos_1);

			JButton btnBackSpace = new JButton("B");
			btnBackSpace.setBackground(new Color(128, 128, 255));
			btnBackSpace.setForeground(new Color(255, 0, 0));
			btnBackSpace.setSize(new Dimension(40, 40));
			btnBackSpace.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String backSpace = null;
					if (textField.getText().length() > 0) {
						StringBuilder str = new StringBuilder(textField.getText());
						str.deleteCharAt(textField.getText().length() - 1);
						backSpace = str.toString();
						textField.setText(backSpace);
					}
				}
			});
			btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnBackSpace.setBounds(364, 139, 138, 50);
			frame.getContentPane().add(btnBackSpace);

			JButton btn9 = new JButton("9");
			btn9.setBackground(new Color(128, 128, 255));
			btn9.setForeground(new Color(0, 0, 128));
			btn9.setSize(new Dimension(40, 40));
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String number = textField.getText() + btn9.getText();
					textField.setText(number);
				}
			});
			btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
			btn9.setBounds(504, 191, 78, 50);
			frame.getContentPane().add(btn9);

			JButton btn6 = new JButton("6");
			btn6.setBackground(new Color(128, 128, 255));
			btn6.setForeground(new Color(0, 0, 128));
			btn6.setSize(new Dimension(40, 40));
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String number = textField.getText() + btn6.getText();
					textField.setText(number);
				}
			});
			btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
			btn6.setBounds(504, 243, 78, 50);
			frame.getContentPane().add(btn6);

			JButton btn3 = new JButton("3");
			btn3.setBackground(new Color(128, 128, 255));
			btn3.setForeground(new Color(0, 0, 128));
			btn3.setSize(new Dimension(40, 40));
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String number = textField.getText() + btn3.getText();
					textField.setText(number);
				}
			});
			btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
			btn3.setBounds(504, 295, 78, 50);
			frame.getContentPane().add(btn3);

			JButton btnTan = new JButton("tan");
			btnTan.setBackground(new Color(128, 128, 255));
			btnTan.setForeground(new Color(0, 0, 128));
			btnTan.setSize(new Dimension(40, 40));
			btnTan.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double value = Math.tan(Double.parseDouble(textField.getText()));
			        textField.setText(String.valueOf(value));
				}
			});
			btnTan.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnTan.setBounds(189, 191, 78, 50);
			frame.getContentPane().add(btnTan);

			JButton btnTan_1 = new JButton("tanh");
			btnTan_1.setBackground(new Color(128, 128, 255));
			btnTan_1.setForeground(new Color(0, 0, 128));
			btnTan_1.setSize(new Dimension(40, 40));
			btnTan_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double value = Math.tanh(Double.parseDouble(textField.getText()));
			        textField.setText(String.valueOf(value));

				}
			});
			btnTan_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnTan_1.setBounds(189, 243, 78, 50);
			frame.getContentPane().add(btnTan_1);

			JButton btnPlus = new JButton("+");
			btnPlus.setBackground(new Color(128, 128, 255));
			btnPlus.setForeground(new Color(0, 0, 128));
			btnPlus.setSize(new Dimension(40, 40));
			btnPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					first = Double.parseDouble(textField.getText());

					textField.setText("");

					operation = "+";
				}
			});
			btnPlus.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnPlus.setBounds(504, 139, 78, 50);
			frame.getContentPane().add(btnPlus);

			JButton btnSub = new JButton("-");
			btnSub.setBackground(new Color(128, 128, 255));
			btnSub.setForeground(new Color(0, 0, 128));
			btnSub.setSize(new Dimension(40, 40));
			btnSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "-";
				}
			});
			btnSub.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnSub.setBounds(592, 139, 64, 50);
			frame.getContentPane().add(btnSub);

			JButton btnMul = new JButton("*");
			btnMul.setBackground(new Color(128, 128, 255));
			btnMul.setForeground(new Color(0, 0, 128));
			btnMul.setSize(new Dimension(40, 40));
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "*";
				}
			});
			btnMul.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnMul.setBounds(592, 191, 64, 50);
			frame.getContentPane().add(btnMul);

			JButton btnDivide = new JButton("/");
			btnDivide.setBackground(new Color(128, 128, 255));
			btnDivide.setForeground(new Color(0, 0, 128));
			btnDivide.setSize(new Dimension(40, 40));
			btnDivide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "/";
				}
			});
			btnDivide.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnDivide.setBounds(592, 243, 64, 50);
			frame.getContentPane().add(btnDivide);

			JButton btnP_1 = new JButton("x2");
			btnP_1.setBackground(new Color(128, 128, 255));
			btnP_1.setForeground(new Color(0, 0, 128));
			btnP_1.setSize(new Dimension(40, 40));
			btnP_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double a = (Double.parseDouble(textField.getText()));
					a = a * a;
					textField.setText("");
					textField.setText(textField.getText() + a);

				}
			});
			btnP_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnP_1.setBounds(111, 295, 78, 50);
			frame.getContentPane().add(btnP_1);

			JButton btnN = new JButton("n!");
			btnN.setBackground(new Color(128, 128, 255));
			btnN.setForeground(new Color(0, 0, 128));
			btnN.setSize(new Dimension(40, 40));
			btnN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double a = (Double.parseDouble(textField.getText()));
					double f = 1;
					while (a != 0) {
						f = f * a;
						a--;
					}
					textField.setText("");
					textField.setText(textField.getText() + f);

				}
			});
			btnN.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnN.setBounds(290, 295, 64, 50);
			frame.getContentPane().add(btnN);

			JSeparator separator = new JSeparator();
			separator.setBounds(72, 291, 1, 2);
			frame.getContentPane().add(separator);

			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(19, 191, 1, 2);
			frame.getContentPane().add(separator_1);

			JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
			rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
			rdbtnNewRadioButton.setForeground(new Color(0, 255, 64));
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 14));
			rdbtnNewRadioButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					btn1.setEnabled(true);
					btn2.setEnabled(true);
					btn3.setEnabled(true);
					btn4.setEnabled(true);
					btn5.setEnabled(true);
					btn6.setEnabled(true);
					btn7.setEnabled(true);
					btn8.setEnabled(true);
					btn9.setEnabled(true);
					btnBackSpace.setEnabled(true);
					btnC.setEnabled(true);
					btnCe.setEnabled(true);
					btnCos.setEnabled(true);
					btnCos_1.setEnabled(true);
					btnDivide.setEnabled(true);
					btnDot.setEnabled(true);
					btnEqual.setEnabled(true);
					btnEx.setEnabled(true);
					btnLn.setEnabled(true);
					btnLog.setEnabled(true);
					btnMul.setEnabled(true);
					btnN.setEnabled(true);
					btnP_1.setEnabled(true);
					btnPlus.setEnabled(true);
					btnSin.setEnabled(true);
					btnSqrt.setEnabled(true);
					btnSub.setEnabled(true);
					btnTan.setEnabled(true);
					btnTan_1.setEnabled(true);
					btnX.setEnabled(true);
					btnx.setEnabled(true);
					btnXrx.setEnabled(true);
					rdbtnNewRadioButton.setEnabled(true);
					btn0.setEnabled(true);

				}
			});
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setBounds(28, 146, 78, 37);
			frame.getContentPane().add(rdbtnNewRadioButton);

			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
			buttonGroup.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
			rdbtnNewRadioButton_1.setForeground(new Color(0, 255, 64));
			rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					btnBackSpace.setEnabled(false);
					btnC.setEnabled(false);
					btnCe.setEnabled(false);
					btnCos.setEnabled(false);
					btnCos_1.setEnabled(false);
					btnDivide.setEnabled(false);
					btnDot.setEnabled(false);btn9.setEnabled(false);
					btnEqual.setEnabled(false);
					btnEx.setEnabled(false);
					btnLn.setEnabled(false);
					btnLog.setEnabled(false);
					btnMul.setEnabled(false);
					btnN.setEnabled(false);
					btnP_1.setEnabled(false);
					btnPlus.setEnabled(false);
					btnSin.setEnabled(false);
					btnSqrt.setEnabled(false);
					btnSub.setEnabled(false);
					btnTan.setEnabled(false);
					btnTan_1.setEnabled(false);
					btnX.setEnabled(false);
					btnx.setEnabled(false);
					btnXrx.setEnabled(false);
					rdbtnNewRadioButton_1.setEnabled(false);
					btn0.setEnabled(false);
					
					
				}
			});
			rdbtnNewRadioButton_1.setBounds(108, 146, 64, 37);
			frame.getContentPane().add(rdbtnNewRadioButton_1);

			JButton button = new JButton("+/-");
			button.setBackground(new Color(128, 128, 255));
			button.setForeground(new Color(0, 0, 128));
			button.setSize(new Dimension(40, 40));
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double value = Double.parseDouble(textField.getText());
			        value = -value; // Negate the value
			        textField.setText(String.valueOf(value));

				}
			});
			button.setFont(new Font("Tahoma", Font.BOLD, 14));
			button.setBounds(290, 347, 64, 50);
			frame.getContentPane().add(button);
		} catch (Exception e) {
			textField.setText("Syntax Error!");
		}
	}
}
