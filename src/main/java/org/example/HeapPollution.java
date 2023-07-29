package org.example;

import java.util.List;

public class HeapPollution {

    public void run(List<String>... lists){
        //warning: possible heap pollution
        //example: List<String> == List<Integer>
    }
}
