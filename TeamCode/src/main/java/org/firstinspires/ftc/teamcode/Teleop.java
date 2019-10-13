// created by Daniel Perry on 10/21/2018 //

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
@TeleOp(name = "Danny - TeleOp A", group = "TeleOp")
public class Teleop extends LinearOpMode {
    private DcMotor LeftMotor;
    private DcMotor RightMotor;

    @Override
    public void runOpMode() throws InterruptedException{
        LeftMotor=hardwareMap.dcMotor.get("left");
        RightMotor=hardwareMap.dcMotor.get("right");
        LeftMotor.setDirection(DcMotor.Direction.REVERSE);


        waitForStart();
        while ((opModeIsActive())){

            while(gamepad1.a){
                LeftMotor.setPower(gamepad1.left_stick_y/1);
                RightMotor.setPower(gamepad1.right_stick_y/1);
            }
            while(!gamepad1.a){
                LeftMotor.setPower(gamepad1.left_stick_y/2);
                RightMotor.setPower(gamepad1.right_stick_y/2);
            }

            telemetry.update();
            idle();
        }

    }
}
