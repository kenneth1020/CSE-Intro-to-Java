
public class cards {
//data variables
	private String suit;
	private String name;
	private int value;
	public cards(String suit, String name, int value) {
		super();
		this.suit = suit;
		this.name = name;
		this.value = value;
	}
	public cards() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the suit
	 */
	public String getSuit() {
		return suit;
	}
	/**
	 * @param suit the suit to set
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "cards [suit=" + suit + ", name=" + name + ", value=" + value + "]";
	}
	
}
