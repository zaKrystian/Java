import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        double mass, road, due;

        Scanner keyboard=new Scanner(System.in);
        System.out.println("Podaj masę paczki:");
        mass=keyboard.nextDouble();

        System.out.println("Odległość do pokonania:");
        road=keyboard.nextDouble();

        if(mass<=1){
            if(road>500)due=2.20;
            else due=1.10;
        }
        else if(mass<=3){
            if(road>500)due=4.40;
            else due=2.20;
        }
        else if(mass<=5){
            if(road>500)due=7.40;
            else due=3.70;
        }
        else{
            if(road>500)due=7.60;
            else due=3.80;
        }

        System.out.println("Do zapłaty: "+due+0+" zł");

    }
}
