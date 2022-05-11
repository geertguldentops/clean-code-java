package be.jidoka.clean.code.single.responsibility.principle.avoid;

public class Employee {

    public double calculatePay() {
        // Complicated financial algorithm for determining an employee's pay.
        return 0.0;
    }

    public void save() {
        // Complicated database code that can persist an employee's data to the database.
    }

    public String describeEmployee() {
        // Complicated reporting code for generating a user-friendly employee report (for legal/government compliance).
        return "";
    }

}
