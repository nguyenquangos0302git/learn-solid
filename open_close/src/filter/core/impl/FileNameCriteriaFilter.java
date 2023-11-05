package filter.core.impl;

import filter.core.ICriteriaFilter;
import filter.model.FileCriteria;
import filter.model.FileItem;

public class FileNameCriteriaFilter implements ICriteriaFilter<FileItem, FileCriteria> {

    @Override
    public boolean isMatch(FileItem fileItem, FileCriteria filter) {
        return fileItem.getName().equals(filter.getNameFilter());
    }
}
