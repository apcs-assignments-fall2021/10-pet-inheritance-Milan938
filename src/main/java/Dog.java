public class Dog extends Pet {
    private String breed;
//    private String name;
//    private int age;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }


    // Constructors
    public Dog(){
        super();
        breed = "pug";
    }

    // makeNoise() method
    public void MakeNoise(){
        System.out.println("WOOFY WOOFY WOOFY");
    }

    // toString method
    public String toString(){
        String str = "Name: " + getName() + " Age: " + getAge() + " Breed: " + this.breed;
        return str;
    }

    // Getter
//    public String getName() {
//        return this.name;
//    }
//
//    public int getAge() {
//        return this.age;
//    }

    public String getBreed(){return this.breed;}

//    // Setter
//    public void setName(String a){
//        this.name = a;
//    }
//
//    public void setAge(int a){
//        this.age = a;
//    }

    public void setBreed(String a){
        this.breed = a;
    }
}