package TB;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
public class Main {
    public static void main(String[] args) {
        // Инициализируем объекты Api
        ApiContextInitializer.init();

        // создаем экземпляр интерфейса- Telegram Bots API
        TelegramBotsApi botsApi = new TelegramBotsApi();

        // регистрируем бота в нашем экземпляре API
        try {
            botsApi.registerBot(new MyBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}