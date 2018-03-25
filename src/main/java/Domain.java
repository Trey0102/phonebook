import com.trey.entity.PhoneBook;
import com.trey.service.PhonebookService;
import com.trey.util.Util;

import java.sql.SQLException;
import java.util.List;

public class Domain {
    public static void main(String[] args) {
        PhonebookService phonebookService = new PhonebookService();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setName("Tanikin Ongarbek");
        phoneBook.setPhone("+7(701)023-25-26");
        phoneBook.setEmail("dad@mail.com");

        try
        {
            phonebookService.remove(phoneBook);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.println("ERROR");
        }
    }
}
