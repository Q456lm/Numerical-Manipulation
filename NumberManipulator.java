import java.util.Scanner;

public class NumberManipulator {
    public static Scanner input = new Scanner(System.in);

    public static double get_input(String mes){ //Used for getting user input
        System.out.print(mes);
        return input.nextDouble();
    }

    public static int round_up(double num){ //Rounds up
        return (int) Math.ceil(num);
    }

    public static int round_down(double num){ //Rounds Down
        return (int) Math.floor(num);
    }

    public static double round_decimal(double num){ //Rounds to nearest number returned as a decimal with ties going to the even number.
        return Math.rint(num);
    }

    public static int round_int(double num){ //Rounds normally
        return (int)Math.round(num);
    }
    public static void main(String[] args) {
        double numero = get_input("Enter a decimal number: "); //Get number from user.

        //For all the calling
        int larint = round_up(numero);
        int smlnum = round_down(numero);
        double evenum = round_decimal(numero);
        int rounum = round_int(numero);

        //Prints out values
        System.out.println("When rounding down: "+smlnum);
        System.out.println("When rounding up: "+larint);
        System.out.println("Normal rounding with even ties: "+evenum);
        System.out.println("Normal rounding: "+ rounum);
    }
}
