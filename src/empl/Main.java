package empl;

public class Main {
    public static void main(String[] args) throws FieldLengthLimitException {
        Employee emp1=new Employee("Jon","Snow");
        emp1.setSalary(1500);
        emp1.tellAboutYourself();
        Manager man1= new Manager("Rob","Stark");
        man1.setSalary(2500);
        man1.setBonus(1000);
        man1.tellAboutYourself();
        Manager man3=man1;
        Manager man2= new Manager("Rob","Stark");
        man2.setSalary(3500);
        man2.setBonus(1500);
        man2.tellAboutYourself();

        emp1.setManager(man1);
        man1.setManager(man2);
        emp1.tellAboutManager();
        man1.tellAboutManager();
        emp1.getTopManager();
        man1.getTopManager();
        man2.getTopManager();

        System.out.println(man1.toString()+" "+man3.toString());
    }
}
