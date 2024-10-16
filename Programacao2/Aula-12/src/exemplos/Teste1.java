package exemplos;

public class Teste1 {
	public static void main(String[] args) {
		
		int w = 0;
		int x = 10;
		
		try {
			int d = x/w;
			System.out.println(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Passou 1");
		
		int[] nums = new int[2];
		
		try {
			int mynums = nums[x];
			System.out.println(mynums);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Passou 1");
	}
}
