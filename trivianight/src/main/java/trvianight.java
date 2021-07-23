
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
public class trvianight {
    public static void main(String[] args){
      int score = 0;
      int userSel = 0;
       Scanner userInput = new Scanner(System.in);
       System.out.println("It's TIEVIA NIGHT!  Are you ready?");
       System.out.println("");
       System.out.println("What is the Lowest Level Programming Language?");
       System.out.println("1) Source code                 2)) Assembly language");
       System.out.println("3 )c#                          4)  Machine Code");
       System.out.println("");
       System.out.println("YOUR ANSWER:");
       
       userSel = Integer.parseInt(userInput.nextLine());
       if(userSel == 4){
           score = score+1;
       System.out.print("You got it right!  Your score is " +score);
    }
       else
       {
           System.out.println("Not Correct, Your score is " + score);
       }
    //----------------------------------------------------------------
     System.out.println("");
       System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
       System.out.println("1) Grace Hopper                 2)) Alan Turing");
       System.out.println("3 )Charles Babbage              4)  Larry Page");
       System.out.println("");
       System.out.println("YOUR ANSWER:");
       
       userSel = Integer.parseInt(userInput.nextLine());
       if(userSel == 2){
           score = score+1;
       System.out.print("You got it right!  Your score is " +score);
    }
       else
       {
           System.out.println("Not Correct Your score is " + score);
       }
}
}