import java.util.Scanner;

public class _11_05_18_1_Uzduotis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        do {
            System.out.println("Iveskite zodi ");
            word = scanner.nextLine();
            if (word.length() % 2 == 0) {
                System.out.println("ivestas zodis " + word + " yra nelyginis" + countLetters(word, 'a'));
            } else {
                System.out.println("ivestas zodis " + word + " yra lyginis" + countLetters(word, 'a'));
            }
        } while (!word.equals("pabaiga"));//darys tol kol ivestas zodis bus nelygus zodziui -pabaiga
    }

    private static int countLetters(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

}
