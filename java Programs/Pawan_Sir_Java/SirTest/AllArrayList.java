import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class AllArrayList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // 1. Append the specified element to the end of a linked list
        list.add("Grapes");
        System.out.println("After appending: " + list);

        // // 2. Iterate through all elements in a linked list
        // System.out.println("Iterating through all elements:");
        // for (String item : list) {
        //     System.out.println(item);
        // }

        // // 3. Iterate through all elements in a linked list starting at the specified
        // // position
        // System.out.println("Iterating from position 2:");
        // Iterator<String> iterator = list.listIterator(2);
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // // 4. Iterate a linked list in reverse order
        // System.out.println("Iterating in reverse order:");
        // Iterator<String> reverseIterator = list.descendingIterator();
        // while (reverseIterator.hasNext()) {
        //     System.out.println(reverseIterator.next());
        // }

        // // 5. Insert the specified element at the specified position in the linked list
        // list.add(1, "Pineapple");
        // System.out.println("After inserting at position 1: " + list);

        // // 6. Insert elements into the linked list at the first and last positions
        // list.addFirst("Mango");
        // list.addLast("Kiwi");
        // System.out.println("After inserting at first and last: " + list);

        // // 7. Insert the specified element at the front of a linked list
        // list.addFirst("Strawberry");
        // System.out.println("After inserting at front: " + list);

        // // 8. Insert the specified element at the end of a linked list
        // list.addLast("Blueberry");
        // System.out.println("After inserting at end: " + list);

        // // 9. Insert some elements at the specified position into a linked list
        // LinkedList<String> newList = new LinkedList<>();
        // newList.add("Papaya");
        // newList.add("Peach");
        // list.addAll(2, newList);
        // System.out.println("After inserting a list at position 2: " + list);

        // // 10. Get the first and last occurrence of specified elements in a linked list
        // System.out.println("First element: " + list.getFirst());
        // System.out.println("Last element: " + list.getLast());

        // // 11. Display elements and their positions in a linked list
        // System.out.println("Elements with positions:");
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println("Position " + i + ": " + list.get(i));
        // }

        // // 12. Remove a specified element from a linked list
        // list.remove("Orange");
        // System.out.println("After removing 'Orange': " + list);

        // // 13. Remove the first and last elements from a linked list
        // list.removeFirst();
        // list.removeLast();
        // System.out.println("After removing first and last elements: " + list);

        // // 14. Remove all elements from a linked list
        // LinkedList<String> tempList = new LinkedList<>(list); // To preserve original list
        // tempList.clear();
        // System.out.println("After clearing the list: " + tempList);

        // // 15. Swap two elements in a linked list
        // Collections.swap(list, 0, 2);
        // System.out.println("After swapping elements at positions 0 and 2: " + list);

        // // 16. Shuffle elements in a linked list
        // Collections.shuffle(list);
        // System.out.println("After shuffling: " + list);

        // // 17. Join two linked lists
        // LinkedList<String> anotherList = new LinkedList<>();
        // anotherList.add("Lemon");
        // anotherList.add("Coconut");
        // list.addAll(anotherList);
        // System.out.println("After joining another list: " + list);

        // // 18. Copy a linked list to another linked list
        // LinkedList<String> copiedList = new LinkedList<>(list);
        // System.out.println("Copied list: " + copiedList);

        // // 19. Remove and return the first element of a linked list
        // String firstElement = list.poll();
        // System.out.println("Removed first element: " + firstElement);
        // System.out.println("List after removal: " + list);

        // // 20. Retrieve, but not remove, the first and last element of a linked list
        // System.out.println("First element: " + list.peekFirst());
        // System.out.println("Last element: " + list.peekLast());

        // // 21. Check if a particular element exists in a linked list
        // System.out.println("Does the list contain 'Banana'? " + list.contains("Banana"));

        // // 22. Convert a linked list to an array list
        // System.out.println("Array List: " + new LinkedList<>(list));

        // // 23. Compare two linked lists
        // LinkedList<String> compareList = new LinkedList<>();
        // compareList.add("Apple");
        // compareList.add("Banana");
        // System.out.println("Lists are equal: " + list.equals(compareList));

        // // 24. Check if a linked list is empty or not
        // System.out.println("Is the list empty? " + list.isEmpty());

        // 25. Replace an element in a linked list
        // list.set(0, "Guava");
        // System.out.println("After replacing element at position 0: " + list);
    }
}
