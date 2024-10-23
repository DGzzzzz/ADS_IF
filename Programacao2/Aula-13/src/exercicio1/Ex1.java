package exercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex1 {

	public static void main(String[] args) {
		
		File a1 = new File("ex1/entrada.txt");
		
		try {
			
			FileReader fr = new FileReader(a1);
			BufferedReader bw = new BufferedReader(fr);
			
			//aqui cod leitura txt
			String linhas = null;
			
			while((linhas = bw.readLine()) != null ) {
				String[] linha1 = linhas.split(" ");
				int soma = 0;
				for (int i = 0; i < linha1.length; i++) {
					soma += Integer.parseInt(linha1[i]);
				}
				System.out.println(soma);
			}	
			
			bw.close();
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
