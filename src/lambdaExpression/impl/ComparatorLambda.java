package lambdaExpression.impl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[] args) {

        final Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        final Comparator<String> comparatorLambda = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

        final List<String> list = Arrays.asList("1", "1234", "12", "12345", "123");
        list.sort(comparatorLambda);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
