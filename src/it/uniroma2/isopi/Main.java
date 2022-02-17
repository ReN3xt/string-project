package it.uniroma2.isopi;

public class Main {

    public static void main(String[] args) {
        String string = "";

    }

    public int calcolaNumeroVocali(String string) {
        char test;
        int count = 0;

        for(int i = 0; i < string.length(); i++){
            test = string.charAt(i);

            if(test == 'a' || test == 'e' || test == 'i' || test == 'o' || test == 'u'){
                count++;
            }
        }

        return count;
    }

    public int calcolaNumeroConsonanti(String string) {
        char test;
        int count = 0;

        for(int i = 0; i < string.length(); i++){
            test = string.charAt(i);

            if(test == 'b' || test == 'c' || test == 'd' || test == 'f' || test ==  'g' || test ==  'h' || test ==  'j' || test ==  'l' || test ==  'm' || test ==  'n' || test ==  'p' || test ==  'q' || test ==  'r' || test ==  's' || test ==  't' || test ==  'v' || test ==  'w' || test ==  'x' || test ==  'y' || test ==  'z') {
                count++;
            }
        }

        return count;
    }

    public int calcolaNumeroSpazi(String string) {
        char test;
        int count = 0;

        for(int i = 0; i < string.length(); i++){
            test = string.charAt(i);

            if (test == ' ') {
                count++;
            }
        }

        return count;
    }

    public int calcolaLettereDoppie(String string) {
        char test1;
        char test2;
        int count = 0;

        for(int i = 0; i < string.length() - 1; i++) {
            test1 = string.charAt(i);
            test2 = string.charAt(i + 1);

            if(test1 == test2 && test1 != ' ') {
                count++;
            }
        }

        return count;
    }


}
