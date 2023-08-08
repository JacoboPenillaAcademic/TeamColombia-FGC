package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;


@TeleOp(name = "ServoTestV1")
public class ServoTestV1 extends LinearOpMode {

  private CRServo Servo;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    Servo = hardwareMap.get(CRServo.class, "Servo");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        while (gamepad1.right_trigger > 0) {
          Servo.setPower(1);
        }
      if (gamepad1.right_trigger <= 0.1) {
          Servo.setPower(0);
        }
        
      while (gamepad1.left_trigger > 0) {
          Servo.setPower(-1);
        }
      if (gamepad1.left_trigger <= 0.1) {
          Servo.setPower(0);
        }
      }
    }
  }
  
