import java.util.Calendar;


public class main {

	public static void main(String[] args) {
		 Calendar calendar = Calendar.getInstance();
	        System.out.println(calendar.get(Calendar.YEAR)); // yıl
	        System.out.println(calendar.get(Calendar.MONTH)); // ayın kaçıncı günü
	        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // dakka
	       
	        
	        
	        ////setTimeInMillis methods kullanımı 
	        
	        Calendar cal = Calendar.getInstance();

	       
	        cal.setTimeInMillis(1234567898765L);

	        // print the new time
	        System.out.println("After setting Time:  " + cal.getTime());
	}

}
