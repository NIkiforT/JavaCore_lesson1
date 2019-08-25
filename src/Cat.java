public class Cat{

    public static int max_distance = 100;
    public static double max_height = 12.2;


    public  static void run(Track name){
        if(name.distance < max_distance) {
            System.out.println("Кот пробежал ");
        }else {
            System.out.println("Кот не может пробежать " + name.distance);
        }
    }
    public static void jump(Wall name) {
        if (name.height < max_height) {
            System.out.println("Кот прыгнул ");
        } else {
            System.out.println("Кот не может прыгнуть " + name.height);
        }
    }
}
