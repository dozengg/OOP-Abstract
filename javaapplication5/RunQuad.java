
package javaapplication5;
import java.util.*;
public class RunQuad {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Press R for rectangle S for square");
       String press = scn.next();
       if (press.equalsIgnoreCase("r")){
           Rectangle rect = new Rectangle();
           rect.showDescription();
       }else if(press.equalsIgnoreCase("s")){
        Square squ = new Square();
        squ.showDescription();
    }
    }
    
}
