package com.kcs.days.third;

/*Onutei sunkei sekasi mokytis matematiką ir ji neturi skaičiuotuvo, 
        padėkite Onutei ir sukurkite skaičiuotuvą kuris atliktu:
        a.Sumos
        b.Skirtumo
        c.Dalybos, nepamirškite, kad dalyba iš nulio negalima!
        d.Daugybos
        e.Kėlimas laipsniu
        Skaičiuoto veiksmų skaičiavimai turi būti atskiroje klasėje. 
        Onutei negalima leisti įvesti blogą skaičių ir netinkamą operaciją reikia prašyti pakartoti įvedimą.
        Onutė įvedinės veiksmus tokiu formatu : „12 + 12“, „50 - 15“ ir t.t.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class SestaUzduotis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaicius ir veiksma tarp ju, pvz: \"12 + 12\"");

        String line = scanner.nextLine();
        String[] items = line.split(" ");//sukuriam masyva ir nurodom kaip sukarpyti, ismetant tarpus
        Calculator calculator = new Calculator();
        double numb, numb2;
        if(items.length == 3){
        switch (items[1]){
            case "+":
                numb = getCorrectNumber(items[0], scanner, "Iveskite pirma skaiciu");
                numb2 = getCorrectNumber(items[2], scanner, "Iveskite antra skaiciu");//naudojam Double (double) metoda konvertuoti string i double
               //double sum = calculator.suma(numb, numb2); vienas variantas kaip uzrasyti
                System.out.println("Suma: " + calculator.suma(numb, numb2));
                break;
            default:
                System.out.println("Nera tokio veiksmo, mergyt");
            }
        }else{
            System.out.println("Nepasiseke, bandyk dar karta");
        }
    }
    private static double getCorrectNumber(String numb, Scanner scanner, String text){
        double result;
        try {
            result = Double.parseDouble(numb);
        }catch (NumberFormatException e){
            while (true) {
                System.out.println(text);
                try {
                    result = scanner.nextDouble();
                    break;
                }catch (InputMismatchException ex){
                    System.out.println("juk sakiau skaiciu");
                    scanner.nextLine();
                }
            }
        }
        return result;
    }
}
