/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagename;
import packagename.number.*;
import packagename.arithmeticsubpackage.*;

/**
 *
 * @author 91936
 */
public class packagedemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //checking whether the number is armstrong or not
          number n=new number();
          n.get(153);
          int remainder;
          int result = 0;
          int originalnum=153;
          
        while(originalnum!=0)
        {
            remainder=  originalnum%10;
            result+=Math.pow(remainder,3);
            originalnum/=10;
            
        }
        if(result==153)
            System.out.println(n +"is an armstrong number");
        else
            System.out.println(n +"is not an armstrong number");
       
    // Performing ARITHMETIC OPERATIONS    
   System.out.println("\n PERFORMING ARITHMETIC OPERATIONS");
    arithmeticsubpackage a=new arithmeticsubpackage();
    System.out.println("\n adding two numbers");
    a.add(10,5);
     arithmeticsubpackage b=new arithmeticsubpackage();
    System.out.println("\n subtracting two numbers");
    b.sub(10,5);
    arithmeticsubpackage c=new arithmeticsubpackage();
    System.out.println("\n Multiplying two numbers");
    c.mul(10,5);
    arithmeticsubpackage d=new arithmeticsubpackage();
    System.out.println("\n Dividing two numbers");
    d.div(10,5);
    arithmeticsubpackage e=new arithmeticsubpackage();
    System.out.println("\n Modulus of two numbers");
    e.mod(10,5);
    





// TODO code application logic here
    }
    
    
  

  
}
