package ultraemojicombat;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		Lutador l[] = new Lutador [12];
		l[0] = new Lutador (" "," ", "Pretty Boy", "Fran�a", 31, 1.75f, 68.9f,  11, 2, 1);
		l[1] = new Lutador (" "," ", "Poxscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador (" "," ", "Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2,1);
		l[3] = new Lutador (" "," ", "Dead Code", "Austr�lia", 28,  1.93f, 81.6f, 13, 0,2);
		l[4] = new Lutador (" "," ", "UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3 );
		l[5] = new Lutador (" "," ", "Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
			
		
		l[7] = new Lutador(" "," ", "Breaker", "EUA", 33, 1.62f, 65.5f, 10, 3, 2);
		l[8] = new Lutador(" "," ", "Deadline", "Brasil", 35, 1.65f, 68.0f, 9, 2,5);
		l[9] = new Lutador ("", "", "Javina", "India", 29, 1.70f, 78.0f, 8, 1, 2);
		l[10] = new Lutador ("", "", "Disy", "Austr�lia", 29, 1.71f, 76.5f, 10, 3, 4);
		
	Luta UEC01 = new Luta();
	
	UEC01.marcarLuta(l[1], l[0]);
	UEC01.lutarHomens();
	l[1].statusHomens();
	l[0].statusHomens();
	
	Luta UEC02 = new Luta();
	
	UEC02.marcarLuta(l[8], l[7]);
	UEC02.lutarMulheres();
	l[8].statusMulheres();
	l[10].statusMulheres();
	
    Luta UEC03 = new Luta(); // Luta que não pode acontecer, pois são de categórias diferentes (feminina e masculina, respectivamente)
	
	UEC03.marcarLuta(l[9], l[5]);
	UEC03.lutarMulheres();
	
	}

}
