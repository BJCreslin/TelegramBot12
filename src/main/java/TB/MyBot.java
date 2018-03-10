package TB;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
//    @Override
    public void onUpdateReceived(Update update) {
            // We check if the update has a message and the message has text
            if (update.hasMessage() && update.getMessage().hasText()) {
                // Set variables
                String message_text = update.getMessage().getText();
                if (message_text.toLowerCase().equals("salam")){message_text="salam popolam";}
                long chat_id = update.getMessage().getChatId();

                SendMessage message = new SendMessage() // Create a message object object
                        .setChatId(chat_id)
                        .setText(message_text);

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
        return Myconstant.getBOTNAME();
    }

    @Override
    public String getBotToken() {
        // Return bot token from BotFather
        // TODO
        return new Myconstant().getBotToken();
    }
}