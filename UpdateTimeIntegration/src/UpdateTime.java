import java.text.SimpleDateFormat;
import java.util.Calendar;
public class UpdateTime {
	public static void main(String[] args) 
	{
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY:MM:DD");
        System.out.println( sdf.format(cal.getTime()) );
	}
}
