public class Ray {
    private static Ray instance;
    private int chanceToAlphaRay = 0;
    private int chanceToDeltaRay = 0;
    private int chanceToNoRay = 0;
    private Main.Radiation actualRay = Main.Radiation.NO_RAY;

    private Ray() {
    }

    public static Ray getInstance() {
        if (instance == null) {
            instance = new Ray();
        }
        return instance;
    }

    public void setAllRayChanceToZero() {
        chanceToAlphaRay = 0;
        chanceToDeltaRay = 0;
        chanceToNoRay = 0;
    }

    public void changeChanceToAlphaRay(int chanceToAlphaRay) {
        this.chanceToAlphaRay += chanceToAlphaRay;
    }

    public void changeChanceToDeltaRay(int chanceToDeltaRay) {
        this.chanceToDeltaRay += chanceToDeltaRay;
    }

    public void changeChanceToNoRay(int chanceToNoRay) {
        this.chanceToNoRay += chanceToNoRay;
    }

    public int getChanceToAlphaRay() {
        return chanceToAlphaRay;
    }

    public void setChanceToAlphaRay(int chanceToAlphaRay) {
        this.chanceToAlphaRay = chanceToAlphaRay;
    }

    public int getChanceToDeltaRay() {
        return chanceToDeltaRay;
    }

    public void setChanceToDeltaRay(int chanceToDeltaRay) {
        this.chanceToDeltaRay = chanceToDeltaRay;
    }

    public int getChanceToNoRay() {
        return chanceToNoRay;
    }

    public void setChanceToNoRay(int chanceToNoRay) {
        this.chanceToNoRay = chanceToNoRay;
    }

    public Main.Radiation getActualRay() {
        return actualRay;
    }

    public void setActualRay(Main.Radiation actualRay) {
        this.actualRay = actualRay;
    }
}
