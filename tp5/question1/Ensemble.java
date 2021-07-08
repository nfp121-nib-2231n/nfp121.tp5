package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
        return table.size();
    }

    public Iterator<T> iterator() {
        return table.iterator();
    }

    public boolean add(T t) {
        return table.add(t);
    }

    public Ensemble<T> union(Ensemble<? extends T> e) {
        Ensemble<T> e1=this;
        Set<T> set = new HashSet<T>();

        set.addAll(e1);
        set.addAll(e);
        e1.clear();
        e1.addAll(set);

        return e1;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
        Ensemble<T> e1=this;
        e1.retainAll(e);
        return e1;
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
        Ensemble<T> e1=this;
        e1.union(e).removeAll(e);
        return e1;
    }

    Ensemble<T> diffSym(Ensemble<? extends T> e) {
        Ensemble<T> e1=this;
        Ensemble<T> e2=this;
        e2.inter(e);
        e1.union(e);
        e1.removeAll(e2);
        return e1;
    }
    
}
