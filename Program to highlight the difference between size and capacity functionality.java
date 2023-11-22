import java.util.ArrayList;
public class SizeVsCapacity {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        displaySizeAndCapacity(list);

        // Adding more elements to exceed the initial capacity
        list.add(40);
        list.add(50);

        // Displaying size and capacity after exceeding initial capacity
        displaySizeAndCapacity(list);

        // Ensuring a specific capacity using ensureCapacity
        list.ensureCapacity(10);

        // Displaying size and capacity after ensuring capacity
        displaySizeAndCapacity(list);
    }
    private static void displaySizeAndCapacity(ArrayList<Integer> list) {
        System.out.println("Size: " + list.size());
        System.out.println("Capacity: " + getCapacity(list));
        System.out.println("--------------------");
    }
    private static int getCapacity(ArrayList<?> list) {
        try {
            java.lang.reflect.Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
            return ((Object[]) field.get(list)).length;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
