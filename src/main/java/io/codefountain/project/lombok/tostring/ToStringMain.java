package io.codefountain.project.lombok.tostring;

public class ToStringMain {

    public static void main(String[] args) {

        ColoredBox box = new ColoredBox();
        box.setHeight(1.5);
        box.setWidth(2.5);
        box.setColor("Green");

        System.out.println(box.toString());
    }
}
