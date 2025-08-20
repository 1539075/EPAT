package sg.edu.nus.iss.epat.workshop;

public class SalesEmployee extends Employee {
    private final float commissionRate;
    private final int salesMade;

    public SalesEmployee(String name, float salary, float commissionRate, int salesMade) {
        super(name, salary);
        this.commissionRate = commissionRate;
        this.salesMade = salesMade;
    }

    private float getCommissionRate() {
        return this.salesMade * this.commissionRate;
    }

    @Override
    public float computeSalary() {
        return getBaseSalary()
                - computeDeductions() + getCommissionRate();
    }
}
