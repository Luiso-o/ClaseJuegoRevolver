package RuletaRusa;

public class Revolver {//Revolver (amb un tambor de 6 buits):

	private int posicionActual;//(posici� del tambor on es dispara, pot ser que estigui la bala o no)
	private int posicionBala;//(la posici� del tambor on es troba la bala)
//	*Aquestes dues posicions, es generaran aleat�riament.
	
	public Revolver() {
		
		posicionActual=Metodo.generaNumeroAleatorio(1,6);
		posicionBala=Metodo.generaNumeroAleatorio(1,6);
		
	}	
	//disparar(): retorna true si la bala coincideix amb la posici� actual.
	public boolean disparar() {
			
		Boolean coincide=false;
			
			if(posicionActual==posicionBala) {
				
				coincide=true;
				
				}
			
				siguienteBala();
			
			return coincide;
		}	
//	- seguentBala(): canvia a la seg�ent posici� del tambor.
	public void siguienteBala() {
			
		if(posicionActual==6) {
				
			posicionActual=1;
				
		}else {
			
			posicionActual++;
		
		}
			
	}	
//	- informa(): mostra informaci� del rev�lver (posici� actual i on est� la bala).
	public String toString() {
			
		return "Camara actual: " + posicionActual + " Camara cargada: " + posicionBala;
			
	}	
		//Numero aleatorio
}
