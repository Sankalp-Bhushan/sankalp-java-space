package SystemDesign.BehaviouralDesignPattern.CommandPattern;

public class Main {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Concrete commands
        Command turnOn = new TurnOnCommand(livingRoomLight);
        Command turnOff = new TurnOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Execute commands dynamically
        System.out.println(">>> Pressing ON button:");
        remote.setCommand(turnOn);
        remote.pressButton();

        System.out.println("\n>>> Pressing OFF button:");
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}