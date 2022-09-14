import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        int value=99,  amount, due;
        double discount=0, dueAfterDiscount, discountValue;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj ilość produktów:  ");
        amount=keyboard.nextInt();

        due=value*amount;
        System.out.println("Cena za produkty: "+due);

        if(amount<10) {
            discount=0;
            System.out.println("Brak rabatu.");
        }
        else if(amount<20&&amount>=10){
            discount=0.2;
            System.out.println("Rabat 20%.");
        }
        else if(amount<50&&amount>=20){
            discount=0.3;
            System.out.println("Rabat 30%.");
        }
        else if(amount<100&&amount>=50){
            discount=0.4;
            System.out.println("Rabat 40%.");
        }
        else{
            discount=0.5;
            System.out.println("Rabat 50%.");
        }


        discountValue=due*discount;
        dueAfterDiscount = due-discountValue;
        System.out.println("Finalna należność: "+dueAfterDiscount);


    }
}
