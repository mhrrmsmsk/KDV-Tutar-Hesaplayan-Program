import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
double fee ,kdv;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the fee amount:");
       fee = scan.nextDouble();
        double amount;
     boolean control= (fee>0 && fee<1000);
       kdv = (control) ? 0.18 : 0.08;
        amount = kdv*fee;
        double result =fee+amount;
        System.out.println("price with kdv:"+result);
        System.out.println("price without kdv:"+fee);
        System.out.println("kdv amount:"+amount);


    }
}