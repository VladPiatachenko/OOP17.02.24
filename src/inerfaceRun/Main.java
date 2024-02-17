package inerfaceRun;

public class Main {
    public static void main(String[] args){
        Server srv = new Server(15);
        for(int i=0;i<14;i++){
            Machine v;
            if(i%3==0){
                v= new Bus("Bus",50,100,32);
                srv.addTransport(1,v);
            }
            else if(i%2==0){
                v= new TracktorWheeled("Tracktor on wheels", 30, 80,"wheel");
                srv.addTransport(2,v);
            }
            else {
                v= new TracktorCrawler("Tracktor crawler", 30, 80,"no wheel");
                srv.addTransport(3,v);
            }
            System.out.println("Limit vehicles:"+srv.getLimitVehicle());
            System.out.println("Now on road " +srv.getCurrentCountVehicle());
        }
    }
}
