package classifier;

public class IrisClassifier {
   public String predict(double panjangSepal, double lebarSepal, double panjangPetal, double lebarPetal) {
       
       String jenisBunga;
       if( (panjangSepal >= 4.3 && panjangSepal <= 5.8) && (lebarSepal >= 2.3 && lebarSepal <= 4.4) && (panjangPetal >= 0.1 && panjangPetal <= 1.9) && (lebarPetal >= 0.1 && lebarPetal <= 0.6) ) {
           jenisBunga = "Setosa";
       } else if( (panjangSepal >= 4.9 && panjangSepal <= 7.0) && (lebarSepal >= 2.0 && lebarSepal <= 3.4) && (panjangPetal >= 3.0 && panjangPetal <= 5.1) && (lebarPetal >= 1.0 && lebarPetal <= 1.8) ) {
           jenisBunga = "versicolor";
       } else if( (panjangSepal >= 4.9 && panjangSepal <= 7.9) && (lebarSepal >= 2.2 && lebarSepal <= 3.8) && (panjangPetal >= 4.5 && panjangPetal <= 6.9) && (lebarPetal >= 1.4 && lebarPetal <= 2.5) ) {
           jenisBunga = "virginica";
       } else {
           jenisBunga = "tidak termasuk ke dalam jenis yang dimaksud";
       }
       
   return jenisBunga;
   }
}
