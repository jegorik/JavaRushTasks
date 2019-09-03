package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        String fileExtension = "";
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
        if (!fileExtension.equals("txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
    }
}

