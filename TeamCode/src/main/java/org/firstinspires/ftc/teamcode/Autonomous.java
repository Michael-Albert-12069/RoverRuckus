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
        Therightway=hardwareMap.dcMotor.get("left");
        Whatisleft.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();

        double drivePower=-0.5;
        double ZEROSPEED=0.00;

        Forward(1,1000);


    }
    public void Forward(double power, long time)throws InterruptedException {
        Whatisleft.setPower(power);
        Therightway.setPower(power);
    }

}
