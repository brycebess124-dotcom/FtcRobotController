package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

public class TestBenchColor {
    NormalizedColorSensor colorSensor;

    public enum DetectedColor {
        RED,
        BLUE,
        YELLOW,
        UNKNOWN
    }

    public void init(HardwareMap hwMap) {
        colorSensor = hwMap.get(NormalizedColorSensor.class, "Sensor_color_distance");
    }

    public DetectedColor getDetectedCOlor() {
        NormalizedRGBA color = colorSensor.getNormalizedColors(); // returns 4 values

        float normRed, normGreen, normBlue;
        normRed = color.red / color.alpha;

    }
}
