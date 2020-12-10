package com.lesson.l3.hard;


import java.util.List;

/**
 Машину на СТО не повезем!
 Инициализируй поле wheels используя данные из loadWheelNamesFromDB.
 Выкинь исключение в случае некорректных данных.
 Подсказка: если что-то не то с колесами, то это не машина!
 Сигнатуры не менять.
 */
/*
Требования:
1. Enum Wheel в классе Main8 менять нельзя.
2. Сигнатуры в классе Car менять нельзя.
3. Во время создания машины нужно вызвать метод loadWheelNamesFromDB.
4. В случае возврата неправильных данных о колесах, нужно кинуть исключение.
5. Инициализируй поле wheels полученными данными.
*/
public class Main2 {

    public enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            //init wheels here

        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) throws Exception {

    }
}
