
package cip.com.prog;

import java.util.*;

public class Dados {

	public static void main(String[] args) {
	
		
		
		System.out.println ("El jugador 1 hace su lanzamiento: ");
		int valorDado1 = (int) Math.floor(Math.random()*6+1);
		int valorDado2 = (int) Math.floor(Math.random()*6+1);
		System.out.println ("Dado1 " + valorDado1 );
		System.out.println ("Dado2 " + valorDado2 );
		System.out.println ("El jugador 2 hace su lanzamiento: ");
		int valorDado3 = (int) Math.floor(Math.random()*6+1);
		int valorDado4 = (int) Math.floor(Math.random()*6+1);
		System.out.println ("Dado1 " + valorDado3 );
		System.out.println ("Dado2 " + valorDado4 );
		int suma_de_dados_tirador_1= (valorDado1 + valorDado2);
		int suma_de_dados_tirador_2= (valorDado3 + valorDado4);
		int c = Math.max(suma_de_dados_tirador_1, suma_de_dados_tirador_2 );
		System.out.println("La tirada más alta es " + c);
		int tirador_1=suma_de_dados_tirador_1;
		int tirador_2=suma_de_dados_tirador_2;
		
		if (tirador_1>tirador_2)		
		System.out.println("El ganador es el jugador 1 " );
		else 
		System.out.println("El ganador es el jugador 2 " );
		int media= ((valorDado1 + valorDado2 + valorDado3 + valorDado4) / 4);
		System.out.println("La media de los 4 dados es " + media );
			
			
		
		
		
		
	}
}
				
			
		




