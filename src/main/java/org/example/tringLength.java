package org.example;

interface StringLength {
    int getLength(String str);
}

interface FirstSymbolOfString{
    Character getFirstChar(String str);
}

interface TreePredicate<T>{
    boolean test(T t1, T t2, T t3, int maxAge);
}