import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedList;

public class Main {

    static ArrayDeque<HeavyBox> ad = new ArrayDeque<>();
    static LinkedList<HeavyBox> ll = new LinkedList<>();

    public static void main(String[] args) {
        //Task 5
        //fill(5, ad);
        //showAndRemove(ad);
        //Task 6
        fill(5, ll);
        System.out.println(test(ll));
        System.out.println(ll);

    }
    public static LinkedList<HeavyBox> test(LinkedList<HeavyBox> name){
        LinkedList<HeavyBox> result = new LinkedList<>();
        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).getWeight() > 300.0001){
                result.add(name.get(i));
                name.remove(i);
            }
        }
        return result;
    }
    public static void showAndRemove(ArrayDeque<HeavyBox> name){
        while (name.peek() != null) System.out.println(name.poll());
    }
    public static void fill(int quantity, Collection<HeavyBox> name){
        for (int i = 0; i < quantity; i++){
            name.add(new HeavyBox());
        }
    }
}
