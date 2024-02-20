import java.util.Scanner;


public class TaxEligibility {
      public static void calculateTax(String name, int salary, String code){
          if(name.isEmpty()){
              throw new RuntimeException("EmployeeNameNotValid");
          }
          else if(salary>=10000&&salary<=15000){
              throw new RuntimeException("TaxNotEligibleException");
          }
          else {
              System.out.println("Employee Code: " + code);
              System.out.println("Employee Name: "+ name);
              System.out.println("Salary: "+ salary);
              System.out.println("Tax is eligible");
          }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Code: ");
        String code = sc.next();
        System.out.print("Enter Employee Name: ");
        String name = sc.next();
        System.out.print("Enter Employee Salary: ");
        int salary= sc.nextInt();
        calculateTax(name,salary,code);

    }
}
