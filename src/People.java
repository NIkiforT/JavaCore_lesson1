public class People{

    public  static int max_distance = 130;
    public static double max_height = 14.2;

    public static void run(Track name){
        if(name.distance < max_distance) {
            System.out.println("Человек пробежал" + name.distance);
        }else {
            System.out.println("Человек не может пробежать " + name.distance);
        }
}
    public static void jump(Wall name) {
        if (name.height < max_height) {
            System.out.println("Человек прыгнул  " + name.height);
        } else {
            System.out.println("Человек не может прыгнуть " + name.height);
        }
    }
}
