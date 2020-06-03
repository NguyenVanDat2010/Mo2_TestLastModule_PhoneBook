package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<PhoneBook> phoneBookList;

    static {
        phoneBookList = new ArrayList<>();
        phoneBookList.add(new PhoneBook("Dat", 123354, "Nghe An", "dat@gmail.com", "kira"));
        phoneBookList.add(new PhoneBook("Tuyen", 453456, "Ha Tinh", "tuyen@gmail.com", "tuyen nguyen"));
        phoneBookList.add(new PhoneBook("Long", 234278, "Ha Noi", "long@gmail.com", "long nguyen"));
        phoneBookList.add(new PhoneBook("Son", 898786, "Ha Noi", "son@gmail.com", "son nguyen"));
    }

    public static void menuPhoneBook(){
        System.out.println("Chọn chức năng theo số để tiếp tục: ");
        System.out.println("1: Xem danh sách");
        System.out.println("2: Thêm mới");
        System.out.println("3: Cập nhật");
        System.out.println("4: Xóa");
        System.out.println("5: Tìm kiếm");
        System.out.println("6: Ghi vào file");
        System.out.println("7: Đọc từ file");
        System.out.println("8: Thoát");
    }
    public static void main(String[] args) {
        PhoneBookAction phoneBookAction = new PhoneBookAction();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        Scanner scanner = new Scanner(System.in);
        String path = "test.data";
        int num = 0;
        while (num != 8) {
            System.out.println("----------MENU CHỨC NĂNG: -----------");
            System.out.println("1: Xem danh sách");
            System.out.println("2: Thêm mới");
            System.out.println("3: Cập nhật");
            System.out.println("4: Xóa");
            System.out.println("5: Tìm kiếm");
            System.out.println("6: Ghi vào file");
            System.out.println("7: Đọc từ file");
            System.out.println("8: Thoát");
            System.out.println("\nCHỌN CHỨC NĂNG ĐỂ TIẾP TỤC: ");
            num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println("HIEN THI DANH BẠ: \n");
                    phoneBookAction.display(phoneBookList);
                    break;
                case 2:
                    System.out.println("THÊM MỚI DANH BẠ\n");
                    phoneBookAction.addPhoneBook(phoneBookList);
                    break;
                case 3:
                    System.out.println("CẬP NHẬT DANH BẠ:\n");
                    phoneBookAction.updatePhonebook(phoneBookList);
                    break;
                case 4:
                    System.out.println("XÓA LIÊN HỆ DANH BẠ:\n");
                    phoneBookAction.deletePhonebook(phoneBookList);
                    break;
                case 5:
                    System.out.println("TÌM KIẾM DANH BẠ:\n");
                    phoneBookAction.searchPhoneBook(phoneBookList);
                    break;
                case 6:
                    System.out.println("GHI VÀO FILE .DATA");
                    readAndWriteFile.writeFileCSV(path, phoneBookList);
                    break;
                case 7:
                    System.out.println("ĐỌC TỪ FILE .DATA");
                    phoneBookList = readAndWriteFile.readFileCSV(path);
                    for (PhoneBook phoneBook : phoneBookList) {
                        System.out.println(phoneBook);
                    }
                    break;
                case 8:
                    break;
            }
        }
    }
}
