public class Cat {
    //attributes
    String name;
    int age;
    double weight;
    //constructor 
    public Cat(){
        
    }
    public Cat(String newName, int newAge, double newWeight){
        name = newName;
        age = newAge;
        weight = newWeight;
    }

    //method 
    public void printInfo(){
        System.out.println("Hi, my name is "+name+" I am "+age+ " years old and weigh "+ weight+"lbs. Adopt me!");
    }

}
