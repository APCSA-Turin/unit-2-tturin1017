package U2T3_CallingMethodsInMethods;

public class Letter {


    private String author;
 
 
    public Letter(String author) {
        this.author = author;
    }
 
 
    public void writeLetter(String n) {
        greeting(n);
        specialMessage();
        closing();
    }
 
 
    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }
 
 
    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }
 
 
    public void closing() {
        System.out.println("See you later!");
        System.out.println("From, " + author);
    }
 }
 