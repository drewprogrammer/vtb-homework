package lesson5.homework;

public class Competition {

    private final Participant[] participants;

    private final Obstacle[] obstacles;

    public Competition(Participant[] participants, Obstacle[] obstacles) {
        this.participants = participants;
        this.obstacles = obstacles;
    }

    public void compete() {
        for (Participant participant : participants) {
            for (Obstacle obs : obstacles) {
                if (!obs.canPass(participant)) {
                    System.out.println(participant.getName() + " сошел с дистанции.");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Competition competition = new Competition(
                new Participant[] {
                        new Cat("Кот", 10, 50),
                        new Human("Человек", 20, 15, 15),
                        new Robot("Робот", 100, 50),
                        new Fish("Рыбка", 100),
                        new Bird("Птица", 100, 150)
                },
                new Obstacle[] {
                        new Threadmill("Дорожка", 5),
                        new Wall("Стена", 7),
                        new SwimmingPool("Водоем", 15),
                        new Threadmill("Дорожка", 15),
                        new Chasm("Пропасть", 15),
                }
        );

        competition.compete();
    }
}