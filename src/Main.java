import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int p,a,t,b,e;
       double pear = 2.14, apple = 3.67, tomatoes = 1.11, banana = 0.95, eggplant = 5.00, totalAmount;
       Scanner input = new Scanner(System.in);

        System.out.println("***Welcome To Grocery Store***");
        System.out.print("How Many KG of Pears : ");
        p = input.nextInt();
        System.out.print("How Many KG of Apples : ");
        a = input.nextInt();
        System.out.print("How Many KG of Tomatoes : ");
        t = input.nextInt();
        System.out.print("How Many KG of Bananas : ");
        b = input.nextInt();
        System.out.print("How Many KG of Eggplants : ");
        e = input.nextInt();

        totalAmount = ((pear* p) + (apple * a) + (tomatoes * t) + (banana * b)+ (eggplant * e));
        System.out.print("Total Amount : " + totalAmount);
    }
}