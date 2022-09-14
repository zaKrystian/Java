import java.util.Scanner;

public class zad1if {
    public static void main(String[] args) {
        int number;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        number= keyboard.nextInt();
        switch (number){
            case 1:
                System.out.println("Odpowiednik to I");
                break;
            case 2:
                System.out.println("Odpowiednik to II");
                break;
            case 3:
                System.out.println("Odpowiednik to III");
                break;
            case 4:
                System.out.println("Odpowiednik to IV");
                break;
            case 5:
                System.out.println("Odpowiednik to V");
                break;
            case 6:
                System.out.println("Odpowiednik to VI");
                break;
            case 7:
                System.out.println("Odpowiednik to VII");
                break;
            case 8:
                System.out.println("Odpowiednik to VIII");
                break;
            case 9:
                System.out.println("Odpowiednik to IX");
                break;
            case 10:
                System.out.println("Odpowiednik to X");
                break;
            default:
                System.out.println("Nieprawidłowe dane");
        }
    }
}
