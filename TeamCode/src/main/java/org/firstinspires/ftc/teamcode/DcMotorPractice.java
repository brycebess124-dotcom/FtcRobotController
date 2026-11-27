package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench1;

@TeleOp
public class DcMotorPractice extends OpMode {
    TestBench1 bench = new TestBench1();
    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;

        bench.setMotorSpeed(motorSpeed);

        if(gamepad1.a) {
            bench.setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else if(gamepad1.b) {
            bench.setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior.FLOAT) ;
        telemetry.addData("Motor Revs", bench.getMotorRevs());
    }
}

/*
1. add a method on test bench that allows you to change the brake behavior from opmode. On A pressed, set break, on B pressed, set float.
 */