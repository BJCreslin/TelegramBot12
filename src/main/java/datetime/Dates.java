package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Dates {
    LocalDateTime localDateTime;

    public Dates() {
        localDateTime = LocalDateTime.now(ZoneId.systemDefault());
    }

    public LocalDateTime getDate() {
        return localDateTime;
    }
}
