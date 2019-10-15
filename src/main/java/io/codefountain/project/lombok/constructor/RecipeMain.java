package io.codefountain.project.lombok.constructor;


public class RecipeMain {

    public static void main(String[] args) {

        Recipe recipe = new Recipe("R001", new String[]{"Vegetable Oil", "Spinach"});
        System.out.println(recipe);
    }
}
