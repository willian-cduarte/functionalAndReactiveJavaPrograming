package org.example.reactive.section10.strategy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressToZip implements Strategy{
    @Override
    public void compressFile(String fileNames) {
        System.out.println(fileNames + " has been successfully converted to .zip file.");

        Path path = Path.of(fileNames);





    }
}
