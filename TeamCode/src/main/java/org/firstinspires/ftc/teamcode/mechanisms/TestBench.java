package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    private DigitalChannel touchSensor;

    public void init(HardwareMap hwMap){
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }

    public boolean isTouchSensorPressed(){
        return !touchSensor.getState();
    }

    public boolean isTouchSensorReleased(){

        return touchSensor.getState();
    }
}

/*
1. Create a new "getter" method in you testBench class called "isTouchSensorReleased return true if the touch sensor is NOT being pressed.
2. In telemetry OpMode. have telemetry state "pressed" and "not pressed" instead of true/false respectively
 */