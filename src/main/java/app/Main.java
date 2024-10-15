package app;

public class Main {

    public static void main(String[] args) {
        DataProvider data = new DataProvider();
        getOutput(Corrector.handleData(data.getData()));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}