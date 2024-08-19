/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication395;

/**
 *
 * @author steph
 */
/* Main class starts the game
All it does is run the constructor in GameFrame class

This is a common technique among coders to keep things organized (and handy when coding in repl.it since we're forced to call a class Main, which isn't always very descriptive)
*/ 

class Main {
  public static void main(String[] args) {

    new GameFrame();
    
  }
}