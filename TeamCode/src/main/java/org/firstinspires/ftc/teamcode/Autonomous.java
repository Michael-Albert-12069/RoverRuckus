package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "Ryer - Auto. ", group = "Autonomous")
public class Autonomous extends LinearOpMode {
    private DcMotor Whatisleft;
    private DcMotor Therightway;


    @Override
    public void runOpMode() throws InterruptedException{
        Whatisleft=hardwareMap.dcMotor.get("left");
        Therightway=hardwareMap.dcMotor.get("right");
        Whatisleft.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();

        double drivePower= 2;
        double ZEROSPEED=0.00;

        Forward(1,5000);


    }
    public void Forward(double power, long time)throws InterruptedException {
        Whatisleft.setPower(power);
        Therightway.setPower(power);
    }

}
