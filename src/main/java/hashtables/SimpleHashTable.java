package hashtables;

public class SimpleHashTable {

    StoredEmployee[] hashTable;

    SimpleHashTable() {
        hashTable = new StoredEmployee[10];
    }

    void put(Employee employee) {
        int hashedKey = hashKey(employee.getLastName());
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }

        if (occupied(hashedKey)) {
            System.err.println("Exist element at position : " + hashedKey);
        } else {
            hashTable[hashedKey] = new StoredEmployee(employee.getLastName(), employee);
        }
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashTable[hashedKey].employee;
    }

    Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        Employee removed = hashTable[hashedKey].employee;
        hashTable[hashedKey] = null;

        StoredEmployee[] oldHashtable = hashTable;
        hashTable = new StoredEmployee[oldHashtable.length];
        for (int i = 0; i < oldHashtable.length; i++) {
            if (oldHashtable[i] != null) {
                put(oldHashtable[i].employee);
            }
        }
        return removed;
    }

    int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex && hashTable[hashedKey] != null && !hashTable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }
    }

    boolean occupied(int index) {
        return hashTable[index] != null;
    }

    void print() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println("Position " + i + " : " + hashTable[i].employee);
            }
        }
    }
}
