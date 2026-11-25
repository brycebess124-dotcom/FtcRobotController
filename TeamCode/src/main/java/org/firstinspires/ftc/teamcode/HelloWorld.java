package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled //remove from robot controller for organization
@Autonomous
public class HelloWorld extends OpMode {

    @Override
    public void init(){
        telemetry.addData("Hello", "Bryce");
    }

    @Override
    public void loop() {

    }
}
