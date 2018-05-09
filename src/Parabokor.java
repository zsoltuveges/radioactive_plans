public class Parabokor extends Plan {

    public Parabokor() {
    }

    public Parabokor(String name, int startingFeed) {
        this.setName(name);
        this.setFeedStuff(startingFeed);
    }

    @Override
    public void applyRay(Ray ray) {
        if (ray.getActualRay() == Main.Radiation.NO_RAY) {
            this.applyIncomingFeedStuff(-1);
        } else {
            this.applyIncomingFeedStuff(1);
        }
    }
}
