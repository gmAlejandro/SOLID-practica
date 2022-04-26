package com.kreitek.service;

import com.kreitek.files.File;
import com.kreitek.files.error.InvalidFileFormatException;
import com.kreitek.interfaces.FileSystemItem;

public class Converter {

    public static FileSystemItem convertMp3ToWav(File file) {
        if (!"mp3".equalsIgnoreCase(file.getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser mp3");
        }

        int indexOfLastDot = file.getName().lastIndexOf(".");
        String nameWithoutExtension = file.getName();
        if (indexOfLastDot > 0) {
            nameWithoutExtension = file.getName().substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".wav";
        FileSystemItem result = new File(file.getParent(), newFileName);

        // Lógica de conversión de mp3 a wav. Se lee de este fichero y se escribe en result

        return result;
    }

    public static FileSystemItem ConvertWavToMp3(File file) {
        if (!"wav".equalsIgnoreCase(file.getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser wav");
        }

        int indexOfLastDot = file.getName().lastIndexOf(".");
        String nameWithoutExtension = file.getName();
        if (indexOfLastDot > 0) {
            nameWithoutExtension = file.getName().substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".mp3";
        FileSystemItem result = new File(file.getParent(), newFileName);
        // Lógica de conversión de wav a mp3. Se lee de este fichero y se escribe en result

        return result;
    }
}
