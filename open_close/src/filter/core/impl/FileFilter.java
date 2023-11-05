package filter.core.impl;

import filter.core.ICriteriaFilter;
import filter.core.IFilter;
import filter.model.FileCriteria;
import filter.model.FileItem;

import java.util.List;
import java.util.stream.Collectors;

public class FileFilter implements IFilter<FileItem, FileCriteria> {

    @Override
    public List<FileItem> filter(List<FileItem> items, ICriteriaFilter<FileItem, FileCriteria> iCriteriaFilter, FileCriteria condition) {
        return items
                .stream()
                .filter(item -> iCriteriaFilter.isMatch(item, condition))
                .collect(Collectors.toList());
    }
}
