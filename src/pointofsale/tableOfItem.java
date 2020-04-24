
package pointofsale;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

import java.util.*;

import javax.swing.table.*;

 

public class tableOfItem extends JFrame {

     

    private final static String[] header = {"Name", "UNIT PRICE", "CODE","QUANTITY"};

     

    tableOfItem(ArrayList<String> al) {

        MyModel mm = new MyModel(al, header);
      JTable table = new JTable(mm);

        add(new JScrollPane(table));
      setSize(700, 440);

      setVisible(true);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

     

    class MyModel extends AbstractTableModel {

       

        private ArrayList<String> al;

        private String[] header;

         

        MyModel(ArrayList<String> al, String[] header) {

            this.al = al;

            this.header = header;

        }

 

        public int getColumnCount() {

            return header.length;

        }

 

        public int getRowCount() {

            return al.size();

        }

 

        public Object getValueAt(int rowIndex, int columnIndex) {

            String[] token = al.get(rowIndex).split(",");

            return token[columnIndex];

        }

 

        public String getColumnName(int col) {
            return header[col];

        }

         
    }

     

    public static void main(String[] args) throws FileNotFoundException, IOException {
    ArrayList<String> itemArrayList=new ArrayList<>();
    
        String file="D:\\java\\PointOfSale\\src\\pointofsale\\item.txt";
        BufferedReader br = null;
        
            br = new BufferedReader(new FileReader(file));
       
        
        String line;
        
            while((line=br.readLine())!=null){
                itemArrayList.add(line);
            }
    
        ArrayList<String> al = new ArrayList<String>();
for(int i=0;i<itemArrayList.size();){
    
    al.add(itemArrayList.get(i++)+","+itemArrayList.get(i++)+","+itemArrayList.get(i++)+","+itemArrayList.get(i++));
        
}
//        for(int i=0;i<al.size();i++)
//            System.out.println(al.get(i));

        new tableOfItem(al);

    }

}