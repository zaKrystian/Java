import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        int day, month, endYear, temp;

        Scanner keyboard=new Scanner(System.in);
        System.out.print("Podaj dzien: ");
        day=keyboard.nextInt();

        System.out.print("Podaj miesiac: ");
        month=keyboard.nextInt();

        System.out.print("Podaj 2 ostatnie cyfry roku: ");
        endYear=keyboard.nextInt();

        temp=day*month;
        if(endYear==temp) System.out.println("Data jest magiczna");
        else System.out.println("Data nie jest magiczna");

    }
}
