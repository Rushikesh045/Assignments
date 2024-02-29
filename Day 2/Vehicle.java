class Vehicle {
    double price;
    String color;
    String model;


    Vehicle(double p, String c, String m)
   {
        price = p;
        color = c;
        model = m;
    }

    void display()
   {
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args)
   {
        Vehicle v1 = new Vehicle(750000.0, "White", "Suzuki Swift");
        v1.display();
    }
}
