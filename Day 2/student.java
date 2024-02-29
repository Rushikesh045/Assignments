class student
{
   String Name;
   int Marks1;
   int Marks2;
   int Marks3;
   
   student(String n1, int m1, int m2, int m3)
   {
      Name=n1;
      Marks1=m1;
      Marks2=m2;
      Marks3=m3;
   }


   public static void main(String args[])
   {
      student s1=new student("Rushikesh",80,88,75);
      s1.display();
   }

   void totalMarks()
   {
      int tm= Marks1 + Marks2 + Marks3; 
      System.out.println("total marks : "+ tm);
   }
  void avgMarks()
  {
      int am=(Marks1 + Marks2 + Marks3)/3;
      System.out.println("Average Marks : "+am);
  }
  void display()
  {
      System.out.println("Name of Student :- "+Name);
      totalMarks();
  }
}