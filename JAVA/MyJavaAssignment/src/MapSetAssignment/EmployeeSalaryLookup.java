package MapSetAssignment;
import java.util.*;

public class EmployeeSalaryLookup {
    public static void main(String[] args) {
        
        Map<Integer, Double> empMap = new HashMap<>();

        // Adding employees
        empMap.put(101, 50000.0);
        empMap.put(102, 60000.0);
        empMap.put(103, 55000.0);

        // 🔍 Retrieve salary by ID
        int searchId = 102;
        if(empMap.containsKey(searchId)) {
            System.out.println("Salary: " + empMap.get(searchId));
        } else {
            System.out.println("Employee ID not found");
        }

        // ✏️ Update salary
        int updateId = 103;
        if(empMap.containsKey(updateId)) {
            empMap.put(updateId, 58000.0);
            System.out.println("Updated Salary: " + empMap.get(updateId));
        } else {
            System.out.println("Employee ID not found");
        }

        // ❌ Handle missing ID
        int missingId = 105;
        double salary = empMap.getOrDefault(missingId, -1.0);

        if(salary == -1.0) {
            System.out.println("Employee ID not found");
        } else {
            System.out.println("Salary: " + salary);
        }
    }
}