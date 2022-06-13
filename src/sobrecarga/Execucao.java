package sobrecarga;

public class Execucao {
	public static void main(String[]args) {
		Lobo l=new Lobo();
		Cachorro c= new Cachorro();
		
		c.reagir("Olá");
		c.reagir("Corre");
		c.reagir(9);
		c.reagir(false);
		c.reagir(true);
		c.reagir(2, 12.5f);
		c.reagir(17, 4.5f);
	}

}
