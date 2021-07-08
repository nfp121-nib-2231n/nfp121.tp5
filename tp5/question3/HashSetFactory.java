package question3;

import java.util.Set;
import java.util.HashSet;

public class HashSetFactory<T> implements Factory<Set>,Comparable<Set>{
    
    public HashSet create()
    {
        return new HashSet();
    }
    

    public int compareTo(Set a)
    {
        return this.compareTo(a);
    }
    
}