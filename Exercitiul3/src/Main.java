public class Main {
    public static void main(String[] args) {
        //Se da un text , sa se numere cuvintele care au lungimea impara si se termina cu litera "e"
        String text = "Istoria este stiinta care stidiaza evolutia societatii omenesti din trecut pana in prezent ";
        int variabila=numarCuvinte(text);
        System.out.println("numarul de cuvinte : "+variabila);


    }

    public static int numarCuvinte(String text) {
        int numarCuvinte=0;
        String[] rezultatSplit = text.split(" ");
        for (int cursor = 0; cursor < rezultatSplit.length; cursor++) {
            if (rezultatSplit[cursor].length() % 2 != 0 || rezultatSplit[cursor].endsWith("e")) {
                numarCuvinte++;
            }
        }return  numarCuvinte;
    }
}
