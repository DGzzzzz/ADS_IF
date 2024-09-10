package exemplos;

public class TesteProduto {
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		System.out.println(produto.getCodigo());
		System.out.println(produto.getDescricao());
		System.out.println(produto.getPreco());
		
		Produto produto2 = new Produto(2, "Mouse", 20.50);
		System.out.println(produto2.getCodigo());
		System.out.println(produto2.getDescricao());
		System.out.println(produto2.getPreco());
	}
}
