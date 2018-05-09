public abstract class Plan {
    private String name;
    private int feedStuff;
    private boolean alive = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFeedStuff() {
        return feedStuff;
    }

    public void setFeedStuff(int feedStuff) {
        this.feedStuff = feedStuff;
    }

    public void applyIncomingFeedStuff(int incomingFeedStuff) {
        feedStuff += incomingFeedStuff;
        if (feedStuff <= 0) {
            alive = false;
        }
    }

    public Boolean isAlive() {
        return alive;
    }

    public abstract void applyRay(Ray ray);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + this.getName() +
                " Feed stuff: " + this.getFeedStuff() +
                " Is alive: " + this.isAlive());
        return sb.toString();
    }
}
