/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.jaxrs.fileupload.interfaces;

import com.fcastillo.jaxrs.fileupload.event.FileEvent;
import java.io.IOException;

/**
 *
 * @author fcastillo
 */
public interface FileHandler {

    public void handle(FileEvent file) throws IOException;
}
