/*
 * Main
 *
 * Version 1.0
 *
 * (c) 2023 Oleksii Shopiak
 * All rights reserved.
 *
 * This is an entry point of a project.
 */
import uni.Group;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Group myGroup = new Group();

        myGroup.addStudent(1001, "Illa",   "Kravchuk", 1, 89);
        myGroup.addStudent(1331, "Alex",   "Shopiak",  3, 93);
        myGroup.addStudent(1345, "Danylo", "Chogadze", 2, 99);
        myGroup.addStudent(1023, "Dmytro", "Nesterov", 4, 65);
        myGroup.addStudent(1021, "Bvabey", "Axel",     2, 74);
        
        myGroup.sortByIdAscending();
        myGroup.printTable("Ascending by id");

        myGroup.sortByNameDescending();
        myGroup.printTable("Descending by name");
    }
}
