package practice.before;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileItem fileItem1 = new FileItem("test1", "jpg", 1000);
        FileItem fileItem2 = new FileItem("test2", "png", 2000);
        FileItem fileItem3 = new FileItem("test3", "jpeg", 3000);
        FileItem fileItem4 = new FileItem("test4", "txt", 4000);
        FileItem fileItem5 = new FileItem("test5", "csv", 5000);
        FileItem fileItem6 = new FileItem("test6", "pom", 6000);
        FileItem fileItem7 = new FileItem("test7", "xml", 7000);
        FileItem fileItem8 = new FileItem("test8", "png", 8000);
        FileItem fileItem9 = new FileItem("test9", "iml", 9000);
        FileItem fileItem10 = new FileItem("test10", "java", 10000);

        List<FileItem> fileItems = Arrays.asList(fileItem1, fileItem2, fileItem3, fileItem4, fileItem5, fileItem6, fileItem7, fileItem8, fileItem9, fileItem10);

        List<FileItem> filterByName = new FileFilter().filterByName(fileItems, "test1");
        List<FileItem> filterByType = new FileFilter().filterByType(fileItems, "jpeg");
        List<FileItem> filterBySize = new FileFilter().filterBySize(fileItems, 9000);

    }

}
