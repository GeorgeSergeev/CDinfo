package mainpack;

import java.util.Iterator;
import java.util.TreeSet;

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

}
