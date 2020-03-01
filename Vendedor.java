
public class Vendedor extends Funcionario implements Comissoes{

	private double totalVendas;
	private double comissaoTotal;


	public Vendedor(String nome, String cpf, String idade, String matricula, double salario, double totalVendas) {
		super(nome, cpf, idade, matricula, salario);
		this.totalVendas = totalVendas;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double getComissaoTotal() {
		return comissaoTotal;
	}

	public void setComissaoTotal(double comissaoTotal) {
		this.comissaoTotal = comissaoTotal;
	}

	@Override
	public void calculaSalario() {

		this.setSalarioTotal(this.salario * 0.92);

		System.out.println("O salário do vendedor é: " + this.getSalarioTotal());

	}

	
	public void calculaComissao() {

		this.comissaoTotal = this.totalVendas * 0.05;	
		System.out.println("Comissão total do vendedor é: "+this.comissaoTotal);
	}

}
