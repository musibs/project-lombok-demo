package io.codefountain.project.lombok.constructor;

import java.util.Date;

public class FeatureMain {

    public static void main(String[] args) {

        Feature feature1 = new Feature();
        System.out.println("Feature 1:"+feature1.toString());

        Feature feature2 = new Feature("F001", "Adding a new theme", new Date());
        System.out.println("Feature 2:"+feature2.toString());
    }
}
