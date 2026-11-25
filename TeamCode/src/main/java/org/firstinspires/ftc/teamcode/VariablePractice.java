package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init(){
        int teamNumber = 23014;
        double motorspeed = 0.75;
        boolean clawClosed = true;
        String name = "The Marinators";
        int motorAngle = 79;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("motor speed", motorspeed);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("Name", name);

    }

    @Override
    public void loop(){
        /*
        1. change the string name to team name.
        2. create an int variable called "motorAngle" and store an angle between 0-180. Display this in the init method.
         */
    }
}
