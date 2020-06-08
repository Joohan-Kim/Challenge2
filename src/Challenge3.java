public class Challenge3 {
    public static final int SIZE = 4;
    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();
    }
    public static void Line() {
        System.out.print("+");
        for (int dash = 0; dash < 2 * SIZE + 1; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void Top() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            TS(line);
            for (int f = 1; f <= line - 1; f++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int b = 1; b <= line - 1; b++) {
                System.out.print("\\");
            }
            TS(line);
            System.out.println("|");
        }
    }
    public static void TS (int line){
        for (int space = 1; space <= SIZE - line + 1; space++) {
            System.out.print(" ");
        }
    }
    public static void Bottom() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            BS(line);
            for (int b = 1; b <= -line + SIZE; b++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int f = 1; f <= -line + SIZE; f++) {
                System.out.print("/");
            }
            BS(line);
            System.out.println("|");
        }
    }
    public static void BS(int line){
        for(int space = 1; space <= line; space++) {
            System.out.print(" ");
        }
    }
}

