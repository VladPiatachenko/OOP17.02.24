package transport;
/*Створити ієрархію класів засобів пересування і сервер,


У функції main () тестового класу в циклі створювати об'єкти нових транспортних засобів
(випадковим чином і з використанням оператора switch) до того моменту, поки не буде перевищено ліміт загальної
 кількості транспортних засобів. Після цього роздрукувати загальну кількість кожного транспортного засобу,
 що виїхав на дорогу.*/
public class Main {
    public static void main(String[] args){
    Server srv = new Server(15);
    for(int i=0;i<14;i++){
        Vehicle v;
        if(i%2==0){
            v= new Car();
            srv.addTransport(1,v);
        }
        else{
            v= new Bicycle();
            srv.addTransport(2,v);
        }
        System.out.println("Limit vehicles:"+srv.getLimitVehicle());
        System.out.println("Now on road " +srv.getCurrentCountVehicle());
    }
}
}
