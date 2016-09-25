package exercicio_314;

public class EmployeeTest {
	public static void main(String[] args) {
		
		//funcionário 1
		Employee f1 = new Employee("Tony", "Stark", 1200);
		double salario1 = f1.getSalarioMensal();
		double salario1Aumento = salario1 + (salario1*0.10);
		
		System.out.println("Salário Mensal do funcionário 1: R$ " + salario1);
		System.out.println("Salário Mensal do funcionário 1 + 10% de aumento: R$ " + salario1Aumento);

		
		//funcionário 2
		Employee f2 = new Employee("Steve", "Rogers", 2000);
		double salario2 = f2.getSalarioMensal();
		double salario2Aumento = salario2 + (salario2*0.10);
		
		System.out.println("\nSalário Mensal do funcionário 2: R$ " + salario2);
		System.out.println("Salário Mensal do funcionário 1 + 10% de aumento: R$ " + salario2Aumento);
	}
}
