/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sonido;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sonido extends Thread {

    public void run() {
        try {
            Clip sonido = AudioSystem.getClip();
//            File a = new File("Balloon.wav.wav");//pc casa
            File a = new File("/home/local/DANIELCASTELAO/igonzaleziglesias/Escritorio/Balloon.wav");//pc clase
            sonido.open(AudioSystem.getAudioInputStream(a));
            sonido.start();
            Thread.sleep(200); // 200 milisegundos (0.2segundos)
            sonido.close();
        } catch (Exception tipoError) {
            System.out.println("" + tipoError);
        }
    }
}
