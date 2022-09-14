import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        String name1="a", name2="b", name3="c", tempString;
        String firstName, secoundName, thirdName;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Podaj 3 imiona do sortowania: ");

        System.out.println("1.: ");

        name1=keyboard.nextLine();

        System.out.println("2.: ");
        name2=keyboard.nextLine();

        System.out.println("3.: ");
        name3=keyboard.nextLine();

        firstName=name1;
        secoundName=name2;
        thirdName=name3;

        if(firstName.compareTo(secoundName)<0)
        {
            firstName=firstName;
            secoundName=secoundName;
        }
        else {
            tempString=firstName;
            firstName=secoundName;
            secoundName=tempString;
        }

        if(secoundName.compareTo(thirdName)<0)
        {
            secoundName=secoundName;
            thirdName=thirdName;
        }
        else {
            tempString=secoundName;
            secoundName=thirdName;
            thirdName=tempString;
        }

        if(firstName.compareTo(secoundName)<0)
        {
            firstName=firstName;
            secoundName=secoundName;
        }
        else {
            tempString=firstName;
            firstName=secoundName;
            secoundName=tempString;
        }

        if(secoundName.compareTo(thirdName)<0)
        {
            secoundName=secoundName;
            thirdName=thirdName;
        }
        else {
            tempString=secoundName;
            secoundName=thirdName;
            thirdName=tempString;
        }

        if(firstName.compareTo(secoundName)<0)
        {
            firstName=firstName;
            secoundName=secoundName;
        }
        else {
            tempString=firstName;
            firstName=secoundName;
            secoundName=tempString;
        }

        if(secoundName.compareTo(thirdName)<0)
        {
            secoundName=secoundName;
            thirdName=thirdName;
        }
        else {
            tempString=secoundName;
            secoundName=thirdName;
            thirdName=tempString;
        }

        System.out.println(firstName);
        System.out.println(secoundName);
        System.out.println(thirdName);




    }
}
