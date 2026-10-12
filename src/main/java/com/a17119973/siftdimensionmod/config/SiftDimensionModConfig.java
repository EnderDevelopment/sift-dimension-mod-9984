package com.a17119973.siftdimensionmod.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SiftDimensionModConfig {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final File CONFIG_FILE = new File("config/siftdimensionmod.json");

    public static void loadConfig() {
        if (!CONFIG_FILE.exists()) {
            saveConfig();
        }

        try (FileReader reader = new FileReader(CONFIG_FILE)) {
            // Load config here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveConfig() {
        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            // Save config here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}