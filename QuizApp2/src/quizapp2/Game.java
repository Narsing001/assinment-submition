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
public class Game {
    Question[] questions=new Question[5];
    Player player=new Player();
   
    public void initGame(){
        for(int i=0;i<5;i++){
            questions [i]=new Question();
            
           }
        questions[0].question=("1).who is the indian cricket team captain of india?");
        questions[0].option1=("1. Rohit Sharma");
        questions[0].option2=("2. Virat Kohli");
        questions[0].option3=("3. Rishab Pant");
        questions[0].option4=("4. K L Rahul");
        questions[0].RightAns=2;
           
        questions[1].question=("2). which is capital of india?");
        questions[1].option1=("1. Delhi");
        questions[1].option2=("2. Mumbai");
        questions[1].option3=("3. pune");
        questions[1].option4=("4. Latur");
        questions[1].RightAns=1;
        
        questions[2].question=("3). which is capital of Maharastra?");
        questions[2].option1=("1. Nashik");
        questions[2].option2=("2. Mumbai");
        questions[2].option3=("3. pune");
        questions[2].option4=("4. Latur");
        questions[2].RightAns=2;
        
        
          questions[3].question=("3). who is the current prime  minister of india?");
        questions[3].option1=("1. Lalu prasad yadav");
        questions[3].option2=("2. Rahul Gandhi");
        questions[3].option3=("3. Narendra Modi");
        questions[3].option4=("4. Amitab bachan");
        questions[3].RightAns=3;
        
        questions[4].question=("3). which sport palyed more in india ?");
        questions[4].option1=("1. Basket Ball");
        questions[4].option2=("2. Cricket");
        questions[4].option3=("3. Hocky");
        questions[4].option4=("4. Kabbadi");
        questions[4].RightAns=2;
        
     
    
    }
    public void playGame(){
        player.getDetails();
        for(int i=0;i<5;i++){
            boolean status=questions[i].askQuestion();
            if(status==true){
                
                System.out.println("you are played very good");
                player.score++;
            }
            else{
                System.out.println("you are not palyed good ");
            }
            
        }
        System.out.println(player.name+ " your score is  "+player.score);
    }
           
        
    
    
}
