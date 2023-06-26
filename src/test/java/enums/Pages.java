package enums;

public enum Pages {

	    Elements("https://demoqa.com/elements/"),
	    BLUE("0000FF");

	    private String value;

	    private Pages(String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }
	
}
