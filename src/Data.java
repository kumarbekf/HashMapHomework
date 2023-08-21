public class Data  {
    private int year_of_manufacture,price;
    private String model;
    private String color;

    public Data(int year_of_manufacture, String model, int price, String color) {
        this.year_of_manufacture = year_of_manufacture;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYear_of_manufacture() {
        return year_of_manufacture;
    }

    public void setYear_of_manufacture(int year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Data{" +
                "year_of_manufacture=" + year_of_manufacture +
                ", model=" + model +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
