package com.narxoz.rpg;

import com.narxoz.rpg.artifact.*;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.vault.ChronomancerEngine;
import com.narxoz.rpg.vault.VaultRunResult;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Homework 9 Demo: Visitor + Memento ===\n");


        Inventory inv1 = new Inventory();
        inv1.addArtifact(new Weapon("Fire Sword", 500, 5, 10));
        inv1.addArtifact(new Potion("Mana Juice", 40, 1, 20));
        Hero arthur = new Hero("Arthur", 100, 50, 20, 10, 300, inv1);

        Inventory inv2 = new Inventory();
        inv2.addArtifact(new Armor("Iron Plate", 200, 20, 15));
        inv2.addArtifact(new Ring("Gold Ring", 1000, 1, 5));
        inv2.addArtifact(new Scroll("Teleport", 150, 1, "Blink"));
        Hero merlin = new Hero("Merlin", 60, 200, 5, 5, 500, inv2);

        System.out.println("--- Special Inspection ---");
        EnchantmentScanner scanner = new EnchantmentScanner();
        inv2.accept(scanner);

        WeightCalculator weightCalc = new WeightCalculator();
        inv2.accept(weightCalc);
        System.out.println("Merlin's Inventory Weight: " + weightCalc.getTotalWeight() + " kg");

        ChronomancerEngine engine = new ChronomancerEngine();
        VaultRunResult result = engine.runVault(List.of(arthur, merlin));
        System.out.println("\n" + result);
    }
}
