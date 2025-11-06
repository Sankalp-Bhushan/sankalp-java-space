package SystemDesign.BehaviouralDesignPattern.CommandPattern;

public class RemoteControl {
    private Command command;

    // setCommand acts as an invoker
    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("❌ No command set on remote");
        }
    }
}
