package com.kcs.days.third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TreciaUzduotis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TreciaUzduotis treciaUzduotis = new TreciaUzduotis();

        while (true) {
            System.out.println("Pasirinkite kokios figuros plotą skaičiuosit: ");
            System.out.println("1 - Stačiakampis trikampis");
            System.out.println("2 - Stačiakampis");
            System.out.println("3 - Kvadratas");
            System.out.println("4 - Apskritimas");
            System.out.println("0 - Baigti darba");
            int selectedMenuItem = (int)getCorrectNumber(scanner);
            switch (selectedMenuItem) {
                case 1:
                    treciaUzduotis.triangle(scanner);
                    break;
                case 2:
                    treciaUzduotis.staciakampis(scanner);
                    break;
                case 3:
                    treciaUzduotis.kvadratas(scanner);
                    break;
                case 4:
                    treciaUzduotis.apskritimas(scanner);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Neradome veiksmo, pakartokite");
                    break;
            }
        }
    }

    private void triangle(Scanner scanner){
        System.out.println("iveskite a statini");
        double a = getCorrectNumber(scanner);

        System.out.println("iveskite b statini");
        double b = getCorrectNumber(scanner);

        System.out.println("Trikampio plotas: " + (a * b)/2);
    }
    private void staciakampis (Scanner scanner){
        System.out.println("iveskite a statini");
        double a = getCorrectNumber(scanner);

        System.out.println("iveskite b statini");
        double b = getCorrectNumber(scanner);

        System.out.println("Staciakampio plotas: " + (a * b));
    }

    private void kvadratas (Scanner scanner){
        System.out.println("iveskite a statini");
        double a = getCorrectNumber(scanner);

        System.out.println("kvadrato plotas: " + Math.pow(a, 2));
    }
    private void apskritimas (Scanner scanner){
        System.out.println("iveskite a spinduli");
        double a = getCorrectNumber(scanner);
        System.out.println("apskritimo plotas: " + Math.PI* Math.pow(a, 2));
    }


    private static double getCorrectNumber(Scanner scanner){
        double result;
        while  (true){
            try {
                result = scanner.nextDouble();
                /*if (result < 1 || result > 4){
                    throw new InputMismatchException("Blogas diapozonas");
                }*/
                break;
            }catch (InputMismatchException e){
                System.out.println("Blogas formatas, pakartoti");
                scanner.nextLine();
            }
        }
        return result;
    }
}

