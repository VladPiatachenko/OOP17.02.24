package inerfaceRun;
/*
* За основу взяти попереднє завдання та доповнити його наступними класами.
* Замість абстрактного класу Vehicle використовувати інтерфейс Run.

Створити абстрактний клас Machine, який реалізує інтерфейс Run.
Створити клас Bus, що розширює абстрактний клас Machine.
*  Визначити в ньому конструктор, поле кількість пасажирів і метод для повернення кількості пасажирів.



* */
public interface Run {

    public void printName();
    public double getMaxSpeed();
    public double getWeight();
    public void move (int i);

}
