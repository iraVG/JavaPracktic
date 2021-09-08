package lesson_paterns;


//***************AbstractFactory Method******************
public class Main {
    public static void main(String[] args) {
        Archer archer = new GoodSquad().createArcher();
        System.out.println(archer.shoot());
        Mage mage = new GoodSquad().createMage();
        System.out.println(mage.cast());

    }
}

abstract class Squad {
    public abstract Mage createMage();
    public abstract Archer createArcher();
}

interface Mage{
    int cast();

}

class GoodMage implements Mage{
    @Override
    public int cast() {
        return 200;
    }
}

class BadMage implements Mage{
    @Override
    public int cast() {
        return 100;
    }
}



interface Archer{
    int shoot();

}
class GoodArcher implements Archer{
    @Override
    public int shoot() {
        return 400;
    }
}
class BadArcher implements Archer{
    @Override
    public int shoot() {
        return 200;
    }
}

class GoodSquad extends Squad{
    @Override
    public Mage createMage() {
        return new GoodMage();
    }

    @Override
    public Archer createArcher() {
        return new GoodArcher();
    }
}

   class  BadSquad extends Squad{
@Override
public Mage createMage() {
        return new BadMage();
        }

@Override
public Archer createArcher() {
        return new BadArcher();
        }
        }
