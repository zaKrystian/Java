import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        String letter;
        double minutes, addminutes, addminutesVale=0, finalvalue=0, finalvalueb=0, finalvaluec=0;
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Podaj literę: ");
        letter= keyboard.nextLine();

        System.out.println("Podaj ilość minut: ");
        minutes= keyboard.nextDouble();

        switch (letter){
            case "A":{
                if(minutes>450){
                    addminutes=minutes-450;
                    addminutesVale=addminutes*0.45;
                }
                finalvalue=39.99+addminutesVale;
                System.out.println("Musisz zapłacić: "+finalvalue+" zł");

                if(minutes>900){
                    addminutes=minutes-900;
                    addminutesVale=addminutes*0.40;
                }
                finalvalueb=59.99+addminutesVale;

                if(finalvalueb<finalvalue) System.out.println("Wybierajac pakiet b zaoszczedziesz"+(finalvalue-finalvalueb));
                if(finalvalue>69.99) System.out.println("Wybierajac pakiet c zaoszczedzisz"+(finalvalue-69.99));

                break;
            }
            case "B":{
                if(minutes>900){
                    addminutes=minutes-900;
                    addminutesVale=addminutes*0.40;
                }
                finalvalue=59.99+addminutesVale;
                break;
            }
            case "C": finalvalue=69.99;
                break;
            default:{
                System.out.println("Złe dane");
                return;
            }
        }
    }
}
