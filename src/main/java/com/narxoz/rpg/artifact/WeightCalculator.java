package com.narxoz.rpg.artifact;

public class WeightCalculator implements ArtifactVisitor {
    private int totalWeight = 0;
    public void visit(Weapon w) { totalWeight += w.getWeight(); }
    public void visit(Potion p) { totalWeight += p.getWeight(); }
    public void visit(Scroll s) { totalWeight += s.getWeight(); }
    public void visit(Ring r) { totalWeight += r.getWeight(); }
    public void visit(Armor a) { totalWeight += a.getWeight(); }
    public int getTotalWeight() { return totalWeight; }
}