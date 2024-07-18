package ex_18072024;

import javax.xml.transform.Source;
import java.util.Scanner;

public class LearnSwitchlatestjdkabove13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item code");
int itemcode =scan.nextInt();
//switch (itemcode){
//    case 001,002,003,041,005:
//        System.out.println("This is electronic gadjet");
//        break;
//    case 006,007:
//        System.out.println("This is Mechanical gadjet");
//break;
//    default:
//        System.out.println("Not valid itemcode");
//}

        switch (itemcode){
            case 1,2,3,4-> System.out.println("Electronic item");
            default -> System.out.println("Mechical item");
        }
    }
}
