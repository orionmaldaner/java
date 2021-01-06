
public class Paciente {

	double peso;	//quilos
	double altura;	//metros
	double imc;
	
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public void calcularIMC() {	// IMC = peso (quilos) / (altura * altura (metros))
		 this.imc = peso / (altura * altura);
		 System.out.println("Valor imc: " +imc);
		 
		 
	}
	
	public String diagnostico() {
		/*Baixo peso muito grave = IMC abaixo de 16 kg/m²
		Baixo peso grave = IMC entre 16 e 16,99 kg/m²
		Baixo peso = IMC entre 17 e 18,49 kg/m²
		Peso normal = IMC entre 18,50 e 24,99 kg/m²
		Sobrepeso = IMC entre 25 e 29,99 kg/m²
		Obesidade grau I = IMC entre 30 e 34,99 kg/m²
		Obesidade grau II = IMC entre 35 e 39,99 kg/m²
		Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²*/

		if(imc < 16.00) {
			return "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
		}
		else if(imc < 17.00) {
			return "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
		}
		else if(imc < 18.50) {
			return "Baixo peso = IMC entre 17 e 18,49 kg/m²";
		}
		else if(imc < 25.00) {
			return "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
		}
		else if(imc < 30.00) {
			return "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
		}
		else if (imc < 35.00) {
			return "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
		}
		else if (imc < 40.00) {
			return "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
		}
		else {
			return "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
		}
		
	}
}
