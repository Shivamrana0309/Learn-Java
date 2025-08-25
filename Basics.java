import java.util.Scanner;

public class Basics {
    // only one public class can exist in a java file
    public static void main(String[] args) {
        // public means to accessible by everywhere
        // static means that this function can be run without the object of Basics class
        // void means it's return types
        // String[] args -> command line arguments given in terminal stored in args array
        // System.out.print(5);
        System.out.print("Enter your name: "); // to print something
        Scanner input = new Scanner(System.in); // Scanner is a class and here we are making its object to take input 
        String num = input.nextLine(); // nextLine() to input a string with spaces
        System.out.println("Your name is: " + num);

        // Primitives
        // int a = 13;
        // char c = 'a';
        // float f = 98.14f; // all the decimal values by default are double 
        // double d = 23284.35478578;
        // long l =13448384529439L;
        // boolean b = false;
        
        // Syntax if-else
        // if(condition){

        // }
        // else if(condition){

        // }
        // else{

        // }

        // Syntax For-loop
        // for(int i=0;i<5;++i){
        //     // body
        // }

        // Syntax While-loop
        // while(condition){
        //     // body
        // }
        // when we know the number of times loop is needed to be run then use the for loop otherwise use while loop
        
        // Syntax Do-while loop
        // do {
            // body
        // } while(condition)

        input.close();
    }
}
