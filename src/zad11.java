import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        String lastName1, lastName2, lastName3;
        String order1, order2, order3, temp;
        double time1, time2, time3, tempTime;
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Podaj nazwisko 1. osoby:");
        lastName1=keyboard.nextLine();
        System.out.println("Podaj czas 1. osoby:");
        time1=keyboard.nextDouble();

        keyboard.nextLine();
        System.out.println("Podaj nazwisko 2. osoby:");
        lastName2=keyboard.nextLine();
        System.out.println("Podaj czas 2. osoby:");
        time2=keyboard.nextDouble();

        keyboard.nextLine();
        System.out.println("Podaj nazwisko 3. osoby:");
        lastName3=keyboard.nextLine();
        System.out.println("Podaj czas 1. osoby:");
        time3=keyboard.nextDouble();

        order1=lastName1;
        order2=lastName2;
        order3=lastName3;

        if(time1>time2) {
            tempTime=time1;
            temp=lastName1;
            time1=time2;
            lastName1=lastName2;
            time2=tempTime;
            lastName2=temp;
        }
        if(time2>time3){
            tempTime=time2;
            temp=lastName2;
            time2=time3;
            lastName2=lastName3;
            time3=tempTime;
            lastName3=temp;
        }
        if(time1>time2) {
            tempTime=time1;
            temp=lastName1;
            time1=time2;
            lastName1=lastName2;
            time2=tempTime;
            lastName2=temp;
        }
        if(time2>time3){
            tempTime=time2;
            temp=lastName2;
            time2=time3;
            lastName2=lastName3;
            time3=tempTime;
            lastName3=temp;
        }
        if(time1>time2) {
            tempTime=time1;
            temp=lastName1;
            time1=time2;
            lastName1=lastName2;
            time2=tempTime;
            lastName2=temp;
        }
        if(time2>time3){
            tempTime=time2;
            temp=lastName2;
            time2=time3;
            lastName2=lastName3;
            time3=tempTime;
            lastName3=temp;
        }


        System.out.println("1."+lastName1+"\n2. "+lastName2+"\n3. "+lastName3);





    }
}
