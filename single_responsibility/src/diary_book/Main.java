package diary_book;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        DiaryBook diaryBook = new DiaryBook();

        DiaryEntry pageOne = new DiaryEntry("1", "Java Head First", "Learn Method", LocalDateTime.now());
        DiaryEntry pageSecond = new DiaryEntry("2", "JavaScript Head First", "Learn Method", LocalDateTime.now());
        DiaryEntry pageThird = new DiaryEntry("3", "Ruby Head First", "Learn Method", LocalDateTime.now());

        diaryBook.saveDiaryEntry(pageOne);
        diaryBook.saveDiaryEntry(pageSecond);
        diaryBook.saveDiaryEntry(pageThird);


        System.out.println(diaryBook.getDiaryEntries());
        diaryBook.remove(pageSecond);

        ExportDiary exportDiary = new ExportDiary();
        exportDiary.exportConsole(diaryBook);

    }

}
