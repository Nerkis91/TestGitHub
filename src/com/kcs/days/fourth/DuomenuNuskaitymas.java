package com.kcs.days.fourth;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DuomenuNuskaitymas {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new FileReader("example.txt"))){
            String line;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
