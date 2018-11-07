package Game;

import Rooms.Board;

import java.util.Scanner;

public class Runner
{
    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        Board[][] level = new Board[(int) Math.random() * 10][(int) Math.random() * 10];
    }
    Scanner in = new Scanner(System.in);
    while(gameOn)
    {
        System.out.println("Pick W,A,S,D to move");
        String move = in.nextLine();
        if(validMove(move, player1, level))
        {
            
        }
    }
}

