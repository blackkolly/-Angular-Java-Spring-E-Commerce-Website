package MyCar;

public class Car {
    private int speed = 0;
    private int gear = 0;
    public void SpeedUp(int increment){
        speed = speed + increment;
    }
    public void SpeedDown(int decrement){
        speed = speed - decrement;
    }
    public void ApplyBrake(int newValue){
        gear = newValue;
    }public void Stop(int newValue){
        gear = newValue;
    }void printState(){
        System.out.println("I love this speed at:"+ speed + "Be careful with the gear at:"+ gear);
    }


}
