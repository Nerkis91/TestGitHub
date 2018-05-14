import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstClass {
    //sukuria programos pavadinima
    public static void main(String[] args){
        //objekto sukurimas
        MyFirstClass myFirstClass = new MyFirstClass();

        float ff = 5.6f;
        //statinis metodas gali pasiekti nestatini metoda tik per klases metoda
        myFirstClass.notStaticMethod("Jonas");

        System.out.println(sayHi());

        myFirstClass.checkThisNumber(50);

        System.out.println("Please insert a number!!!");
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            System.out.println("Your number is -> " +number);
        }catch (InputMismatchException e){
            System.out.println("Ivestas ne skaicius");
        }

    }
    private void notStaticMethod (String name){
        //strumpinys 'sout' + enter
        System.out.println(name);
        System.out.println(sayHi());
    }

    private static String sayHi(){


        return "Hi Nerijus";
    }

    private void checkThisNumber(int number){
        if (number > 10){
            System.out.println("Daugiau");
        }else if (number >15){
            System.out.println("daugiau uz 15");
        }else {
            System.out.println("maziau");
        }
    }
}
