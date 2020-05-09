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
        System.out.println("Adunarea este : " + adunare);
        int scadere = calculator.scadere(primulNumar, alDoileaNumar);
        System.out.println("Scaderea este : " + scadere);
        inmultire = calculator.inmultire(primulNumar, alDoileaNumar);
        System.out.println("Impartirea este : " + inmultire);
        impartire = calculator.impartire(primulNumar, alDoileaNumar);
        System.out.println("Impartirea este :" + impartire);

        // Sa se modeleze un calculator stiintific care sa permita operatiile calculatorului simpli
        //Si pe langa asta urmoatoarele
        //ridicare la putere
        //radical
        //logaritm in baza 10
        //logarimt dintr-un numar

        CalculatorStiintifin calculatorStiintifin = new CalculatorStiintifin();
        System.out.println("Rezultatul adunarii este : " + calculatorStiintifin.adunbare(10, 20));
        System.out.println("Rezultatul scaderii este : " + calculatorStiintifin.scadere(40, 20));
        System.out.println("Rezultatul inmultirii este : " + calculatorStiintifin.inmultire(20, 14));
        System.out.println("Rezultatul impartirii este : " + calculatorStiintifin.impartire(10, 5));

        double ridicarePutere = calculatorStiintifin.ridcareLaPutere(2, 3);
        System.out.println("Ridicarea la putere este : " + ridicarePutere);
        double radical = calculatorStiintifin.radicalDinNumar(36);
        System.out.println("Radical din 36 este : " + radical);
        double log10 = calculatorStiintifin.logaritmBaza10(20);
        System.out.println("Log in baza 10 din 20 este : " + log10);
        double log = calculatorStiintifin.logaritmNumar(20);
        System.out.println("Logrimt din 20 este : " + log);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Va rugam introduceti primul numarul pentru ridicare la putere :");
        primulNumar = scanner1.nextInt();
        System.out.println("Va rugam intrduceti al douilea numarul pentru : ");
        alDoileaNumar = scanner1.nextInt();

        ridicarePutere = calculatorStiintifin.ridcareLaPutere(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul ridicarii la putere al numerelor :" + primulNumar + " si " + alDoileaNumar + " este : " + ridicarePutere);

        System.out.println("Va rugam introduceti numarul pentru calcularea radicalului :");
        primulNumar = scanner1.nextInt();
        System.out.println("Rezultatul calcularii rezultatului numarului " + primulNumar + " este " + calculatorStiintifin.radicalDinNumar(primulNumar));
        System.out.println("Va rugam introduceti numarul pentru calcularea log in baza 10 : ");
        primulNumar = scanner1.nextInt();
        System.out.println("Rezultatul calcului logaritmului in baza 10 a numarului " + primulNumar + " este : " + calculatorStiintifin.logaritmBaza10(primulNumar));
        System.out.println("Va rugam introduceti numarul pentru calcularea logaritmului :");
        primulNumar = scanner1.nextInt();
        System.out.println("Rezultatul calcului logaritmului a numarului " + primulNumar + " este : " + calculatorStiintifin.logaritmNumar(primulNumar));

        //Sa se introduca 2 numere
        //Afisam numerele
        //Sa se afiseze meniul
        //1.Adunare
        //2.inmultire
        //3. Radical
        //4. Scadere
        //In functie de operatie sa se realizeze operatia respectiva , daca operatia presupune folosirea unui singru numar,
        //--facem operatia si pentru al doilea nuamr
        //Afisam rezultatul
        int optiune = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Va rugam introduceti cele 2 numere ");
        primulNumar = sc.nextInt();
        alDoileaNumar = sc.nextInt();
        System.out.println("Cele douna numere sunt : " + primulNumar + " si " + alDoileaNumar);
        System.out.println("Meniu");
        System.out.println("1.Adunare");
        System.out.println("2.Inmultire");
        System.out.println("3.Radical");
        System.out.println("4.Scadere");
        System.out.println("Va rugam alegeti o optiune ");
        optiune = sc.nextInt();

        while (optiune != 9) {//daca utilizatorul introduce orice numar inafara de 9
            if (optiune == 1) {
                System.out.println("S-a ales optiunea adunarea");
                System.out.println("Rezultatul adunarii este : " + calculatorStiintifin.adunbare(primulNumar, alDoileaNumar));

            } else if (optiune == 2) {
                System.out.println("S-a ales optiunea inmultire");
                System.out.println("Rezultatul inmultirii este : " + calculatorStiintifin.inmultire(primulNumar, alDoileaNumar));

            } else if (optiune == 3) {
                System.out.println("S-a ales optiunea radical");
                System.out.println("Rezultatul radicalul celor 2 numere este :67 " + calculatorStiintifin.radicalDinNumar(primulNumar) + " si " + calculatorStiintifin.radicalDinNumar(alDoileaNumar));

            } else if (optiune == 4) {
                System.out.println("S-a aleas optiunea scadere");
                System.out.println("Rezultatul scaderii este : " + calculatorStiintifin.scadere(primulNumar, alDoileaNumar));

            } else {
                System.out.println("Nu gasim optiunea dvs !");
            }
            optiune=sc.nextInt();
        }
        System.out.println("Ne pare rau , ati apasat tasta 9 am iesit din program . O zi buna ! ");

    }
}
