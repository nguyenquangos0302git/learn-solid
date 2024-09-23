package practice.after;

import java.util.List;
import java.util.stream.Collectors;

public class FileFilter implements IFilter<FileItem> {
    @Override
    public List<FileItem> filter(List<FileItem> targets, ICriteriaFilter<FileItem> criteriaFilter) {
        return targets.stream().filter(criteriaFilter::isMatchCriteria).collect(Collectors.toList());
    }
}
