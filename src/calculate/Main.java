package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        char ch;
        do {
            //scanner class for user input
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter first number  ");
            int a = scan.nextInt();//storing first number
            System.out.print("Enter second number  ");
            int b = scan.nextInt();
            System.out.print("Enter the one of the symbol +,-,*,/ : ");
            char symbol = scan.next().charAt(0);
            cal.calculateResult(a,b,symbol);
            if(symbol == '+'){
            cal.addition(a,b);
            } else if(symbol == '-'){
            cal.subtraction(a,b);}
            else if (symbol == '*'){
                cal.multiplication(a,b);}
           else{ cal.division(a,b);}
            Scanner input =new Scanner(System.in);
            System.out.print("Would you like to do more calculation please enter \"y\" or \"N\" : ");
            String x = input.nextLine();
            ch = x.charAt(0);


        }         while (ch == 'y' || ch == 'Y');

        System.out.println("Thanks for using calculator Arvindbhai for team scrum");

    }
}