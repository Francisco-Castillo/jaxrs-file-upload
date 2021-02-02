/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.jaxrs.fileupload.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

/**
 *
 * @author fcastillo
 */
public class FileSystemUtils {

    public static String save(File file, String path, String fileName) throws IOException {

        new File(System.getProperty("java.io.tmpdir") + "/" + path).mkdirs();
        File fileToSave = new File(System.getProperty("java.io.tmpdir") + "/" + path + "/" + fileName);

        try (InputStream input = new FileInputStream(file)) {

            Files.copy(input, fileToSave.toPath());

        }

        return fileToSave.getAbsolutePath();

    }
}
