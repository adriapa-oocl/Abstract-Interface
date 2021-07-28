package model;

abstract class Chicken {
    public abstract void getCombination(int cockCount, int henCount, int chickenCount, int moneyCount);
}

class Combination extends Chicken {
    @Override
    public void getCombination(int cockCount, int henCount, int chickenCount, int moneyCount) {
        System.out.println("You can buy with these combinations: ");
        for (cockCount = 20; cockCount >= 0; cockCount--) {
            for (henCount = 33; henCount >= 0; henCount--) {
                for (chickenCount = 300; chickenCount >= 0; chickenCount -= 3) {
                    if ((cockCount * 5 + henCount * 3 + chickenCount / 3) == 100 && (cockCount + henCount + chickenCount) == 100) {
                        System.out.println("Cock count: " + cockCount + " Hen count: " + henCount + " Chicken count: " + chickenCount);
                        break;
                    }
                }
            }
        }
    }
}

public class GetCombination {
    public static void main(String[] args) {
        int cockCount = 200, henCount = 33, chickenCount = 300, yuanCount = 100;
        Chicken chickenCombination = new Combination();
        chickenCombination.getCombination(cockCount, henCount, chickenCount, yuanCount);
    }
}