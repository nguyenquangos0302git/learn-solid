package practice.after;

public class ExportDiaryBook {

    private ErrorManager errorManager = new ErrorManager();

    public void saveToFile(DiaryBook diaryBook) {
        try {
            System.out.println("Save DiaryBook to file");
        } catch (Exception e) {
            errorManager.logError(e);
        }

    }

}
