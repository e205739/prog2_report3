package jp.ac.uryukyu.ie.e205739;

public class Warrior extends LivingThing  {

    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

    public void attackWithWeponSkill(LivingThing L){
        int damage = (int)(attack * 1.5);
        if( dead == true ) {
            damage = 0;
        }
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, L.getName(), damage);
        L.wounded(damage);

    }
}