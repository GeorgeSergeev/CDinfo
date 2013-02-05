package mainpack;
import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class workWindow extends JFrame{
  public workWindow(CDlist list)
  {
	  super ("CD List");
      setBounds(100, 100, 200, 200);
	  enableEvents(AWTEvent.WINDOW_EVENT_MASK);
	  try
		  {
		   init(list);
		  }
		  catch(Exception e)
		  {
		   e.printStackTrace();
		  }
	  
  }
	private void init(CDlist list) throws Exception
	 {
	  //Column names
	  Vector  header = new Vector();
	  header.add("Artist");
	  header.add("Title");
	  header.add("Year");
	  header.add("Price");
	  
	  //Create JTable
	  JTable cdTable = new JTable();
	  JScrollPane pane = new JScrollPane();
      pane.getViewport().add(cdTable);
      this.getContentPane().add(pane, BorderLayout.CENTER);
/*      Vector header = new Vector();
      header.add("P_1");
      header.add("P_2"); */
      
      // Помещаю в модель таблицы данные
      DefaultTableModel dtm = (DefaultTableModel)cdTable.getModel();
      // Сначала данные, потом шапка
      dtm.setDataVector(list.GetAsTable(), header);
      // Ну все, теперь только размеры, видимость и чтобы по крестику закрывалось :-)
      this.setSize(640, 480);
      this.setVisible(true);	 }
	 protected void processWindowEvent(WindowEvent e)
	 {
	  super.processWindowEvent(e);
	  if (e.getID() == WindowEvent.WINDOW_CLOSING)
	  {
	   System.exit(0);
	  }
	 }
  
}
