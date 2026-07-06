public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean expr = daysSkipped < 5;
        double value = expr ? 1 : 0.85;
        return value;
    }

    public int bonusMultiplier(int productsSold) {
        boolean bonus = productsSold < 20;
        int multiplier = bonus ? 10 : 13;
        return multiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        int multiplier = bonusMultiplier(productsSold);
        return multiplier * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        // salary multiplier calc
        boolean expr = daysSkipped < 5;
        double value = expr ? 1 : 0.85;
        // bonus calc
        boolean bonus = productsSold < 20;
        int multiplier = bonus ? 10 : 13;
        // final salary
         double total = 1000*value + multiplier*productsSold;
        boolean salary = total < 2000;
        double fin = salary ? total : 2000;
        
        return fin;
        
    } 
}
