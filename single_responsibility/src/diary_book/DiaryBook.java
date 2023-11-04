package diary_book;

import java.util.ArrayList;
import java.util.List;

public class DiaryBook {

    private List<DiaryEntry> diaryEntries = new ArrayList<>();

    private ErrorManger errorManger = new ErrorManger();

    public List<DiaryEntry> getDiaryEntries() {
        return diaryEntries;
    }

    public void saveDiaryEntry(DiaryEntry diaryEntry) {
        try {
            diaryEntries.add(diaryEntry);
        }
        catch (Exception ex) {
            errorManger.writeError(ex);
        }

    }

    public void remove(DiaryEntry diaryEntry) {
        try {
            diaryEntries.remove(diaryEntry);
        }
        catch (Exception ex) {
            errorManger.writeError(ex);
        }
    }

}
