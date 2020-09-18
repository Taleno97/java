import java.util.Scanner;

public class IngoCalculator{

        static int Zahl1,Zahl2,rechnung,ergebnis,nocheinmal;
        static Scanner input = new Scanner(System.in);


    public static void main (String[] args){
        System.out.println("WAS GEHTN INGO");
        do{
            rechner();
        }while(nocheinmal==1);
        System.out.println("Nerd");
    }

    public static int rechenOperation(int a,int b){
        switch(rechnung){
            case 1:
                return a + b;
            case 2:
                return a * b;
            case 3:
                return a - b;
            case 4:
                return a / b;
            default:
                System.out.println("Error!");
                break;
        }
        return 0;
    }

    public static int rechner(){
        System.out.println("Bitte bestimm die Rechenart:");
        System.out.println("1 zum addieren");
        System.out.println("2 zum multiplizieren");
        System.out.println("3 zum subtrahieren");
        System.out.println("4 zum dividieren");
        rechnung = Integer.parseInt(input.nextLine());
        System.out.println("Danke bitte gib nun die erste Zahl ein!");
        Zahl1 = Integer.parseInt(input.nextLine());
        System.out.println("Danke bitte gib nun die zweite Zahl ein!");
        Zahl2 = Integer.parseInt(input.nextLine());
        ergebnis = rechenOperation(Zahl1,Zahl2);
        System.out.println("Dein Ergebnis ist:" + ergebnis + " Möchtest du noch eine andere Zahl berechnen?");
        System.out.println("1: ja  2: nein");
        nocheinmal = Integer.parseInt(input.nextLine());
        return nocheinmal;
    }
}