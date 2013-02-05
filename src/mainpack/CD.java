package mainpack;

//import java.util.logging.Formatter;
import java.util.Formatter;

interface CDinfo {
	public String GetInfo();
};

public class CD implements CDinfo {
	/*
	 * <TITLE>Empire Burlesque</TITLE> 
	 * <ARTIST>Bob Dylan</ARTIST> 
	 * <COUNTRY>USA</COUNTRY> 
	 * <COMPANY>Columbia</COMPANY> 
	 * <PRICE>10.90</PRICE> 
	 * <YEAR>1985</YEAR>
	 */
	private String Title, Artist, Country, Company ;
	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getTitle() {
		return Title;
	}


	public void setTitle(String fTitle) {
		this.Title = Title;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String Artist) {
		this.Artist = Artist;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int Year) {
		this.Year = Year;
	}

	private int Year;
	
    public CD (String Title, String Artist, int Year )
    {
    	this.Artist=Artist;
    	this.Title=Title;
    	this.Year=Year;
    }
    
    public CD (String Title, String Artist, String Country, String Company, int Year )
    {
    	this.Artist=Artist;
    	this.Title=Title;
    	this.Country=Country;
    	this.Company=Company;
    	this.Year=Year;
    }
    
    public String GetInfo()
    {
    	Formatter f = new Formatter(); // объявление объекта

    	// форматирование текста по формату %S, %c

    	f.format("%s \t %s \t %04d", Artist, Title, Year);
    	return f.toString(); 
    }
    
    
}




