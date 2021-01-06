import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite seu peso: ");
        double peso = s.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = s.nextDouble();
		
        Paciente p1 = new Paciente(peso, altura);
		
		//Paciente p1 = new Paciente(53, 1.68);
		p1.calcularIMC();
		System.out.println(p1.diagnostico());
	}

}
