package homework;

import java.util.*;

public class Phonebook {
    private final Map<String, List<String>> phonebook;

    public Phonebook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public Phonebook() {
        this(new HashMap<>());
    }

    public void add(String name, String phoneNumber) {
        List<String> nums = new ArrayList<>();
        nums.add(phoneNumber);
        phonebook.put(name, nums);
    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, Arrays.asList(phoneNumbers) );
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phonebook.getOrDefault(name,Collections.emptyList());
    }

    public String reverseLookup(String phoneNumber)  {
         for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        return new ArrayList<>(phonebook.keySet());
    }

    public Map<String, List<String>> getMap() {
        return new HashMap<>(phonebook);
    }
}