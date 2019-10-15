package io.codefountain.project.lombok.constructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Recipe {

    private final String recipeId;
    @NonNull
    private String[] ingredients;
    private String recipeType;

}
