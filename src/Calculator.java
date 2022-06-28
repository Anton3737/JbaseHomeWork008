import java.util.Scanner;

public class Calculator {
    static double resault;
    static double operandOne;  // об'явдяєм поля
    static double operandTwo;


    static double add(){
        resault = operandOne + operandTwo;
        return resault;
    }
    static double sub(){
        resault = operandOne - operandTwo;
        return resault;
    }                                     // Методи з математичними операціями
    static double mul(){
        resault = operandOne * operandTwo;
        return resault;
    }
    static double div(){
        resault = operandOne / operandTwo;
        return resault;
    }


    public static void main(String[] args) {
        System.out.println("Веедіть операнд 1: ");
        Scanner in = new Scanner(System.in);
        operandOne = in.nextDouble();
        System.out.println("Веедіть операнд 2: ");      // ввод значень
        operandTwo = in.nextDouble();
        System.out.println("Введіть знак математичної операції:");
        Scanner matOper = new Scanner(System.in);
        String simvolmatoper = matOper.next();

        switch (simvolmatoper) {                       // опрацьовуємо вибір операції через свіч кейс та виводимо результат
            case "+":
                    add();
                System.out.println("результат ділення " + add());
                break;
            case "-":
                    sub();
                System.out.println("результат віднімання " + sub());
                break;
            case "*":
                    mul();
                System.out.println("результат множення " + mul());
                break;
            case "/":
//                div();
//                System.out.println("результат ділення " + div());
//                try {
//                    div();
//                    System.out.println("результат ділення " + div());
//                }catch (Exception e){
//                    System.out.println("ділення на 0 не можливе ");
//                }
                try {
                    div();
                    System.out.println("результат ділення " + div());
                } catch (ArithmeticException e) {
                    System.out.println("division by zero");
                }
                break;
            default:
        }
    }
}



