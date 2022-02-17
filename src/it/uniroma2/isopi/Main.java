package it.uniroma2.isopi;

public class Main {

    public static void main(String[] args) {
        if (args.length > 1) {
            String string;
            int numeroVocali;
            int numeroConsonanti;
            int numeroSpazi;
            int numeroDoppie;

            if (args[1] != null) {
                string = args[1];
            } else {
                string = "";
            }

            if (args[0] != null) {
                if (args[0].equals("calcola vocali")) {
                    numeroVocali = calcolaNumeroVocali(string);
                    System.out.println(numeroVocali);
                } else if (args[0].equals("calcola consonanti")) {
                    numeroConsonanti = calcolaNumeroConsonanti(string);
                    System.out.println(numeroConsonanti);
                } else if (args[0].equals("calcola spazi")) {
                    numeroSpazi = calcolaNumeroSpazi(string);
                    System.out.println(numeroSpazi);
                } else if (args[0].equals("calcola doppie")) {
                    numeroDoppie = calcolaDoppie(string);
                    System.out.println(numeroDoppie);
                } else if (args[0].equals("inverti stringa")) {
                    string = invertiStringa(string);
                    System.out.println(string);
                } else if (args[0].equals("concatena stringa") && args.length > 2) {
                    string = concatenaStringa(string, args[2]);
                    System.out.println(string);
                }
            }
        }
    }

    public static int calcolaNumeroVocali(String string) {
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

    public static int calcolaNumeroConsonanti(String string) {
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

    public static int calcolaNumeroSpazi(String string) {
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

    public static int calcolaDoppie(String string) {
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

    public static String invertiStringa(String string) {
        String invertedString;
        StringBuilder tempString = new StringBuilder();

        for(int i = 0; i < string.length() ; i++) {
            tempString.append(string.charAt(string.length() - i));
        }

        invertedString = tempString.toString();

        return invertedString;
    }

    public static String concatenaStringa(String string1, String string2) {
        StringBuilder tempString = new StringBuilder();
        String stringaConcatenata;

        tempString.append(string1);
        tempString.append(string2);

        stringaConcatenata = tempString.toString();

        return stringaConcatenata;
    }
}
