// java basics

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main { // Pascalcase
    
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(123);
        printer.print();

        Printer<Double> printer2 = new Printer<>(123.45);
        printer2.print();

        Printer<String> printer3 = new Printer<>("Hello");
        printer3.print();
    }
    
    
    public static void basics(String[] args) {
        System.out.println("Hello World!");

        // variable declaration
        int a = 10;
        int b = 20;
        int c = a + b;
        c = c + 10;
        int age = 20; //camelcase
        System.out.println(c);

        // reference types
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = "Hello World";
        /*
         * System.out.println(message.replace("World", "There"));
         * System.out.println(message.substring(0, 5));
         * System.out.println(message.indexOf("W"));
         * System.out.println(message.startsWith("H"));
         * System.out.println(message.endsWith("d"));
         */
        System.out.println("Yeooo \"Hello\"");

        // arrays 
        System.out.println("\n\n arrays:");

        // one way to declare an array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[4] = 5;
        String numbersString = Arrays.toString(numbers);
        System.out.println(numbersString);

        // another way to declare an array
        int[] numbers2 = {2, 3, 5, 1, 4};
        System.out.println(numbers2.length);

        // sorting
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        // multidimensional arrays
        // int[][] numbers3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // System.out.println(Arrays.deepToString(numbers3));

        int[][] numbers3 = new int[2][3];
        numbers3[0][0] = 1;
        numbers3[1][2] = 6;
        System.out.println(Arrays.deepToString(numbers3));

        // constants
        final float PI = 3.14f;
        // PI = 1;
        System.out.println(PI);

    }

    public static void math(String[] args) {
        int result = 10 / 3;
        float result2 = (float)10 / (float)3;
        System.out.println(result);
        System.out.println(result2);

        int x = 1;
        int y = x++;
        int z = ++x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("\n\n");

        // Implicit casting
        // byte > short > int > long > float > double
        short x1 = 1;
        int y1 = x1 + 2;
        System.out.println(y1);

        // Explicit casting
        double a = 1.1;
        int b = (int)a + 2;
        System.out.println(b);

        System.out.println("\n");

        // Math class
        int result3 = Math.round(1.1F);
        System.out.println(result3);

        int result4 = (int)Math.ceil(1.1F);
        System.out.println(result4);
        
        // Formatting numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result5 = currency.format(1234567.891);
        System.out.println(result5);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result6 = percent.format(0.1);
        System.out.println(result6);

        // Reading input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String FIrstname = scanner.next().trim();
        String Lastname = scanner.next().trim();

        System.out.println("You are " + FIrstname + " " + Lastname);
    }


    public static void control(String[] args) {
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

        // Ternary operator
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);

        // Switch statement
        String role = "user";
        switch (role) {
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }

        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + i);
        }

        // While loop
        while (income > 0) {
            System.out.println("Income is " + income);
            income -= 1000;
        }

        // for each loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

    }

    // generics
    public static class Printer <T> {
        T thingToPrint;

        public Printer(T thingToPrint) {
            this.thingToPrint = thingToPrint;
        }
        
        public void print() {
            System.out.println(thingToPrint);
        }
        
    }
} 
