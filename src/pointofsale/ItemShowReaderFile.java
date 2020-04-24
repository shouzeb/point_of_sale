
package pointofsale;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ItemShowReaderFile {
    ArrayList<String> itemArrayList=new ArrayList<>();
    public ItemShowReaderFile() throws FileNotFoundException, IOException{
        String file="D:\\java\\PointOfSale\\src\\pointofsale\\item.txt";
        BufferedReader br = null;
        
            br = new BufferedReader(new FileReader(file));
       
        
        String line;
        
            while((line=br.readLine())!=null){
                itemArrayList.add(line);
            }
    }
}
