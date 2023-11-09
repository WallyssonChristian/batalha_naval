package navalbattlegame;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class NavalBattleGame {
	
	static Scanner read = new Scanner(System.in);
	private static final Logger logger = Logger.getLogger(NavalBattleGame.class.getName()); // Import para Logs e Testes
	
	public static void main(String[] args) {
		
		// Definition of variables
		// String[][] gameMapv2 = new String[5][5]; // Transformar em matriz na V2
		String [] gameMapV1;
		ArrayList<String> shipLocation;
		String guess;
		int Score = 0;
		
		// Setting Ships Location
			// Definir O local dos navios de forma aleatória, utilizando metodo Math.Random()
		String[] locationTeste = {"2", "3", "4"};
		
		// Start of Code
		System.out.print("Digite seu palpite: ");
		guess = read.nextLine();
		String result = checkYourself(guess, locationTeste);
		System.out.println(result);
	}
	
	static public String checkYourself(String g, String[] lT) { // METODO checkYourself()
		int guess = Integer.parseInt(g);
		String result = "Erro";
		for(String cell: lT) {
			int cellAsInt = Integer.parseInt(cell);
			if(guess == cellAsInt) {
				result = "Acerto";
				break;
			}
		}
		return result;
			
					// incrementar score, informar e verificar se a matriz esta vazia.
						// Se a matriz estiver Vazia, informar que o navio afundou, fim de jogo
					// Se o palpite estiver errado = avisar erro, incrementar score, repetir,
				
	}
	
	static public void setShipLocation(String[] l) { // METODO setShipLocation()
		
		// Capture o local da célula como parametro, utilizando uma matriz
		// atribuir os locais na matriz de local
		// V2: Criar um Get e um Set, dentro de uma classe
	}

}
