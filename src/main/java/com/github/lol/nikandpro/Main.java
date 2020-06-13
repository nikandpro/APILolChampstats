package com.github.lol.nikandpro;

import com.github.lol.nikandpro.model.game.GivenPlayer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GivenPlayer givenPlayer = new GivenPlayer();
        givenPlayer.setName(sc.nextLine());


    }

}
