import java.util.Scanner;

public class Main {
    static class person{
        int age;
        int age_eligible(){
            if (age>=18) {
                System.out.println("Eligible");
            }
            else {
                System.out.println("Not Eligible");
            }
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       person p1 = new person();
       p1.age= sc.nextInt();
       p1.age_eligible();
    }
}