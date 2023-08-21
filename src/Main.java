import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){


        HashMap<Car,Data> carDataHashMap = new HashMap<>();
        carDataHashMap.put(new Car(1,3456,"Jeep"+"},\n"),
               new Data(2015,"Jeep Wrangler",1000000,"black"));
        for (Map.Entry<Car, Data> hashMap : carDataHashMap.entrySet()){
            Car auto = hashMap.getKey();
            Data auto1 = hashMap.getValue();
            System.out.println("Car name" + auto + "Car model"+ auto1);
        }
        
    }
    }

