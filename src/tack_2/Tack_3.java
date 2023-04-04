//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
/*package tack_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tack_3 {
    private static final Logger LOG  = Log.log(Tack_3.class.getName());
    public static void write() {

        try(FileWriter in = new FileWriter("test.txt")){
            String[] data = getFilesInFolder(path);
            for (String datum :data) {
                in.append(datum)    ;
            }
        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);
        }


    public static String[] getFilesInFolder(String path) {
        File dir = new File(path);//папка в которой будет наш массив файлов
        String[] result = new String[0];//названия всех файлов а названия всех файлов мы будем брать из папки
        File[] files;
        if (dir.isDirectory()) {//проверка что нам дают папку ли
            files = dir.listFiles();//здесь бежим по массиву файлов
            if (files != null) {//проверяем есть ли файлы в этой папке
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    String name = files[i].getName();
                    if (files[i].isFile()) {
                        System.out.println("\tFile - " + name);
                    } else {
                        System.out.println("Directory - " + name);
                    }
                    result[i] = name;
                }
            }


        } else {
            System.out.println(dir.getName() + "не является папкой");
        }
    return result;
    }}}*/