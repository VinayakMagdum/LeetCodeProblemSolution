package examples.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/design-a-food-rating-system/
 */
public class ProblemNumber2353 {
    Map<String, Integer> foodRating = new HashMap<>();
    Map<String, List<String>> cuisinesFood = new HashMap<>();
//    class Food {
//        Food() {
//
//        }
//    }

    public ProblemNumber2353(String[] foods, String[] cuisines, int[] ratings) {
        initiliaseMaps(foods, cuisines, ratings);
    }

    public void initiliaseMaps(String[] foods, String[] cuisines, int[] ratings) {
        int length = foods.length;
        for(int i = 0; i < length; i++) {
            foodRating.put(foods[i], ratings[i]);
            if (cuisinesFood.containsKey(cuisines[i])) {
                cuisinesFood.get(cuisines[i]).add(foods[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(foods[i]);
                cuisinesFood.put(cuisines[i], list);
            }
        }
    }

    public static void main(String[] args) {

//        ProblemNumber2353 foodRatings = new ProblemNumber2353(
//            new String[] {"cpctxzh","bryvgjqmj","wedqhqrmyc","ee","lafzximxh","lojzxfel","flhs"},
//            new String[] {"korean", "japanese", "japanese", "greek", "japanese", "korean"},
//            new int[] {9, 12, 8, 15, 14, 7}
//        );
//
//        System.out.println(foodRatings.highestRated("korean")); // return "kimchi"
//        // "kimchi" is the highest rated korean food with a rating of 9.
//        System.out.println(foodRatings.highestRated("japanese")); // return "ramen"
//        // "ramen" is the highest rated japanese food with a rating of 14.
//        foodRatings.changeRating("sushi", 16); // "sushi" now has a rating of 16.
//        System.out.println(foodRatings.highestRated("japanese")); // return "sushi"
//        // "sushi" is the highest rated japanese food with a rating of 16.
//        foodRatings.changeRating("ramen", 16); // "ramen" now has a rating of 16.
//        System.out.println(foodRatings.highestRated("japanese")); // return "ramen"
//        // Both "sushi" and "ramen" have a rating of 16.
//        // However, "ramen" is lexicographically smaller than "sushi".

        ProblemNumber2353 foodRatings = new ProblemNumber2353(
            new String[] {"cpctxzh","bryvgjqmj","wedqhqrmyc","ee","lafzximxh","lojzxfel","flhs"},
            new String[] {"wbhdgqphq","wbhdgqphq","mxxajogm","wbhdgqphq","wbhdgqphq","mxxajogm","mxxajogm"},
            new int[] {15,5,7,16,16,10,13}
        );
        foodRatings.changeRating("lojzxfel",1);
        System.out.println(foodRatings.highestRated("mxxajogm"));
        System.out.println(foodRatings.highestRated("wbhdgqphq"));
        System.out.println(foodRatings.highestRated("mxxajogm"));
    }

    public void changeRating(String food, int newRating) {
        if(foodRating.containsKey(food)) {
            foodRating.put(food, newRating);
        }
    }

    public String highestRated(String cuisine) {
        String ans = "";
        if (cuisinesFood.containsKey(cuisine)) {
            List<String> foods = cuisinesFood.get(cuisine);
            int highRated = 0;
            String prevSameFood = "";
            for(String food : foods) {
                if (foodRating.get(food) >= highRated) {
                    if (highRated == foodRating.get(food)) {
                        ans = food.compareTo(prevSameFood) > 1 ? prevSameFood : food;
                        prevSameFood = ans;
                    } else {
                        ans = food;
                        prevSameFood = ans;
                    }
                    highRated = foodRating.get(food);
                }
            }
        }
        return ans;
    }
}
