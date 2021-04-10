
package classifier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ColdDetector {
    public boolean detectCold(boolean sakitTenggorokan, boolean  demam, double suhuTubuh, boolean batuk, int batukBatuk){
        boolean kondisi;
        
        if(
                (sakitTenggorokan == true) && 
                (demam == false && suhuTubuh <= 37) && 
                (demam == true && suhuTubuh >= 37.5) && 
                (batuk == false && batukBatuk ==0) && 
                (batuk ==true && batukBatuk == 1)){    
            kondisi = true;
        }
        else{
            kondisi = false;      
        }   
        return kondisi;
    }
    
    public void uji (String lokasiFile){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(lokasiFile)));
            String testCase=null;
            int i=1;
            while (
                    (testCase=bufferedReader.readLine())!=null
            ) {                
                String[] input = testCase.split(",");
                boolean hasilDeteksi = detectCold( 
                        Boolean.parseBoolean (input[0]),
                        Boolean.parseBoolean (input[1]),
                        Double.parseDouble (input[2]),
                        Boolean.parseBoolean (input[3]),
                        Integer.parseInt (input[4]));
                System.out.println("test case ke-"+i+" adalah "+hasilDeteksi);
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(ColdDetector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
