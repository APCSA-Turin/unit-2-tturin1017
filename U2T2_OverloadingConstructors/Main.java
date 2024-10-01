package U2T2_OverloadingConstructors;

public class Main {
    public static void main(String[] args) {
      
        Character c1 = new Character("Ash");
        int hp = c1.getHpLevel();
        System.out.println(hp);
        c1.setHpLevel(50);
        System.out.println(c1.getHpLevel());
        
    }
}
