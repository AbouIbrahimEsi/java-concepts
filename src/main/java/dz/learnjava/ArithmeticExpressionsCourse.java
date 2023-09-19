package dz.learnjava;

import java.text.NumberFormat;

public class ArithmeticExpressionsCourse {
    public static void main(String[] args) {

        int result = 10 / 3; // it gives an int
        double result2 = (double)10 / (double)3; // it gives a double
        System.out.println(result);

        int x = 1;
//        int y = x++;  // ==> y = 1 , x = 2
        int y = ++x;    // ==> y = 2 , x = 2

        x += 2;    //Augmented or Compound assignment operator
        //x -= 2; x *= 2; x /= 2;

        // Implicit casting
        // byte > short > int > long > float > double
        short x1 = 1;
        int y1 = x1 + 2;
        System.out.println(y1);

        // Explicit casting ==> Compatible variables
        double x2 = 1;
        int y2 = (int)x1 + 2;
        System.out.println(y2);

        // Explicit casting ==> Incompatible variables
        String x3 = "1";
        int y3 = Integer.parseInt(x3) + 1;
        System.out.println(y3);

        // Math Class
        int result3 = Math.round(1.1F);
        int result4 = (int)Math.ceil(1.1F);
        int result5 = (int)Math.floor(1.1F);
        double result6 = Math.random(); // random number between 0 and 1

        // Formatting numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();  // it's a factory method
        String resultCurrency = currency.format(1245.895);
        NumberFormat percent = NumberFormat.getPercentInstance();  // it's a factory method
        String resultPercentage = percent.format(0.2);

    }
}
