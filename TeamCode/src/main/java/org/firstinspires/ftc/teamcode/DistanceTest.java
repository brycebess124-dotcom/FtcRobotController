package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchDistance;

@TeleOp
public class DistanceTest extends OpMode {
    TestBenchDistance bench = new TestBenchDistance();
    double distance;

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        distance = bench.getDistance();
        telemetry.addData("Distance", bench.getDistance());

        if (distance < 10){
            telemetry.addLine("too close");
        }
    }
}
/*
1. print "too close" if your object is less than 10 cm away.
 */