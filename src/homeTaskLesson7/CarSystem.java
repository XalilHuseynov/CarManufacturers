package homeTaskLesson7;

public class CarSystem {
    public static void main(String[] args) {
        System.out.println("-----Car manufacturers info-----");
        CarManufacturer renaultCar = new CarManufacturer("Renault",1924,"France");
        CarManufacturer fordCar = new CarManufacturer("Ford",1967,"USA");
        System.out.println(renaultCar);
        System.out.println(fordCar);
        //Yoxlama emeliyyatlari ucun allCarModels arrayini yaratdiq
        int carCount=6;
        CarModels[] allCars = new CarModels[carCount];
        System.out.println("\n-----Car models info-----");
        //Serte uygun olaraq default masinlar yaratdiq
        CarModels clio = new CarModels("Clio",2016,2.0,"Gasoline",16500,renaultCar);
        allCars[0]=clio;
        CarModels scenic = new CarModels("Scenic",2020,1.6,"Gasoline",28500,renaultCar);
        allCars[1]=scenic;
        CarModels megane = new CarModels("Megane",2022,1.5,"Diesel",38500,renaultCar);
        allCars[2]=megane;
        CarModels connect = new CarModels("Connect",2017,1.7,"Diesel",23999,fordCar);
        allCars[3]=connect;
        CarModels mustang = new CarModels("Mustang",2018,2.5,"Gasoline",32000,fordCar);
        allCars[4]=mustang;
        CarModels transit = new CarModels("Transit",2024,2.0,"Diesel",21500,fordCar);
        allCars[5]=transit;
        System.out.println(clio+"\n"+scenic+"\n"+megane+"\n"+connect+"\n"+mustang+"\n"+transit);
        System.out.println("\n-----Cars with diesel engines-----");
        for(CarModels car: allCars){
            if(car.getFuelType().equalsIgnoreCase("diesel")){
                System.out.println(car);
            }
        }
        System.out.println("\n-----Cars from France-----");
        for(CarModels car: allCars){
            if(car.getManufacturer().getOriginCountry().equalsIgnoreCase("france")){
                System.out.println(car);
            }
        }
        System.out.println("\n-----Car with the highest price-----");
        double maxPrice = allCars[0].getPrice();
        //Birinci for ile en baha masini tapiriq , ikincide ise axtaris edib cap edirik
        for(CarModels car: allCars){
            if(car.getPrice()>maxPrice){
                maxPrice=car.getPrice();
            }
        }
        for(CarModels car: allCars){
            if(maxPrice==car.getPrice()){
                System.out.println(car);
            }
        }
        System.out.println("\n-----Luxury cars-----(Price over 25k)");
        for(CarModels car : allCars){
            if(car.getPrice()>25000){
                car.setLuxury(true);
            }
        }
        for(CarModels car : allCars){
            if(car.isLuxury()){
                System.out.println(car);
            }
        }
    }
}
