package Oops;
import java.util.Scanner;
class Guesser {
    int guessNum;
    int guessingNumber() {
        System.out.println("Guesser :) Kindly Guess the number :) ");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class PlayerGuess1 {
    int guessNum;
    int guessingNumber() {
        System.out.println("Players :) Kindly Guess the number :) ");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    int numFromPlayer4;
    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }
    void collectNumFromPlayer() {
        PlayerGuess1 pg1 = new PlayerGuess1();
        PlayerGuess1 pg2 = new PlayerGuess1();
        PlayerGuess1 pg3 = new PlayerGuess1();
        PlayerGuess1 pg4 = new PlayerGuess1();

        numFromPlayer1 = pg1.guessingNumber();
        numFromPlayer2 = pg2.guessingNumber();
        numFromPlayer3 = pg3.guessingNumber();
        numFromPlayer4 = pg4.guessingNumber();
    }
    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            System.out.println("Player 1 Won the Game :) ");
        } else if (numFromGuesser == numFromPlayer2) {
            System.out.println("Player 2 Won the Game :) ");
        }else  if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 Won the Game :) ");
        }else if (numFromGuesser == numFromPlayer4){
            System.out.println("Player 4 Won the Game :)");
        } else {
            System.out.println("All Guesses are wrong Umpire Wins :) ");
        }
    }
}
class gusser_game {
    public static void main(String[] args) {
        System.out.println("Hello world !...! Game is starting...:) ");
        System.out.println("Plz Guess the number between 1 to 10");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();

    }
}
