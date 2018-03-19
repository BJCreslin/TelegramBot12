package TB;

import TB.config.ConfigCommand;
import TB.objects.MessageBotTextSingltone;
import TB.reactions.EchoSwitch;
import TB.reactions.Hello;
import TB.reactions.WeatherCommand;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    //    @Override
    public void onUpdateReceived(Update update) {
        String messageTextForAnswer = ""; //переменная, в которой будут содержаться ответы

        Message message = update.getMessage();
        // We check if the update has a message and the message has text
        if (message != null && message.hasText()) {
            // Set variables
            String message_text = update.getMessage().getText();

            if (ConfigCommand.isEchoAnswer()) {
                sendMsg(message, message_text);
            }

            // При запуске бота здороваемся
            if ("/start".equalsIgnoreCase(message_text)) {
                String messText = new Hello().execute();
                sendMsg(message, messText);
            }

            if (message_text.toLowerCase().startsWith("echo switch".toLowerCase())) {
                String messText = new EchoSwitch().execute();
                sendMsg(message, messText);
            }
            if (message_text.toLowerCase().startsWith("погода".toLowerCase())) {
                String messText = new WeatherCommand().execute();
                sendMsg(message, messText);
            }


            if (message_text.toLowerCase().equals("salam")) {
                messageTextForAnswer = "salam popolam";
            }

            if (message_text.toLowerCase().equals("привет")) {
                messageTextForAnswer = "salam popolam";
            }

            long chat_id = update.getMessage().getChatId();

            SendMessage message1 = new SendMessage() // Create a message object object
                    .setChatId(chat_id)
                    .setParseMode("HTML")
                    .setText(messageTextForAnswer);

            try {
                execute(message1); // Sending our message object to user
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

    private void sendMsg(Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        sendMessage.enableHtml(true);
        try {
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


    }
}