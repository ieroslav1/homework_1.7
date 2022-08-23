public class Main {
    public static void main(String[] args) {

        // 1 Задание
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника = " + fullName);

        // 2 Задание
        String s1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + s1);

        // 3 Задание
        String fullName2 = "Иванов Семён Семёнович";
        String s2 = fullName2.replace("ё", "е");
        System.out.println(s2);
    }
}