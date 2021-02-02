
package com.fcastillo.jaxrs.fileupload.event;

import java.io.File;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author fcastillo
 */
@Getter
@Setter
public class FileEvent {

    private File file;
    private String mimeType;

    public FileEvent() {
    }

    public FileEvent(File file, String mimeType) {
        this.file = file;
        this.mimeType = mimeType;
    }
    
}
