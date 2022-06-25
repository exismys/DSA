package linked_list;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private class DLNode {
        int key;
        int value;
        DLNode prev;
        DLNode next;
    }

    private Map<Integer, DLNode> cache;
    private int capacity;
    private DLNode head;
    private DLNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new DLNode();
        tail = new DLNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            DLNode node = cache.get(key);
            moveToFront(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            DLNode node = cache.get(key);
            removeNode(node);
            cache.remove(key);
        }
        if (cache.size() == capacity) {
            cache.remove(tail.prev.key);
            removeNode(tail.prev);
        }
        DLNode node = new DLNode();
        node.key = key;
        node.value = value;
        addNode(node);
        cache.put(key, node);
    }

    // Creates a new node at the front
    private void addNode(DLNode node) {
        node.next = head.next;
        node.prev = head;
        node.next.prev = node;
        head.next = node;
    }

    // Removes the last node (least recently used node)
    private void removeNode(DLNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Moves a given node to the front
    private void moveToFront(DLNode node) {
        removeNode(node);
        addNode(node);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
    }
}
