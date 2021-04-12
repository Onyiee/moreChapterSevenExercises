package exerciseSevenPointOneZero;
//# 7.10 (Sales Commissions) Use a one-dimensional array to solve the
//         following problem: A company pays its salespeople on a commission basis.
//         The salespeople receive $200 per week plus 9% of
//         their gross sales for that week. For example, a salesperson who grosses $5,000 in
//        sales in a week receives $200 plus 9% of $5,000, or a total of $650. Write an
//        application (using an array of counters)
//         that determines how many of the salespeople earned salaries in each of the following
//         ranges (assume
//         that each salesperson’s salary is truncated to an integer amount):
//         a) $200–299
//         b) $300–399
//         c) $400–499
//         d) $500–599
//         e) $600–699
//         f) $700–799
//         g) $800–899
//         h) $900–999
//         i) $1,000 and over
//         Summarize the results in tabular format

public class SalesCommission {

    private int basePay = 200;
    private int grossSales;
    private double salary;
    private int [] salaryRange = new int[9];

    public void setBasePay(int basePay) {
        this.basePay = basePay;
    }

    public int getBasePay() {
        return basePay;
    }


    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void salaryCalculator(int grossSales) {
        salary = basePay + 0.09 * grossSales;
        salaryRangeCalculator((int) salary);
    }

    public double getCalculatedSalary() {
        return salary;
    }

    private void salaryRangeCalculator(int salary){
        int calculatedSalary = salary/100;
        switch (calculatedSalary) {
            case 2 -> salaryRange[0]++;
            case 3 -> salaryRange[1]++;
            case 4 -> salaryRange[2]++;
            case 5 -> salaryRange[3]++;
            case 6 -> salaryRange[4]++;
            case 7 -> salaryRange[5]++;
            case 8 -> salaryRange[6]++;
            case 9 -> salaryRange[7]++;
            default -> salaryRange[8]++;
        }
        }


    public int[] getSalaryRange() {
        return salaryRange;
    }
}


