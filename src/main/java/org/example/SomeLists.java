package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;


public class SomeLists {

    // такая структура может быть полезна только для чтения
    List<? extends Number> numbers = new ArrayList<>();// можно положить только null

    //по сути это реальный extends Number
    List<? super Number> numbers2 = new ArrayList<>();// можно положить Number, Integer, Long и т.д. но не Object


}
