public class Robot {

    public static int max_distance = 150;
    public static double max_height = 22.2;

    public static void run(Track name){
        if(name.distance < max_distance) {
            System.out.println("Робот пробежал  " + name.distance);
        }else {
            System.out.println("Робот не может пробежать " + name.distance);
        }
    }
    public static void jump(Wall name) {
        if (name.height < max_height) {
            System.out.println("Робот прыгнул  "+ name.height);
        } else {
            System.out.println("Робот не может прыгнуть " + name.height);
        }
    }
}
