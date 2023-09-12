package tddmicroexercises.tirepressuremonitoringsystem.somedependencies;

import tddmicroexercises.tirepressuremonitoringsystem.Alarm;
import tddmicroexercises.tirepressuremonitoringsystem.Sensor;

public class AnAlarmClient3
{
    // A class with the only goal of simulating a dependency on Alert
    // that has impact on the refactoring.

    private final Sensor sensor = new Sensor();
    private Alarm _anAlarm;

    public AnAlarmClient3()
    {
        _anAlarm = new Alarm(sensor);
    }

    public void DoSomething()
    {
        _anAlarm.check();
    }

    public void DoSomethingElse()
    {
        boolean isAlarmOn = _anAlarm.isAlarmOn();
    }
}
