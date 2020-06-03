package phonebook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public void writeFileCSV(String path, List<PhoneBook> bookList) {
        File fileWriter = new File(path);
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        try {
            fileOutputStream = new FileOutputStream(fileWriter);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (PhoneBook phoneBook : bookList) {
                objectOutputStream.writeObject(phoneBook);
            }
            System.out.println("Ghi vào file thành công");
//            objectOutputStream.writeObject(bookList);

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<PhoneBook> readFileCSV(String path) {
        List<PhoneBook> list = new ArrayList<>();
        File fileReader = new File(path);
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        try {
            fileInputStream = new FileInputStream(fileReader);
            objectInputStream = new ObjectInputStream(fileInputStream);

            PhoneBook phoneBook = null;
            while ((phoneBook = (PhoneBook) objectInputStream.readObject()) != null) {
                list.add(phoneBook);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (EOFException e) {
            System.out.println("het file");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
