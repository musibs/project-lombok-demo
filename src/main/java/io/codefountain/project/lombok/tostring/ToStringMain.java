package io.codefountain.project.lombok.tostring;

/**
 * @author musib on 15/10/2019
 * @project project-lombok-demo
 */
public class ToStringMain {

    public static void main(String[] args) {

        ColoredBox box = new ColoredBox();
        box.setHeight(1.5);
        box.setWidth(2.5);
        box.setColor("Green");

        System.out.println(box.toString());
    }
}
