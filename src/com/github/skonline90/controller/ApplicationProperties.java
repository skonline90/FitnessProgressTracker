package com.github.skonline90.controller;

import java.io.File;

/**
 * This interface defines constants that contain the application properties.
 *
 * @author skonline90
 * @version 09.08.2018
 */
public interface ApplicationProperties
{
    public static final String APPLICATION_TITLE = "Fitness Progress Tracker";
    public static final String APPLICATION_VERSION = "0.0.1";
    public static final String FULL_APPLICATION_NAME = APPLICATION_TITLE + " "
            + APPLICATION_VERSION;

    public static final String SAVE_DIR_NAME = "save";
    public static final String SAVE_FILE_DIRECTORY_PATH = System
        .getProperty("user.dir") + File.separator + SAVE_DIR_NAME;
    public static final String SAVE_FILE_ENDING = ".fpts";
    public static final String SAVE_FILE_REGULAR_PREFIX = "r_";
    public static final String SAVE_FILE_ENDURANCE_PREFIX = "e_";
    public static final String SAVE_FILE_MACHINE_PREFIX = "m_";
    public static final String SAVE_FILE_PAIN_PREFIX = "p_";
}
