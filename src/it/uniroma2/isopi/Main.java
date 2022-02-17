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

            switch(test){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }

        return count;
    }

    public int calcolaNumeroConsonanti(String string) {
        char test;
        int count = 0;

        for(int i = 0; i < string.length(); i++){
            test = string.charAt(i);

            switch(test){
                case 'b':
                case 'c':
                case 'd':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'l':
                case 'm':
                case 'n':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    count++;
                    break;
            }
        }

        return count;
    }

    public int calcolaNumeroSpazi(String string) {
        char test;
        int count = 0;

        for(int i = 0; i < string.length(); i++){
            test = string.charAt(i);

            switch(test){
                case ' ':
                    count++;
                    break;
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
