package RuletaRusa;

public class Jugador {
	
	private int id;//- id (representa el n�mero del jugador, comen�a en 1)
	private String nombre;	
	private Boolean vivo;//(indica si est� viu o no el jugador)

	public Jugador(int id,String nombre){
		
		this.id=1;
		this.nombre=nombre + " Jugador/a " + id; //Nickname
		this.vivo=true;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean getVivo() {
		return this.vivo;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setVivo(boolean vivo) {
		this.vivo=vivo;
	}

//M�todes:
//- jugar(Revolver r): el jugador/a s'apunta i es dispara, si la bala es dispara,el jugador/a mor.
	public void jugar(Revolver revolver) {
		
		System.out.println("El jugador " + nombre + " se apunta y dispara...");
		
			if(revolver.disparar()) {
				
				vivo=false;//jugador muere
				
					System.out.println("El jugador " + nombre + " a muerto x_x\n");
					
			}else {
				
				System.out.println("El jugador " + nombre + " se ha librado :D\n");
				
			}
			
	}		
	
}
