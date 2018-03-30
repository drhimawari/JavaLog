package jp.techacademy.sahashi.nobumichi.javalog;

import android.util.Log;

class Dog extends Animal implements Movable {
    // 変数
    String name;      // 名前
    int age;    // 年齢

    // 引数付きコンストラクタ
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // メソッド
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }

}
