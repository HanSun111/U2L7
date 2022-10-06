public class LabRat {
    public static void main(String[] args) {
        String yum = "What’s for dinner?";
        String din = yum.substring(3, 12).substring(5, 7);
        System.out.println(din);

        String today = "FRIDAY!";
        String x = today.substring(3, 7).substring(0, 3).substring(1, 3);
        System.out.println(x);

    }
}