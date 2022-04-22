package ru.stepik;

public class Methods {

    public static void findBestStudentGriffindor(Griffindor student1, Griffindor student2) {
        System.out.println("Сравнение учеников факультета Гриффиндор:");
        System.out.println("Имя: " + student1.getName() + " Благородство: " + student1.getNobility() + " Честь: "
                + student1.getHonor() + " Храбрость: " + student1.getCourage());
        System.out.println("Имя: " + student2.getName() + " Благородство: " + student2.getNobility() + " Честь: "
                + student2.getHonor() + " Храбрость: " + student2.getCourage());
        System.out.println("------------------------------------------------------------------------------------------");
        int resultStudent1 = student1.getNobility() + student1.getHonor() + student1.getCourage();
        int resultStudent2 = student2.getNobility() + student2.getHonor() + student2.getCourage();
        if (resultStudent1 > resultStudent2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public static void findBestStudentPuffendui(Puffendui student1, Puffendui student2) {
        System.out.println("Сравнение учеников факультета Пуффендуй:");
        System.out.println("Имя: " + student1.getName() + " Трудолюбие: " + student1.getDiligence() + " Верность: "
                + student1.getLoyalty() + " Честность: " + student1.getHonesty());
        System.out.println("Имя: " + student2.getName() + " Трудолюбие: " + student2.getDiligence() + " Верность: "
                + student2.getLoyalty() + " Честность: " + student2.getHonesty());
        System.out.println("------------------------------------------------------------------------------------------");
        int resultStudent1 = student1.getDiligence() + student1.getLoyalty() + student1.getHonesty();
        int resultStudent2 = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();
        if (resultStudent1 > resultStudent2) {
            System.out.println(student1.getName() + " лучший Пуффиндуец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Пуффиндуец, чем " + student1.getName());
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public static void findBestStudentCogtevran(Cogtevran student1, Cogtevran student2) {
        System.out.println("Сравнение учеников факультета Когтевран:");
        System.out.println("Имя: " + student1.getName() + " Ум: " + student1.getMind() + " Мудрость: "
                + student1.getWisdom() + " Остроумие: " + student1.getWit() + " Креативность: " + student1.getCreativity());
        System.out.println("Имя: " + student2.getName() + " Ум: " + student2.getMind() + " Мудрость: "
                + student2.getWisdom() + " Остроумие: " + student2.getWit() + " Креативность: " + student2.getCreativity());
        System.out.println("------------------------------------------------------------------------------------------");
        int resultStudent1 = student1.getMind() + student1.getWisdom() + student1.getWit() + student1.getCreativity();
        int resultStudent2 = student2.getMind() + student2.getWisdom() + student2.getWit() + student2.getCreativity();
        if (resultStudent1 > resultStudent2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public static void findBestStudentSlizerin(Slizerin student1, Slizerin student2) {
        System.out.println("Сравнение учеников факультета Слизерин:");
        System.out.println("Имя: " + student1.getName() + " Хитрость: " + student1.getCunning() + " Решительность: "
                + student1.getDecisiveness() + " Амбициозность: " + student1.getAmbition() + " Находчивость: "
                + student1.getResourcefulness() + " Жажда власти: " + student1.getPower());
        System.out.println("Имя: " + student2.getName() + " Хитрость: " + student2.getCunning() + " Решительность: "
                + student2.getDecisiveness() + " Амбициозность: " + student2.getAmbition() + " Находчивость: "
                + student2.getResourcefulness() + " Жажда власти: " + student2.getPower());
        System.out.println("------------------------------------------------------------------------------------------");
        int resultStudent1 = student1.getCunning() + student1.getDecisiveness() + student1.getAmbition()
                + student1.getResourcefulness() + student1.getPower();
        int resultStudent2 = student2.getCunning() + student2.getDecisiveness() + student2.getAmbition()
                + student2.getResourcefulness() + student2.getPower();
        if (resultStudent1 > resultStudent2) {
            System.out.println(student1.getName() + " лучший Слизерианец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Слизерианец, чем " + student1.getName());
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public static void findBestStudentHogwarts(Hogwarts student1, Hogwarts student2) {
        System.out.println("Сравнение учеников Хогвартса по сумме свойств магии и трансгрессии:");
        System.out.println("Имя: " + student1.getName() + " Магия: " + student1.getMagic() + " Трансгрессия: "
                + student1.getTransgression());
        System.out.println("Имя: " + student2.getName() + " Магия: " + student2.getMagic() + " Трансгрессия: "
                + student2.getTransgression());
        System.out.println("------------------------------------------------------------------------------------------");
        int resultStudent1 = student1.getMagic() + student1.getTransgression();
        int resultStudent2 = student2.getMagic() + student2.getTransgression();
        if (resultStudent1 > resultStudent2) {
            System.out.println(student1.getName() + " обладает большим показателем суммы магии и трансгрессии, чем "
                    + student2.getName());
        } else {
            System.out.println(student2.getName() + " обладает большим показателем суммы магии и трансгрессии, чем " + student1.getName());
        }

    }
}

