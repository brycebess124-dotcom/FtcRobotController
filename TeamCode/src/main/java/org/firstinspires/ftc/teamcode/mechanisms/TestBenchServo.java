package org.firstinspires.ftc.teamcode.mechanisms;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class TestBenchServo {
    private Servo servoPos;
    private CRServo servoRot;

    public void init(HardwareMap hwMap) {
        servoPos = hwMap.get(Servo.class, "servo_pos");
        servoRot = hwMap.get(CRServo.class, "servo_rot:");
        servoPos.scaleRange(0.5, 1.0);
        servoPos.setDirection(Servo.Direction.REVERSE);
        servoRot.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void setServoPos(double angle) {
        servoPos.setPosition(angle);
    }

    public void setServoRot(double rightTrigger) {
        double power = gamepad1.left_trigger;
        servoRot.setPower(power);
    }
}

/*
1. Set your CR to reverse its direction.
2. Set your op mode so when you pull the left gamepad trigger, it sets the position of the pos servo and when you pull the
right gamepad trigger, 0 is off and 1 is fully on.
 */