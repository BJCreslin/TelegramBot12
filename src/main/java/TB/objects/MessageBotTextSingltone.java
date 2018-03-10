package TB.objects;

public enum MessageBotTextSingltone {
    INSTANCE;
    private static String text = "";

    public static String getText() {
        return text;
    }

    public static void setText(String text1) {
        text = text1;
    }
}
