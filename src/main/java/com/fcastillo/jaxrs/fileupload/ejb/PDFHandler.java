    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.jaxrs.fileupload.ejb;

import com.fcastillo.jaxrs.fileupload.event.FileEvent;
import com.fcastillo.jaxrs.fileupload.interfaces.FileHandler;
import com.fcastillo.jaxrs.fileupload.qualifiers.pdf;
import com.fcastillo.jaxrs.fileupload.utils.FileSystemUtils;
import java.io.IOException;
import java.util.Date;
import javax.ejb.Stateless;
import javax.enterprise.event.ObservesAsync;

/**
 *
 * @author fcastillo
 */
@Stateless
public class PDFHandler implements FileHandler{

    @Override
    public void handle(@ObservesAsync @pdf FileEvent file) throws IOException {
        System.out.println("NOMBRE: "+file.getFile().getName());
    }
   
}
