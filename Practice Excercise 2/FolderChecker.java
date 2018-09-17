package com.company;

import java.io.*;


public class FolderChecker{

    public static String[] checkFolder(String fileName) {
        File f = new File(fileName);
        File[] listOfFiles = f.listFiles();
//        new FilenameFilter()
//        {
//            public boolean accept(File f, String name)
//            {
//                return name.endsWith(".java");
//            }
//        });
        String[] fileList = new String[listOfFiles.length];
        for(int i =0 ;i<listOfFiles.length;i++){
            fileList[i]= listOfFiles[i].getName();
            System.out.println(listOfFiles[i].getName());
        }

        return fileList;
    }

}
