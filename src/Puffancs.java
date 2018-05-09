public class Puffancs extends Plan {

    public Puffancs() {
    }

    public Puffancs(String name, int startingFeed) {
        this.setName(name);
        this.setFeedStuff(startingFeed);
    }

    @Override
    public void applyRay(Ray ray) {
        Main.Radiation actualRay = ray.getActualRay();
        switch (actualRay) {
            case ALPHA_RAY:
                this.applyIncomingFeedStuff(2);
                break;
            case DELTA_RAY:
                this.applyIncomingFeedStuff(-2);
                break;
            case NO_RAY:
                this.applyIncomingFeedStuff(-1);
                break;
        }
        ray.changeChanceToAlphaRay(10 - this.getFeedStuff());
    }
}
