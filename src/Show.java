import java.util.ArrayList;

public class Show {
   public String title;
   ArrayList<Actor> listOfActors;
   public Director director;
   public int duration;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director.toString());
    }

    public void printActorsList() {
        System.out.println("Актёры:");
        if (listOfActors.isEmpty()) {
            System.out.println("  Список актёров пуст");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println("  " + actor.toString());
            }
        }
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Актёр " + newActor.toString() + " уже есть в спектакле");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актёр " + newActor.toString() + " добавлен");
        }
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                Actor oldActor = listOfActors.set(i, newActor);
                System.out.println("Актёр " + oldActor.toString() + " заменён на " + newActor.toString());
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " не найден");
    }
}
