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

            switch (test) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }

        return count;
    }

    public int calcolaNumeroConsonanti(String string) {
        char test;
        int count = 0;

        for(int i = 0; i < string.length(); i++){
            test = string.charAt(i);

            switch (test) {
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' -> count++;
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
        char test1, test2;
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
