package com.kcs.days.second;

public class antraUzduotis {

    private static final String PALINDROME_1 = "KOL EINU ŠUNIE LOK";
    private static final String PALINDROME_2 = "ARGI TEN NE TIGRA";
    private static final String PALINDROME_3 = "SĖDĖK UŽU KĖDĖS";

    public static void main(String[] args) {

        String[] palindromeMas = {PALINDROME_1, PALINDROME_2, PALINDROME_3};

        for (String p : palindromeMas){
            if (isWordIsPalindrome(p.replaceAll(" ", ""))){
                System.out.println("Palindromas");
            }else{
                System.out.println("Nepalindromas");
            }
        }

        /*boolean isPalindrome = isWordIsPalindrome("KOL EINU ŠUNIE LOK".replaceAll(" ", ""));

        if (isPalindrome) {
            System.out.println("Tai yra Palindromas");
        }else{
            System.out.println("Tai nėra Palindromas");
        }*/
    }
    private static boolean isWordIsPalindrome (String word) {
        boolean isPalindrome = true;//isivaizduojame kad visada yra palindromas
        for (int i = 0; i < word.length(); i++){
            char a = word.charAt(i);
            char b = word.charAt(word.length() - 1 - i);
            if (a != b){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}