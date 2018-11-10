/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclasses;

/**
 *
 * @author Michaela
 */
public class SayHello {

    // main method
    public static void main(String... args) {
        HelloWorld englishGreetings = new EnglishGreatings();
        HelloWorld frenchGreetings = new FrenchGreeting();
        HelloWorld spanishGreetings = new SpanishGreetings();
        
        englishGreetings.greet();
        frenchGreetings.greet();
        spanishGreetings.greet();
        
        englishGreetings.greetSomeone("Wisky");
        frenchGreetings.greetSomeone("Pier");
        spanishGreetings.greetSomeone("Rodriguez");
        
    }
}
