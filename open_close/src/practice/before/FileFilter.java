package practice.before;

import java.util.List;
import java.util.stream.Collectors;

public class FileFilter {

    public List<FileItem> filterByName(List<FileItem> fileItems, String name) {
        return fileItems.stream().filter(e -> e.getName().equals(name)).collect(Collectors.toList());
    }

    public List<FileItem> filterByType(List<FileItem> fileItems, String type) {
        return fileItems.stream().filter(e -> e.getType().equals(type)).collect(Collectors.toList());
    }

    public List<FileItem> filterBySize(List<FileItem> fileItems, int size) {
        return fileItems.stream().filter(e -> e.getSize() >= size && e.getSize() <= size).collect(Collectors.toList());
    }

}
