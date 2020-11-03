package com.br.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileZipperUtil {
	
	private static List<String> filesListInDir;

    /**
     * This method zips the directory
     * @param dir
     */
    public static File zipDirectory(File dir) throws IOException {
    	File zippedFile = new File(dir.getPath() + ".zip");
    	filesListInDir = new ArrayList<String>();
        populateFilesList(dir);
        // now zip files one by one
        // create ZipOutputStream to write to the zip file
        FileOutputStream fos = new FileOutputStream(zippedFile.getPath());
        ZipOutputStream zos = new ZipOutputStream(fos);
        for (String filePath : filesListInDir) {
            // f or ZipEntry we need to keep only relative file path, so we used substring on absolute path
            ZipEntry ze = new ZipEntry(filePath.substring(dir.getAbsolutePath().length() + 1, filePath.length()));
            zos.putNextEntry(ze);
            // read the file and write to ZipOutputStream
            FileInputStream fis = new FileInputStream(filePath);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0) {
                zos.write(buffer, 0, len);
            }
            zos.closeEntry();
            fis.close();
        }
        zos.close();
        fos.close();
        return zippedFile;
    }
    
    /**
     * This method populates all the files in a directory to a List
     * @param dir
     * @throws IOException
     */
    private static void populateFilesList(File dir) throws IOException {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) filesListInDir.add(file.getAbsolutePath());
            else populateFilesList(file);
        }
    }
	
}
