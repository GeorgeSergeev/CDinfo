package mainpack;

public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		xmlCDlist list=new xmlCDlist();
		list.documentParse("xml/test.xml"); 
		workWindow app = new workWindow(list);
	    app.setVisible(true);
	    app.pack(); 
		/*
		if (list.documentParse("xml/test.xml")!=0) System.out.println("Error");
		else System.out.println(list.GetInfo()); */
	}

}
