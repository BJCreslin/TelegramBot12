package TB.config;

public class ConfigCommand {
    final static private String BotToken = "456915279:AAGoXpOfvd_uSa8pY-x0-wLBqM8EeW_jTX4";
    final static private String BOTNAME = "BJCallBote";


    /**
     * эхо ответ. По умолчанию включен.
     */

    static private boolean echoAnswer = true;

    public static boolean isEchoAnswer() {
        return echoAnswer;
    }

    public static void setEchoAnswer(boolean echoAnswer) {
        ConfigCommand.echoAnswer = echoAnswer;
    }




    public static String getBOTNAME() {

        return BOTNAME;
    }

    public static String getBotToken() {
        return BotToken;
    }
}
