package org.example;

interface StringLength {
    int getLength(String str);
}

interface FirstSymbolOfString{
    Character getFirstChar(String str);
}

interface ThreePredicate<T>{
    boolean test(T t1, T t2, T t3, int maxAge);
}

interface Person{
    String getSurname();
    String getName();
    String getMiddlename();
    int getAge();

}