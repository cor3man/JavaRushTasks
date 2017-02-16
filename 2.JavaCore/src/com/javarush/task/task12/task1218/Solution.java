package com.javarush.task.task12.task1218;

/* 
Fly, Move, Eat для классов Dog, Car, Duck, Airplane
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Move {
        public void move();
    }

    public interface Eat {
        public void eat();
    }

    public class Dog implements Move, Eat{
        public void move(){

        }
        @Override
        public void eat() {

        }
    }

    public class Duck implements Move, Eat,Fly{
        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }

        @Override
        public void fly() {

        }
    }

    public class Car implements Move{
        @Override
        public void move() {

        }
    }

    public class Airplane implements Move, Fly{
        @Override
        public void move() {

        }

        @Override
        public void fly() {

        }
    }
}