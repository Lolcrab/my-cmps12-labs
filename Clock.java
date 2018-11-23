package lab1;

public class Clock {
	private int hour;
	private int minute;
	
	public Clock() {
		hour = 0;
		minute = 0;
	}
	
	public Clock(int h) {
		hour = h;
		minute = 0;
	}
	
	public Clock(int h, int m) {
		hour = h;
		minute = m;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void incrementTimer() {
		minute++;
		if(minute > 59) {
			minute = 0;
			hour++;
		}
	}
	
	public void incrementTimer(int x) {
		for(int i = 0; i < x; i++)
			incrementTimer();
	}
	
	public void setTime(int h, int m) {
		if (m > 59 || h > 24) {
			System.out.println("Invalid Input");
/*			int minExcess = minute - 60;
			int reps = minute / 60;
			minute = minExcess;
			for (int i = 0; i < reps; i++)
				hour++;*/
		} else {
			minute = m;
			hour = h;
		}
//		if (h > 24) {
//			System.out.println("Invalid Input");
			/*int hourExcess = hour / 24
			for (int i = 0; i < hourExcess ; i++) 
				hour -= 24;*/
		//} else hour = h;
	}
	
	public String toString() {
		String AMorPM;
		if (hour > 11) {
			if(hour == 24)
				AMorPM = new String("AM"); 
			else AMorPM = new String("PM");
			hour -= 12;
		}
		else AMorPM = new String("AM");
		if(hour == 0)
			hour = 12;
		String civHour;
		if(hour < 10)
			civHour = new String("0"+hour);
		else civHour = new String(Integer.toString(hour));
		String civMin;
		if(minute < 10)
			civMin = new String("0"+minute);
		else civMin = new String(Integer.toString(minute));
		String result = new String(civHour + ":" + civMin + " " + AMorPM);
		return result;
	}

}
