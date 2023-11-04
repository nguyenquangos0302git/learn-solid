package diary_book;

import java.time.LocalDateTime;

public class DiaryEntry {

    private String id;

    private String title;

    private String context;

    private LocalDateTime localDateTime;

    public DiaryEntry() {}

    public DiaryEntry(String id, String title, String context, LocalDateTime localDateTime) {
        this.id = id;
        this.title = title;
        this.context = context;
        this.localDateTime = localDateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
