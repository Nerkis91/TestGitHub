package com.kcs.days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class treciaUzduotis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pasirinkite kokios figuros plotą skaičiuosit: ");
        System.out.println("1 - Stačiakampis trikampis");
        System.out.println("2 - Stačiakampis");
        System.out.println("3 - Kvadratas");
        System.out.println("4 - Apskritimas");

        int choice = scanner.nextInt();

        System.out.println("Jusu pasirinkimas " + choice);
        getCorrectNumber(scanner);
    }

    private static int getCorrectNumber(Scanner scanner){
        int result = 0;
        while  (true){
            try {
                result = scanner.nextInt();
                if (result < 1 || result > 4){
                    throw new InputMismatchException("Blogas diapozonas");
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Blogas formatas, pakartoti");
                scanner.nextLine();
            }
        }

        return result;
    }
}

