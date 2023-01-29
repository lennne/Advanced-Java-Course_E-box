import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BigBashEvent {
    public static void main(String[] args) throws Exception {
        //fill the code
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the purchased date:");

        String date = s.nextLine();
        Object thedate = Event.checkEventAvailable(date);

        if (Event.checkEventAvailable(date) instanceof Date){
            System.out.println("Enter purchase amount:");
            double d2 = s.nextDouble();
            System.out.println("The discounted amount is " + Event.getAmountWithDiscount(d2, (Date) thedate));
        }else {
            System.out.println("Not Eligible for BIGBASH event");
        }

    }
}

class Event {

    public static Object checkEventAvailable(String date) throws ParseException {
        //fill the code
        int month = Integer.parseInt(date.substring(date.indexOf("-") + 1,date.lastIndexOf("-")));
        if(month%2 == 0){
            Date hello = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            return (Object) hello;
        }

        return false;
        //Date eventDate = new SimpleDateFormat("dd-MM-yyyy").parse(date);
    }

    public static double getAmountWithDiscount(double amount, Date date) {
        //fill the code
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        double d = Double.valueOf(calendar.get(Calendar.MONTH)) + 1.00;

        double discountedamount = amount * (100.00 -(d))/100.00;
        return discountedamount;
    }
}

