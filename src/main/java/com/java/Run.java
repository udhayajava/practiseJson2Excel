package com.java;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        JsonToExcel jsonToExcel = new JsonToExcel();
        jsonToExcel.jsonReader();
        jsonToExcel.writeExcel();
        jsonToExcel.Excel();

    }
}
