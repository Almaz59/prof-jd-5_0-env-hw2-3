package ru.stepik;

public class Main {


    public static void main(String[] args) {
        Griffindor[] griffindors = {
                new Griffindor("Гарри Потер", 95, 87, 87, 59, 83),
                new Griffindor("Гермиона Грейнджер", 78, 46, 55, 23, 67),
                new Griffindor("Рон Уизли", 68, 93, 56, 28, 35),
        };

        Puffendui[] puffenduis = {
                new Puffendui("Захария Смит", 78, 56, 32, 10, 45),
                new Puffendui("Сетрик Диггори", 67, 38, 89, 56, 90),
                new Puffendui("Джастин Финч-Флетчили", 43, 73, 70, 69, 55),
        };

        Cogtevran[] cogtevrans = {
                new Cogtevran("Чжоу Чанг", 80, 40, 53, 82, 71, 34),
                new Cogtevran("Падма Патил", 75, 77, 90, 66, 34, 85),
                new Cogtevran("Маркус Белби", 90, 71, 33, 89, 91, 64),
        };

        Slizerin[] slizerins = {
                new Slizerin("Драко Малфой", 91, 97, 87, 75, 34, 44, 68),
                new Slizerin("Грэхэм Монтегю", 83, 88, 56, 90, 58, 19, 20),
                new Slizerin("Грегори Гойл", 54, 76, 42, 30, 78, 55, 70),

        };

        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Потер", 95, 87),
                new Hogwarts("Гермиона Грейнджер", 78, 46),
                new Hogwarts("Рон Уизли", 68, 93),
                new Hogwarts("Захария Смит", 78, 56),
                new Hogwarts("Сетрик Диггори", 67, 38),
                new Hogwarts("Джастин Финч-Флетчили", 43, 73),
                new Hogwarts("Чжоу Чанг", 80, 40),
                new Hogwarts("Падма Патил", 75, 77),
                new Hogwarts("Маркус Белби", 90, 71),
                new Hogwarts("Драко Малфой", 91, 97),
                new Hogwarts("Грэхэм Монтегю", 83, 88),
                new Hogwarts("Грегори Гойл", 54, 76),

        };
        PrintService printService = new PrintService();
        printService.print(griffindors);
        printService.print(puffenduis);
        printService.print(cogtevrans);
        printService.print(slizerins);

        Methods.findBestStudentGriffindor(griffindors[0], griffindors[1]);
        Methods.findBestStudentPuffendui(puffenduis[1], puffenduis[2]);
        Methods.findBestStudentCogtevran(cogtevrans[0], cogtevrans[2]);
        Methods.findBestStudentSlizerin(slizerins[0], slizerins[1]);

        Methods.findBestStudentHogwarts(hogwarts[0], hogwarts[9]);
    }


}

