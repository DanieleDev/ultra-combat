package ultraemojicombat;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoriaMasculina().equals(l2.getCategoriaMasculina())
				&& l1 != l2 ) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		
		}else if(l1.getCategoriaFeminina().equals(l2.getCategoriaFeminina()) 
					&& l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante =null;
		}
		
		 if (l1.getMulher() != l2.getMulher()){
			this.aprovada = false;
			
		 }else if (l1.getHomem() != l2.getHomem()){
			 this.aprovada = false;
		 }else {
			 this.aprovada = true;
		 }
	}
	
	
	
	public void lutarHomens() {
		if (this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentarHomens();		
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentarHomens();
			
			Random aleatorio =new Random();	
			int vencedor = aleatorio.nextInt(3);
			System.out.println("=========== Resultado da Luta ===========");
			switch(vencedor){
			case 0:
				System.out.println("Empatou!");
				this.desafiante.empatarLuta();
				this.desafiado.empatarLuta();
				break;
			case 1:
				System.out.println("Vitória do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:	
				System.out.println("Vitória do "  + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
			System.out.println("==========================================");	
		}else{
			System.out.println("A luta não pode acontecer!");
		}
	}
	
	public void lutarMulheres() {
		if (this.aprovada ) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentarMulheres();		
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentarMulheres();
			
			Random aleatorio =new Random();	
			int vencedor = aleatorio.nextInt(3);
			System.out.println("=========== Resultado da Luta ===========");
			switch(vencedor){
			case 0:
				System.out.println("Empatou!");
				this.desafiante.empatarLuta();
				this.desafiado.empatarLuta();
				break;
			case 1:
				System.out.println("Vitória do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:	
				System.out.println("Vitória do "  + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
			System.out.println("==========================================");	
		
		}else{
			System.out.println("A luta não pode acontecer!");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
