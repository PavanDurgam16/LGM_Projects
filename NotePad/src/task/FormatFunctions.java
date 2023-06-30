package task;

public class FormatFunctions {

	NotePadInterface npi;

	public FormatFunctions(NotePadInterface npi) {
		this.npi = npi;
	}
	
	public void wordWrap() {
		if (npi.wordWrapOn == false) 
		{ npi.wordWrapOn =true; 
		npi.textArea.setLineWrap(true); 
		npi.textArea.setWrapStyleWord(true); 
		npi.wrap1.setText("Word Wrap: On");
		} else if(npi.wordWrapOn ==true) { 
			npi.wordWrapOn=false;
			npi.textArea.setLineWrap(false); 
			npi.textArea.setWrapStyleWord(false); 
			npi.wrap1.setText("Word Wrap: Od");
		}
}
}
