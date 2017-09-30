package Task_3;

public class MyVector implements MyCollection {
    private int [] arr;
    private int [] arr1;
    private int size;

    public int getSize() {
        return arr.length;
    }

    public int[] getArr() {
        return arr;
    }

    public MyVector()
    {
        size = 0;
        arr = new int[0];
        arr1 = new int[0];
    }
    @Override
    public void add(int element) {
        add(size, element);
    }

    @Override
    public void add(int index, int element) {
        if (index >arr.length || index <0){ return;}

        arr1 = new int[size+1];

        for ( int i =0; i < index;i++)
        {
            arr1[i] = arr[i];
        }
        arr1[index] = element;
        for (int i = index+1; i < arr1.length; i++)
        {
            arr1[i] = arr[i-1];
        }
        arr = new int[arr1.length];
        arr = arr1.clone();
        size++;
    }

    @Override
    public String toString() {
        String array = "";
        for ( int i =0; i < arr.length; i ++)
        {
            array+= (arr[i] +" ");
        }
        return array;
    }

    @Override
    public void clear() {
      arr = new int[0];
      arr1 = new int[0];
        size = 0;
    }

    @Override
    public void reverse() {
        arr1 = new int[arr.length];
        for ( int i =0; i < arr.length; i ++)
        {
            arr1[i] = arr[arr.length-i-1];
        }
        arr = arr1.clone();
    }

    @Override
    public boolean contains(int o) {
        for ( int i =0 ; i < arr.length; i++){
            if (o == arr[i]) return true;
        }
        return false;
    }

    @Override
    public int get(int index) {
        return arr[index];
        }


    @Override
    public void set(int index, int element) {
        arr[index] = element;
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public void sort() {

    }

    @Override
    public int[] toArray() {
        return arr;
    }

    @Override
    public int indexOf(int o) {
        for ( int i = 0; i < arr.length; i ++)
        {
            if (arr[i] == o)
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insertElementAt(int element, int index) {
        add(element, index);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void removeAt(int index) {
        arr1 = new int[arr.length-1];
        for( int i = 0; i < index;i++)
        {
            arr1[i] = arr[i];
        }
        for( int i = index; i < arr1.length;i++)
        {
            arr1[i] = arr[i+1];
        }
        arr = new int[arr1.length];
        arr = arr1.clone();
    }

    @Override
    public void remove(int element) {
//        arr1 = new int[arr.length-1];
//        for ( int i =0; i < arr1.length; i ++){
//            arr1 [i] = arr[i];
//        }
//        arr = new int[arr1.length];
//        arr = arr1.clone();

            removeAt(this.indexOf(element));

    }

    @Override
    public void removeAll(int element) {
        while (indexOf(element) !=-1){
            removeAt(indexOf(element));
        }
    }
}
