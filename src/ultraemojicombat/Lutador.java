package ultraemojicombat;

public class Lutador {
	 
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoriaMasculina;
	private String categoriaFeminina;
	private String homem;
	private String mulher;
	private int vitorias;
	private int derrotas; 
	private int empates;
	
	
	public void apresentarHomens () {
		if (this.categoriaMasculina != this.categoriaFeminina){
			System.out.println("--------------------------------------------------------");
			System.out.println("Apresentamos o lutador " + this.getHomem() +  this.getNome());
			System.out.println("Diretamente de " + this.getNacionalidade());
			System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
			System.out.println("Pesando " + this.getPeso() + "Kg");
			System.out.println(this.getVitorias() + " Vit�rias ");
			System.out.println(this.getDerrotas() + " derrotas e ");
			System.out.println(this.getEmpates() + " empates!");
		}else {
			System.out.println("");
		}
	}
	
	public void statusHomens() {
		
			System.out.println("------ STATUS ------");
			System.out.println(this.getNome() + " � um peso " + getCategoriaMasculina());
			System.out.println("Ganhou " + this.getVitorias() + " veses");
			System.out.println("Perdeu " + this.getDerrotas() + " veses");
			System.out.println("Empatou " + this.getEmpates() + " veses");
		
	}
	
	public void apresentarMulheres () {
		if (getCategoriaFeminina().equals(getCategoriaFeminina())){
			System.out.println("------------------------------------------------------------");
			System.out.println("Apresentamos a Lutadora " +  this.getNome());
			System.out.println("Diretamente de " + this.getNacionalidade());
			System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
			System.out.println("Pesando " + this.getPeso() + "Kg");
			System.out.println(this.getVitorias() + " Vit�rias ");
			System.out.println(this.getDerrotas() + " derrotas e ");
			System.out.println(this.getEmpates() + " empates!");
		}else {
			System.out.println(" ");
		}
	}
	
	public void statusMulheres() {
		System.out.println("------ STATUS ------");
		System.out.println(this.getNome() + " � um peso " + getCategoriaFeminina());
		System.out.println("Ganhou " + this.getVitorias() + " veses");
		System.out.println("Perdeu " + this.getDerrotas() + " veses");
		System.out.println("Empatou " + this.getEmpates() + " veses");
	}
	
	
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	//	this.vitorias = this.vitorias + 1; // 
	}
	 public void perderLuta() {
		 this.setDerrotas(getDerrotas() + 1); 
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	public Lutador(String homem, String mulher,String no, String na, int id, float al, float pe, 
					int vi, int de, int em ) {
		this.homem = homem;
		this.mulher = mulher;
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de; 
		this.empates = em;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoriaMasculina();
		this.setHomem(homem);
		this.setCategoriaFeminina();
		this.setMulher(mulher);
		
		}

	public String getCategoriaMasculina() {
		return categoriaMasculina;
		
	}

	private void setCategoriaMasculina() {
		
		if(this.peso < 52.2 ) {
			this.categoriaMasculina = "Inválido";
		}else if (this.peso <= 70.3) {
			this.categoriaMasculina = "Leve";
		}else if (this.peso <= 83.9) {
			this.categoriaMasculina = "Médio"; 
		} else if (this.peso <= 120.2) {
			this.categoriaMasculina ="Pesado";
		}else { 
			this.categoriaMasculina = "Inválido";
		}
	}
	
	public String getCategoriaFeminina() {
		return categoriaFeminina;
		
	}
	
	private void setCategoriaFeminina() {
	
		
		if(this.peso < 50.2 ) {
			this.categoriaFeminina = "Inválido";
		}else if (this.peso <= 62.2) {
			this.categoriaFeminina = "Leve";
		}else if (this.peso <= 73.9) {
			this.categoriaFeminina = "Mádio"; 
		} else if (this.peso <= 100.2) {
			this.categoriaFeminina ="Pesado";
		}else { 
			this.categoriaFeminina = "Inválido";
		}
	}
	
	public String getHomem() {
		return homem;
	}

	public void setHomem(String homem) {
		this.homem = homem;
	}

	public String getMulher() {
		return mulher;
	}

	public void setMulher(String mulher) {
		this.mulher = mulher;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
}