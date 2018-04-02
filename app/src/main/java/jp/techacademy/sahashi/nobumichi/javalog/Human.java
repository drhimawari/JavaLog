package jp.techacademy.sahashi.nobumichi.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {

    // 引数付きコンストラクタ
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String hobby = "水泳";

    // メソッド
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }

}
