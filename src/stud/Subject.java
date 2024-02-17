package stud;

public class Subject {
 private String nameSubject;
 private float mark;
 private boolean passed=false;

Subject(String nS){
    this.nameSubject=nS;
    this.mark= (float) ((Math.random()*(5)));
    if(this.mark>2){this.passed=true;}
}

    public String getNameSubject() {
        return nameSubject;
    }

    public float getMark() {
        return mark;
    }

    public boolean isPassed() {
        return passed;
    }
}
