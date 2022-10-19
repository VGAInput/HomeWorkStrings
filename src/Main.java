import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        lesson3();
    }

    static final String firstName = "Ivan", middleName = "Ivanovich", lastName = "Ivanov";
    static final String firstNameCyrrilic = "Семён", middleNameCyrrilic = "Семёнович", lastNameCyrrilic = "Иванов";

    private static void lesson1() {
            /*
                   Данные сотрудников хранятся в неструктурированном формате,
            и бухгалтерия попросила написать программу, в которой
            можно работать с Ф.И.О. сотрудников.
            Напишите четыре строки:
            */

        String fullName = firstName + " " + lastName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);

    }

    private static void lesson2() {
            /*
                Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии
            нужны Ф.И.О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
            Напишите программу, которая изменит написание Ф. И. О. сотрудника
            с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
            */

        String fullName = firstName + " " + lastName + " " + middleName;
        fullName = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    private static void lesson3() {
            /*
                Система, в которой мы работаем, не принимает символ “ё”.
            Поэтому нам нужно написать программу, которая заменяет
            символ “ё” на символ “е”.
            */

        String fullName = firstNameCyrrilic + " " + lastNameCyrrilic + " " + middleNameCyrrilic;
        fullName = fullName.replace('ё', 'е');

        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}