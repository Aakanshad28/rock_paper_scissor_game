package rock_paper_scissors;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {

			String[] rps = { "rock", "paper", "scissor" };
			String cMove = rps[new Random().nextInt(rps.length)];
			System.out.println(cMove);

			String pMove;

			while (true) {
				System.out.println("Please enter your move:(rock,paper or scissors):");
				pMove = scanner.nextLine();
				if (pMove.equals("rock") || pMove.equals("paper") || pMove.equals("scissor")) {
					break;
				}
				System.out.println(pMove + "is not a valid move.");
			}
			System.out.println("Computer played :" + cMove);
			if (pMove.equals(cMove)) {
				System.out.println("The game was tie!");
			} else if (pMove.equals("rock")) {
				if (cMove.equals("paper")) {
					System.out.println("Player Lose!!");
				} else if (cMove.equals("scissor")) {
					System.out.println("Player win!!");
				}
			} else if (pMove.equals("paper")) {
				if (cMove.equals("rock")) {
					System.out.println("Player Win!!");
				} else if (cMove.equals("scissor")) {
					System.out.println("Player Lose!!");
				}
			} else if (pMove.equals("scissor")) {
				if (cMove.equals("paper")) {
					System.out.println("Player Win!!");
				} else if (cMove.equals("rock")) {
					System.out.println("Player Lose!!");
				}
			}
			System.out.println("Want to Play Again? (yes/no)");
			String playAgain = scanner.next();

			if (!playAgain.equals("yes")) {
				break;

			}
			scanner.close();
		}

	}
}
