package com.narxoz.rpg.vault;

public class VaultRunResult {
    private final int artifactsAppraised;
    private final int mementosCreated;
    private final int restoredCount;

    public VaultRunResult(int artifactsAppraised, int mementosCreated, int restoredCount) {
        this.artifactsAppraised = artifactsAppraised;
        this.mementosCreated = mementosCreated;
        this.restoredCount = restoredCount;
    }

    @Override
    public String toString() {
        return "--- Vault Run Summary ---\n" +
                "Artifacts Appraised: " + artifactsAppraised + "\n" +
                "Mementos Created: " + mementosCreated + "\n" +
                "Time Rewinds: " + restoredCount;
    }
}