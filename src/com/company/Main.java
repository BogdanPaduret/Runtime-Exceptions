package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String text;

        text = "ArithmeticException";
        try {
            int x = 3 / 0;
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exceptie neprevazuta");
        } finally {
            System.out.println("Finalizat " + text + "\n");
        }

        text = "NullPointerException";
        try {
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(null);
            int x = integers.get(0);
        } catch (NullPointerException e) {
//            e.printStackTrace();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exceptie neprevazuta");
        }finally {
            System.out.println("Finalizat " + text + "\n");
        }

        text = "IndexOutOfBoundsException";
        try {
            ArrayList<Integer> integers = new ArrayList<>();
            int x = integers.get(0);
        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exceptie neprevazuta");
        }finally {
            System.out.println("Finalizat " + text + "\n");
        }

        text = "ArrayIndexOutOfBoundsException";
        try {
            String[] strings = new String[2];
            strings[0] = "abc";
            strings[1] = "def";
            strings[2] = "ghi";
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exceptie neprevazuta");
        }finally {
            System.out.println("Finalizat " + text + "\n");
        }

        text = "ClassCastException";
        try {
            Object object = new Object();
            Object exception = new Object();
            object = (Exception) object;
        } catch ( ClassCastException e) {
//            e.printStackTrace();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exceptie neprevazuta");
        }finally {
            System.out.println("Finalizat " + text + "\n");
        }

        text = "IllegalArgumentException";
        try {
            String string = "string";
            int integer = 2;
            ArrayList<Object> objects = new ArrayList<>();
            objects.add(string);
            objects.add(integer);
            Math.max(Integer.parseInt(string), integer);
        } catch ( IllegalArgumentException e) {
//            e.printStackTrace();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exceptie neprevazuta");
        }finally {
            System.out.println("Finalizat " + text + "\n");
        }

        text = "NoSuchElementException";
        try {
            File file = new File("src/com/company/file");
            Scanner scanner = new Scanner(file);
            String string = scanner.nextLine();
        } catch ( NoSuchElementException e) {
//            e.printStackTrace();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exceptie neprevazuta");
        }finally {
            System.out.println("Finalizat " + text + "\n");
        }

    }

}
