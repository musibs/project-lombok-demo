package io.codefountain.project.lombok.equalsandhashcode;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author musib on 15/10/2019
 * @project project-lombok-demo
 */
@EqualsAndHashCode
@Getter
@Setter
public class SongsAlbum {

    private static int staticField;
    private String albumName;
    private int yearOfRelease;
    private String[] singer;
    private int noOfSongs;
    private transient String publisher;
}
