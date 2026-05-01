package com.narxoz.rpg.vault;

import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.memento.Caretaker;
import com.narxoz.rpg.artifact.GoldAppraiser;
import java.util.List;

public class ChronomancerEngine {
    public VaultRunResult runVault(List<Hero> party) {
        Caretaker caretaker = new Caretaker();
        int appraised = 0;
        int saved = 0;
        int restored = 0;

        for (Hero hero : party) {
            System.out.println("\n>>> Chronomancer activates the vault for " + hero.getName());


            caretaker.save(hero.createMemento());
            saved++;

            GoldAppraiser appraiser = new GoldAppraiser();
            hero.getInventory().accept(appraiser);
            appraised += hero.getInventory().getArtifacts().size();
            System.out.println("Appraised Value: " + appraiser.getTotalValue() + " gold.");


            System.out.println("!! A TIME TRAP EXPLODES !!");
            hero.takeDamage(80);
            hero.spendGold(100);
            System.out.println("State after trap: " + hero);

            System.out.println("Rewinding time to the crystal snapshot...");
            hero.restoreFromMemento(caretaker.undo());
            restored++;
            System.out.println("State after rewind: " + hero);
        }

        return new VaultRunResult(appraised, saved, restored);
    }
}