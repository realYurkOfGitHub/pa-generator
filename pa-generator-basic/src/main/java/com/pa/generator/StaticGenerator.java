package com.pa.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class StaticGenerator {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        File parentFilte = new File(projectPath).getParentFile();
        String inputPath = new File(parentFilte,"pa-generator-demo-projects/").getAbsolutePath();
        String outputPath = projectPath;
        copyFilesByHutool(inputPath,outputPath);
    }

    /**
     * 拷贝文件（Hutool 实现，会将输入目录完整拷贝到输出目录下）
     * @param inputPath
     * @param outputPath
     */
    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }
}
