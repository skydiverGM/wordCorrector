package app;

public class Corrector {

    public static String handleData(String[] strs) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (String str : strs) {
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }
            count++;
            builder.append(count).append(") ").append(str).append("\n");
        }
        return builder.toString();
    }
}