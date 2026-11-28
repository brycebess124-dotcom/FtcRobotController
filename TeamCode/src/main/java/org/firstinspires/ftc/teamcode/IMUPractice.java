package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

@TeleOp
public class IMUPractice extends OpMode {
    TestBenchIMU bench = new TestBenchIMU();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        double heading = bench.getHeading();
        double motorSpeed = 1;
        bench.setMotorSpeed(motorSpeed);
        telemetry.addData("Heading", heading);
        if (heading < 0.5 && heading > -0.5) {
            bench.setMotorSpeed(0);
            bench.setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else if(heading < -0.5) {
            if (motorSpeed < 0){
                motorSpeed *= -1;
                bench.setMotorSpeed(motorSpeed);
            }
        }
        else if (heading > 0.5){
            if (motorSpeed > 0){
                motorSpeed *= -1;
                bench.setMotorSpeed(motorSpeed);
            }
        }
    }
}
/*
1. return the heading in radians instead of degrees.
2. When your heading is less than 0.5 and greater than -0.5 stop a motor. if it's less than -0/5,
make your motor positive and if it's greater than 0.5 make your motor negative.
 */