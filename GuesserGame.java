import java.util.Scanner;

class Guesser {
    int GuesserNum;
    public int GuesserNumb() {
        Scanner sc = new Scanner(System.in);
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}

class Player {
    int PlayerNum;
    public int PlayerNumb() {
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }
}

class Umpire {
    int Guessernum;
    int PlayerNum1;
    int PlayerNum2;
    int PlayerNum3;

    public void collectNumFromGuesser() {
        System.out.print("Guesser kindly enter the Number : ");
        Guesser guess = new Guesser();
        Guessernum = guess.GuesserNumb();
    }

    public void collectNumFromPlayer() {
        System.out.print("Player1 Kindly Guess a Number : ");
        Player P1 = new Player();
        PlayerNum1 = P1.PlayerNumb();

        System.out.print("Player2 Kindly Guess a Number : ");
        Player P2 = new Player();
        PlayerNum2 = P2.PlayerNumb();
        
        System.out.print("Player3 Kindly Guess a Number : ");
        Player P3 = new Player();
        PlayerNum3 = P3.PlayerNumb();

     }

    public void compare() {

        if(Guessernum == PlayerNum1) {
            if (Guessernum == PlayerNum2 && Guessernum == PlayerNum3) {
                System.out.println("All Players WON the Game.");
            } else if (Guessernum == PlayerNum2) {
                System.out.println("Player1 and Player2 WON the Game.");
            } else if (Guessernum == PlayerNum3) {
                System.out.println("Player1 and Player3 WON the Game.");
            } else {
                System.out.println("Only Player1 WON the Game.");
            }
        } 
        
        else if(Guessernum == PlayerNum2) {
            if (Guessernum == PlayerNum3) {
                System.out.println("Player2 and Player3 WON the Game.");
            } else{
                System.out.println("Only Player2 WON the Game");
            }
        }

        else if(Guessernum == PlayerNum3) {
            System.out.println("Only Player3 WON the Game.");
        }

        else {
            System.out.println("All the Players Lost the Game.");
        }
    }

}

public class GuesserGame {
    public static void main(String[] args) {        
        Umpire UM = new Umpire();
        System.out.println("----------- Game Start ----------- ");
        UM.collectNumFromGuesser();
        UM.collectNumFromPlayer();
        UM.compare();
        System.out.println("----------- Game Over ----------- ");
    }
}
