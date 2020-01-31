import  java.util.Date;
public class Car {
    public static void main(String[] args) {
       Car tesla = new Car("Tesla", "Model S", 2019);
        System.out.println(tesla.starYourEngine("correct"));
        System.out.println(tesla.drive());

    }

    public String make;
    public String model;
    public int year;
    public int mileage;
    private Date lastOilChange;
    static int carsOutThere = 0;
    private boolean running;


    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = 0;
        this.lastOilChange = new Date();
        this.running = false;
        carsOutThere++;
        }
        public String starYourEngine(String key){
            if(key.equals("correct")){
                this.running = true;
                return "Vrroooom!";
            }
            else return "...";
        }

        public String drive(){
            if(this.running){
                this.mileage++;
                return "vrrooom!";
            }
            else return ("...");
        }








    }


