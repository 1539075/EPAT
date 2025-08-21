package sg.edu.nus.iss.epat.workshop;

public class Manager extends Employee {
	private float variableComponent;
	
	public Manager (String name, float salary, 
	         float variableComponent){
		super (name, salary);
		this.variableComponent = variableComponent;
	}
	
	public float variableComponent() {
		return variableComponent;
	}
    @Override
	public float getVariableComponent() {
		return variableComponent();
	}
}

