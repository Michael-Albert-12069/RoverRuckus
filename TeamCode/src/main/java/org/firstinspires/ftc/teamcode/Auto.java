package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Michael - Auto A", group = "Autonomous")

public class Auto extends LinearOpMode {
    private DcMotor LeftMotor;
    private DcMotor RightMotor;


    @Override
    public void runOpMode() throws InterruptedException{
        LeftMotor=hardwareMap.dcMotor.get("left");
        RightMotor=hardwareMap.dcMotor.get("left");
        LeftMotor.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();

        double drivePower=-0.5;
        double ZEROSPEED=0.00;

        Forward(1,1000);


    }
    public void Forward(double power, long time)throws InterruptedException {
        LeftMotor.setPower(power);
        RightMotor.setPower(power);
    }

}
