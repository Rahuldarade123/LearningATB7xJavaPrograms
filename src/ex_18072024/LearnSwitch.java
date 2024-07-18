package ex_18072024;

import java.util.Scanner;

public class LearnSwitch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter browser name");
        String browser=scan.next();
        browser=browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("Chrome started");
                break;
            case "firefox":
                System.out.println("Firefox started");
                break;
            case "edge":
                System.out.println("Edge started");
                break;
            case "internetexplorer":
                System.out.println("internetexplorer started");
                break;
            default:
                System.out.println("Not valid data");
        }
    }
}
