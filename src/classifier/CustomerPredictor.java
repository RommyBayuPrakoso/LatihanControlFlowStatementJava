
package classifier;

public class CustomerPredictor {
    public boolean predict(int umur, int statusPelajar, int tingkatPelunasanKredit) {
        boolean potensiMenjadiCostumer = true;
        
        if((umur == 1) || (umur == 0 && statusPelajar == 0) || (umur == 2 && tingkatPelunasanKredit == 0)){
       
        }else {
            potensiMenjadiCostumer = false;  
        }
             
        return potensiMenjadiCostumer;        
    }
        
}
