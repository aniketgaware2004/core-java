package hashtable;

import java.util.*;

// Class to store key-value pairs
class Pair {
    int key;        // Roll number
    String val;     // Student name

    // Default constructor
    public Pair() {
        key = 0;
        val = " ";
    }

    // Parameterized constructor
    public Pair(int key, String val) {
        this.key = key;
        this.val = val;
    }

    @Override
    public String toString() {
        return "Pair [key=" + key + ", val=" + val + "]";
    }
}

// Custom HashTable class
class HashTable {
    private final int SLOTS = 10;
    private LinkedList<Pair>[] table;

    // Constructor
    public HashTable() {
        table = new LinkedList[SLOTS];
        for (int i = 0; i < SLOTS; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hash(int key) {
        return key % SLOTS;
    }

    // Put key-value pair into hash table
    public void put(int key, String val) {
        int slot = hash(key);
        LinkedList<Pair> bucket = table[slot];
        
        for (Pair pair : bucket) {
            if (pair.key == key) {
                pair.val = val; // update existing key
                return;
            }
        }
        Pair newPair = new Pair(key, val);
        bucket.add(newPair);
        System.out.println("Added: " + newPair);
    }

    // Get value by key
    public String get(int key) {
        int slot = hash(key);
        LinkedList<Pair> bucket = table[slot];
        
        for (Pair pair : bucket) {
            if (pair.key == key) {
                return pair.val;
            }
        }
        return null; // not found
    }
}

// Main class to test the HashTable
public class HashtableMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashTable ht = new HashTable();
        ht.put(1, "Nilesh");
        ht.put(4, "Nitin");
        ht.put(8, "Sandeep");
        ht.put(5, "Amit");
        ht.put(24, "Vishal");
        ht.put(34, "Yogesh");
        ht.put(15, "Akash");
        ht.put(1, "Rohan"); // Update name for key=1

        System.out.print("Enter a roll no. to find");
		int roll= sc.nextInt();
		String name= ht.get(roll);
		System.out.println("Name found:"+ name);
		sc.close();
         
    }
}
