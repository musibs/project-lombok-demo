package io.codefountain.project.lombok.constructor;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Feature {

    private String featureId;
    private String featureDescription;
    private Date featureImplementationDate;
}
