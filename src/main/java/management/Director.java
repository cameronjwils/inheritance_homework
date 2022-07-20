package management;

public class Director extends Manager{
    private double Budget;
    public Director(String name, String NI_number,double Salary, double Budget){
        super(name, NI_number, Salary);
        this.Budget = Budget;
    }
}