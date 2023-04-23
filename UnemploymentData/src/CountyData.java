
public class CountyData implements Comparable<CountyData>{
private String county;
private int smoker;
private int obese;
private int avgHouseHoldIncome;


public CountyData() {
	super();
	county = "Everfall";
	smoker = 0;
	obese = 0;
	avgHouseHoldIncome = 10000000;
}

public CountyData(String county, int smoker, int obese, int avgHouseHoldIncome) {
	super();
	this.county = county;
	this.smoker = smoker;
	this.obese = obese;
	this.avgHouseHoldIncome = avgHouseHoldIncome;
}

/**
 * @return the county
 */
public String getCounty() {
	return county;
}


/**
 * @param county the county to set
 */
public void setCounty(String county) {
	this.county = county;
}


/**
 * @return the smoker
 */
public int getSmoker() {
	return smoker;
}


/**
 * @param smoker the smoker to set
 */
public void setSmoker(int smoker) {
	this.smoker = smoker;
}


/**
 * @return the obese
 */
public int getObese() {
	return obese;
}


/**
 * @param obese the obese to set
 */
public void setObese(int obese) {
	this.obese = obese;
}


/**
 * @return the avgHouseHoldIncome
 */
public int getavgHouseHoldIncome() {
	return avgHouseHoldIncome;
}


/**
 * @param avgHouseHoldIncome the avgHouseHoldIncome to set
 */
public void setavgHouseHoldIncome(int avgHouseHoldIncome) {
	this.avgHouseHoldIncome = avgHouseHoldIncome;
}

@Override
public String toString() {
	return "CountyData [county=" + county + ", smoker=" + smoker + ", obese=" + obese + ", avgHouseHoldIncome=" + avgHouseHoldIncome + "]";
}

public int compareTo(CountyData objectToCompare) {
	if(this.avgHouseHoldIncome == objectToCompare.avgHouseHoldIncome)
		return 0;
	if(this.avgHouseHoldIncome > objectToCompare.avgHouseHoldIncome)
		return -1;

	return 1;//know that this.aveHouseHoldIncome < objectToCompare.aveHouseHoldIncome
}
}

