import java.util.Scanner;

public class IngoCalculator{

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte bestimmen Sie Ihre Rechenart:");
        System.out.println("1 zum addieren");
        System.out.println("2 zum multiplizieren");
        System.out.println("3 zum subtrahieren");
        System.out.println("4 zum dividieren");
        int rechnung = Integer.parseInt(input.nextLine());
        bestimmeRechenOperation();
    }

    public static int bestimmeRechenOperation(){
        int ergebnis;
        switch(rechnung){
            case 1:
                return ergebnis = Zahl1 + Zahl2;
            case 2:
                return ergebnis = Zahl1 * Zahl2;
            case 3:
                return ergebnis = Zahl1 - Zahl2;
            case 4:
                return ergebnis = Zahl1 / Zahl2;
            default:
                System.out.println("Error!");
                break;
        }
    }
}