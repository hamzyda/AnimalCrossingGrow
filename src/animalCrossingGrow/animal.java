//animal.java
package animalCrossingGrow;

import java.util.Random;

public class animal {
    static Random random = new Random();
    static int animalState = 0;
    public int intimacy;
    public int level;
    public String condition;
    public String face;

    public animal() {
        this.intimacy = 0;
        this.level = 1;
        this.condition = "";
        this.face = "";
    }

    public String getface() {
        return this.face;
    }

    public String getintimacy() {
        return String.valueOf(this.intimacy);
    }

    public String getlevel() {
        return String.valueOf(this.level);
    }

    public void hungry() {
        this.condition = "배고픔";
    }

    public void bored() {
        this.condition = "심심함";
    }

    public void dirty() {
        this.condition = "더러움";
    }

    public void sleepy() {
        this.condition = "졸림";
    }

    public String State() {
        animalState = random.nextInt(4);
        switch (animalState) {
            case 0 :
                this.hungry();
                break;
            case 1 :
                this.bored();
                break;
            case 2 :
                this.dirty();
                break;
            case 3 :
                this.sleepy();
                break;
        }

        return this.condition;
    }
}