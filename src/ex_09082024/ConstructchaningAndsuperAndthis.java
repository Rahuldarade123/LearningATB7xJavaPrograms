package ex_09082024;

public class ConstructchaningAndsuperAndthis {
    public static void main(String[] args) {
        Dog d1= new Dog();
        Dog d2=new Dog("Lab");
        Dog d3=new Dog("Lab","Golden , ");
        Animal A1= new Animal();
    d3.Display();
    }
}

class Animal {
    String type;
    Animal() {
        System.out.println("Animal Dc");
    }

    Animal(String type) {
this.type=type;

    }
}
    class Dog extends Animal {
        String breed;
        Dog(){
            System.out.println("Dog DC");
        }

        Dog(String Breed){
            super("Dog type");
            this.breed=Breed;

        }

        Dog(String breed , String type){
            super(type);
            this.breed=breed;



        }
        void Display(){
            System.out.println("Type: "+super.type + "Breed: " + breed);
        }
void tata(){

}

    }
