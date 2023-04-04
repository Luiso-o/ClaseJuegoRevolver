package RuletaRusa;

import java.util.Scanner;

public class Metodo {
	
	public Metodo() {
		
	}
	
		static int generaNumeroAleatorio(int minimo,int maximo) {
			int num=(int)Math.floor(Math.random()*(maximo-minimo+minimo)+(minimo));
				return num;
			
			}
		
		static String pideString(String mensaje) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
				System.out.println(mensaje);
					return input.nextLine();
		}
		
		static int pideInt(String mensaje) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
				System.out.println(mensaje);
					return input.nextInt();
		}
}
