package day21statickeyword;

import java.util.List;

public class StudentRunner {

    public static void main(String[] args) {
        //stdName static oldugundan ona ulaşmak için object oluşturmadım
        //sadece class ismini kullanmak yeterlidir.
        System.out.println(Student.stdName);

        //age non-static oldugundan ona ulaşmak için object oluşturmak zorundayız.
        Student std1 = new Student();
        System.out.println(std1.age);

        String initials = Student.getInitials("Sefa Eyer");//statik olmadıgı için String
        System.out.println(initials);                               //konternera atadık.

        int vowels = std1.countVowels("Tom Cruise");
        System.out.println(vowels);

        String s = std1.getInitials("Ali Can");
        System.out.println(s);

        //List oluşturmada yeni bir ışıltı
        List<String>names = List.of("Ali", "Veli", "Can", "Kemal");
        System.out.println(names);
    }
}

