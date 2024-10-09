package exemplo2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Douglas");
		nomes.add(0, "Gabriela");
		nomes.add("Matheus");
		nomes.add(2, "Igor");
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(i + 1 + ": " + nomes.get(i));
		}
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(1122212);
		
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(i + 1 + ": " + nums.get(i));
		}
	} 
}
