package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        if(args.length == 0){
            System.out.print("Hello World!");
        }
        else if(args.length == 2){
            System.out.print("Hello" + " " + args[0] + " " + args[1]+"!");
        }
        else{
            System.out.print("Hello" + " " + args[0] +"!");
        }
    }
}
