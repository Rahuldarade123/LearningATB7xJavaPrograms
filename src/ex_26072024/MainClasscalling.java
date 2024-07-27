package ex_26072024;

public class MainClasscalling {
    public static void main(String[] args) {
        LearnObjectclass P1= new LearnObjectclass();
        P1.talk("Hello brother");
        P1.ismale= true;
        System.out.println(P1.ismale);

        LearnObjectclass P2=new LearnObjectclass();
        String str=P2.Run();
        System.out.println(str);
    }
}
