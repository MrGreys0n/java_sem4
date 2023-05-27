package prac8.mediator;

public class SimleUser implements User {
    Chat chat;
    String name;

    public SimleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String messsage) {
        chat.sendMessage(messsage, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receiving message: " + message + ".");
    }
}
