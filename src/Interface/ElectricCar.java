package Interface;

public class ElectricCar implements Car {
    int speed = 0;
    int gear = 0;

    public void SpeedUp(int increment) {
        speed = speed + increment;
    }

    public void SpeedDown(int decrement) {
        speed = speed - decrement;
    }

    public void ApplyBrake(int newValue) {
        gear = newValue;
    }

    public void Stop(int newValue) {
        gear = newValue;
    }

    void printState() {
        System.out.println("I love this speed at:" + speed + "Be careful with the gear at:" + gear);
    }

    public static void main(String[] args) {
        //creating two differents Car objects
        ElectricCar motor1 = new ElectricCar();
        ElectricCar motor2 = new ElectricCar();
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

