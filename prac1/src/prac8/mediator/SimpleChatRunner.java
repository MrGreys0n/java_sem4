package prac8.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimleUser(chat, "User 1");
        User user2 = new SimleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("I'm user 1");
        admin.sendMessage("Roger that. I'm admin");
    }
}
