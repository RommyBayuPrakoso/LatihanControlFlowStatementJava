
package sdm;

public class Karyawan {
    public int hitungGaji(int gajiSebelumPPH, double PPH, int PTKP ){
        int gajiSetelahPPH = PTKP ;
        if (gajiSebelumPPH >= PTKP)
        {
            gajiSetelahPPH = (int) (gajiSebelumPPH - (gajiSebelumPPH * PPH));
        }
        
        return gajiSetelahPPH;
    }
    
     public int hitungPPH(int gajiSebelumPPH, double PPH, int PTKP){
        int PPHYangHarusDibayar = 0;
        if(gajiSebelumPPH >= PTKP){
            PPHYangHarusDibayar =(int) (gajiSebelumPPH * PPH);
        }
        return PPHYangHarusDibayar;
    }
}
