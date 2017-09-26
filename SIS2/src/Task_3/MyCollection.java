package Task_3;

public interface MyCollection {
    public void add(int index);
    public void add (int index, int element);
    public void clear();
    public void reverse();
    public boolean contains(int o);
    public int get(int index);
    public int indexOf(int o);
    public void insertElementAt(int element, int index);
    public boolean isEmpty();
    public void removeAt(int index);
    public void remove(int element);
    public void removeAll(int element);

    public void set(int index, int element);
    public int size();
    public void sort();
    public int [] toArray();
    public String toString();
}
