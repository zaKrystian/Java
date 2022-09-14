import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        double mass, weight, gravityConstant=9.8;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Podaj masę: ");
        mass=keyboard.nextDouble();
        weight=mass*gravityConstant;
        System.out.println("Ciężar obiektu: "+weight+" N. ");
        if(weight<10) System.out.println("Obiekt jest zbyt lekki.");
        else if(weight<1001) System.out.println("Obiekt ma dobry ciężar.");
        else System.out.println("Obiekt jest zbyt cięzki.");
    }
}
