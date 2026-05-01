package com.narxoz.rpg.artifact;

public class EnchantmentScanner implements ArtifactVisitor {
    public void visit(Weapon w) { System.out.println("[Scan] Weapon: " + w.getName() + " (Atk: +" + w.getAttackBonus() + ")"); }
    public void visit(Potion p) { System.out.println("[Scan] Potion: " + p.getName() + " (Heal: " + p.getHealing() + ")"); }
    public void visit(Scroll s) { System.out.println("[Scan] Scroll: " + s.getSpellName()); }
    public void visit(Ring r) { System.out.println("[Scan] Ring: " + r.getName() + " (Magic: +" + r.getMagicBonus() + ")"); }
    public void visit(Armor a) { System.out.println("[Scan] Armor: " + a.getName() + " (Def: +" + a.getDefenseBonus() + ")"); }
}