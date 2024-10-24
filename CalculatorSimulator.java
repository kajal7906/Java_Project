//Program of CalculatorSimulator

import java.util.*;

//Customs Exceptions
class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    String msg;
    public EmployeeNameInvalidException(String message) {
        msg = message;
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }

        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

        if (empSal > 100000) {
            return empSal * 0.08; // 8% tax
        } else if (empSal >= 50000 && empSal <= 100000) {
            return empSal * 0.06; // 6% tax
        } else if (empSal >= 30000 && empSal < 50000) {
            return empSal * 0.05; // 5% tax
        } else if (empSal >= 10000 && empSal < 30000) {
            return empSal * 0.04; // 4% tax
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
    }
}

public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        // Test Case 1: kajal, 34000, False
        try {
            System.out.println("Tax amount is: " + taxCalculator.calculateTax("Kajal", false, 34000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test Case 2: Neetu, 1000, True
        try {
            System.out.println("Tax amount is: " + taxCalculator.calculateTax("Neetu", true, 1000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test Case 3: Parnita, 55000, True
        try {
            System.out.println("Tax amount is: " + taxCalculator.calculateTax("Parnita", true, 55000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test Case 4: "", 30000, True
        try {
            System.out.println("Tax amount is: " + taxCalculator.calculateTax("", true, 30000));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
