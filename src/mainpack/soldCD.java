package mainpack;


class soldCD extends CD implements Comparable <soldCD>
{
	private float price;
	
	public soldCD (String Title, String Artist, int Year, float price )
	{
		super (Title,Artist,Year);
		this.price=price;
	}

	public soldCD(String Title, String Artist, String Country, String Company, int Year, float price )
			{
   		     super (Title,Artist,Country,Company,Year);
		     this.price=price;
			}
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String GetInfo()
	{
		String cdinfo=super.GetInfo();
		return cdinfo+"\t"+price;
	}

	@Override
	public int compareTo(soldCD arg) {
		// TODO Auto-generated method stub
		  String otherArtist = ((soldCD) arg).getArtist();
		  int res=this.getArtist().compareTo(otherArtist);
		  if (res==0) res=this.getfTitle().compareTo(otherArtist);
          return res;
	}
	
}
