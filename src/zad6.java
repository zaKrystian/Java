import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        double secounds, minutes=0, hours=0, days=0;
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Podaj ilość sekund: ");
        secounds=keyboard.nextDouble();



        if(secounds>86400) {
            days=secounds/86400;
            hours=secounds/3600;
            minutes=secounds/60;
        }
        else if(secounds>3600) {
            hours=secounds/3600;
            minutes=secounds/60;
        }
        else if(secounds>60) {
            minutes=secounds/60;
        }


        System.out.println(secounds+" sukund to " +days+" dni, "+hours+" godzin i "+minutes+" minut.");
    }
}
