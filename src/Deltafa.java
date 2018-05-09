public class Deltafa extends Plan {

    public Deltafa() {
    }

    public Deltafa(String name, int startingFeed) {
        this.setName(name);
        this.setFeedStuff(startingFeed);
    }

    @Override
    public void applyRay(Ray ray) {
        Main.Radiation actualRay = ray.getActualRay();
        switch (actualRay) {
            case ALPHA_RAY:
                this.applyIncomingFeedStuff(-3);
                break;
            case DELTA_RAY:
                this.applyIncomingFeedStuff(4);
                break;
            case NO_RAY:
                this.applyIncomingFeedStuff(-1);
                break;
        }
        if (this.getFeedStuff() < 5) {
            ray.changeChanceToDeltaRay(4);
        } else if (this.getFeedStuff() > 5 && this.getFeedStuff() < 10) {
            ray.changeChanceToDeltaRay(1);
        }
    }
}
