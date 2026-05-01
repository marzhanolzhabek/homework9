package com.narxoz.rpg.artifact;

public class GoldAppraiser implements ArtifactVisitor {
    private int totalValue = 0;
    public void visit(Weapon w) { totalValue += w.getValue() + 50; }
    public void visit(Potion p) { totalValue += p.getValue(); }
    public void visit(Scroll s) { totalValue += s.getValue() + 20; }
    public void visit(Ring r) { totalValue += r.getValue() * 2; }
    public void visit(Armor a) { totalValue += a.getValue() + 100; }
    public int getTotalValue() { return totalValue; }
}