/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp2;

/**
 *
 * @author Narsing
 */
import java.util.Scanner;

public class Player {
  Scanner sc=new Scanner(System.in);  
  String name;
  int score=0;
  public void getDetails(){
      System.out.println("Enter the name of player");
      name=sc.next();
  }
}
