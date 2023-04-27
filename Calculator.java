import java.util.Scanner;
import java.io.*;

class Calculator{
    public static void main(String[] args) {

        try{
            FileReader reader = new FileReader("input.txt");
            FileOutputStream outputStream = new FileOutputStream("output.txt");
            PrintStream printStream = new PrintStream(outputStream);
            Scanner sc = new Scanner(reader);
            String str = null;
            while (sc.hasNextLine()) {
                try {
                    str = sc.nextLine();
                    String[] numbers = str.split(" ");
                    double x = Double.parseDouble(numbers[0]);
                    double y = Double.parseDouble(numbers[2]);
                    if (!numbers[1].equals("+") && !numbers[1].equals("-") && !numbers[1].equals("*") && !numbers[1].equals("/")) {
                        printStream.println(str + " = " + "Operation Error!");
                        continue;
                    }
                    if (numbers[1].equals("+")) {
                        printStream.println(str + " = " + (x + y));
                        continue;
                    }
                    if (numbers[1].equals("-")) {
                        printStream.println(str + " = " + (x - y));
                        continue;
                    }
                    if (numbers[1].equals("*")) {
                        printStream.println(str + " = " + (x * y));
                        continue;
                    }
                    if (y == 0) {
                        printStream.println(str + " = " + "Error! Division by zero");
                        continue;
                    }
                    printStream.println(str + " = " + (x / y));
                }
                catch(NumberFormatException ex) {
                    printStream.println(str + " = " + "Error! Not number");
                }
            }
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}