import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {

    private Map<String, String> contacts = new HashMap<>();
    public int add(String name, String number) {
        contacts.put(name, number);
        return contacts.size();
    }

    public String findByNumber(String number) {
        return contacts.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), number))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public String findByName(String name) {
        return contacts.get(name);
    }
}
