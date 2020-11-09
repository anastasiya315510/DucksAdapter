package enumerator_Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IteratorToEnumeration implements Enumeration{
    Iterator iterator;

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public boolean nextElement() {
        return iterator.next();
    }
}
