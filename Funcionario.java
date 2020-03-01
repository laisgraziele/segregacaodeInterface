
public class Funcionario implements Salarios{

	
	
		private String nome;
		private String cpf;
		private String idade;
		private String matricula;
		protected double salario;
		private double salarioTotal;
	

		public Funcionario(String nome, String cpf, String idade, String matricula, double salario) {
			super();
			this.nome = nome;
			this.cpf = cpf;
			this.idade = idade;
			this.matricula = matricula;
			this.salario = salario;
		}
	



		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}


		public double getSalarioTotal() {
			return salarioTotal;
		}



		public void setSalarioTotal(double salarioTotal) {
			this.salarioTotal = salarioTotal;
		}
		
		
		public void calculaSalario() {
			
			 this.setSalarioTotal(this.salario * 0.92);	
			 
			 System.out.println("O salário do funcionário é: " +this.getSalarioTotal());
		}
				

}
