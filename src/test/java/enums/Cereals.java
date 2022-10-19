package enums;

public enum Cereals {
    CAPTAIN_CRUNCH(50),
    FROOT_LOOPS(60),
    REESES_PUFFS(100),
    COCOA_PUFS(75);

    int levelOfDeliciousness;
    Cereals(int levelOfDeliciousness){
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}
