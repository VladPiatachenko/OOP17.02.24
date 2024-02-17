package stud;

public class Student {
    private int id;
    private static int nextId=1;
    private String name;
    private String surname;
    private Subject subjects[];

    Student(){
        this.id=nextId++;
        subjects = new Subject[5];
    }

    Student(String name, String surname){
        this.name=name;
        this.surname=surname;
        this.id=nextId++;
        subjects = new Subject[5];
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
}
/*1. Створити клас stud.Student, який містить наступні поля:

- гетери та сетери для всіх полів;

- конструктор за замовчуванням і з параметрами.



2. Створити клас stud.Subject з полями:

- назва предмета  (String nameSubject);

- оцінка (змінюється від 2-5 и заповнюється за допомогою Math.random()) (float mark);

- зданий предмет або ні (якщо оцінка <= 2) (boolean passed).

Для назв предметів створити окремий масив рядків (String[] nameSubjects). При створенні об’єкта stud.Subject та ініціалізації поля назва предмета (String nameSubject), використовувати назву предмета з масиву String[] nameSubjects.*/