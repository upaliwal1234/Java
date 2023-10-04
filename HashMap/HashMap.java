package HashMap;

import java.util.*;

public class HashMap<K, V> {

    class Node {
        K key;
        V value;
        Node next;

        public Node() {

        }

        public Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private int size;
    ArrayList<Node> ll;

    public HashMap() {
        this(4);
    }

    public HashMap(int n) {
        ll = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ll.add(null);
        }
    }

    public int hasfun(K key) {
        int bn = key.hashCode() % ll.size();
        if (bn < 0) {
            bn = bn + ll.size();
        }
        return bn;
    }

    public void put(K key, V value) {
        int idx = hasfun(key);
        Node temp = ll.get(idx);
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        Node nn = new Node();
        nn.key = key;
        nn.value = value;
        temp = ll.get(idx);
        nn.next = temp;
        ll.set(idx, nn);
        size++;
        double thf = 2.0;
        double lf = (1.0 * size) / ll.size();
        if (lf > thf) {
            rehashing();
        }
    }

    private void rehashing() {
        ArrayList<Node> new_list = new ArrayList<>();
        for (int i = 0; i < 2 * ll.size(); i++) {
            new_list.add(null);
        }
        ArrayList<Node> oba = ll;
        for (Node temp : oba) {
            while (temp != null) {
                put(temp.key, temp.value);
                temp = temp.next;
            }
        }
    }

    public V get(K key) {
        int idx = hasfun(key);
        Node temp = ll.get(idx);
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    public boolean containsKey(K key) {
        int idx = hasfun(key);
        Node temp = ll.get(idx);
        while (temp != null) {
            if (temp.key.equals(key)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public V remove(K key) {
        int idx = hasfun(key);
        Node curr = ll.get(idx);
        Node prev = null;
        while (curr != null) {
            if (curr.key.equals(key)) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            return null;
        } else if (prev == null) {
            ll.set(idx, curr.next);
            curr.next = null;
            size--;
            return curr.value;
        } else {
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.value;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Node node : ll) {
            while (node != null) {
                sb.append(node.key + "=" + node.value + ",");
                node = node.next;
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 1);
        map.put(4, 1);
        map.put(5, 1);
        System.out.println(map);
        System.out.println(map.containsKey(5));
        System.out.println(map.containsKey(6));
        System.out.println(map.get(4));
        System.out.println(map.get(9));
    }

}