package practice.before;

import java.time.LocalDateTime;

public class DiaryEntry {

    private Long id;

    private String title;

    private LocalDateTime createdDate;

    private String content;

    public DiaryEntry() {
    }

    public DiaryEntry(Long id, String title, LocalDateTime createdDate, String content) {
        this.id = id;
        this.title = title;
        this.createdDate = createdDate;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
