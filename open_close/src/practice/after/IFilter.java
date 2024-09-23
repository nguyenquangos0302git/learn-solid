package practice.after;

import java.util.List;

public interface IFilter<T> {

    List<T> filter(List<T> targets, ICriteriaFilter<T> criteriaFilter);

}
