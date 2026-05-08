public class Vehicle {
    public String brandname;
    public String modelname;
    public java.time.Year yearofmfg;
    public String color;
    public char fueltype; // p=petrol,e=electric,d=diesel,c=cng
    public float mileage;
    public float price;
    public int seats;
    private String mfgcode;
    private int noofservices;
    

    public void setMfgCode(String mCode){
        mfgcode=mCode;
    }
    public String getMfgCode(){
        return mfgcode;
    }
    public void setnoofservices(int mCode){
        noofservices=mCode;
    }
    public int getnoofservices(){
        return noofservices;
    }
    public Vehicle(){
        brandname = "MG";
        modelname = "Hector";
        yearofmfg = java.time.Year.of(2025);
        color = "Red";
        fueltype = 'p';
        seats = 5;
        price = 115000.45f;
    }
    public Vehicle(String brandname,String modelName,float price,String color){
        this.brandname=brandname;
        this.modelname=modelName;
        this.price=price;
        this.color=color;
    }
    public Vehicle(char fueltype,float price,String mfgcode){
        this.fueltype=fueltype;
        this.price=price;
        this.mfgcode=mfgcode;
    }
    public void start() {
        System.out.println("Start Ignition by pressing the button");
        System.out.println("Your initial Speed is 10kmph");
    }

    public void drive() {
        System.out.println("Let's Go!");
    }

    public int accelarate(int initSp) {
        return initSp + 20;
    }

    public void stop() {
        System.out.println("Stop Ignition by pressing the button");
        System.out.println("Your Vehicle is stopped!");
    }

    public float calcMileage(float fuelAmt, float distance) {
        return distance / fuelAmt;
    }
   
    
    /*public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.brandname = "MG";
        v.modelname = "Hector";
        v.yearofmfg = java.time.Year.of(2025);
        v.color = "Red";
        v.fueltype = 'p';
        v.seats = 5;
        v.price = 115000.45f;
        printDetails(v);
        v.start();
        v.drive();

        int newSp = v.accelarate(40);
        System.out.println("New Speed: " + newSp + " kmph");

        float mileage = v.calcMileage(40, 500.2f);
        System.out.println("The mileage is: " + mileage + " kmpL");
        v.stop();
    }*/

}
