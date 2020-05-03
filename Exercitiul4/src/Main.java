public class Main {
    //Se da un text
    //A) Sa se numere toate cuvintele care au lungimea mai mare de cat 2 , contin caracterul 'i' si caracterul i se afla pe o pozitie para
    public static void main(String[] args) {
        String text1="Obiectul istoriei nu se limitează doar la evenimentele politice, cum ar fi de exemplu bătăliile sau faptele conducătorilor.";
        int numarCuvinte=numarulDeCuvinte(text1);
        System.out.println("numarul de cuvinte este : "+numarCuvinte);
    }
    public static int numarulDeCuvinte(String text){
        int numarCuvinte=0;
        String[]rezultatSplit=text.split(" ");
        for(int cursor=0;cursor<rezultatSplit.length;cursor++){
            if(rezultatSplit[cursor].length() >2 && rezultatSplit[cursor].contains("i")&&rezultatSplit[cursor].indexOf("i")%2==0){
                numarCuvinte++;
            }
        }return numarCuvinte;
    }
}
