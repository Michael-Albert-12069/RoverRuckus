// created by Daniel Perry on 10/21/2018 //

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
@TeleOp(name = "Danny - TeleOp A", group = "TeleOp")
public class Teleop extends LinearOpMode {
    private DcMotor Whatisleft;
    private DcMotor Therightway;

    @Override
    public void runOpMode() throws InterruptedException{
        Whatisleft=hardwareMap.dcMotor.get("left");
        Therightway=hardwareMap.dcMotor.get("right");
        Whatisleft.setDirection(DcMotor.Direction.REVERSE);


        waitForStart();
        while ((opModeIsActive())){

            while(gamepad1.a){
                Whatisleft.setPower(gamepad1.left_stick_y/1);
                Therightway.setPower(gamepad1.right_stick_y/1);
            }
            while(!gamepad1.a){
                Whatisleft.setPower(gamepad1.left_stick_y/2);
                Therightway.setPower(gamepad1.right_stick_y/2);
            }

            telemetry.update();
            idle();
        }

    }
}
