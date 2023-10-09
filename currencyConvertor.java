import java.text.DecimalFormat;
import java.util.Scanner;

public class currencyConvertor {
    public static void main(String[] args) {
        double rupee, dollar, pound, code, euro, KWD;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("*** WelCome to Webeduclick Currency Converter Project ***");
        System.out.println("Enter the currency code");
        System.out.println("1:Rupees");
        System.out.println("2:Dollar");
        code = sc.nextInt();

        if (code == 1) {
            System.out.println("Enter amount in rupees:");
            rupee = sc.nextFloat();
            dollar = rupee / 75;
            System.out.println("Dollar : " + f.format(dollar));

        } else if (code == 2) {
            System.out.println("Enter amount in dollar:");
            dollar = sc.nextFloat();
            rupee = dollar * 75;
            System.out.println("Rupees : " + f.format(rupee));
        }
    }
}
