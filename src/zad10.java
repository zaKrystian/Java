import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        double percentOfFatCalories, caloriesInProduct, caloriesFat, fatGrams, fatCaloriesInGram=9;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Podaj liczbę kalorii: ");
        caloriesInProduct= keyboard.nextDouble();

        System.out.println("Podaj ilosc tłuszczu w g");
        fatGrams=keyboard.nextDouble();

        caloriesFat=fatCaloriesInGram*fatGrams;
        if (caloriesFat>caloriesInProduct) {
            System.out.println("Złe dane. Spróbuj jeszce raz");
            return;
        }
        percentOfFatCalories=caloriesFat/caloriesInProduct;
        System.out.print("Procent kalorii z tłuszczu: "+ percentOfFatCalories*100+"%. ");

        if(percentOfFatCalories<0.3) System.out.println("Produkt niskotłuszczowy");
        else System.out.println("Produkt wysokotluszczowy");




    }
}
