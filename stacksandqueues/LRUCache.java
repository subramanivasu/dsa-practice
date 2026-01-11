package stacksandqueues;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {


        class Node {
        int key;
        int value;
        Node prev, next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    Map<Integer, Node> map;
    Node head;
    Node tail;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node val = map.get(key);
            remove(val);
            insertAtEnd(val);
            return val.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insertAtEnd(node);
        } else {
            if (map.size() == capacity) {
                Node lru = head.next;
                remove(lru);
                map.remove(lru.key);
            }

            Node node = new Node(key, value);
            map.put(key, node);
            insertAtEnd(node);
        }
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertAtEnd(Node node) {
        Node prev = tail.prev;
        prev.next = node;
        node.prev = prev;
        node.next = tail;
        tail.prev = node;
    }

}