package com.company;

import java.util.Collections;
import java.util.Stack;

public class Main {

        public static void main(String[] args) {

            Stack<Integer> numbers = new Stack<Integer> ();
            numbers.push(1);
            numbers.push(2);
            numbers.push(3);
            numbers.push(4);
            numbers.push(5);
            numbers.push(6);
            numbers.push(7);
            numbers.push(8);
            numbers.push(9);
            numbers.push(10);
            numbers.push(11);
            System.out.println(numbers);
            Collections.reverse(numbers);
            System.out.println(numbers);
            Collections.reverse(numbers);
            numbers.remove(5);
            System.out.println(numbers);
        }
    }

