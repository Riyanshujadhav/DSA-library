import java.util.ArrayList;
import java.util.List;

public class _001_ {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        // size-->
        System.out.println(list.size());
        System.out.println(list);
        //element at index
        System.out.println(list.get(5));
        // replace-->
        list.set(5, 8);
        System.out.println(list);
        // add at index-->it shift all elements to right
        list.add(2, 0);
        System.out.println(list);
        // remove-->
        list.remove(4);
        System.out.println(list);
        list.add(23);
        System.out.println(list);
        // remove by value-->
        list.remove(Integer.valueOf(23));
        System.out.println(list);
        
    }
}
