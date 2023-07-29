import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("phone List", phones);
        printData("email List", emails);

    }

    public static void printData(String header, Collection<Contact> contacs){

        System.out.println("--------------");
        System.out.println(header);
        System.out.println("--------------");
        contacs.forEach(System.out::println);

    }
}
