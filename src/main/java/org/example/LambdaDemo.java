package org.example;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {

    public static StringLength stringLength = String::length;//получить длину строки


    public static FirstSymbolOfString firstSymbol = str -> {//получить первый символ строки
        if (str.length() > 0){
            return str.charAt(0);
        }else{
            return null;
        }
    };

    public static Predicate<String> noSpace = str-> !str.contains(" ");//проверка, что строка без пробелов

    public static Function<String, Integer> count = str -> {//получить кол-во слов разделенных запятыми
        if (!str.isEmpty()){
            return str.split(",").length;
        }else{
            return null;
        }
    };

    public static Function<Person, Integer> ageHuman = Person::getAge;//получить возраст человека

    //проверить, что у двух людей одинаковые фамилии
    public static BiPredicate<Person, Person> sameSurname = (h1, h2) -> h1.getSurname().equals(h2.getSurname());

    public static Function<Person, String> fullName = h -> String.join(" ", h.getSurname(), h.getName(), h.getMiddlename());

    public static Function<Human, Human> newHuman = h->
        new Human(h.getSurname(), h.getName(), h.getMiddlename(), h.getAge()+1, h.getGender());

    public static ThreePredicate<Human> youngPeople = (h1, h2, h3, maxAge) ->
            h1.getAge() < maxAge && h2.getAge() < maxAge && h3.getAge() < maxAge;

}