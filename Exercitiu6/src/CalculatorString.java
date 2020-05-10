public class CalculatorString extends CalculatorStiintifin {
    public CalculatorString() {

    }

    public String concantenare(String text1, String text2) {
        return text1.concat(text2);
    }

    public int contineCaracter(String text1, char a) {
        return text1.indexOf(a);
    }

    public int adunareSrting(String text1, String text2) {
        return text1.length() + text2.length();
    }

    public boolean stringParImpar(String text1) {
        if (text1.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public char[] sirCaractere(String text1) {
        return text1.toCharArray();
    }

    public boolean vocala(String text1) {
        char primaLitera = text1.charAt(0);
        if(primaLitera=='a'||primaLitera=='e'||primaLitera=='i'||primaLitera=='o'||primaLitera=='u'){
            return true;
        }else {
            return false;
        }
    }
    public int spatiiStinrg(String text1){
        int numarDeSpatii=0;
        for(int cursor=0;cursor<text1.length();cursor++){
            if(text1.charAt(cursor)==' '){
                numarDeSpatii++;
            }
        }
        return numarDeSpatii;
    }

}
