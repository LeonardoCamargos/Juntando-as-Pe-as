public class Esporte extends Roupa {
	
	public void lavar() {
		super.lavar();
		System.out.println("Roupa Esporte lavada .");
	}
	
	public void dobrar() {
		super.dobrar();
		System.out.println("Roupa Esportiva dobrada");
	}
	
	public void emUso() {
		super.dobrar();
		System.out.println("Roupa Esportiva em uso");
	}
	
	
	public String toString() {
		return "Esporte" + super.toString();
	}
	
	
	
}
