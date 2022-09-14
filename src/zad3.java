import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        double weight, height, bmi;

        Scanner keyboard=new Scanner(System.in);

        System.out.print("Podaj masę w kg: ");
        weight= keyboard.nextDouble();

        System.out.print("Podaj wysokość w m: ");
        height= keyboard.nextDouble();
        bmi=weight/(height*2);
        System.out.print("Twoje bmi to: "+bmi+". ");
        if(bmi<18.5) System.out.println("Masz niedowage");
        else if(bmi<25) System.out.println("Prawidłowa masa ciała");
        else System.out.println("Masz nadwage");
    }
}
