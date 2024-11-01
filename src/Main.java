import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> teamLead1 = Arrays.asList("Maryna", "Milana", "Yanina");
        List<String> teamLead2 = Arrays.asList("Mary", "John", "Nina");
        List<String> teamLead3 = Arrays.asList("Valera", "Galina", "Artem");

        Set<String> unoqueEmployees = new HashSet<>();
        unoqueEmployees.addAll(teamLead1);
        unoqueEmployees.addAll(teamLead2);
        unoqueEmployees.addAll(teamLead3);

        List<String> finalEmployeeList = new ArrayList<>(unoqueEmployees);

        System.out.println("Общий список сотрудников для получения премии:  ");
        for (String employee : finalEmployeeList) {
            s
        }
    }
}