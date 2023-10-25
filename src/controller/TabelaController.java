package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TabelaController implements ITabelaController {
	
	public TabelaController() {
		super();
	}

	@Override
	public void readFile(String path, String nome) throws IOException {
		File tab = new File(path, nome);
		if (tab.exists() && tab.isFile()) {
			FileInputStream fluxo = new FileInputStream (tab);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			String [] camada = new String [4];
			while (linha != null) {
				camada = linha.split(",");
				if (camada[2].equals("Fruits")) {
					System.out.println(camada[0] +"\t"+ camada[1] + "\t" +camada[3]+"\n");
				}
				
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		}else {
			System.out.println("Diretorio ou arquivo inexistente.");
		}
		
	}

}
