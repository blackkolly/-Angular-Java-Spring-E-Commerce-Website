package MyCar;

public class CarTest {
    public static void main(String[] args){
       //creating two differents Car objects
       Car motor1 = new Car();
       Car motor2 = new Car();
       //Invoke methods to the objects
       motor1.SpeedDown(34);
       motor1.SpeedUp(20);
       motor1.ApplyBrake(5);
       motor1.Stop(1);
       motor2.SpeedDown(90);
       motor2.SpeedDown(10);
       motor1.printState();
       motor2.printState();

    }

}
