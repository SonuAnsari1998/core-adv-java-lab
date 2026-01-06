package jan_05_2026_Collection_Serialization_Deserialization;

import java.io.*;
import java.util.Scanner;

public class Serialization1 {

    // Record definition
    public record Product(Integer id, String name, Double price) implements Serializable {}

    // Serialization method
    public static void serializeProducts(String filepath) throws IOException {
        try (FileOutputStream fout = new FileOutputStream(filepath);
             ObjectOutputStream oos = new ObjectOutputStream(fout);
             Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the size of product array: ");
            int size = Integer.parseInt(sc.nextLine());

            Product[] products = new Product[size];

            for (int i = 0; i < products.length; i++) {
                System.out.print("Enter id: ");
                Integer id = Integer.valueOf(sc.nextLine());

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter price: ");
                Double price = Double.valueOf(sc.nextLine());

                products[i] = new Product(id, name, price);
            }

            // Serialize the whole array
            oos.writeObject(products);

            System.out.println("Product Objects Stored Successfully");
        }
    }

    // Deserialization method
    public static void deserializeProducts(String filepath) throws IOException, ClassNotFoundException {
        try (FileInputStream fin = new FileInputStream(filepath);
             ObjectInputStream ois = new ObjectInputStream(fin)) {

            Product[] products = (Product[]) ois.readObject();

            System.out.println("Deserialized Products:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        String filepath = "C:\\Serialization Deserialization\\product.txt";

        try {
            // First serialize
            serializeProducts(filepath);

            // Then deserialize
            deserializeProducts(filepath);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}