package RuletaRusa;

public class App_Ruleta {

	public static void main(String[] args) {
		
		int participantes=Metodo.pideInt("introduce entre 1 a 6 participantes");
		
			Juego juego=new Juego(participantes);
		
				while(!(juego.finJuego())) {
			
					juego.ronda(participantes);
			
				}
		
		System.out.println("\nFin del juego, ya pueden llamar a la policia :D\n"
				+ "Mensi�n especial para quien pens� en este juego.");
		
	}

}
