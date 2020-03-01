
public class Main {
	
	public static void main(String[] args) {
		
		
		Funcionario Secretaria = new Funcionario("Lais", "1332655655", "23", "1562", 2800);
		
		Secretaria.calculaSalario();
	
		
		
		Vendedor v = new Vendedor ("Laís", "2625615615", "25", "6512", 2500, 4565);
		
		
		v.calculaSalario();
		v.calculaComissao();
		
		
	}

}
