import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        String choice;
        int velAir=340, velWater=1490, velSteel=5100;
        double distance, time;
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Podaj dystans: ");
        distance=keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Jaki osrodek?(powietrze/woda/stal):");
        choice=keyboard.nextLine();

        switch (choice){
            case "powietrze":
                time=distance/velAir;
                break;
            case "woda":
                time=distance/velWater;
                break;
            case "stal":
                time=distance/velSteel;
                break;
            default:{
                System.out.println("Złe dane wejściowe");
                return;}
        }
        System.out.println("Czas potrzebny do przebycia: "+time+" s.");

    }
}
