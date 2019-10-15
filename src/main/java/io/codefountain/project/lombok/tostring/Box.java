package io.codefountain.project.lombok.tostring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public abstract class Box {

    @ToString.Exclude
    private double height;
    private double width;
}
