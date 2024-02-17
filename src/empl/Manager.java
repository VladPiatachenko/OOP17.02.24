package empl;

public class Manager extends Employee{
    double bonus;

    public Manager(String name, String surname) throws FieldLengthLimitException {
        super(name, surname);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void tellAboutYourself(){
        System.out.println("ID: "+this.id+"; Name:"+this.name+" "+this.surname+"; $"+(this.salary+this.bonus));
    }
}
