import java.util.ArrayList;
import java.util.List;

public class Main {

    public enum Radiation {
        ALPHA_RAY,
        DELTA_RAY,
        NO_RAY
    }

    public static void main(String[] args) {
        int SIMULATION_DAY_NUMBER = 10;
        Ray ray = Ray.getInstance();
        Plan falank = new Puffancs("Falank", 7);
        Plan sudar = new Deltafa("Sudar", 5);
        Plan kopcos = new Parabokor("Kopcos", 4);
        Plan nyulank = new Deltafa("Nyulank", 3);
        List<Plan> planList = new ArrayList<>();
        planList.add(falank);
        planList.add(sudar);
        planList.add(kopcos);
        planList.add(nyulank);

        for (int i = 0; i < SIMULATION_DAY_NUMBER; i++) {
            for (Plan plan : planList) {
                plan.applyRay(ray);
            }
            if (ray.getChanceToAlphaRay() > ray.getChanceToDeltaRay() && ray.getChanceToAlphaRay() > ray.getChanceToNoRay()) {
                ray.setActualRay(Radiation.ALPHA_RAY);
            } else if (ray.getChanceToDeltaRay() > ray.getChanceToAlphaRay() && ray.getChanceToDeltaRay() > ray.getChanceToNoRay()) {
                ray.setActualRay(Radiation.DELTA_RAY);
            } else {
                ray.setActualRay(Radiation.NO_RAY);
            }
            ray.setAllRayChanceToZero();
            System.out.println(ray.getActualRay());
        }

        for (Plan plan : planList) {
            System.out.println(plan.toString());
        }

    }
}
