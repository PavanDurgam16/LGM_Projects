package task;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NotePadInterface implements ActionListener {

	JFrame window;
	JTextArea textArea;
	JScrollPane scrollPane;
	JMenuBar menuBar;
	JMenu fileMenu, editMenu, formatMenu, colorMenu;
	JMenuItem new1, open1, save1, saveAs1, exit1;
	
	JMenuItem wrap1,fontArial,fontTNR, fontSize8, fontSize12, fontSize16, fontSize20, fontSize24, fontSize28;;
	JMenu fontMenu, fontSizeMenu;

	FileFunctions file = new FileFunctions(this);
	FormatFunctions format = new FormatFunctions(this);
	 boolean wordWrapOn =false;
	
	
	public static void main(String[] args) {
		new NotePadInterface();
	}

	public NotePadInterface() {
		createWindow();
		createTextArea();
		createMenuMenuBar();
		createFileMenu();
		createForatMenu();
		window.setVisible(true);
	}

	public void createWindow() {
		window = new JFrame("Notepad");
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void createTextArea() {

		textArea = new JTextArea();
		scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		window.add(scrollPane);
	}

	public void createMenuMenuBar() {
		menuBar = new JMenuBar();
		window.setJMenuBar(menuBar);
		
		
		fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		
		editMenu = new JMenu("Edit");
		menuBar.add(editMenu);
		
		formatMenu = new JMenu("Format");
		menuBar.add(formatMenu);
		
		colorMenu = new JMenu("Color");
		menuBar.add(colorMenu);
		
	}
	
	public void createFileMenu() {
		
		new1 = new JMenuItem("New");
		new1.addActionListener(this);
		new1.setActionCommand("New");
		fileMenu.add(new1);
		
		open1 = new JMenuItem("Open");
		open1.addActionListener(this);
		open1.setActionCommand("Open");
		fileMenu.add(open1);
		
		save1 = new JMenuItem("Save");
		save1.addActionListener(this);
		save1.setActionCommand("Save");
		fileMenu.add(save1);
		
		saveAs1 = new JMenuItem("Save As");
		saveAs1.addActionListener(this);
		saveAs1.setActionCommand("Save As");
		fileMenu.add(saveAs1);
		
		exit1 = new JMenuItem("Exit");
		exit1.addActionListener(this);
		exit1.setActionCommand("Exit");
		fileMenu.add(exit1);
	}
	
	public void createForatMenu() {
		wrap1 = new JMenuItem("Word Wrap: Off"); 
		wrap1.addActionListener(this); 
		wrap1.setActionCommand("Word Wrap"); 
		formatMenu.add(wrap1);
		
		fontMenu = new JMenu("Font"); 
		formatMenu.add(fontMenu);
		
		fontArial = new JMenuItem("Arial");
		fontArial.addActionListener(this); 
		fontArial.setActionCommand("Arial"); 
		fontMenu.add(fontArial);
		
		fontTNR = new JMenuItem("Times New Roman");
		fontTNR.addActionListener(this);
		fontTNR.setActionCommand("Times New Roman");
		fontMenu.add(fontTNR);
		
		fontSizeMenu = new JMenu("Font Size"); 
		formatMenu.add(fontSizeMenu);
		
		fontSize8 = new JMenuItem("8"); 
		fontSize8.addActionListener(this); 
		fontSize8.setActionCommand("size8"); 
		fontSizeMenu.add(fontSize8);
		
		fontSize12 = new JMenuItem("12"); 
		fontSize12.addActionListener(this); 
		fontSize12.setActionCommand("size12"); 
		fontSizeMenu.add(fontSize12);
		
		fontSize16 = new JMenuItem("16");
		fontSize16.addActionListener(this);
		fontSize16.setActionCommand("size16");
		fontSizeMenu.add(fontSize16);
		
		fontSize20 = new JMenuItem("20");
		fontSize20.addActionListener(this);
		fontSize20.setActionCommand("size20");
		fontSizeMenu.add(fontSize20);
		
		fontSize24 = new JMenuItem("24"); 
		fontSize24.addActionListener(this);
		fontSize24.setActionCommand("size24");
		fontSizeMenu.add(fontSize24);
		
		fontSize28 = new JMenuItem("8");
		fontSize28.addActionListener(this); 
		fontSize28.setActionCommand("size28");
		fontSizeMenu.add(fontSize28);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		switch(command) { 
		case "New": 
			file.newFileMethod(); 
		break; 
		case "Open":
			file.openMethod(); 
		break; 
		case "Save": 
			file.saveMethod(); 
		break; 
		case "Save As": 
			file.saveAsMethod(); 
		break;
		case "Exit": 
			file.exitMethod(); 
		break;
		case "Word Wrap": 
			format.wordWrap(); 
			break;
		
		}
		
	}

}
