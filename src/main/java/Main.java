import java.util.Scanner;

public class Main {

    static String word = "miracles";

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // miracles --------
        System.out.println ("������ �����");
        int lengthWord = word.length ();
        String maskWord = "-".repeat (lengthWord);
        System.out.println (maskWord);

        // --------
        // m-------
        // -i------
        // --r-----
        // ---a----
        // ----c---
        // -----l--
        // ------e-
        // -------s

        do {
            System.out.println ("������� �����");
            char c = input.next ().charAt (0);
            // a 2
            // w -1
            if ( word.indexOf (c) >= 0 ) {
                System.out.println ("�����!");
                for (char elem : word.toCharArray ()) {
                    if ( elem == c ) {
                        maskWord = replaceMaskLetter (c, maskWord);
                    }
                }
                System.out.println (maskWord);
            } else {
                System.out.println ("������, �������� ��� ���!");
                System.out.println (maskWord);
            }
        } while (maskWord.contains ("-"));
        System.out.println ("����������� �� �������!!!");
    }


    public static String replaceMaskLetter(char c, String maskWord) {
        StringBuilder stringBuilder = new StringBuilder ();
        for (int i = 0; i < word.length (); i++) {
            if ( word.charAt (i) == c ) {
                stringBuilder.append (c);
            } else if ( maskWord.charAt (i) != '-' ) {
                stringBuilder.append (maskWord.charAt (i));
            } else {
                stringBuilder.append ("-");
            }
        }
        return stringBuilder.toString ();
    }
}