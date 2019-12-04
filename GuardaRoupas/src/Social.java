public class Social extends Roupa {

	public void lavar() {
		super.lavar();
		System.out.println("Roupa Social Lavada");
	}
	
	public void dobrar() {
		super.dobrar();
		System.out.println("Roupa social Dobrada");
	}
	public void emUso() {
		super.dobrar();
		System.out.println("Roupa social em uso");
	}
	
	public String toString() {
		return "Social"+super.toString();
	}
}
