package Notes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.Timer;
import java.util.TimerTask;

import java.util.HashMap;

import java.util.Scanner;

public class More {
    
    public static void main(String[] args) {

        /* threading */ // allows a program to operate multiple tasks simultaneously
        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        scanner.close();

        /* Date and Time */
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
        
        LocalDateTime dateTime = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        // System.out.println(formattedDateTime);

        LocalDate date = LocalDate.of(2024, 12, 25);
        // System.out.println(date);

        LocalTime time = LocalTime.of(12, 30, 0);
        // System.out.println(time);

        LocalDateTime dateTime2 = LocalDateTime.of(date, time);
        // System.out.println(dateTime2);

        /* Exception Handling */
        try {
            int result = 10 / 0;
            // System.out.println(result);
        } catch (ArithmeticException e) {
            // System.out.println("Error: " + e.getMessage());
        } finally {
            // System.out.println("Finally block");
        }

        /* anonymous classes */
        /* 
        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Woof");
            }
        };
        dog.bark();
        */

        /* timertasks */
        // Timer = Class that schedules tasks to be executed at specified intervals
        // TimerTask = Task to be executed. Will be extended to define own task
        /* 
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 10;

            @Override
            public void run() {
                if (counter > 0) {
                    System.out.println(counter);
                    counter--;
                } else {
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }
            }
        };
        // timer.schedule(task, 0, 200);
        */

        /* HashMaps */ // key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 20);
        map.put("Jane", 21);
        map.put("Jim", 22);
        map.remove("Jane");
        // System.out.println(map);
        // System.out.println(map.get("John"));
        // System.out.println(map.containsKey("Jane"));

        /* enum */
        Day day = Day.MONDAY;
        // System.out.println(day);
        // System.out.println(day.getDayNumber());
        
    }
}

enum Day {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private int dayNumber;

    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
            if (i == 5) {
                System.out.println("Time's up!");
                System.exit(0);
            }
        }
    }
}

