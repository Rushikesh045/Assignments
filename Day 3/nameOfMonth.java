//question no 17

class nameOfMonth
{
   public static void main(String args[])
   {
       int month = 8;
    String m;
    switch (month) {
      case 1: m = "January";
        break;
      case 2: m = "February";
        break;
      case 3: m = "March";
        break;
      case 4: m = "April";
        break;
      case 5: m = "May";
        break;
      case 6: m = "June";
        break;
      case 7: m = "July";
        break;
      case 8: m = "August";
        break;
      case 9: m = "September";
        break;
      case 10: m = "October";
        break;
      case 11: m = "November";
        break;
      case 12: m = "December";
        break;
      default: m = "Invalid month";
        break;
    }
    System.out.println(m);
   }
}