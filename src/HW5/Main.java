package HW5;

import HW5.tack.Tack1;
import HW5.tack.Tack2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Tack2.class.getName());//логгер создали
        FileHandler fileHandler = new FileHandler("log.txt");//файлхэндлер создали
        logger.addHandler(fileHandler);//подключение логгера к файлу
        logger.warning("Что-то пошло не так: ");//вывод сообщения
        fileHandler.close();//Закрытие именно файлхэнжлера не ЛОГЕРА!!!!


        //Tack1.run();
        Tack2.sortedName();
    }
}
