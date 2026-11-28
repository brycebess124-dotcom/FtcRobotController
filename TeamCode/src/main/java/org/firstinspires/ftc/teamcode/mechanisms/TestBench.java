package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {

    private DigitalChannel touchSensor;
    private DcMotor motor;
    private double ticksPerRev;

    public void init(HardwareMap hwMap){
        //touch sensor code
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        // DC Motor
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();


    }

    public boolean isTouchSensorPressed(){
        return !touchSensor.getState();
    }

    public boolean isTouchSensorReleased(){

        return touchSensor.getState();
    }
    public void setMotorSpeed(double speed) {
        //accepts values from -1.0 to 1.0
        motor.setPower(speed);
    }

    public double getMotorRevs(){
        return motor.getCurrentPosition() / ticksPerRev * 2; // how many times the motor has spun since the last reset 2:1
    }

    public void setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior zeroBehaviour){
        motor.setZeroPowerBehavior(zeroBehaviour);

    }


}
