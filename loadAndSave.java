package hotelmanagement2;

import static hotelmanagement2.HotelManagement2.customer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class loadAndSave {

    public static void saveToFile() {
        try {
            try ( FileOutputStream fileOut = new FileOutputStream("customerList.txt")) {
                try ( ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                    for (Customer h : customer) {
                        out.writeObject(h);
                    }
                    out.close();
                    fileOut.close();
                }

            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void readFromFile() {
//        customerList.removeAll(customerList); // Så det ej blir dubletter när man kallar på denna metod. 

        Customer h = null;
        try {
            try ( FileInputStream fileIn = new FileInputStream("customerList.txt");  ObjectInput in = new ObjectInputStream(fileIn)) {
                while (true) {
                    h = (Customer) in.readObject();
                    customer.add(h);
                }
            }
        } catch (IOException i) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HotelManagement2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
