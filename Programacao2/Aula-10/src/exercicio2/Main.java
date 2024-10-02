package exercicio2;

public class Main {

	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor();
		
		fornecedor.setNome("Douglas");
		fornecedor.setEmail("email@email.com");
		fornecedor.setTel("123248541451");
		fornecedor.setValorCredito(1200);
		fornecedor.setValorDivida(800);

		System.out.println("A divida do fornecedor " + fornecedor.getNome() + " é de R$" + fornecedor.imprimirSaldo() + ",00");
		
		
		System.out.println(" ----------------- ");
		
		Empregado empregado = new Empregado();
		
		empregado.setNome("Matheus");
		empregado.setEmail("email2@email.com");
		empregado.setTel("1515151521");
		empregado.setCodigoSetor(123);
		empregado.setSalarioBruto(1200.90);
		empregado.setImposto(4);
		
		System.out.println("O empregado " + empregado.getNome() + " do setor " + empregado.getCodigoSetor() + " tem um " + empregado.imprimeSalario());
		
		System.out.println(" ----------------- ");
		
		Vendedor vendedor = new Vendedor();
		
		vendedor.setNome("Pablo");
		vendedor.setValorVendas(100);
		vendedor.setComissao(5);
		vendedor.setSalarioBruto(1200);
		
		System.out.println("Vendedor " + vendedor.getNome() + " Salario com comissao " + vendedor.imprimirSalarioVendedor());
		
		System.out.println(" ----------------- ");
		
		Operario operario = new Operario();
		operario.setNome("Joao");
		operario.setValorProducao(500);
		operario.setSalarioBruto(3000);
		
		
		System.out.println("Operario " + operario.getNome() + " Salario com comissao " + operario.imprimirSalarioOperario());
	}

}
