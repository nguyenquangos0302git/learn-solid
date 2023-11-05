package filter.core;

public interface ICriteriaFilter<T, D> {

    boolean isMatch(T tclazz, D condition);

}
