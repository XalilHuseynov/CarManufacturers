package homeTaskLesson7;

public class CarModels {
    private String model;
    CarManufacturer manufacturer;
    private int productionYear;
    private double engineSize;
    private String fuelType;
    private double price;
    private boolean isLuxury = false;

    public boolean isLuxury() {
        return isLuxury;
    }

    public void setLuxury(boolean luxury) {
        isLuxury = luxury;
    }

    public CarModels(String model, int productionYear, double engineSize, String fuelType, double price, CarManufacturer manufacturer) {
        this.model = model;
        this.productionYear = productionYear;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public CarManufacturer getManufacturer() {
        return manufacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public double getPrice() {
        return price;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return  "Car: "+"|"+model+ "|     |" + manufacturer.getManufacturerName() +
                "|     |" + productionYear +
                "|     |" + engineSize +
                "|     |" + fuelType +
                "|     |" +(price)+"k|";
    }
}
