package Lab4.people;

public class Rectagle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth( ) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight( ) {
        this.height = height;
    }

    public void Rectangle(String color, FillType filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Method to display information about the rectangle
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
    }

    // Method to calculate the area of the rectangle
    @Override
    public double getArea() {
        return width * height;
    }
}

