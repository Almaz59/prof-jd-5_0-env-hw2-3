package ru.stepik;

public class PrintService {
    public static void print(Griffindor[] griffindor) {
        System.out.println("Список учеников факультета Griffindor:");
        for (int i = 0; i < griffindor.length; i++) {
            System.out.println(griffindor[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void print(Puffendui[] puffendui) {
        System.out.println("Список учеников факультета Puffendui:");
        for (int i = 0; i < puffendui.length; i++) {
            System.out.println(puffendui[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void print(Cogtevran[] cogtevran) {
        System.out.println("Список учеников факультета Cogtevran:");
        for (int i = 0; i < cogtevran.length; i++) {
            System.out.println(cogtevran[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void print(Slizerin[] slizerin) {
        System.out.println("Список учеников факультета Slizerin:");
        for (int i = 0; i < slizerin.length; i++) {
            System.out.println(slizerin[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

}
