package com.matraore;

import com.matraore.user.User;
import com.matraore.user.UserDao;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean running = true;

    public static void main(String[] args) {
        System.out.println("***** CAR BOOKING *****");

        do{
            System.out.println("️1️⃣ - Book Car");
            System.out.println("️2️⃣ - View All User Booked Cars");
            System.out.println("️3️⃣ - View All Bookings");
            System.out.println("️4️⃣ - View Available Cars");
            System.out.println("️5️⃣ - View Available Electric Cars");
            System.out.println("️6️⃣ - View all users");
            System.out.println("️7️⃣ - Exit");

            System.out.println("");

            Scanner scanner = new Scanner(System.in);

            int input = scanner.nextInt();
            if (input == 7){
                running = false;
            }
            /*
            if (input <= 0 || input >= 8) {
                System.out.println();
                System.out.println("");
            }

             */

            switch (input) {
                case 1 :
                    System.out.println("you select option 1");
                    break;
                case 2 :
                    System.out.println("you select option 2");
                    break;
                case 3 :
                    System.out.println("you select option 3");
                    break;
                case 4 :
                    System.out.println("you select option 4");
                    break;
                case 5 :
                    System.out.println("you select option 5");
                    break;
                case 6 :
                    getAllUsers();
                    break;
                default:
                    System.out.println(input + " is not a valid option ❌");
            }
            System.out.println("");


        } while (running);

    }

    private static void getAllUsers() {
        UserDao users = new UserDao();

        for (User c : users.getUsers()) {
            System.out.println(c);
        }
    }


}


