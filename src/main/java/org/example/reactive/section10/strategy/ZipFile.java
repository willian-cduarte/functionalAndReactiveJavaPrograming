package org.example.reactive.section10.strategy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {

    public void execute(Path filePath) throws IOException {

        var fileName = filePath.toString();
        var zipFileName = fileName.replaceAll("csv", "zip");

        FileInputStream fileIn = new FileInputStream(fileName);
        var zipFile = new ZipOutputStream(new FileOutputStream(zipFileName));
        zipFile.putNextEntry(new ZipEntry(fileName));
        var lenRead = 0;
        var buf = new byte[1024];
        while ((lenRead = fileIn.read(buf)) > 0) {
            zipFile.write(buf, 0, lenRead);
        }

        fileIn.close();
        zipFile.close();
    }
}
