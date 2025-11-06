package SystemDesign.BehaviouralDesignPattern.MediatorPattern;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();

        User user1 = new UserImpl(chatMediator, "Sankalp");
        User user2 = new UserImpl(chatMediator, "Aman");
        User user3 = new UserImpl(chatMediator, "Priya");
        User user4 = new UserImpl(chatMediator, "Neha");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.send("Hi everyone!");
        System.out.println();
        user3.send("Hey Sankalp, how are you?");
    }
}
