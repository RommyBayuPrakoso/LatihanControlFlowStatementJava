
package alarmsystem;

public class Alarm {
    public boolean isAlarmStatusWarning(double suhuYangDideteksiSensorSuhu, boolean statusSensorAsap, boolean statusSensorWaterDetection) {
        
        boolean statusAlarmWarning = false;
        
        if ( suhuYangDideteksiSensorSuhu > 55.5 || statusSensorAsap == true || statusSensorWaterDetection == true)
            statusAlarmWarning = true;
        
        return statusAlarmWarning;
        
    }
}
