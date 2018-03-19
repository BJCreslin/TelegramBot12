package TB.reactions;

import TB.config.ConfigCommand;
import TB.objects.MessageBotTextSingltone;

public class EchoSwitch implements Comandable {
    public String execute() {
        ConfigCommand.setEchoAnswer(!ConfigCommand.isEchoAnswer());
        MessageBotTextSingltone.setText("Echo is " + ConfigCommand.isEchoAnswer());
        return "Echo is " + ConfigCommand.isEchoAnswer();
    }
}
