package com.github.skonline90.controller;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class SaveFileManager
{
    /**
     * Tests whether the file with the given filename exists in save directory.
     * 
     * @param filename filename with or without ending (.fpts)
     */
    private boolean saveFileExists(String filename)
    {
        File saveDir = new File(ApplicationProperties.SAVE_FILE_DIRECTORY_PATH);
        FilenameFilter fileNameEndingFilter = new FilenameFilter()
        {
            @Override
            public boolean accept(File dir, String name)
            {
                return name.endsWith(ApplicationProperties.SAVE_FILE_ENDING);
            }
        };

        File fileWithExtension, fileWithoutExtension;
        File[] files = saveDir.listFiles(fileNameEndingFilter);
        fileWithExtension = new File(
                saveDir.getAbsolutePath() + File.separator + filename);
        fileWithoutExtension = new File(
                saveDir.getAbsolutePath() + File.separator + filename
                        + ApplicationProperties.SAVE_FILE_ENDING);
        for (int i = 0; i < files.length; i++)
        {
            if (fileWithExtension.exists() || fileWithoutExtension.exists())
                return true;
        }
        return false;
    }

    /**
     * Creates a savefile with the given filename in the savefile directory.
     * 
     * @param filename Filename with or without file extension.
     * @return true, if the file was created.
     * @throws IOException If an IO Error occures.
     */
    public boolean createSaveFile(String filename) throws IOException
    {
        if (!saveFileExists(filename))
        {
            File file;
            if (!filename.endsWith(ApplicationProperties.SAVE_FILE_ENDING))
            {
                file = new File(ApplicationProperties.SAVE_FILE_DIRECTORY_PATH
                        + File.separator + filename
                        + ApplicationProperties.SAVE_FILE_ENDING);
            }
            else
            {
                file = new File(ApplicationProperties.SAVE_FILE_DIRECTORY_PATH
                        + File.separator + filename);
            }
            if (file.createNewFile()) return true;
        }
        return false;
    }

    /**
     * Checks whether the save file directory exists and creates it
     * in case it didn't.
     * 
     * @return true, if the directory was successfully created.
     */
    public boolean createSaveDir()
    {
        File saveFileDir = new File(
                ApplicationProperties.SAVE_FILE_DIRECTORY_PATH);
        if (!(saveFileDir.exists() && saveFileDir.isDirectory()))
        {
            saveFileDir.mkdirs();
            return true;
        }
        return false;
    }

    // For testing
    public static void main(String[] args) throws IOException
    {
        SaveFileManager manager = new SaveFileManager();
        boolean saveFileCreated = manager.createSaveFile("liegestütz.fpts");
        System.out.println(saveFileCreated);
    }
}
