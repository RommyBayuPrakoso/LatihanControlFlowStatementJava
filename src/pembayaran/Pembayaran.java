
package pembayaran;

public class Pembayaran {
       public int hitungPembayaran(int nilaiTotalPembelian, double diskon ){
        int nilaiYangDibayar = nilaiTotalPembelian ;
        if (nilaiYangDibayar >= 5000000)
            nilaiYangDibayar = (int) (nilaiTotalPembelian - nilaiTotalPembelian * diskon);
        
        return nilaiYangDibayar;
    }
}

