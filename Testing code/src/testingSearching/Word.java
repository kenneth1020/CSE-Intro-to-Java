package testingSearching;

public class Word {
	
	private String word;
	private String def;
	
	public Word(String word, String def) {
		this.word = word;
		this.def = def;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getDef() {
		return def;
	}

	public void setDef(String def) {
		this.def = def;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", def=" + def + "]";
	}
	
	//need these methods to use for our searches
	public int compareTo(String key)  {
		//System.out.println(word + " " + " key " + word.compareTo(key));
		return word.compareTo(key);
	}
	
	public boolean equals(String key)  {
		return word.equals(key);
	}

}
