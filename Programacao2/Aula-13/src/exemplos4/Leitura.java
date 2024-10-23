package exemplos4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Leitura {
	
	public static void main(String[] args) {
		
		File a1 = new File("textos/nomes.txt");
		
		try {
			
			FileReader fr = new FileReader(a1);
			BufferedReader bw = new BufferedReader(fr);
			
			//aqui cod leitura txt
			String linha = null;
			
			while ((linha = bw.readLine()) != null) {
				System.out.println(linha);
			}
			
			bw.close();
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
