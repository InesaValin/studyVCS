package lt.vcs.third;

public class Main {

	public static void main(String[] args) {
	
		String mintys = "Visi didieji darbai ir visos didziosios mintys prasideda nuo juokingai menku dalyku";
		String spalva = "Ruda";
		
		String text = "Visuomet perdetai galvoji apie tai, ko nezinai";
		String color ="Melyna";
		
		Page kamiu = new Page(spalva,mintys);
		Page kamiu2 = new Page (color,text);
		
		
	

		kamiu.howManyWords();
		kamiu.findWord();
		kamiu.deleteWord();
		kamiu.changeColor();
		kamiu.deleteText();
		
		kamiu2.howManyWords();	
		kamiu2.findWord();
		kamiu2.deleteWord();
		kamiu2.changeColor();
		kamiu2.deleteText();

	}

}
