package by.it.siarheikorbut.jd01_14;

import java.io.*;

public class TaskA {

    private static final String FILE_DATA = "file.data";
    private static final String SRC = "src";
    static final String USER_DIR = "user.dir";

    private static String gepPath() {
        String packageName = TaskA.class
                .getPackage()
                .getName()
                .replace(".", File.separator)
                .concat(File.separator);
        String root = System.getProperty("user.dir");
        return root + File.separator + SRC + File.separator + packageName;
    }

    public static void main(String[] args) {
        String filename = gepPath() + FILE_DATA;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
            for (int i = 0; i < 20; i++) {
                int n = -12345 / 2 + (int) (Math.random()*12345);
                dataOutputStream.writeInt(n);
            }
            dataOutputStream.writeInt(90 + (89 << 8) + (88 << 16) + 87 * 256 * 256 * 256);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
