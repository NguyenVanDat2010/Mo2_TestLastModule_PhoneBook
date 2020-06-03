package phonebook;

import java.util.List;
import java.util.Scanner;

public class PhoneBookAction {
    Scanner scanner = new Scanner(System.in);

    public void addPhoneBook(List<PhoneBook> phoneBookList) {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập Email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập facebook: ");
        String facebook = scanner.nextLine();
        phoneBookList.add(new PhoneBook(name, phoneNumber, address, email, facebook));
        System.out.println("Danh sách sau khi thêm mới:");
        display(phoneBookList);
    }

    public void updatePhonebook(List<PhoneBook> phoneBookList) {
        System.out.println("Nhập vị trí index cần cập nhật: ");
        int index = scanner.nextInt();
        if (index < phoneBookList.size()) {
            scanner.nextLine();
            System.out.println("Nhập tên cần sửa: ");
            String name = scanner.nextLine();
            System.out.println("Nhập số điện thoại cần sửa:");
            int phoneNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập địa chỉ cần sửa: ");
            String address = scanner.nextLine();
            System.out.println("Nhập Email cần sửa: ");
            String email = scanner.nextLine();
            System.out.println("Nhập facebook cần sửa: ");
            String facebook = scanner.nextLine();
            phoneBookList.get(index).setName(name);
            phoneBookList.get(index).setPhoneNumber(phoneNumber);
            phoneBookList.get(index).setAddress(address);
            phoneBookList.get(index).setEmail(email);
            phoneBookList.get(index).setFacebook(facebook);
            System.out.println("Danh sách sau khi sửa:");
            display(phoneBookList);
        } else {
            System.out.println("Index bạn nhập vượt quá size");
        }
    }

    public void deletePhonebook(List<PhoneBook> phoneBookList) {
        System.out.println("Nhập vị trí index cần xóa: ");
        int id = scanner.nextInt();
        if (id < phoneBookList.size()) {
            phoneBookList.remove(id);
            System.out.println("Danh sách sau khi xóa:");
            display(phoneBookList);
        } else {
            System.out.println("Index bạn nhập vượt quá size");
        }
    }

    public void display(List<PhoneBook> phoneBookList) {
        for (PhoneBook phoneBook : phoneBookList) {
            System.out.println(phoneBook.toString());
        }
    }

    public void searchPhoneBook(List<PhoneBook> phoneBookList) {
        System.out.println("Nhập tên cần tìm kiếm trong danh bạ: ");
        boolean check = false;
        int index = 0;
        String inputValue = scanner.nextLine();
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (phoneBookList.get(i).getName().toLowerCase().contains(inputValue.toLowerCase())
//                    phoneBookList.get(i).getAddress().toLowerCase().contains(inputValue.toLowerCase()) ||
//                    phoneBookList.get(i).getEmail().toLowerCase().contains(inputValue.toLowerCase()) ||
//                    phoneBookList.get(i).getFacebook().toLowerCase().contains(inputValue.toLowerCase())
            ) {
                index = i;
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (check) {
            System.out.println(phoneBookList.get(index).toString());
        } else {
            System.out.println("Thông tin bạn nhập ko tồn tại");
        }
    }
}
