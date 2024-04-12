package br.ufrn.imd;

public class Person {
    public Person(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }
    public String name;
    public String hometown;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHometown() {
        return hometown;
    }
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }



}
