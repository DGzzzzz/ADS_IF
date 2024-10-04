package exercicio2;

public class Main {

	public static void main(String[] args) {

		String nomeFornecedor = "Alex";
		String emailFornecedor = "email@fornecedor.com";
		String telFornecedor = "1518265481";
		double valorDividaFornecedor = 158.50;
		double valorCreditoFornecedor = 850.10;

		Fornecedor fornecedor = new Fornecedor(nomeFornecedor, emailFornecedor, telFornecedor, valorDividaFornecedor, valorCreditoFornecedor);

		fornecedor.obterSaldo();
		fornecedor.imprimirDadosFornecedor();
		System.out.println(fornecedor.imprimirSaldo());

		System.out.println("--------------------------------------------------------------");

		String nomeEmpregado = "Douglas";
		String emailEmpregado = "email@gmail.com";
		String telEmpregado = "1518185184";
		Integer codigoSetorEmpregado = 54;
		double salarioBrutoEmpregado = 1250.5;

        Empregado empregado = new Empregado(nomeEmpregado, emailEmpregado, telEmpregado, codigoSetorEmpregado, salarioBrutoEmpregado);

		empregado.calcularSalario();
		empregado.imprimeEmpregado();
		System.out.println(empregado.imprimeSalario());


		System.out.println("--------------------------------------------------------------");

		String nomeAdm = "Jessica";
		String emailAdm = "email@adm.com";
		String telAdm = "1518265481";
		Integer codigoSetorAdm = 11;
		double salarioBrutoAdm = 2100.100;
		double ajudaCustoAdm = 150.50;

		Administrador adm = new Administrador(nomeAdm, emailAdm, telAdm, codigoSetorAdm, salarioBrutoAdm, ajudaCustoAdm);

		adm.calcularSalarioAdmin();
		adm.imprimeDadosAdm();


		System.out.println("--------------------------------------------------------------");

		String nomeOperador = "Matheus";
		String emailOperador = "email@operador.com";
		String telOperador = "1518265481";
		Integer codigoSetorOperador = 54;
		double salarioBrutoOperador = 4000.50;
		double valorProducaoOperador = 450.00;

		Operario operario = new Operario(nomeOperador, emailOperador, telOperador, codigoSetorOperador, salarioBrutoOperador, valorProducaoOperador);

		operario.calcularSalarioOperario();
		operario.imprimirDadosOperador();

		System.out.println("--------------------------------------------------------------");

		String nomeVendedor = "Pau";
		String emailVendedor = "email@vendedor.com";
		String telVendedor = "1518265481";
		Integer codigoSetorVendedor = 13;
		double salarioBrutoVendedor = 4000.50;
		double valorVendaVendedor = 450.00;

		Vendedor vendedor = new Vendedor(nomeVendedor, emailVendedor, telVendedor, codigoSetorVendedor, salarioBrutoVendedor, valorVendaVendedor);

		vendedor.calcularSalarioVendedor();
		vendedor.imprimirDadosVendedor();
    }
}
