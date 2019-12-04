import java.util.ArrayList;

public class Lavanderia {
	
	protected Roupa roupa;
	protected Social roupaSocial;
	protected Esporte roupaEsporte;//Composição
	
	public ArrayList <Roupa>lavando;

	public Lavanderia(ArrayList<Roupa> roupasLavando) {
	this.lavando = new ArrayList <Roupa>();
	}

	public static void addRoupaLanvaderia(ArrayList<Roupa>lavadora,
			Roupa r) {
		lavadora.add(r);
		
	}
	public static void retiraRoupaLavanderia(ArrayList<Roupa>lavadora,
			Roupa r) {
		if(lavadora.contains(r)) {
			lavadora.remove(r);
		}
		
	}
	
	public Lavanderia() {
		this.lavando = new ArrayList <Roupa>();
		
	}
	
}
