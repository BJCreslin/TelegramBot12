package TB.reactions;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

/**
 * Класс для формирования приветствий
 */
public class Hello {


    /**
     * ПРиветствие при команде /start
     * TODO
     *
     * @return
     */
    public static String helloMessage() {
        return "<b>ПРивет. Это просто бот</b>";

    }
}

