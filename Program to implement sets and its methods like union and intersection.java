import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        // Creating two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements to the sets
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Displaying the sets
        displaySet("Set 1:", set1);
        displaySet("Set 2:", set2);

        // Performing union of sets
        Set<Integer> unionSet = union(set1, set2);
        displaySet("Union Set:", unionSet);

        // Performing intersection of sets
        Set<Integer> intersectionSet = intersection(set1, set2);
        displaySet("Intersection Set:", intersectionSet);
    }

    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    private static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    private static void displaySet(String label, Set<Integer> set) {
        System.out.print(label + " ");
        for (int element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
