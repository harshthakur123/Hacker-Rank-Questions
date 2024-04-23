import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dayOfTheProgrammer {

	public static void main(String[] args) {
		System.out.println(dayOfProgrammer(2017));

	}
	public static String dayOfProgrammer(int year) {
	    int day = 0, month = 0;

	    boolean leapYear = false;
	    if (year >= 1700 && year <= 1917 && year % 4 == 0) {
	        leapYear = true;
	    } else if (year >= 1919 && year <= 2700 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
	        leapYear = true;
	    }

	    List<Integer> monthDays = new ArrayList<>(Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));
	    List<Integer> monthDaysLeap = new ArrayList<>(Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));
	    int sumOfDays = 0;
	    List<Integer> currentMonthDays = leapYear ? monthDaysLeap : monthDays;

	    for (int i = 0; i < 12; i++) {
	        sumOfDays += currentMonthDays.get(i);
	        if (256 - sumOfDays <= currentMonthDays.get(i)) {
	            month = i + 1;
	            day = 256 - sumOfDays;
	            break;
	        }
	    }

	    return String.format("%02d.%02d.%04d", day, month+1, year);
	}

}
