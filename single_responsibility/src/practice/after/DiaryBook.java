package practice.after;

import java.util.ArrayList;
import java.util.List;

public class DiaryBook {

    private List<DiaryEntry> diaryEntries = new ArrayList<>();
    private ErrorManager errorManager = new ErrorManager();

    public void addDiaryEntry(DiaryEntry diaryEntry) {
        try {
            diaryEntries.add(diaryEntry);
        } catch (Exception e) {
            errorManager.logError(e);
        }

    }

    public void removeDiaryEntry(DiaryEntry diaryEntry) {
        try {
            diaryEntries.remove(diaryEntry);
        } catch (Exception e) {
            errorManager.logError(e);
        }

    }

    public List<DiaryEntry> getAllDiaryEntry() {
        return diaryEntries;
    }

}
