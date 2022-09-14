import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        double score1, score2, score3, average;
        Scanner keyboard=new Scanner(System.in);
        int tests=3;
        System.out.print("Podaj wyniki 1. testu(%): ");
        score1=keyboard.nextDouble();
        System.out.print("Podaj wyniki 2. testu(%): ");
        score2=keyboard.nextDouble();
        System.out.print("Podaj wyniki 3. testu(%): ");
        score3=keyboard.nextDouble();

        average = (score1+score2+score3)/tests;
        System.out.println("Twoja średnia to: "+average);
        System.out.print("Twoja ocena to: ");

        if(average<60) System.out.println(1);
        else if(average<70) System.out.println(2);
        else if(average<80) System.out.println(3);
        else if(average<90) System.out.println(4);
        else System.out.println(5);
    }
}
