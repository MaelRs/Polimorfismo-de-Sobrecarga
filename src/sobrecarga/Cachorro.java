package sobrecarga;

public class Cachorro extends Lobo {
		@Override
	public void emitirSom() {
		System.out.println("Som de Mamifero");
	}	
		
	public void reagir(String frase) {
		if(frase.equals("Ola")||frase.equals("Toma Comida")) {
			System.out.println("Abanar o Rabo e Latir");
		}else {
			System.out.println("Rosnar");
		}
	}
	public void reagir(int hora) {
		if(hora<12) {
			System.out.println("Abanar o rabo");
		}else if(hora>=18) {
			System.out.println("Ignora");
		}else {
			System.out.println("Abanar o rabo e latir");
		}
	}
	public void reagir(boolean dono) {
		if(dono=true) {
			System.out.println("Abanar o rabo");
		}else {
			System.out.println("Rosnar e latir");
		}
	}
	public void reagir(int idade, float peso) {
		if(idade<5 && peso<10) {
			System.out.println("Abanar rabo");
		}else {
			System.out.println("Rosnar");
		}if(peso>10) {
			System.out.println("Rosnar");
		}else {
			System.out.println("Ignorar");
		}
	}
}
