import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainClass {

	public static final String ADDED_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static void main(String[] args) throws ParseException {
		String dateToFormat = "2025-05-27 17:34:13";
		SimpleDateFormat format = new SimpleDateFormat(ADDED_DATE_FORMAT);
		Date date = format.parse(dateToFormat);
		System.out.println(date);
		
		System.out.println(convertStringToDateTime(dateToFormat));
		System.out.println(convertDateTimeToString(date));
	}

	public static Date convertStringToDateTime(String strDate) throws ParseException {
		if (strDate == null || strDate.isEmpty() || "null".equalsIgnoreCase(strDate)) {
			return null;
		}
		if(strDate.charAt(4) != '-' || strDate.charAt(7) != '-' || strDate.charAt(13) != ':' || strDate.charAt(16) != ':')
			throw new ParseException ("Date must be in yyyy-MM-dd HH:mm:ss format.", 0);
		return new SimpleDateFormat(ADDED_DATE_FORMAT).parse(strDate);
	}
	
	public static String convertDateTimeToString(Date date) {
		if (date == null)
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat(ADDED_DATE_FORMAT);
		try {
			return sdf.format(date);
		} catch (Exception ex) {
			return null;
		}
	}
}
