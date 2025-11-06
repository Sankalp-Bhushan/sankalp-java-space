package SystemDesign.BehaviouralDesignPattern.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User sender) {
        for (User u : this.users) {
            // Do not send message to the sender itself
            if (u != sender) {
                u.receive(msg);
            }
        }
    }
}
