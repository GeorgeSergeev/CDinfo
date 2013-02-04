package mainpack;

public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		CDlist list=new CDlist();
		soldCD mcd=new soldCD("Red","King Crimson ", 1973,5);
		list.add(mcd);
		mcd=new soldCD("Led Zeppelin I","Led Zeppelin", 1969,10);
		list.add(mcd);
		mcd=new soldCD("Led Zeppelin II","Led Zeppelin", 1970,10);
		list.add(mcd);
		mcd=new soldCD("Lizard","King Crimson ", 1971,5);
		list.add(mcd);
		mcd=new soldCD("Machine head","Deep purple ", 1972,15);
		list.add(mcd);
		System.out.println(list.GetInfo()); */
		xmlCDlist list=new xmlCDlist();
		if (list.documentParse("c:\\workspace\\classtest\\xml\\test.xml")!=0) System.out.println("Error");
		else System.out.println(list.GetInfo());
	}

}
