public class Fifth {
    public static void main(String[] args) {
        int count = 0;
        for (int hours = 0; hours < 24; hours++){
            for (int minutes = 0; minutes < 60; minutes++){
                int hourFirst = hours / 10;
                int hourSecond = hours % 10;
                int minuteFirst = minutes / 10;
                int minuteSecond = minutes % 10;
                if (hourFirst==minuteSecond && hourSecond==minuteFirst){
                    count++;
                }
            }
        }
        System.out.println("Кількість симетричних операцій на годиннику = " + count);
    }
}