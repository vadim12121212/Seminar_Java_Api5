
import java.util.ArrayList;
import java.util.HashMap;

public class Task {
    // Написать простой класс Телефонный Справочник (с помощью HashMap), который
    // хранит в себе список фамилий и телефонных номеров.
    // В этот телефонный справочник с помощью метода add() можно добавлять записи, а
    // с помощью метода get() искать номер телефона по фамилии.
    // Следует учесть, что под одной фамилией может быть несколько телефонов (в
    // случае однофамильцев),
    // тогда при запросе такой фамилии должны выводиться все телефоны.

    // ***Желательно не добавлять лишний функционал (дополнительные поля (имя,
    // отчество, адрес),
    // взаимодействие с пользователем через консоль и т.д). Консоль использовать
    // только для вывода результатов проверки телефонного справочника

    // Для цикла for, отображения кол-ва номеров.
    private static int num = 0;
    // Создаем HashMap, Который принимает уникальный ключ String и
    // ArrayList<String>.
    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();

    // Стандарт метод
    public static void main(String[] args) {

        Task pb = new Task();
        // Список сотрудников и телефонов.
        pb.add("Пупкин", "8(800)555-35-35");
        pb.add("Захаров", "8(495)415-82-82");
        pb.add("Крылов", "8(800)410-20-20");
        pb.add("Перов", "8(800)474-58-58");
        pb.add("Костенко", "8(496)274-16-79");
        pb.add("Печенкин", "8(925)316-65-82");
        pb.add("Яйкин", "8(903)155-20-90");
        pb.add("Носяйкин", "8(903)675-75-10");
        pb.add("Печенкин", "8(495)613-43-04");
        pb.add("Пупкин", "8(800)555-33-55");

        // Цикл фон, проверка имени. Если совпадает имя, вывести все телефоны.
        for (String x : pb.get("Пупкин")) {
            num++;
            System.out.println("Пупкин " + num + " телефон: " + x);
        }
    }

    // Создаем метод add, добавления телефонов.
    public void add(String surname, String phone) {

        // Создаем отдельный ArrayList.
        ArrayList<String> strings = phoneMap.get(surname); // Ищу существующую фамилию
        // Выводим
        System.out.println("String = " + strings);

        if (strings == null) {
            ArrayList<String> listOfPhones = new ArrayList<>();
            listOfPhones.add(phone);
            phoneMap.put(surname, listOfPhones);
        } else {
            strings.add(phone);
            phoneMap.put(surname, strings);
        }
    }

    // Метод получающий телефон по фамилии, возвращает фамилию.
    public ArrayList<String> get(String surname) {
        return phoneMap.get(surname);
    }

}