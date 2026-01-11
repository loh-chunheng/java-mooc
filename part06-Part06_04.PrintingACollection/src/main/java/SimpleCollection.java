
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }
        
        String output = "";
        
        for (String element: this.elements) {
            output = output + element + "\n";
        }
        
        int size = this.elements.size();
        
        if (size == 1) {
            return "The collection " + name + " has " + size
                + " element:" + "\n" + output.trim();
        }
        
        return "The collection " + name + " has " + size
                + " elements:" + "\n" + output.trim();
        
    }
    
}
