package TB;

import TB.config.ConfigCommand;
import TB.reactions.Hello;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    //    @Override
    public void onUpdateReceived(Update update) {
        String messageTextForAnswer = ""; //переменная, в которой будут содержаться ответы

        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
            String message_text = update.getMessage().getText();


            // При запуске бота здороваемся
            if ("/start".equalsIgnoreCase(message_text)) {
                messageTextForAnswer = Hello.helloMessage();
            }


            if (message_text.toLowerCase().equals("salam")) {
                messageTextForAnswer = "salam popolam";
            }

            if (message_text.toLowerCase().equals("привет")) {
                messageTextForAnswer = "salam popolam";
            }

            long chat_id = update.getMessage().getChatId();

            SendMessage message = new SendMessage() // Create a message object object
                    .setChatId(chat_id)
                    .setText(messageTextForAnswer);

            try {
                execute(message); // Sending our message object to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }


    //    @Override
    public String getBotUsername() {
        // Return bot username
        // If bot username is @MyAmazingBot, it must return 'MyAmazingBot'
        // TODO
        return ConfigCommand.getBOTNAME();
    }

    @Override
    public String getBotToken() {
        // Return bot token from BotFather
        // TODO
        return ConfigCommand.getBotToken();
    }
}