/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp2;

/**
 *
 * @author Narsing
 */import java.util.Scanner;
public class Question {
    Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int userAns,RightAns;
    public boolean askQuestion(){
        System.out.println(question);
        System.out.println("1. "+option1);
         System.out.println("2. "+option2);
          System.out.println("3. "+option3);
           System.out.println("4. "+option4);
            System.out.println("choose the answer");
            userAns=sc.nextInt(); 
            if (userAns==RightAns)
            {
                return true;
            }
            
            return false;
    }
    
    
}
