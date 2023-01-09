import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        final int SALARY_CEILING = 6000;
        final double SENTINEL = -1;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        int salary, age;
        double employeeContribute = 0, employerContribute = 0, totalContribute = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly salary (or -1 to end): ");
        salary = sc.nextInt();

        while (salary != SENTINEL) {
            System.out.print("Enter the age: ");
            age = sc.nextInt();

            if (age <= 55) {
                employeeContribute = salary * EMPLOYEE_RATE_55_AND_BELOW;
                employerContribute = salary * EMPLOYER_RATE_55_AND_BELOW;
            } else if (age <= 60) {
                employeeContribute = salary * EMPLOYEE_RATE_55_TO_60;
                employerContribute = salary * EMPLOYER_RATE_55_TO_60;
            } else if (age <= 65) {
                employeeContribute = salary * EMPLOYEE_RATE_60_TO_65;
                employerContribute = salary * EMPLOYER_RATE_60_TO_65;
            } else {
                employeeContribute = salary * EMPLOYEE_RATE_65_ABOVE;
                employerContribute = salary * EMPLOYER_RATE_65_ABOVE;
            }
            totalContribute = employeeContribute + employerContribute;
            System.out.println("The employee's contribution is: " + Math.round(employeeContribute * 100.0) / 100.0);
            System.out.println("The employer's contribution is: " + Math.round(employerContribute * 100.0) / 100.0);
            System.out.println("The total contribution is: " + Math.round(totalContribute * 100.0) / 100.0);

            System.out.print("Enter the monthly salary (or -1 to end):");
            salary = sc.nextInt();
        }


    }
}
