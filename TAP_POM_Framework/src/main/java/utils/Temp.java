package utils;

import java.io.File;

public class Temp {
    
    public static void main(String[] args) {
	int count = new File(".\\reports\\images").list().length;
	System.out.println("File count"+count);
    }

}
