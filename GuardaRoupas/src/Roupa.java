public class Roupa {

	private  String descricao;
	private  String cor;
	private  String situacao;
	private  String estampa;
	private  String tecido;
	private int manequim;
	private double preco;
	
	public Roupa() {
		
	}

	
	//gets e sets 
	
	
	public String getDescricao() {
		return descricao;
	}

	public String getTecido() {
		return tecido;
	}


	public void setTecido(String tecido) {
		this.tecido = tecido;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getEstampa() {
		return estampa;
	}

	public void setEstampa(String estampa) {
		this.estampa = estampa;
	}

	public int getManequim() {
		return manequim;
	}

	public void setManequim(int manequim) {
		this.manequim = manequim;
	}
	
	
	public void dobrar() {
		System.out.println("Roupa dobrada");
	}
	
	public void lavar() {
		System.out.println("RoupaLavada ");
	}
	
	public void emUso() {
		System.out.println("Roupa em uso");
	}
	
	public String toString() {
		return this.descricao+""+
		this.cor + " " + 
		this.manequim+""+
		this.tecido+""+
		this.preco+
		this.situacao;
		}
	}
	

