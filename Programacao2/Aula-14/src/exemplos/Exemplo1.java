package exemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		int[] nums = {13, 56, 78, 98, 3, 34,};
		
		Arrays.sort(nums);
		
		for (int i : nums) {
			System.out.print(i + " ");
		}
		
		Scanner s = new Scanner(System.in);
		int chave = Integer.parseInt(s.nextLine());
		int index = Arrays.binarySearch(nums, chave);
		
		if (index < 0) {
			System.out.println("não encontrado");
		} else {
			System.out.println("posição: " + index);
		}
	}
}
