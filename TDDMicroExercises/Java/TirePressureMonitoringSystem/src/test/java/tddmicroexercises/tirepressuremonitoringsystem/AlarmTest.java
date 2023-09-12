package tddmicroexercises.tirepressuremonitoringsystem;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AlarmTest {
    @Mock
    private Sensor sensor;

    @Test
    @DisplayName("Alarm should be off by default")
    void alarmShouldBeOffByDefault() {
        Alarm alarm = new Alarm(sensor);
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    @DisplayName("Alarm should be on when pressure is lower than the low pressure threshold")
    void alarmShouldBeOnWhenPressureIsLowerThanTheLowPressureThreshold() {
        Alarm alarm = new Alarm(sensor);
        when(sensor.popNextPressurePsiValue()).thenReturn(16.0);
        alarm.check();

        assertTrue(alarm.isAlarmOn());
    }
}
