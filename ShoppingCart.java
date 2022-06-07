import java.io.Console;
import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {
        System.out.println("Welcome to your shopping cart!");

        LinkedList<String> cart = new LinkedList<>();
        Console cons = System.console();
        String input;
        boolean stop = false;
        
        cart.add("apple");
        
        // main loop

        while (!stop) {
            input = cons.readLine();
            String[] terms = input.split(" ");
            String cmd = terms[0];

           
        switch (cmd) {

            case "add":
                for (int i = 1; i < terms.length; i++ ){
                    boolean found = false;
                    for (int j = 0; j < cart.size(); j++){
                        if ( terms[i].equals(cart.get(j))) {
                            found = true;
                            break;
                        }
                    } 
                    
                    if (!found) {
                    cart.add(terms[i]);
                    System.out.println("Added " + terms[i]);}
                }
           
                
     
            break;

            case "list":
                if (cart.size() > 0){
                    for (int i = 0; i< cart.size(); i++) {
                        System.out.println(i+1 + " " + cart.get(i));
                    }} else {
                        System.out.println("Your cart is empty!");
                    
                }
                
            break;


            case "delete":
                cart.remove(terms[1]);
            break;

            case "stop": stop = true;
            break;
        }
        }

        
    
        
    }
}