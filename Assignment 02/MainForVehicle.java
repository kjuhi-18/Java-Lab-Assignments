public class MainForVehicle {
    

    public static void main(String[] a) {
        Vehicle v = new Vehicle();
        v.brandname = "MG";
        v.modelname = "Hector";
        v.yearofmfg = java.time.Year.of(2025);
        v.color = "Red";
        v.fueltype = 'p';
        v.seats = 5;
        v.price = 115000.45f;

        Vehicle v1 = new Vehicle("Toyota", "Canry", 250000.99f, "Red");
        v1.setMfgCode("MAh93e4");
        v1.seats = 5;
        Vehicle v2 = new Vehicle('D', 2000053.35f, "Mah68740");

        v.start();
        v.drive();
        Vehicle[] fleet = new Vehicle[] { v, v1, v2 };
        System.out.println("Brand\tModel\tYear\tColor\tFuel\tSeats\tPrice\tMileage\tMfgCode\tServices");

        for (Vehicle v32 : fleet) {
            
            v32.start();
            v32.drive();
            v32.accelarate(20);
            if (v32.fueltype == 'D') {
                float m322 = v32.calcMileage(50, 500);
               printTabular(v32, m322 );
            } else if (v32.fueltype == 'P' || v32.fueltype == 'C') {
                float m322 = v32.calcMileage(40, 500);
                printTabular(v32, m322 );
            } else {
                float m322 = 0;
               printTabular(v32, m322 );
            }

        }

    }

    

    public static void printTabular(Vehicle v, float m) {
        System.out.println(v.brandname + "\t" + v.modelname + "\t" + v.yearofmfg + "\t" + v.color + "\t" + v.fueltype
                + "\t" + v.seats + "\t" + v.price + "\t" + m + "\t" + v.getMfgCode() + "\t" + v.getnoofservices());
    }
}
