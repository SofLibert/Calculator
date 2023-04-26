import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] numbers = str.split(" ");

        try{
            double x = Double.parseDouble(numbers[0]);
            double y = Double.parseDouble(numbers[2]);
            if (!numbers[1].equals("+") && !numbers[1].equals("-") && !numbers[1].equals("*") && !numbers[1].equals("/")){
                System.out.println("Operation Error!");
                return;
            }
            if (numbers[1].equals("+")){
                System.out.println(x + y);
                return;
            }
            if (numbers[1].equals("-")){
                System.out.println(x - y);
                return;
            }
            if (numbers[1].equals("*")){
                System.out.println(x * y);
                return;
            }
            if (y == 0){
                System.out.println("Error! Division by zero");
                return;
            }
            System.out.println(x / y);
        }

        catch(NumberFormatException ex){
            System.out.println("Error! Not number");
        }
    }
}