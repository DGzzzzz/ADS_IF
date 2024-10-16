package exemplos;

public class Teste2 {
	public static void main(String[] args) {
		
		int w = 0;
		int x = 10;		
		
		try {
			
			int d = x/w;
			System.out.println(d);
			
			int[] nums = new int[2];
			int mynums = nums[x];
			System.out.println(mynums);
			
		} catch (ArithmeticException e) {
			
			System.out.println("Divisao por zero");
			
		}
	
	}
}
