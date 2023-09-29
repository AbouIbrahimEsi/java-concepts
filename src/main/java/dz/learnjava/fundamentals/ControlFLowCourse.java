package dz.learnjava.fundamentals;


import java.util.Scanner;

public class ControlFLowCourse {
    public static void main(String[] args) {

        // logical operators and boolean expressions
        int temperature = 23;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalCredit = false;

        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalCredit;
        System.out.println(isEligible);

        //IF statements
        int temp = 32;
        if(temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of");
        } else if (temp > 20 ) {
            System.out.println("It's nice day");
        } else {
            System.out.println("Cold Day");
        }

        // Simplifying if statements
        int income = 120_000;

//        boolean hasHighIncome2 = false;
//        if(income > 100_000) {
//            hasHighIncome2 = true;
//        }
        boolean hasHighIncome2 = (income > 100_000);

        //The ternary operator
//        String className = "Economy class";
//        if (income > 100_000)
//            className = "First Class";
        String className = income > 100_000 ? "First class" : "Economy class"; // Ternary operator

        //Switch statements
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }

        // Loops
        // while loops are good in situations when we don't know ahead of time how many times we
        // want to repeat something
        String input = "";
        Scanner scanner1 = new Scanner(System.in);
        while(true){
            System.out.print("Input:");
            input = scanner1.next().toLowerCase();

            if(input.equals("pass"))
                continue; // continue the loop without executing the rest of the code
                          // moves the control to the beginning of the loop
            if(input.equals("quit"))
                break; // terminates the loop
            System.out.println(input);
        }

        // do while loop execute at least one time
        do {
            System.out.print("Input:");
            input = scanner1.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        // For each loop
        String[] fruits = {"Apple", "Mango", "Orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


    }
}
