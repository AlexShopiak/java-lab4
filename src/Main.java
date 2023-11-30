import util.Group;
import util.Student;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Group myGroup = new Group();

        myGroup.add(new Student(1001, "Illa",   "Kravchuk", 1, 89));
        myGroup.add(new Student(1331, "Alex",   "Shopiak",  3, 93));
        myGroup.add(new Student(1345, "Danylo", "Chogadze", 2, 99));
        myGroup.add(new Student(1023, "Dmytro", "Nesterov", 4, 65));
        myGroup.add(new Student(1021, "Bvabey", "Axel",     2, 74));
        
        myGroup.sortByIdAscending();
        myGroup.printTable("Ascending by id");

        myGroup.sortByNameDescending();
        myGroup.printTable("Descending by name");
    }
}
