package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicplayer = new MusicPlayer(music);

        System.out.println("Name of the song: " + music.getSong());
        musicplayer.playMusic();

        context.close();
    }
}
