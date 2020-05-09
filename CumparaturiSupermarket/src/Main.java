import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Sa se modeleze cosul de cuparaturi dintr-un supermarket
        //Fiecare produs sa fie reprezentat de un obiect care sa contina nume si pret , ex mere 5 lei , pere 7 lei , cirese 100 lei
        //Cosul de cumparaturi va fi reprezentat de un array de produse
        //Sa se afiseze un meniu cu produsele dorite
        //Bazat pe  ce se introduce la tastura adaugam in cosul de cumparaturi
        //Sa se calculeze costul total al cosului de cumparaturi
        //Simulam  platim pentru cosul de cumparaturi
        Produs[] cosDeCumparaturi = new Produs[10];
        System.out.println("Meniu cumparaturi");
        System.out.println("1.Mere");
        System.out.println("2.Matura");
        System.out.println("3.Set de Farfurii");
        System.out.println("4.Mustar");
        System.out.println("5.Apa");
        System.out.println("6.Bere");
        System.out.println("7.Suc");
        System.out.println("Va rugam alegeti produsele dorite :");
        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();
        while (optiune != 0) {
            if (optiune == 1) {
                System.out.println("Ati adauga in cosul de cumparaturi mere");
                Produs mere = new Produs("mere", 5);
                cosDeCumparaturi[0] = mere;
                System.out.println("Afisare adaugarea : " + cosDeCumparaturi[0].getNume() + " si " + cosDeCumparaturi[0].getPret());
            } else if (optiune == 2) {
                System.out.println("Ati adauga in cosul de cumparaturi matura");
                Produs matura = new Produs("matura", 6);
                cosDeCumparaturi[1] = matura;
                System.out.println("Afisare adaugarea : " + cosDeCumparaturi[1].getNume() + " si " + cosDeCumparaturi[1].getPret());
            } else if (optiune == 3) {
                System.out.println("Ati adauga in cosul de cumparaturi un set de farfurii");
                Produs setFarfurii = new Produs("Set de farfurii", 10);
                cosDeCumparaturi[2] = setFarfurii;
                System.out.println("Afisare adaugarea : " + cosDeCumparaturi[2].getNume() + " si " + cosDeCumparaturi[2].getPret());
            } else if (optiune == 4) {
                System.out.println("Ati adauga in cosul de cumparaturi mustar");
                Produs mustar = new Produs("mustar", 4);
                cosDeCumparaturi[3] = mustar;
                System.out.println("Afisare adaugarea : " + cosDeCumparaturi[3].getNume() + " si " + cosDeCumparaturi[3].getPret());
            } else if (optiune == 5) {
                System.out.println("Ati adauga in cosul de cumparaturi apa");
                Produs apa = new Produs("apa", 3);
                cosDeCumparaturi[4] = apa;
                System.out.println("Afisare adaugarea : " + cosDeCumparaturi[4].getNume() + " si " + cosDeCumparaturi[4].getPret());
            } else if (optiune == 6) {
                System.out.println("Ati adauga in cosul de cumparaturi bere");
                Produs bere = new Produs("bere", 8);
                cosDeCumparaturi[5] = bere;
                System.out.println("Afisare adaugarea : " + cosDeCumparaturi[5].getNume() + " si " + cosDeCumparaturi[5].getPret());
            } else if (optiune == 7) {
                System.out.println("Ati adauga in cosul de cumparaturi suc");
                Produs suc = new Produs("suc", 5);
                cosDeCumparaturi[6] = suc;
                System.out.println("Afisare adaugarea : " + cosDeCumparaturi[6].getNume() + " si " + cosDeCumparaturi[6].getPret());
            } else {
                System.out.println("Nu avem acest produs");
            }


            optiune = scanner.nextInt();
        }
        System.out.println("Ati apasat tasta 0 , programul sa inchis , O zi buna !");
        System.out.println("Ati cumparat : ");
        System.out.println("lungimea cosului este : " + cosDeCumparaturi.length);
        for (int cursor = 0; cursor < cosDeCumparaturi.length; cursor++) {
            if (cosDeCumparaturi[cursor] != null) {
                System.out.println("Produsele sunt" + cosDeCumparaturi[cursor].getNume() + " la pretul de " + cosDeCumparaturi[cursor].getPret());
            }
        }
        int pretTotal = 0;
        for (int cursor = 0; cursor < cosDeCumparaturi.length; cursor++) {
            if (cosDeCumparaturi[cursor] != null) {
                pretTotal = cosDeCumparaturi[cursor].getPret();
            }
        }
        System.out.println("Pret total este : " + pretTotal);
        System.out.println("S-a platit cumparaturile");
        pretTotal = 0;
    }
    //sa se reprezinte un calculato care face operatiile simple , stiintifice dar si urmatoarele operatii cu stringuri
    //--cocantenarea a 2 stringuri
    //verifica daca strigul contine un anumit caracter
    //aduna lungimea a 2 stringuri
    //vreifica daca lungimea unui string est un numar par sau impar
    //transforma un string intr-un sir de caractere
    //verifica daca stirngul incepe cu o vocala
    //numara spatiile dintr-un sting
    
}
