package com.javarush.task.task16.task1631;


import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public ImageReaderFactory() {
    }

    public static ImageReader getImageReader(ImageTypes type) {
        ImageReader result;
        if (type == ImageTypes.BMP) {
            result = new BmpReader();
        } else if (type == ImageTypes.JPG) {
            result = new JpgReader();
        } else if (type == ImageTypes.PNG) {
            result = new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return result;
    }
}
