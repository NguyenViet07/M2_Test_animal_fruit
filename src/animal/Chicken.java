package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: Em là gà đây!";
    }
    @Override
    public String howToEat(){
        return "Chicken: Em ăn giun !";
    }
}
