import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Анна", "Смирнова", Gender.FEMALE, 1.68);
        Actor actor2 = new Actor("Иван", "Петров", Gender.MALE, 1.82);
        Actor actor3 = new Actor("Елена", "Соколова", Gender.FEMALE, 1.65);

        Director director1 = new Director("Пётр", "Иванов", Gender.MALE, 15);
        Director director2 = new Director("Мария", "Сидорова", Gender.FEMALE, 8);

        String musicAuthor = "Чайковский";
        String choreographer = "Мариус Петипа";

        ArrayList<Actor> showActors = new ArrayList<>();
        Show regularShow = new Show("Обычный спектакль", 120, director1, showActors);

        ArrayList<Actor> operaActors = new ArrayList<>();
        Opera opera = new Opera("Опера", 150, director2, operaActors,
                musicAuthor, "Текст либретто оперы", 20);

        ArrayList<Actor> balletActors = new ArrayList<>();
        Ballet ballet = new Ballet("Балет", 130, director1, balletActors,
                musicAuthor, "Текст либретто балета", choreographer);

        System.out.println("Распределение актёров:");
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);
        System.out.println();

        System.out.println("Списки актёров:");
        System.out.println("Обычный спектакль:");
        regularShow.printActorsList();
        System.out.println();

        System.out.println("Опера:");
        opera.printActorsList();
        System.out.println();

        System.out.println("Балет:");
        ballet.printActorsList();
        System.out.println();

        System.out.println("Замена актёра в балете (Петрова на Иванову):");
        ballet.replaceActor("Петров", actor2);
        System.out.println();

        System.out.println("Обновлённый список актёров в балете:");
        ballet.printActorsList();
        System.out.println();

        System.out.println("Попытка заменить несуществующего актёра в опере:");
        opera.replaceActor("Кузнецов", actor1);
        System.out.println();

        System.out.println("Либретто оперы:");
        opera.printLibretto();
        System.out.println();

        System.out.println("Либретто балета:");
        ballet.printLibretto();


    }
}
