package exerciseSevenPointOneZero;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        SalesCommission salesCommission = new SalesCommission();
        int grossSales = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for gross sales: ");
        grossSales = input.nextInt();
        while (grossSales != -1){
            salesCommission.salaryCalculator(grossSales);
            System.out.println("Your salary is  " + salesCommission.getCalculatedSalary());
            System.out.println("Enter a value for gross sales: ");
            grossSales = input.nextInt();
        }
        System.out.printf("%s%20s%n ", "Salary", "Frequency");
        System.out.printf("%s%15d%n ","$200-299",salesCommission.getSalaryRange()[0]);
        System.out.printf("%s%15d%n ","$300-399",salesCommission.getSalaryRange()[1]);
        System.out.printf("%s%15d%n ","$400-499",salesCommission.getSalaryRange()[2]);
        System.out.printf("%s%15d%n ","$500-599",salesCommission.getSalaryRange()[3]);
        System.out.printf("%s%15d%n ","$600-699",salesCommission.getSalaryRange()[4]);
        System.out.printf("%s%15d%n ","$700-799",salesCommission.getSalaryRange()[5]);
        System.out.printf("%s%15d%n ","$800-899",salesCommission.getSalaryRange()[6]);
        System.out.printf("%s%15d%n ","$900-999",salesCommission.getSalaryRange()[7]);
        System.out.printf("%s%9d%n ","$1000 and over",salesCommission.getSalaryRange()[8]);




    }
}



