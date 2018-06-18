package builder.pattern;

public class Labor {

    public static void main(String[] args) {
        NutritionFacts facts = new NutritionFacts.Builder(240, 2).calories(100).sodium(35)
                .carbohydrate(27).build();

        System.out.println(facts);
    }

}
