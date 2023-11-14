package runanimal;
import java.util.Scanner;
public class RunAnimal {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Choose an Animal: Press [B] for Bird, [D] for Dog, [C] for cat: ");
        String animal = scn.nextLine();
        
        if(animal.equalsIgnoreCase("b")){
            bird.eat();
            bird.sleep();
            bird.makesound();
        }
        else if(animal.equalsIgnoreCase("d")){
            dog.eat();
            dog.sleep();
            dog.makesound();
        } 
        else if(animal.equalsIgnoreCase("c")){
            cat.eat();
            cat.sleep();
            cat.makesound();
        }else{
            System.out.println("Invalid output");
            
        }
        
        
        
        
        
        
    }
    
}
