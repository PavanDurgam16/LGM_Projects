package task;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileFunctions {

	NotePadInterface npi;
	String fileName;
	String fileAdd;

	public FileFunctions(NotePadInterface npi) {
		this.npi = npi;
	}

	public void newFileMethod() {
		npi.textArea.setText("");
		npi.window.setTitle("New");
		fileName = null;
		fileAdd = null;
	}

	public void openMethod() {
		FileDialog fd = new FileDialog(npi.window, "Open", FileDialog.LOAD);
		fd.setVisible(true);

		if (fd.getFile() != null) {
			fileName = fd.getFile();
			fileAdd = fd.getDirectory();
			npi.window.setTitle(fileName);

			try {
				BufferedReader br = new BufferedReader(new FileReader(fileAdd + fileName));
				npi.textArea.setText("");
				String line = null;
				while ((line = br.readLine()) != null) {
					npi.textArea.append(line + "\n");
				}
				br.close();
			} catch (Exception e) {
				System.out.println("File Not Opened!");
			}
		}
	}

	public void saveMethod() {

		if(fileName ==null) {
			saveAsMethod();
		}
		else {
			try {
				FileWriter fw = new FileWriter(fileAdd + fileName);
				fw.write(npi.textArea.getText());
				npi.window.setTitle(fileName);
				fw.close();
			} catch (Exception e) {
				System.out.println("Something Wrong!");
			}
		}
			
	}

	public void saveAsMethod() {
		FileDialog fd = new FileDialog(npi.window, "Save", FileDialog.SAVE);
		fd.setVisible(true);
		if (fd.getFile() != null) {
			fileName = fd.getFile();
			fileAdd = fd.getDirectory();
			npi.window.setTitle(fileName);
		}

		try {
			FileWriter fw = new FileWriter(fileAdd + fileName);
			fw.write(npi.textArea.getText());
			fw.close();
		} catch (Exception e) {
			System.out.println("SOMETHING WRONG!");
		}

	}

	public void exitMethod(){
		System.exit(0);
	}
}
