
package pointofsale;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class itemAdding  {
    private String name,code;
    private String unitPrice,quantity;
    File itemm=new File("D:\\java\\PointOfSale\\src\\pointofsale\\item.txt");
    
    
public itemAdding(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public itemAdding(String name, String code, String unitPrice, String quantity) throws IOException {
        this.name = name;
        this.code = code;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        BufferedReader br = null;
        ArrayList<String> array=new ArrayList<>();
            br = new BufferedReader(new FileReader(itemm));
        String line;
            while((line=br.readLine())!=null){
                array.add(line);
            }
        FileWriter fw=new FileWriter(itemm);
        BufferedWriter bw=new BufferedWriter(fw);
        for(int i=0;i<array.size();i++){
            bw.write(array.get(i));
            bw.newLine();
        }
        bw.write(this.name);
        bw.newLine();
        bw.write(this.unitPrice);
        bw.newLine();
        bw.write(this.code);
        bw.newLine();
        bw.write(this.quantity);
        bw.close();
        
    }

    
    
}
