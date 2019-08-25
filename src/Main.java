public class Main {


    public static void main(String[] args) {

        People people = new People();
        Cat cat = new Cat();
        Robot robot = new Robot();
        Object[] objects = new Object[]{people, cat, robot};



        Track track1 = new Track();
        Wall wall1 = new Wall();

        for (Object n : objects) {
            if (n == people) {
                people.run(track1);
                if (people.max_distance < track1.distance) {
                    System.out.println("Человек не прошел дорожку");
                } else {
                    people.jump(wall1);
                }

            } else if (n == cat) {
                cat.run(track1);
                if (cat.max_distance < track1.distance) {
                    System.out.println("Кот не прошел дорожку");
                } else {
                    Cat.jump(wall1);
                }
            } else {
                robot.run(track1);
                if (robot.max_distance < track1.distance) {
                    System.out.println("Робот не прошел дорожку");
                } else {
                    robot.jump(wall1);
                }

            }

        }
    }
}

