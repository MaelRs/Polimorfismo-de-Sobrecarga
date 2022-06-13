package sobrecarga;

public class Lobo extends Mamifero {
	protected String corPelo;
	
	@Override
	public void emitirSom() {
		System.out.println("Som de Mamifero");
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
}
