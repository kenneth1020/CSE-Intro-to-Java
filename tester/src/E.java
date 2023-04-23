
public class E {
private String player;
private String racketName;
private String brandRacket;
private String shoesBrand;

public E(String player, String racketName, String brandRacket, String shoesBrand) {
	super();
	this.player = player;
	this.racketName = racketName;
	this.brandRacket = brandRacket;
	this.shoesBrand = shoesBrand;
}
public E() {
	super();
	player = "Sandy";
	racketName = "Gucci Grill 2019";
	brandRacket = "LOUIS VUITTON";
	shoesBrand = "Gucci is Life";
}
/**
 * @return the player
 */
public String getPlayer() {
	return player;
}
/**
 * @param player the player to set
 */
public void setPlayer(String player) {
	this.player = player;
}
/**
 * @return the racketName
 */
public String getRacketName() {
	return racketName;
}
/**
 * @param racketName the racketName to set
 */
public void setRacketName(String racketName) {
	this.racketName = racketName;
}
/**
 * @return the brandRacket
 */
public String getBrandRacket() {
	return brandRacket;
}
/**
 * @param brandRacket the brandRacket to set
 */
public void setBrandRacket(String brandRacket) {
	this.brandRacket = brandRacket;
}
/**
 * @return the shoesBrand
 */
public String getShoesBrand() {
	return shoesBrand;
}
/**
 * @param shoesBrand the shoesBrand to set
 */
public void setShoesBrand(String shoesBrand) {
	this.shoesBrand = shoesBrand;
}
@Override
public String toString() {
	return "E [player=" + player + ", racketName=" + racketName + ", brandRacket=" + brandRacket + ", shoesBrand="
			+ shoesBrand + "]";
}

	
	
	
}
