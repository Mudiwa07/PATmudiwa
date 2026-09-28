import java.io.File;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;

public class BManager {
    private File basketFile;
    private JSONArray basket;

    // Constructor to initialize the BasketManager with a specific file
    public BManager(String filename) {
        basketFile = new File(filename);
        basket = new JSONArray();

        // Load existing data if the file exists
        if (basketFile.exists()) {
            loadBasket();
        }
    }

    // Method to add an item to the basket
    public void addItem(String size) {
        JSONObject item = new JSONObject();
      
        //item.put("Item name", name);
        item.put("size", size);
        basket.add(item);
    }

    // Method to load basket items from the JSON file
    private void loadBasket() {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(basketFile)) {
            Object obj = parser.parse(reader);
            basket = (JSONArray) obj;
        } catch (IOException | ParseException e) {
            System.out.println("Error reading the file: " + e);
        }
    }

    // Method to save the basket items to the JSON file
    public void saveBasket() {
        try (FileWriter outFile = new FileWriter(basketFile)) {
            outFile.write(basket.toJSONString()); // Write JSON array to file
            outFile.flush();
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e);
        }
    }

    // Method to clear the basket (delete the file and reset the basket array)
    public void clearBasket() {
        if (basketFile.exists()) {
            basketFile.delete();
        }
        basket = new JSONArray();
    }

    // Example method to add items interactively (you can modify this as needed)
    public void interactiveAddItems() {
        
            
            //String itemName = JOptionPane.showInputDialog("Enter the name of your item\ne.g. 'Blue bombshell'");
            String itemSize = JOptionPane.showInputDialog("Enter the size of your item\n(XS,S,M,L,XL)");
            addItem( itemSize);
        
        saveBasket();
    }
}