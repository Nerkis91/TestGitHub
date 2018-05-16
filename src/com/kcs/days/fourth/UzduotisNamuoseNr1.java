package com.kcs.days.fourth;

import java.util.ArrayList;
import java.util.List;

public class UzduotisNamuoseNr1 {
    /*Sukurti naują ArrayList kolekciją, pridėti 5 vartotojų vardus ir juos atspausdinti,
    jei vardo ilgis ilgesnis nei 6 simboliai. Rezultatus spausdinti ekrane naudojant for ciklą.*/

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Nerijus");
        names.add("Karolis");
        names.add("Konstantinas");
        names.add("Rokas");
        names.add("Povilas");

        System.out.println(getFirst(names));
        System.out.println(getLast(names));
        //names.stream().filter(a -> a.length() > 6).forEach(System.out :: println);

        for (String name : names) {
            if (name.length() > 6) {
                System.out.println(name);
            }
        }
    }
    private static String getFirst(List<String> names){
        return names.get(0);
    }
    private static String getLast (List<String> names){
        return names.get(names.size() - 1);
    }
}
