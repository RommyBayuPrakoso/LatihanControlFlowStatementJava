
package classifier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VehicleDetector {
    public String detectVehicle(boolean bersayap, boolean  terbang, boolean  tinggalLandasVertikal, boolean  berotor, boolean dibuatDiAfsel, boolean rel, boolean terowongan){
    String jenisKendaraan;
        
    if(bersayap || terbang)
        jenisKendaraan = "pesawat";
    if( tinggalLandasVertikal && berotor){
        jenisKendaraan = "helikopter";
    if( dibuatDiAfsel)
        jenisKendaraan = "Rooivalk";
        }
    else{
        jenisKendaraan = "keretaApi";
        if( terowongan)
            jenisKendaraan = "subwayCar";
            
    }
    return jenisKendaraan;

    }
    public void uji(String lokasiFile) {
       try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(lokasiFile)));
            String testCase = null;
            int i=1;
            while ((testCase=bufferedReader.readLine())!=null){                
                String[] input = testCase.split(";");
                String hasilDeteksi = detectVehicle( 
                        Boolean.parseBoolean (input[0]),
                        Boolean.parseBoolean (input[1]),
                        Boolean.parseBoolean (input[2]),
                        Boolean.parseBoolean (input[3]),
                        Boolean.parseBoolean (input[4]),
                        Boolean.parseBoolean (input[5]),
                        Boolean.parseBoolean (input[6])
                       
                );
                System.out.println("test case ke-"+i+" adalah "+hasilDeteksi);
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(ColdDetector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}

