package tddmicroexercises.tirepressuremonitoringsystem.somedependencies;

import tddmicroexercises.tirepressuremonitoringsystem.Alarm;
import tddmicroexercises.tirepressuremonitoringsystem.Sensor;

public class AnAlarmClient1
{
    // A class with the only goal of simulating a dependency on Alert
    // that has impact on the refactoring.

    private final Sensor sensor = new Sensor();
    public AnAlarmClient1()
    {
        Alarm anAlarm = new Alarm(sensor);
        anAlarm.check();
        boolean isAlarmOn = anAlarm.isAlarmOn();
    }
}
