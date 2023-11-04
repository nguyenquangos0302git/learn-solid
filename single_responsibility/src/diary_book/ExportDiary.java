package diary_book;

public class ExportDiary {

    public void exportConsole(DiaryBook diaryBook) {
        diaryBook
                .getDiaryEntries()
                .forEach(diaryEntry -> System.out.println(diaryEntry.getId() + " " + diaryEntry.getTitle() + " " + diaryEntry.getContext() + " " + diaryEntry.getLocalDateTime()));
    }

}
