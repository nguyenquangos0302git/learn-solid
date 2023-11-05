package filter.core;

import java.util.List;

public interface IFilter<T, D> {

    List<T> filter(List<T> items, ICriteriaFilter<T, D> iCriteriaFilter, D condition);

}
