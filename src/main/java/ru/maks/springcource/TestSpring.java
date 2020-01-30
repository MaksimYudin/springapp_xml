package ru.maks.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //TestBean testBean = context.getBean("testBean", TestBean.class);
        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //MusicPlayer musicPlayer = context.getBean("musicPlayerOnConstructor", MusicPlayer.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayerInSetter", MusicPlayer.class);
        musicPlayer.playMusic();

        //List<Music> meList = context.getBean("myList", java.util.ArrayList.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayerListArgs", MusicPlayer.class);
        musicPlayer2.playMusicList();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        RockMusic music1 = context.getBean("musicBean", RockMusic.class);
        RockMusic music2 = context.getBean("musicBean", RockMusic.class);
        System.out.println(music1 == music2);

        context.close();
    }
}
