package minitest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhoneBookManage extends Phone implements Iphone {
    public List<Contact> dataList = new ArrayList<>();

    public PhoneBookManage() {
    }

    public PhoneBookManage(List<Contact> dataList) {
        this.dataList = dataList;
    }

    @Override
    public void searchPhone(String name) {
        for (Contact contact : dataList
        ) {
            if (contact.getPhoneNumber().indexOf(name) >= 0) {
                System.out.println(contact);
            }
            if (dataList.isEmpty()) {
                System.out.println(" Empty list...");
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(dataList, new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }


    @Override
    public void display(Type type) {
        if (type == null) {
            for (Contact contact : dataList
            ) {
                System.out.println(contact);
            }
        } else {
            for (Contact contact : dataList
            )
                if (contact.getType().equals(type))
                    System.out.println(contact);
        }
    }

    @Override
    public void insertPhone(Contact contactt) {
        boolean check = false;
        for (Contact contact : dataList) {
            if (contact.getPhoneNumber().equals(contact.getPhoneNumber())) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println(" Contact already exists...");
        } else {
            dataList.add(contactt);
            System.out.println(" Add contact done...");
        }
        WriteFile.writeFile(dataList);
    }

    @Override
    public void removePhone(String name) {
        for (Contact contact : dataList
        ) {
            if (contact.getPhoneNumber().equals(name)) {
                dataList.remove(contact);
                break;
            }
        }
        WriteFile.writeFile(dataList);
        System.out.println(" Successfully deleted!!!" + dataList);

    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (Contact contact: dataList
             ) {
            if (contact.getName().equals(name)){
                contact.setPhoneNumber(newPhone);
                break;
            }
        } WriteFile.writeFile(dataList);
        System.out.println(" Contacts have been updated..." + dataList);

    }
}
