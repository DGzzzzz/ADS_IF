package exemplos4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriacaoDiretorio {

	public static void main(String[] args) {

		File d1 = new File("textos");
		
		d1.mkdir(); // cria pasta
		
		File a1 = new File("textos/nomes.txt");
		
		try {
			
			a1.createNewFile();			
			FileWriter fw = new FileWriter(a1, false);
			BufferedWriter bw = new BufferedWriter(fw);
			
			// escrita no txt abaixo
			bw.write("Olá mundo\n");
			bw.write("vamoooooooooo");
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
