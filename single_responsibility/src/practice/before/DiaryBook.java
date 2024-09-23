package practice.before;

import java.util.ArrayList;
import java.util.List;

public class DiaryBook {

    private List<DiaryEntry> diaryEntries = new ArrayList<>();

    public void addDiaryEntry(DiaryEntry diaryEntry) {
        try {
            diaryEntries.add(diaryEntry);
        } catch (Exception e) {
            logError(e);
        }

    }

    public void removeDiaryEntry(DiaryEntry diaryEntry) {
        try {
            diaryEntries.remove(diaryEntry);
        } catch (Exception e) {
            logError(e);
        }

    }

    public void saveToFile() {
        try {
            System.out.println("Save DiaryBook to file");
        } catch (Exception e) {
            logError(e);
        }

    }

    public List<DiaryEntry> getAllDiaryEntry() {
        return diaryEntries;
    }

    public void logError(Exception exception) {
        System.out.println("Error");
    }

}
