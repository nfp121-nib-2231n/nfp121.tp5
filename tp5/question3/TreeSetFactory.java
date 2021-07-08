package question3;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetFactory<T> implements Factory<Set>,Comparable<Set>{

    public Set create()
    {
        return new TreeSet();
    }
    

    public int compareTo(Set a)
    {
        return this.compareTo(a);
    }
}
