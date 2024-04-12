package br.ufrn.imd;

public class Main {
    public static void main(String[] args){
        String name = args[0];
        String hometown = args[1];
        Person person = new Person(name, hometown);
    }
}
