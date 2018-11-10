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
public class EnglishGreatings implements HelloWorld {

    String name = "world";

    @Override
    public void greet() {
        greetSomeone("world");
    }

    @Override
    public void greetSomeone(String someone) {
        name = someone;
        System.out.println(Greet() + name);
    }

    public String Greet() {
        return "Hello ";
    }
}
