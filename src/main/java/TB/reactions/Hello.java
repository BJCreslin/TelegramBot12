package TB.reactions;

import TB.objects.MessageBotMessage;
import TB.objects.MessageBotTextSingltone;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

/**
 * Класс для формирования приветствий
 */
public class Hello implements Comandable {


    /**
     * ПРиветствие при команде /start
     * TODO
     *
     * @return
     */


    public String execute() {
        MessageBotTextSingltone.setText("<b>ПРивет. Это просто бот</b>");
        return "<b>ПРивет. Это просто бот</b> \n" +
                "для смены эхо режима наберите - echo switch\n" +
                "Что бы узнать погоду наберите - Погода\n" +
                "Для даты- дата";
    }
}


