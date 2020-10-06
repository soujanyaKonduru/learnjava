
 import java.util.*;
 import java.sql.Timestamp;

public class Q8JDKClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);

        Date date = new Date();
        System.out.println(new Timestamp(date.getTime()));
        

	}

}
