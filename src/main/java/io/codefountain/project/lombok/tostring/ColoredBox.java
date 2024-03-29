package io.codefountain.project.lombok.tostring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@Setter
public class ColoredBox extends Box {

    private String color;

}
