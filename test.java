public class test {
    public static void main(String[] args) {
        lambdaMap x = () -> {int x = 10; (x < 5) ? System.out.println("small") : System.out.println("big");};

        x.foo();
    }
}

interface lambdaMap {
    void foo();
}
