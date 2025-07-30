package homeTaskLesson7;

public class CarManufacturer {
    private String manufacturerName;
    private int foundationYear;
    private String originCountry;

    public CarManufacturer(String manufacturerName, int foundationYear, String originCountry) {
        this.manufacturerName = manufacturerName;
        this.foundationYear = foundationYear;
        this.originCountry = originCountry;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    @Override
    public String toString() {
        return manufacturerName + "   ("+originCountry+",Founded in : "+foundationYear+")";
    }
}
