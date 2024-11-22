package hackerRank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeConversion {

    public static String timeConversion(String s) throws ParseException {
        // Write your code here
        String timeFor24hr = "";

        SimpleDateFormat  displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");

        Date date = parseFormat.parse(s);

        timeFor24hr = parseFormat.format(date) +" = "+ displayFormat.format(date);
        return  timeFor24hr;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(timeConversion("07:05:45PM"));
    }

}
