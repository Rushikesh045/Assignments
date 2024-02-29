class Room
{
   int hight;
   int width;
   int breadth;

   Room(int h1,int w1, int b1)
   {
      hight=h1;
      width=w1;
      breadth=b1;
   }


    public static void main(String args[])
  {
      Room rm=new Room(10,12,6);
      rm.volume();
  }
 void volume()
  {
     int v=hight*width*breadth;
     System.out.println(v);
  }
}