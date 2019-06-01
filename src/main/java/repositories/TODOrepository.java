package repositories;

import model.TODO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TODOrepository {

    public static final String FILE_POSTFIX = "todo.txt";
    private static String FILE_PATH = "C:\\Projects\\tododata\\";

    public List<TODO> getTodoes(String username) {
        List<TODO> items = new ArrayList<>();
        String filePath = getTodoFilePathByUserName(username);
        try (Scanner scanner = new Scanner(new FileInputStream(filePath))) {
            long itemCount = scanner.nextLong();
            for (long itemNumber = 0; itemNumber < itemCount; itemNumber++) {
                extractTODOFromScanner(items, scanner);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return items;
    }

    private void extractTODOFromScanner(List<TODO> items, Scanner scanner) {
        Long id = scanner.nextLong();
        scanner.nextLine();
        String comment = scanner.nextLine();
        String isDone = scanner.nextLine();
        items.add(new TODO(id, Boolean.valueOf(isDone), comment));
    }

    private static String getTodoFilePathByUserName(String username) {
        return FILE_PATH + username + FILE_POSTFIX;
    }

}
