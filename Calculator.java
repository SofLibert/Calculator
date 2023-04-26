import java.util.Scanner;
import java.io.*;

class Calculator{
    public static void main(String[] args) {

        try(FileReader reader = new FileReader("input.txt")) {
            Scanner sc = new Scanner(reader);
            while (sc.hasNextLine()) {
                try {
                    String str = sc.nextLine();
                    String[] numbers = str.split(" ");
                    double x = Double.parseDouble(numbers[0]);
                    double y = Double.parseDouble(numbers[2]);
                    if (!numbers[1].equals("+") && !numbers[1].equals("-") && !numbers[1].equals("*") && !numbers[1].equals("/")) {
                        System.out.println("Operation Error!");
                        continue;
                    }
                    if (numbers[1].equals("+")) {
                        System.out.println(x + y);
                        continue;
                    }
                    if (numbers[1].equals("-")) {
                        System.out.println(x - y);
                        continue;
                    }
                    if (numbers[1].equals("*")) {
                        System.out.println(x * y);
                        continue;
                    }
                    if (y == 0) {
                        System.out.println("Error! Division by zero");
                        continue;
                    }
                    System.out.println(x / y);
                }
                catch(NumberFormatException ex) {
                    System.out.println("Error! Not number");
                }
            }
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}