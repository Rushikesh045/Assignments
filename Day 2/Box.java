class Box
 {
    double height;
    double width;
    double breadth;

    Box(double h, double w, double b)
   {
       height = h;
       width = w;
       breadth = b;
    }

    void getVolume()
    { 
        double gv=height * width * breadth;
        System.out.println("volume of box : "+ gv);
        
    }

    void getArea()
    { 
        double ga = (2*(height * width + width * breadth + height * breadth));
        System.out.println("area of box : "+ga);
    }

    public static void main(String[] args)
  {
        Box b1 = new Box(10, 7, 2);
        Box b2 = new Box(15, 9, 4);

        System.out.println("box 1");
        b1.getVolume();
        b1.getArea();
       
       System.out.println("box 1");
        b2.getVolume();
        b2.getArea();
    }
}