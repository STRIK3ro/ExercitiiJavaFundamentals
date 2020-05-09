import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    //Vrem sa se modeleze comportamentul unui calculator simplu
    //Calculatorul sa fie reprezentat folosind programarea orientata
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        System.out.println("Adunarea este : " + calculator.adunbare(10, 5));
        System.out.println("Scaderea este : " + calculator.scadere(20, 15));
        int inmultire = calculator.inmultire(30, 2);
        System.out.println("Inmultirea este : " + inmultire);
        int impartire = calculator.impartire(50, 5);
        System.out.println("Impartirea este : " + impartire);

        //De aici citim valorile de la tastura
        //Obiectul care ne ajuta sa facem asta se numeste "Scanner"

        Scanner scanner = new Scanner(System.in);
        //Citeste primul numar de la tastatura
        System.out.println("Va rugam introduceti primul numar : ");
        int primulNumar = scanner.nextInt();
        //Citeste al doilea nuamr dela tastatura
        System.out.println("Va rugam introduceti al doulea nuamr : ");
        int alDoileaNumar = scanner.nextInt();
        System.out.println("Numerele introduse de dvs sunt : " + primulNumar + " si " + alDoileaNumar);

        int adunare = calculator.adunbare(primulNumar, alDoileaNumar);
        System.out.println("Adunarea este : "+adunare);
        int scadere=calculator.scadere(primulNumar,alDoileaNumar);
        System.out.println("Scaderea este : "+scadere);
        inmultire=calculator.inmultire(primulNumar,alDoileaNumar);
        System.out.println("Impartirea este : "+inmultire);
        impartire=calculator.impartire(primulNumar,alDoileaNumar);
        System.out.println("Impartirea este :"+impartire);

    }

}
