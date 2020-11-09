package enumerator_Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnumerationIterator implements Iterator{
    Enumeration enumeration;
    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public boolean next() {
     return  enumeration.nextElement();
    }

    @Override
    public void remove() {
    throw  new UnsupportedOperationException("There is no support for delete Method");
    }
}
