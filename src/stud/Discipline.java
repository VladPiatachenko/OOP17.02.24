package stud;

public enum Discipline {
    JavaOOP("Java OOP", 1),
    JavaSE("Java Standard Edition",2),
    JavaEE("Java Enterprise Edition",3),
    MachineLearning("Machine Learning",4),
    Algebra("Math",5);

    String name;
    int id;

    Discipline(String s, int i) {
        this.name=s;
        this.id=i;
    }

    public static String subjectById(int i){
        for(Discipline d: Discipline.values()){
            if(d.id==i){
                return d.name;
            }

        }
        return "None";
    }
}
