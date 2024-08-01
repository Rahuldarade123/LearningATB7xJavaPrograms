package ex_31072024;

public class ATBPerson {
    String name;
    long phone;
    boolean isfeepaid;
    String CourseName;

    ATBPerson(){

        System.out.println("Default constructor");
        CourseName="ATBC";

    }

// Parameterised constructor
    ATBPerson(String Givenname){
        System.out.println("Para constructor");
        this.name=Givenname;
this.phone=9988477750L;
    }
   void ATBPerson(String Givenname){
        System.out.println("Para constructor swapnil");
        this.name=Givenname;
    }

    public ATBPerson(String Givenname,long givenphone,String email){
        System.out.println("Para constructor another");
        this.name=Givenname;
        this.phone=givenphone;
    }

}



