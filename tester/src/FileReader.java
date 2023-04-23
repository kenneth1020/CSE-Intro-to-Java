
public class FileReader {
	private int indexNumber;//A 1
	private String company;//B 2
	private String country;//C 3
	private String continent;//D 4
	private String region; //E 5
	private String clientDescription;//F 6
	private String FRDMDescription;//G 7
	public String ClientProduct; //H 8
	private String priority;//I 9
	public int FRDMProductCode;//J 10
	public FileReader(int indexNumber, String company, String country, String continent, String region,
			String clientDescription, String fRDMDescription, String clientProduct, String priority,
			int fRDMProductCode) {
		super();
		this.indexNumber = indexNumber;
		this.company = company;
		this.country = country;
		this.continent = continent;
		this.region = region;
		this.clientDescription = clientDescription;
		FRDMDescription = fRDMDescription;
		ClientProduct = clientProduct;
		this.priority = priority;
		FRDMProductCode = fRDMProductCode;
	}
	public FileReader() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the indexNumber
	 */
	public int getIndexNumber() {
		return indexNumber;
	}
	/**
	 * @param indexNumber the indexNumber to set
	 */
	public void setIndexNumber(int indexNumber) {
		this.indexNumber = indexNumber;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}
	/**
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the clientDescription
	 */
	public String getClientDescription() {
		return clientDescription;
	}
	/**
	 * @param clientDescription the clientDescription to set
	 */
	public void setClientDescription(String clientDescription) {
		this.clientDescription = clientDescription;
	}
	/**
	 * @return the fRDMDescription
	 */
	public String getFRDMDescription() {
		return FRDMDescription;
	}
	/**
	 * @param fRDMDescription the fRDMDescription to set
	 */
	public void setFRDMDescription(String fRDMDescription) {
		FRDMDescription = fRDMDescription;
	}
	/**
	 * @return the clientProduct
	 */
	public String getClientProduct() {
		return ClientProduct;
	}
	/**
	 * @param clientProduct the clientProduct to set
	 */
	public void setClientProduct(String clientProduct) {
		ClientProduct = clientProduct;
	}
	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}
	/**
	 * @return the fRDMProductCode
	 */
	public int getFRDMProductCode() {
		return FRDMProductCode;
	}
	/**
	 * @param fRDMProductCode the fRDMProductCode to set
	 */
	public void setFRDMProductCode(int fRDMProductCode) {
		FRDMProductCode = fRDMProductCode;
	}
	@Override
	public String toString() {
		return "FileReader [indexNumber=" + indexNumber + ", company=" + company + ", country=" + country
				+ ", continent=" + continent + ", region=" + region + ", clientDescription=" + clientDescription
				+ ", FRDMDescription=" + FRDMDescription + ", ClientProduct=" + ClientProduct + ", priority=" + priority
				+ ", FRDMProductCode=" + FRDMProductCode + "]";
	}
	
	
	
	
	

}
