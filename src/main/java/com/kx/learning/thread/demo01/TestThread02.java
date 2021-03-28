package com.kx.learning.thread.demo01;

import org.apache.commons.io.FileUtils;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

public class TestThread02 {
    static String path = "src/main/java/com/kx/learning/thread/demo01"
            .replace("/", File.separator);


    public static void main(String[] args) {
        try {
            File dir = ResourceUtils.getFile(path);
            File[] files = dir.listFiles();
            for (File file : files) {
                System.out.println(file.getAbsolutePath());
                System.out.println(file.isDirectory());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// Downloader
class WebDownloader {
    // Download method
    public void downloader(String url, String filename) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Exception, error occurred in downloader method");
        }
    }
}
