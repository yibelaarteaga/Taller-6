package punto9;
import java.util.Scanner;
public class Nueve {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		Deck deck = new Deck();
		deck.barajar();
		
		Hand crupier = new Hand(deck.reparto(),deck.reparto());
		Hand jugador = new Hand(deck.reparto(),deck. reparto());
		int puntosJugador = 0,puntosCrupier = 0;
		
		System.out.println("Este es tu mazo.");
		jugador.display();puntosJugador = jugador.getPuntos();
		System.out.println(" Tu tiene" + puntosJugador + " puntos.");
		int choice = 1; while (choice == 1 && puntosJugador < 21 && jugador.numeroCartas < 5) {
			System.out.println(" Quieres otra tarjeta?" );
			System.out.println("1. si");
			System.out.println(" 2. no");
			choice = in .nextInt();
			
			if( choice == 1) {
				jugador.maxcartas(deck.reparto());
				System.out.println("Este es tu mazo.");
				jugador.display(); puntosJugador = jugador.getPuntos();
				System.out.println(" Tu tienes" + puntosJugador + " puntos.");
			}
		}
		
		puntosCrupier = crupier.getPuntos();
		while(puntosCrupier < 16 && crupier.numeroCartas < 5) {
			crupier.maxcartas(deck.reparto());
			puntosCrupier = crupier.getPuntos();
		}
		
		System.out.println("El partido tiene: ");
		crupier.display();
		System.out.println("El partido tiene " + puntosCrupier + " puntos. ");
		
		if(puntosJugador > 21)
			System.out.println("** Jugador arrestado- gana el crupier. **");
		
		else if(puntosCrupier > 21)
		System.out.println("** Crupier arrestado. jugador gana. **");
		else if (puntosCrupier >puntosJugador)
			System.out.println("** crupier gana **");
		else if (puntosCrupier <puntosJugador)
			System.out.println("** jugador gana **");
		else if(puntosCrupier == puntosJugador)
			System.out.println("** crupier y jugador empatados");
	}
	
	
			
	
	
}
