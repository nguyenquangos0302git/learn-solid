package practice.after;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DiaryEntry first1 = new DiaryEntry(1L, "test1", LocalDateTime.now(), "test1");
        DiaryEntry first2 = new DiaryEntry(2L, "test2", LocalDateTime.now(), "test2");
        DiaryEntry first3 = new DiaryEntry(3L, "test3", LocalDateTime.now(), "test3");
        DiaryEntry first4 = new DiaryEntry(4L, "test4", LocalDateTime.now(), "test4");
        DiaryEntry first5 = new DiaryEntry(5L, "test5", LocalDateTime.now(), "test5");
        DiaryEntry first6 = new DiaryEntry(6L, "test6", LocalDateTime.now(), "test6");
        DiaryEntry first7 = new DiaryEntry(7L, "test7", LocalDateTime.now(), "test7");

        DiaryBook diaryBook = new DiaryBook();
        diaryBook.addDiaryEntry(first1);
        diaryBook.addDiaryEntry(first2);
        diaryBook.addDiaryEntry(first3);
        diaryBook.addDiaryEntry(first4);
        diaryBook.addDiaryEntry(first5);
        diaryBook.addDiaryEntry(first6);
        diaryBook.addDiaryEntry(first7);

        List<DiaryEntry> diaryEntryList = diaryBook.getAllDiaryEntry();
        diaryBook.removeDiaryEntry(first1);
        diaryEntryList.forEach(diaryEntry -> System.out.println(diaryEntry.getContent()));
    }

}
