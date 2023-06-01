package Pruebas;

import java.util.Scanner;

public class SimulacroFPR {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
	
		char colorKarting;
		final char VERDE = 'V' , ROJO = 'R', FIN = 'F';
		final int VUELTAS_MAXIMAS = 10;
		int vueltasV = 0, vueltasR = 0, cantPianitosV=0, cantPianitosR=0, cantVecesPianitoVuelta=0, promedioV=0,promedioR=0;
		
		
		System.out.println("Bienvenidos a ORT Karting");
		
		do {
		    System.out.println("Ingresa 'V' para el auto Verde, 'R' para el auto rojo, 'F' para finalizar:");
		    colorKarting = input.next().charAt(0);
		    input.nextLine(); // Consumir el salto de línea restante
		} while ((colorKarting!=FIN)&&(colorKarting!=ROJO)&&(colorKarting!=VERDE));
		
		
		while (vueltasV<VUELTAS_MAXIMAS&&vueltasR<VUELTAS_MAXIMAS&&colorKarting!=FIN) {
			
			System.out.println("Ingrese la cantidad de veces que piso el pianito");
			cantVecesPianitoVuelta= Integer.parseInt(input.nextLine());
			
			
			if (colorKarting==VERDE) {
			vueltasV++;
			cantPianitosV = cantPianitosV + cantVecesPianitoVuelta;
			}else {
				vueltasR++;
				cantPianitosR = cantPianitosR + cantVecesPianitoVuelta;
			}
			if (vueltasV<VUELTAS_MAXIMAS && vueltasR<VUELTAS_MAXIMAS) {
				do { System.out.println("Ingresa 'V' para el auto Verde, 'R' para el auto rojo, 'F' para finalizar:");
					colorKarting = input.next().charAt(0); 
					input.nextLine();
					
				} while ((colorKarting != VERDE)&&(colorKarting != ROJO)&&(colorKarting != FIN));
			}
		}
			if (colorKarting!=FIN) {
				if (vueltasV>vueltasR) {
					System.out.println("Ha ganado la carrera el karting Verde con un total de "+vueltasV+ " vueltas");	
				}else {
					System.out.println("Ha ganado la carrera el karting Rojo con un total de "+vueltasR+" vueltas");
				}
				
			}else {
				System.out.println("Carrera indefinida");
			}
			promedioV=cantPianitosV/vueltasV;
			promedioR= cantPianitosR/vueltasR;
			
			if (promedioV>promedioR) {
				System.out.println("El karting Verde piso menos el pianito");
				
			}else {
				System.out.println("El karting Rojo piso menos el pianito");
			}
	}
		
}
