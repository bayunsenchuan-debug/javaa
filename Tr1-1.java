// ファイル名が Main.java なので、メインとなるこちらだけに public をつけます
public class Tr1-1 {
    public static void main(String[] args) {
        Hero hero1 = new Hero("minato", 100, 10);
        System.out.println(hero1); 
    }
}

// Heroクラスからは public を外します（これだけでOK！）
class Hero {
    private String name;
    private int hp, mp;

    public Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "勇者(名前= " + this.name + "/HP " + this.hp + "/MP " + this.mp + ")";
    }
}