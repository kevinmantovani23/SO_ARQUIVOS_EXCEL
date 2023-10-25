package view;

import java.io.IOException;

import controller.TabelaController;

public class Main {

	public static void main(String[] args) {
		
		TabelaController tabCont = new TabelaController ();
		String path = "C:\\TEMP";
		String nome = "generic_food.csv";
		
		try {
			tabCont.readFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
