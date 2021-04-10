package main;

import pembayaran.Pembayaran;
import sdm.Karyawan;
import billing.Customer;
import expertsystem.Expert;
import alarmsystem.Alarm;
import classifier.IrisClassifier;
import classifier.CustomerPredictor;
import classifier.NeuralNetwork;
import classifier.ColdDetector;
import classifier.VehicleDetector;

public class Aplikasi {
     public static void main(String[] args) {
        Pembayaran pembayaran = new Pembayaran ();
        
        int nilaiYangDibayarkan;
        
        //test case 1
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(6000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        //test cas 2
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(4000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        //test case 3
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(5000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        
        System.out.println("---------------------------------------------------");
        
        
        Karyawan karyawan = new Karyawan();
        int gajiSetelahPPH;
        
        //test case 1
        gajiSetelahPPH = karyawan.hitungGaji(6000000, 0.1, 6000000);
        System.out.println(gajiSetelahPPH);
         
        //test case 2
        gajiSetelahPPH = karyawan.hitungGaji(4000000, 0.1, 3000000);
        System.out.println(gajiSetelahPPH);
        
        //test case 3
        gajiSetelahPPH = karyawan.hitungGaji(500000, 0.1, 1000000);
        System.out.println(gajiSetelahPPH);
        
        
        System.out.println("---------------------------------------------------");    
        
        
        int PPHyangHarusDibayar;
        
        //test case 1
        PPHyangHarusDibayar = karyawan.hitungPPH(6000000, 0.1, 6000000);
        System.out.println(PPHyangHarusDibayar);
         
        //test case 2
        PPHyangHarusDibayar = karyawan.hitungPPH(4000000, 0.1, 3000000);
        System.out.println(PPHyangHarusDibayar);
        
        //test case 3
        PPHyangHarusDibayar = karyawan.hitungPPH(500000, 0.1, 1000000);
        System.out.println(PPHyangHarusDibayar);
        
        
        System.out.println("---------------------------------------------------");
        
        
        int nilaiTagihanPembayaranSetelahDenda;
        
        //test case 1
        Customer customer = new Customer();
        nilaiTagihanPembayaranSetelahDenda = customer.hitungPembayaranTagihan(400000, 0.01, 1, 4);
        System.out.println(nilaiTagihanPembayaranSetelahDenda);
        
        //test case 2
        nilaiTagihanPembayaranSetelahDenda = customer.hitungPembayaranTagihan(300000, 0.01, 1, 3);
        System.out.println(nilaiTagihanPembayaranSetelahDenda);
        
        
        System.out.println("---------------------------------------------------");
        
        
        Expert expert = new Expert();
        
        boolean jenisTumpahan;
        
        //test case 1
        jenisTumpahan = expert.isAceticAcid(true, 5, true);
        System.out.println(jenisTumpahan);
        
        //test case 2
        jenisTumpahan = expert.isAceticAcid(true, 6, true);
        System.out.println(jenisTumpahan);
        
        //test case 3
        jenisTumpahan = expert.isAceticAcid(true, 7, true);
        System.out.println(jenisTumpahan);
        
        //test case 4
        jenisTumpahan = expert.isAceticAcid(true, 5, false);
        System.out.println(jenisTumpahan);
        
        //test case 5
        jenisTumpahan = expert.isAceticAcid(true, 6, false);
        System.out.println(jenisTumpahan);
        
        //test case 6
        jenisTumpahan = expert.isAceticAcid(true, 7, false);
        System.out.println(jenisTumpahan);
        
        //test case 7
        jenisTumpahan = expert.isAceticAcid(false, 5, true);
        System.out.println(jenisTumpahan);
        
        //test case 8
        jenisTumpahan = expert.isAceticAcid(false, 6, true);
        System.out.println(jenisTumpahan);
        
        //test case 9
        jenisTumpahan = expert.isAceticAcid(false, 7, true);
        System.out.println(jenisTumpahan);
        
        
        System.out.println("---------------------------------------------------");
        
        
        Alarm alarm = new Alarm();
        
        boolean statusAlarmWarning;
        
        //test case 1
        statusAlarmWarning =alarm.isAlarmStatusWarning(55.5, true, true);
        System.out.println(statusAlarmWarning);
         
        //test case 2
        statusAlarmWarning =alarm.isAlarmStatusWarning(60, true, true);
        System.out.println(statusAlarmWarning);
         
        //test case 3
        statusAlarmWarning =alarm.isAlarmStatusWarning(40, true, true);
        System.out.println(statusAlarmWarning);
         
        //test case 4
        statusAlarmWarning =alarm.isAlarmStatusWarning(55.5, false, true);
        System.out.println(statusAlarmWarning);
         
        //test case 5
        statusAlarmWarning =alarm.isAlarmStatusWarning(60, false, true);
        System.out.println(statusAlarmWarning);
         
        //test case 6
        statusAlarmWarning =alarm.isAlarmStatusWarning(40, false, true);
        System.out.println(statusAlarmWarning);
         
        //test case 7
        statusAlarmWarning =alarm.isAlarmStatusWarning(55.5, false, false);
        System.out.println(statusAlarmWarning);
         
        //test case 8
        statusAlarmWarning =alarm.isAlarmStatusWarning(60, false, false);
        System.out.println(statusAlarmWarning);
         
        //test case 9
        statusAlarmWarning =alarm.isAlarmStatusWarning(40, false, false);
        System.out.println(statusAlarmWarning);
        
        
        System.out.println("---------------------------------------------------");
        
        System.out.println("---------------------------------------------------");
        
        
        IrisClassifier irisClassifier = new IrisClassifier();
        
        String jenisBunga;
        
        //test case 1
        jenisBunga = irisClassifier.predict(4.3, 3.0, 1.1, 0.1);
        System.out.println(jenisBunga);
        //test case 2
        jenisBunga = irisClassifier.predict(4.8, 3.0, 1.4, 0.1);
        System.out.println(jenisBunga);
        //test case 3
        jenisBunga = irisClassifier.predict(5.2, 4.1, 1.5, 0.1);
        System.out.println(jenisBunga);
        //test case 4
        jenisBunga = irisClassifier.predict(4.6, 3.6, 1.0, 0.2);
        System.out.println(jenisBunga);
        //test case 5
        jenisBunga = irisClassifier.predict(5.1, 3.3, 1.7, 0.5);
        System.out.println(jenisBunga);
        //test case 6
        jenisBunga = irisClassifier.predict(5.0, 3.5, 1.6, 0.6);
        System.out.println(jenisBunga);
        //test case 7
        jenisBunga = irisClassifier.predict(5.0, 2.3, 3.3, 1.0);
        System.out.println(jenisBunga);
        //test case 8
        jenisBunga = irisClassifier.predict(4.9, 2.4, 3.3, 1.0);
        System.out.println(jenisBunga);
        //test case 9
        jenisBunga = irisClassifier.predict(5.0, 2.0, 3.5, 1.0);
        System.out.println(jenisBunga);
        //test case 10
        jenisBunga = irisClassifier.predict(6.1, 2.8, 4.0, 1.3);
        System.out.println(jenisBunga);
        //test case 11
        jenisBunga = irisClassifier.predict(5.7, 2.8, 4.1, 1.3);
        System.out.println(jenisBunga);
        //test case 12
        jenisBunga = irisClassifier.predict(5.6, 3.0, 4.1, 1.3);
        System.out.println(jenisBunga);
        //test case 13
        jenisBunga = irisClassifier.predict(6.1, 2.6, 5.6, 1.4);
        System.out.println(jenisBunga);
        //test case 14
        jenisBunga = irisClassifier.predict(6.0, 2.2, 5.0, 1.5);
        System.out.println(jenisBunga);
        //test case 15
        jenisBunga = irisClassifier.predict(6.3, 2.2, 5.0, 1.5);
        System.out.println(jenisBunga);
        //test case 16
        jenisBunga = irisClassifier.predict(7.2, 3.0, 5.8, 1.6);
        System.out.println(jenisBunga);
        //test case 17
        jenisBunga = irisClassifier.predict(4.9, 2.5, 4.5, 1.7);
        System.out.println(jenisBunga);
        //test case 18
        jenisBunga = irisClassifier.predict(6.2, 2.8, 4.8, 1.8);
        System.out.println(jenisBunga); 
        
        
        System.out.println("---------------------------------------------------");
         
        
        CustomerPredictor customerPredictor = new CustomerPredictor();
        
        boolean potensiMenjadiCostumer;
          
        //test case 1
        potensiMenjadiCostumer = customerPredictor.predict(0, 0, 0);
        System.out.println(potensiMenjadiCostumer); 
        
        //test case 2
        potensiMenjadiCostumer = customerPredictor.predict(0, 0, 1);
        System.out.println(potensiMenjadiCostumer);   
        
        //test case 3
        potensiMenjadiCostumer = customerPredictor.predict(0, 1, 0);
        System.out.println(potensiMenjadiCostumer);        
        
        //test case 4
        potensiMenjadiCostumer = customerPredictor.predict(0, 1, 1);
        System.out.println(potensiMenjadiCostumer);        
        
        //test case 5
        potensiMenjadiCostumer = customerPredictor.predict(1, 0, 0);
        System.out.println(potensiMenjadiCostumer);        
        
        //test case 6
        potensiMenjadiCostumer = customerPredictor.predict(1, 0, 1);
        System.out.println(potensiMenjadiCostumer);        
        
        //test case 7
        potensiMenjadiCostumer = customerPredictor.predict(1, 1, 0);
        System.out.println(potensiMenjadiCostumer);        
        
        //test case 8
        potensiMenjadiCostumer = customerPredictor.predict(1, 1, 1);
        System.out.println(potensiMenjadiCostumer);        
        
        //test case 9
        potensiMenjadiCostumer = customerPredictor.predict(2, 0, 0);
        System.out.println(potensiMenjadiCostumer);        
        
        //test case 10
        potensiMenjadiCostumer = customerPredictor.predict(2, 0, 1);
        System.out.println(potensiMenjadiCostumer);        
        
        //test case 11
        potensiMenjadiCostumer = customerPredictor.predict(2, 1, 0);
        System.out.println(potensiMenjadiCostumer);        
        
        //test case 12
        potensiMenjadiCostumer = customerPredictor.predict(2, 1, 1);
        System.out.println(potensiMenjadiCostumer);   
        
        
        System.out.println("---------------------------------------------------");
        
        
        NeuralNetwork neuralNetwork = new NeuralNetwork();
        
        double nilaiFungsiPiecewise;
        
        //test case 1
        nilaiFungsiPiecewise = neuralNetwork.funcPiecewiseLinear(0.802, 0.026, 0.240, 0.357, 0.639);
        System.out.println(nilaiFungsiPiecewise);
        
        //test case 2
        nilaiFungsiPiecewise = neuralNetwork.funcPiecewiseLinear(0.375, 0.620, 0.641, 0.663, 0.766);
        System.out.println(nilaiFungsiPiecewise);
        
        //test case 3
        nilaiFungsiPiecewise = neuralNetwork.funcPiecewiseLinear(0.641, 0.110, 0.614, 0.665, 0.448);
        System.out.println(nilaiFungsiPiecewise);
        
        //test case 4
        nilaiFungsiPiecewise = neuralNetwork.funcPiecewiseLinear(0.298, 0.016, 0.095, 0.601, 0.253);
        System.out.println(nilaiFungsiPiecewise);
        
        //test case 5
        nilaiFungsiPiecewise = neuralNetwork.funcPiecewiseLinear(0.119, 0.100, 0.255, 0.450, 0.072);
        System.out.println(nilaiFungsiPiecewise);
        
        //test case 6
        nilaiFungsiPiecewise = neuralNetwork.funcPiecewiseLinear(0.132, 0.082, 0.173, 0.572, 0.545);
        System.out.println(nilaiFungsiPiecewise);
        
        //test case 7
        nilaiFungsiPiecewise = neuralNetwork.funcPiecewiseLinear(0.912, 0.221, 0.297, 0.744, 0.638);
        System.out.println(nilaiFungsiPiecewise);
        
        //test case 8
        nilaiFungsiPiecewise = neuralNetwork.funcPiecewiseLinear(0.485, 0.127, 0.490, 0.079, 0.984);
        System.out.println(nilaiFungsiPiecewise);
        
        //test case 9
        nilaiFungsiPiecewise = neuralNetwork.funcPiecewiseLinear(0.345, 0.405, 0.959, 0.511, 0.834);
        System.out.println(nilaiFungsiPiecewise);
        
        //test case 10
        nilaiFungsiPiecewise = neuralNetwork.funcPiecewiseLinear(0.963, 0.099, 0.470, 0.194, 0.779);
        System.out.println(nilaiFungsiPiecewise);

        
        System.out.println("---------------------------------------------------");
        

        ColdDetector coldDetector = new ColdDetector(); 
        coldDetector.uji("F:\\tugas\\GUDEK\\tugas if then else\\testcases.txt");
        
        
        System.out.println("---------------------------------------------------");
        
           
        VehicleDetector detector = new VehicleDetector();
        
        detector.uji("F:\\tugas\\GUDEK\\VehicleDetector\\testcases.csv");
    
        
    }    
    
}
