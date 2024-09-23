package practice.after;

public class FilterByName implements ICriteriaFilter<FileItem> {

    private String name;

    public FilterByName(String name) {
        this.name = name;
    }

    @Override
    public boolean isMatchCriteria(FileItem target) {
        return target.getName().equals(name);
    }

}
