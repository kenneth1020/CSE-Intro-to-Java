
public class CountyData2 implements Comparable<CountyData2>{
private String county;
private int population;
private int death;


public CountyData2() {
	super();
	county = "Everfall";
	population = 242671273;
	death = 567;
}


public CountyData2(String county, int population, int death) {
	super();
	this.county = county;
	this.population = population;
	this.death = death;
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
 * @return the population
 */
public int getPopulation() {
	return population;
}


/**
 * @param population the population to set
 */
public void setPopulation(int population) {
	this.population = population;
}


/**
 * @return the death
 */
public int getDeath() {
	return death;
}


/**
 * @param death the death to set
 */
public void setDeath(int death) {
	this.death = death;
}


@Override
public String toString() {
	return "CountyData2 [county=" + county + ", population=" + population + ", death=" + death + "]";
}

public int compareTo(CountyData2 objectToCompare) {
	if(this.death == objectToCompare.death)
		return 0;
	if(this.death > objectToCompare.death)
		return -1;

	return 1;//know that this.unEmployment < objectToCompare.unEmployment
}





}

