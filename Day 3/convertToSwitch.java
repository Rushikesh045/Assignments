//question no 6

class convertToSwitch
{
   public static void main(String args[])
   {
      System.out.println("Enter The Number");
      int marks=9;

      switch(marks)
      {
         
         case 10:
               System.out.println("Congratulations you have full marks");
               break;
         case 9:
               System.out.println("Congratulations you have almost full marks");
               break;

         case 8:
               System.out.println("Congratulations you have done very well");
               break;

         case 7:
               System.out.println("Congratulations you have done well");
               break;

         case 6:
               System.out.println("You are doing alright but could study more");
               break;

         case 5:
               System.out.println("You only got half marks, you need to do more");
               break;

         case 4:
               System.out.println("You got less than half marks, you need to do more");
               break;

         case 3:
               System.out.println("You have got loww narks, see a teacher ");
               break;
         case 2:
               System.out.println("You have got very low marks,see a teacher");
               break;

         case 1:
               System.out.println("You only got 1 marks, see a teacher");
               break;
         default:
               System.out.println("You have failed abysmally");
      }
   }
}