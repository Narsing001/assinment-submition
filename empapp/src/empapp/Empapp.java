/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empapp;


/**
 *
 * @author Narsing
 */
public class Empapp {
     public String name,city;
    public void display()
    {
        int age=19;
        name="rohan";
        city="latur";
        
        System.out.println("my name is "+name);
        System.out.println("age"+age);
        System.out.println("city"+city);
        
        
        

}

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empapp ep=new Empapp();
        ep.display();
         Empapp ep1=new Empapp();
         ep1.display();
                
    }
    
}
