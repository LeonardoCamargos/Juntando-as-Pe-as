
public class VestuarioMain {

	public static void main(String[] args) {
		
		GuardaRoupas guardaroupas = new GuardaRoupas();
		
		Lavanderia lavanderia = new Lavanderia();
		
		Esporte camiseta = new Esporte();
		camiseta.setCor("branca");
		camiseta.setDescricao("regata");
		camiseta.setManequim(40);
		
		
		Social terno = new Social();
		terno.setCor("cinza");
		terno.setManequim(44);
		
		Social camisa = new Social();
		terno.setCor("verde");
		camisa.setManequim(48);
		
		Fardamento bata = new Fardamento();
		bata.setCor("azul");
		
		GuardaRoupas.addRoupa(guardaroupas.gavetaDireita,camiseta);
		GuardaRoupas.addRoupa(guardaroupas.gavetaEsquerda,terno);
		GuardaRoupas.addRoupa(guardaroupas.gavetaDireita,camisa);
		GuardaRoupas.addRoupa(guardaroupas.gavetaDireita,bata);
		
		GuardaRoupas.confereRoupas(guardaroupas.gavetaDireita);
		GuardaRoupas.confereRoupas(guardaroupas.gavetaEsquerda);
		GuardaRoupas.confereRoupas(guardaroupas.gavetaDireita);
		GuardaRoupas.confereRoupas(guardaroupas.gavetaEsquerda);
		
		Lavanderia.addRoupaLanvaderia(lavanderia.lavando,terno);
		Lavanderia.retiraRoupaLavanderia(lavanderia.lavando,camisa);
		
		
		
	}
	

}
