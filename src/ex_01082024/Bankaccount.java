package ex_01082024;

public class Bankaccount {
    String BankName;
    int Balance;
    String BankCode;

    Bankaccount(){
        BankName="SBI";
        Balance=1000;
        BankCode="SBI001";
    }

    public Bankaccount(String GivenbankName, int Givenbalance, String GivenbankCode) {
        this.BankName = GivenbankName;
        this.Balance = Givenbalance;
        this.BankCode = GivenbankCode;
    }

void Printdetails(){

    System.out.println("Bank Name ->" +BankName);
    System.out.println("Bank balance ->" +Balance);
    System.out.println("Bank BankCode ->" +BankCode);
}
    void Printdetails2raw(){

        System.out.println( BankName="SBIwadadf");
        System.out.println( Balance=10560550);
        System.out.println( BankCode="SB56I99001");
    }





}
