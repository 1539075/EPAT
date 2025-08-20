package sg.edu.nus.iss.epat.workshop;

public abstract class Employee {
    private final String name;
    private final float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public float getBaseSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public float computeDeductions() {
        return this.salary * 0.2f;
    }

    public abstract float computeSalary();
}

