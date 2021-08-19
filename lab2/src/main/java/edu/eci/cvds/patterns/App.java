package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if(args.length != 0){
            for(String names: args){
                System.out.println( "Hello " + names +"!" );
            }
        }
        else{
            System.out.println( "Hello World!");
        }
    }
}
