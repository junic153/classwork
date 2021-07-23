
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junic153
 */
public class Scanner1 {
    public static void main(String[] args) {
        int sum = 0;
        int operand1 =0;
        int operand2=0;
        Scanner myScanner = new Scanner(System.in);
        String stringOperand1="";
        String stringOperand2="";
        
        System.out.println("Please input first number");
          stringOperand1 = myScanner.nextLine();
          System.out.println("Please inpput second number");
          stringOperand2=myScanner.nextLine();
          operand1=Integer.parseInt(stringOperand1);
          operand2=Integer.parseInt(stringOperand2);
        sum = operand1 + operand2;
        System.out.println("the sum is " + sum);
        
    }
}
