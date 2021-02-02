/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.jaxrs.fileupload.resources;


import com.fcastillo.jaxrs.fileupload.event.FileEvent;
import com.fcastillo.jaxrs.fileupload.qualifiers.pdf;
import java.io.File;
import java.util.Objects;
import javax.enterprise.event.Event;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author fcastillo
 */
@Path("/upload")
public class FileUploadResource {

    @Inject
    Event<FileEvent> fileEvent;

    @Consumes("application/pdf")
    @POST
    public Response uploadFile(File file) {
        FileEvent fileEvento = new FileEvent(file, "pdf"); 
        
        Event<FileEvent> pdfEvent = this.fileEvent.select(new AnnotationLiteral<pdf>(){});
        
        pdfEvent.fireAsync(fileEvento).whenCompleteAsync((event, error)->{
            if (Objects.isNull(error)) {
                System.out.println("...Gu");
            }
        });
        
        return Response.ok().build();
    }
}
