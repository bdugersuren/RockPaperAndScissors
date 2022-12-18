import java.util.*;

import java.util.Scanner;

public class Main {
    public static String f(int x){
        String s="";
        switch(x){
            case 0: s= "Rock";break;
            case 1: s= "Paper";break;
            case 2: s= "Scissors"; break;
        }
        return  s;
    }
    private static final int ROCK=0;
    private static final int PAPER=1;
    private static final int SCISSORS=2;

    public static void main(String[] args) {
        int computerChoice=0,yourChoose=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose [r]ock, [p]aper or [s]cissors:");
        String playerMove=sc.nextLine();

        if(playerMove.equals("r") || playerMove.equals("rock") )yourChoose=ROCK;
        else if(playerMove.equals("p") || playerMove.equals("paper") )yourChoose=PAPER;
        else if(playerMove.equals("s") || playerMove.equals("scissors") )yourChoose=SCISSORS;
        else{
            System.out.println("Invalid Input. Try Again...");
            return;
        }
        Random rnd = new Random();
        computerChoice = rnd.nextInt(3);

        System.out.println("Your: "+f(yourChoose) +"   computer's Choice:"+f(computerChoice));

        if(yourChoose==computerChoice)System.out.println("Draw");
        else {
            if ((yourChoose+1)%3==computerChoice)System.out.println("You lose");
            else System.out.println("You win");
        }
    }
}