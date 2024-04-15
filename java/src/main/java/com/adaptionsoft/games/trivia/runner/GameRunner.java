
package com.adaptionsoft.games.trivia.runner;
import java.util.Random;

import com.adaptionsoft.games.uglytrivia.Game;


public class GameRunner {

	private static boolean notAWinner;

	public static void main(String[] args) {
		Random rand = new Random();
		playGame(rand);
		
	}

	public static void playGame(Random rand) {
		Game aGame = new Game();

// Rajout de joueur (8joueurs)
		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");
		aGame.add("Jean");
		aGame.add("mathieu");
		aGame.add("Benoit");
		aGame.add("Gile");
		aGame.add("Boris");



		do {
// Lancer du Dé
			aGame.roll(rand.nextInt(5) + 1);
// Verification du chiffre afficher par le dé
			if (rand.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer(); // Mauvaise réponse
			} else {
				notAWinner = aGame.wasCorrectlyAnswered(); // Bonne réponse
			}



		} while (notAWinner);
	}
}
