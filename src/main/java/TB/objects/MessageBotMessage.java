package TB.objects;

public class MessageBotMessage {
    public MessageBotMessage(String resultCommandMessage) {
        this.text = resultCommandMessage;
    }

    public String getText() {
        return text;
    }

    public void setResultCommandMessage() {
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;
}
