package RuletaRusa;

import java.util.ArrayList;

public class Juego {
	
	private ArrayList<Jugador>jugadores;
	private Revolver revolver;

		public Juego(int numJugadores) {
			
			comprobarJugadores(numJugadores);//controlo el numero de jugadores.
			
				jugadores=new ArrayList<Jugador>();	
				
					crearJugadores();//creo y agrego jugadores.
			
						revolver=new Revolver();
			
							System.out.println(revolver);
		}
	
//M�todes
//- fiJoc(): quan un jugador/a mor, retorna true.
	public boolean finJuego() {
			
			for(int i=0; i<jugadores.size(); i++) {
				
				if(!jugadores.get(i).getVivo()==true) {
					
					return true;
					
				}
			}
			
			return false;
		}		
//- ronda(): cada jugador/a s'apunta i es dispara,
//s'informar� de l'estat de la partida (El jugador/a X 
//es dispara, no ha mort en aquesta ronda, etc.)
	public void ronda(int numJugadores) {
		
		for(int i=0; i<numJugadores; i++) {
			
			jugadores.get(i).jugar(revolver);
			
				System.out.println(revolver);//comprobar
			
			if(!jugadores.get(i).getVivo()) {
				return;
			}
		}
	}
		
	private int comprobarJugadores(int numeroJugadores) {
		
		if(!(numeroJugadores<=6)) {
			
			System.out.println("El numero de participantes supera el rango permitido,"
					+ " descartaremos a " + (numeroJugadores-6) + " Participantes:\n");
			
			numeroJugadores=6;
			
		}else if(!(numeroJugadores>=1)) {
			
			System.out.println("No hay participantes en esta partida,"
					+ " agregaremos a " + (numeroJugadores+6) + " Participantes:\n");
			
			numeroJugadores=6;
			
		}
		
		return numeroJugadores;
	}
	
	private void crearJugadores(){
		
		Jugador jugador1=new Jugador(1,"Luis");
		jugadores.add(jugador1);
		
		Jugador jugador2=new Jugador(2,"Sandra");
		jugadores.add(jugador2);
		
		Jugador jugador3=new Jugador(3,"Pedro");
		jugadores.add(jugador3);
		
		Jugador jugador4=new Jugador(4,"Maria");
		jugadores.add(jugador4);
		
		Jugador jugador5=new Jugador(5,"Carlos");
		jugadores.add(jugador5);
		
		Jugador jugador6=new Jugador(6,"Sara");
		jugadores.add(jugador6);
		
		
	}

}//Clase Juego
