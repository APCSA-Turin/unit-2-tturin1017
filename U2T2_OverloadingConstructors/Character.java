package U2T2_OverloadingConstructors;

public class Character {
    private String name;
    private int hpLevel=100;
    private boolean isRunning = false;

    //constructors
    public  Character(){} 

    public Character(String newName){ 
        name = newName;
    }
    public Character(String name, int hpLevel){
        this.name = name;
        this.hpLevel = hpLevel;
    }

    public int getHpLevel(){
        return hpLevel;
    }

    public void setHpLevel(int hpLevel){
        this.hpLevel = hpLevel;
    }

 






















    // //getters and setters 
    // public void setName(String name){
    //     this.name = name;
    // }
    // public String getName(){
    //     return name;
    // }

    // public void setHpLevel(int hpLevel){
    //     this.hpLevel = hpLevel;
    // }
    // public int getHpLevel(){
    //     return hpLevel;
    // }


}
