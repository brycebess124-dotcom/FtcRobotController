package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBenchDistance {
    private DistanceSensor distance;

    public void init(HardwareMap hwMap){
        distance = hwMap.get(DistanceSensor.class, "sensor_distance");
    }
}
