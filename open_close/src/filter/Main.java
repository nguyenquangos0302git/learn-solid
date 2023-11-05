package filter;

import filter.core.IFilter;
import filter.core.impl.FileFilter;
import filter.core.impl.FileNameCriteriaFilter;
import filter.model.FileCriteria;
import filter.model.FileItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FileItem> fileItems = getFileItems();

        FileCriteria fileCriteria = new FileCriteria();
        fileCriteria.setNameFilter("Java");

        IFilter<FileItem, FileCriteria> iFilter = new FileFilter();
        List<FileItem> fileItemsAfterFilter = new ArrayList<>();

        if (fileCriteria.getNameFilter() != null) {
            fileItemsAfterFilter = iFilter.filter(fileItems, new FileNameCriteriaFilter(), fileCriteria);
        }

        System.out.println(fileItemsAfterFilter);
    }

    private static List<FileItem> getFileItems() {
        List<FileItem> fileItems = new ArrayList<>();

        FileItem fileFirst = new FileItem("Java", "java", "1MB");
        FileItem fileSecond = new FileItem("JavaScript", "js", "5MB");
        FileItem fileThird = new FileItem("GoLang", "go","2MB");
        FileItem fileFourth = new FileItem("Text", "txt","3MB");
        FileItem fileFifth = new FileItem("PDF", "pdf","4MB");
        fileItems.add(fileFirst);
        fileItems.add(fileSecond);
        fileItems.add(fileThird);
        fileItems.add(fileFourth);
        fileItems.add(fileFifth);

        return fileItems;
    }

}
