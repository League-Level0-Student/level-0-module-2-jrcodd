package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		for (int i = 0;; i++) {
		int animalChoice =	JOptionPane.showOptionDialog(null, "What animal do you like?", "Animal Noises", 0,
					JOptionPane.QUESTION_MESSAGE, null, new String[] { "llama", "cat", "cow", "duck", "dog" }, null);

		
			if (animalChoice == 0) {
				playNoise(llamaFile);
			} else if (animalChoice == 1) {
				playNoise(meowFile);
			} else if (animalChoice == 2) {
				playMoo();
			} else if (animalChoice == 3) {
				playQuack();
			} else if (animalChoice == 4) {
				playWoof();
			}	
		}

		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */

	} /* 2. Make it so that the user can keep entering new animals. */

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
