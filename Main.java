package johanhjalmarsson.com;
import java.util.Scanner;

public class Main {
    public static String[] options1 = {"Vad vill du göra", "1. Addera två tal", "2. Räkna bokstäver i en sträng",
            "3. Spegelvänd en sträng", "4. Summera alla tal  en sträng", "e. Avsluta programmet"};
            // Strängar till huvudmenyn
    public static String[] answers1 = {"Du valde att addera två tal","Du valde att räkna bokstäver i en sträng",
            "Du valde att spegelvända en sträng","Du valde att summera alla tal i en sträng","Tack och Hej då!",
            "Det alternativet finns inte."};
            // Strängar för svar efter menyval

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {              //huvudmeny

            for (String s : options1
                 ) {
                System.out.println(s);
            }

            switch (sc.nextLine().charAt(0)) { //hämtar char från användaren
                case '1':
                    System.out.println(answers1[0]);
                    addInt();
                    break;

                case '2':
                    System.out.println(answers1[1]);
                    countCharInString();
                    break;

                case '3':
                    System.out.println(answers1[2]);
                    reverseString();
                    break;

                case '4':
                    System.out.println(answers1[3]);
                    sumString();
                    break;
                case 'e':
                    System.out.println(answers1[4]);
                    System.exit(0);
                default:
                    System.out.println(answers1[5]);
                    break;
            }
        }
    }
    public static void addInt () {  //summerar två tal hämtade från användaren
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv de två tal du vill addera");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println();   //extra rad endast av estetiska skäl. Samma i samtliga metoder.
    }
    public static void countCharInString () {  //räknar en, av användaren vald, char i en sträng (given av användaren)
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ordet du vill leta i:");
        String word = sc.nextLine();
        System.out.println("Ange vilken bokstav i "+word+" du vill räkna:");
        char c = sc.nextLine().charAt(0);
        int sum = 0;


        for (int i = 0; i < word.length(); i++) {
            if (c == word.charAt(i)) {
                sum = sum + 1;
            }
        }
        System.out.println("Det finns "+sum+" "+c+" i ordet "+word);
        System.out.println();
    }
    public static void reverseString() {   //spegelvänder en sträng, given av användaren.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange strängen du vill spegelvända");
        String word = sc.nextLine();

        for (int i = (word.length()-1); i>=0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }
    public static void sumString() {   // summerar talen i en sträng (given av användaren)
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv strängen du vill summera");
        String word = sc.nextLine();
        boolean b1 = true;

            int sum = 0;
            for (int i = 0; i < word.length(); i++) {
                b1 = isDigit(word.charAt(i));
                char c = word.charAt(i);
                int a = Character.getNumericValue(c);       //omvandlar char till int
                sum = sum + a;
            }
            if (b1) {
                System.out.println("Summan av " + word + " är: " + sum);
                System.out.println();
            } else {
            System.out.println("Error: Det fanns en eller flera bokstäver i strängen.");
            System.out.println();
            }
    }
    public static boolean isDigit(char c) {  //kollar om en char är digit
        char c1 = c;
        return Character.isDigit(c1);

    }
}
