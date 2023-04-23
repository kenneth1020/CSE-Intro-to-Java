
public class WorstDataNA implements Comparable<WorstDataNA>{
	private int year;
	private int month;
	private int day;
	private double percent;

	public WorstDataNA() {
		super();
		year = 1998;
		month = 10;
		day = 26;
		percent = 100.0;
	}

	public WorstDataNA(int year, int month, int day, double percent) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.percent = percent;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return the percent
	 */
	public double getPercent() {
		return percent;
	}

	/**
	 * @param percent the percent to set
	 */
	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "WorstDataNA [year=" + year + ", month=" + month + ", day=" + day + ", percent=" + percent + "]";
	}

	public int compareTo(WorstDataNA objectToCompare) {
		if(this.percent == objectToCompare.percent)
			return 0;
		if(this.percent > objectToCompare.percent)
			return -1;

		return 1;//know that this.unEmployment < objectToCompare.unEmployment
	}

	


}
