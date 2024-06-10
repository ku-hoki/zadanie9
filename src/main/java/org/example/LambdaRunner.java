package org.example;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaRunner {

    public static int runStringLength(StringLength stringLength, String parametr){
        return stringLength.getLength(parametr);
    }
    public static <T, R> R runFunction(Function<T, R> function, T parametr){
        return function.apply(parametr);
    }

    public static <T> boolean runPredicate(Predicate<T> predicate, T parametr){
        return predicate.test(parametr);
    }

    public static <T, U> boolean runBiPredicate(BiPredicate<T, U> biPredicate, T p1, U p2){
        return biPredicate.test(p1, p2);
    }

    public static <T> boolean runThreePredicate(ThreePredicate<T> threePredicate, T p1, T p2, T p3, int maxAge){
        return threePredicate.test(p1, p2, p3, maxAge);
    }

}
