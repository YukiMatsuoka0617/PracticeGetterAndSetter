package com.example.practicegetterandsetter;

public class Human {
    String name;
    int birthday;
    int manpukudo;

    Human(String name, int birthday, int manpukudo) {  // コンストラクタ1
        this.name = name;
        this.birthday = birthday;
        this.manpukudo = manpukudo;
    }

    Human(String name, int birthday) {            // コンストラクタ2
        this(name, birthday, 50);
    }

    Human() {                                          // コンストラクタ3
        this("不明", 0, 50);
    }

    void eat() {
        this.manpukudo += 60;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
