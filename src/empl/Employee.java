package empl;

public class Employee {
    protected int id;
    private static int nextId=1;
    protected String name;
    protected String surname;
    protected double salary;
    Manager man=null;


    public Employee(String name, String surname) throws FieldLengthLimitException {
        this.id=nextId++;
        if(name.length()<20){
        this.name = name;
        }else{
            this.name="error_input";
            throw new FieldLengthLimitException("Check your input, there too much symbols for name field");
        }
        if(surname.length()<20){
            this.surname = surname;
        }else{
            this.surname="error_input";
            throw new FieldLengthLimitException("Check your input, there too much symbols for surname field");
        }
    }

    public void getTopManager(){
        System.out.print(this.name+" "+this.surname+" -> ");
        if(this.man==null){
            System.out.println(this.getName()+" "+this.getSurname());
        } else {man.getTopManager();}
    }

    public void tellAboutManager(){
        System.out.println("This employee "+this.id+", "+this.name+" "+this.surname+" managed by "+this.man.name+" "+this.man.surname);
    }

    public void tellAboutYourself(){
        System.out.println("ID: "+this.id+"; Name:"+this.name+" "+this.surname+"; $"+this.salary);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setManager(Manager mn) {
        this.man=mn;
    }
}
