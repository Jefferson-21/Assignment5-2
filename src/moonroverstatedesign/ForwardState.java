/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonroverstatedesign;

/**
 *
 * @author jeyarajjeyakumar
 */
public class ForwardState extends State {

    ForwardState() {
        this.name = "Move Forward";
        this.subState = "Accelerate";
    }

    public Boolean pressRightPedal(int numOfTimesPressed) {
        Boolean move = false;
        switch (numOfTimesPressed) {
            case 2:
                if(this.subState != "Accelerate" && this.subState != "Decelerate") {
                    System.out.println("Error: Can only press Right Pedal twice when in Accelerate or Decelerate States.\nUnable to move.");
                } else if(this.subState == "Accelerate") {
                    System.out.println("Transitioning from Accelerate State to Decelerate State...");
                    this.subState = "Decelerate";
                } else {
                    System.out.println("Transitioning from Decelerate State to Accelerate State...");
                    this.subState = "Accelerate";
                }
                break;
            case 3:
                if(this.subState != "Decelerate") {
                    System.out.println("Error: Can only press Right Pedal thrice when in Decelerate State.\nUnable to move.");
                } else {
                    System.out.println("Transitioning from Decelerate State to At Rest State...");
                    this.subState = null;
                    move = true;
                }
                break;
            default:
                System.out.println("Error: Must press Right Pedal twice or thrice when in Move Forward State.\nUnable to move.");
                break;
        }
        return move;
    }

    protected void pressRightPedalForTime(int numOfSecondsPressed) {
        switch (numOfSecondsPressed) {
            case 3:
                if(this.subState != "Decelerate" && this.subState != "Constant Speed") {
                    System.out.println("Error: Can only press Right Pedal for 3 seconds when in Constant Speed or Decelerate States.\nUnable to move.");
                } else if(this.subState == "Decelerate") {
                    System.out.println("Transitioning from Decelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Transitioning from Constant Speed State to Decelerate State...");
                    this.subState = "Decelerate";
                } 
                break;
            case 5:
                if(this.subState != "Accelerate" && this.subState != "Constant Speed") {
                    System.out.println("Error: Can only press Right Pedal for 5 seconds when in Constant Speed or Accelerate States.\nUnable to move.");
                } else if(this.subState == "Accelerate") {
                    System.out.println("Transitioning from Accelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Transitioning from Constant Speed State to Accelerate State...");
                    this.subState = "Accelerate";
                }
                break;
            default:
                System.out.println("Error: Must press Right Pedal for 3 or 5 seconds when in Move Forward State.\nUnable to move.");
                break;
        }
    }
    
}
