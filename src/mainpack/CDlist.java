package mainpack;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

public class CDlist implements CDinfo{
	   private TreeSet <soldCD> CDall = new TreeSet<soldCD>();
	   public void add(soldCD obj) {
	         CDall.add(obj);
	   }
	   public int count() {
	         return CDall.size();
	   }
	   @Override
	   public String GetInfo() {
		   String res="";
		   Iterator iterator = CDall.iterator();
		   //Собираем все
		   while (iterator.hasNext()){
			   res+=((soldCD)iterator.next()).GetInfo()+'\n';
		   }
		   return res;
	   }
	   
	   public Vector GetAsTable() {
		   Vector result = new Vector();
		   Iterator iterator = CDall.iterator();
		   //Собираем все
		   while (iterator.hasNext()){
			   Vector element = new Vector();
			   soldCD curCD= (soldCD) iterator.next();
	            element.add(curCD.getArtist());
	            element.add(curCD.getTitle());
	            element.add(curCD.getYear());
	            element.add(curCD.getPrice());
	            // Присоединяем список к результату
	            result.add(element);
		   }		   
		   return result;
	   }
	   

}
