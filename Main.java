/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Fakhruddin
 */
public class Main {
    public static void main(String[] args) {
        peserta p = new peserta("Faka","rudin");
        surah s = new surah("Al-Fatihah","An-Nas","Al-Falaq","Al-Ikhlas");
        System.out.println("Nama Peserta : "+ p.toString());
        
        s.setSurah("AlFatihah","AnNas","AlFalaq","AlIkhlas");
        System.out.println("Surah Pertama : "+s.getAlFatihah());
        System.out.println("Surah Ke-Dua : "+s.getAnNas());
        System.out.println("Surah ke-Tiga : "+s.getAlFalaq());
        System.out.println("Surah Ke-Empat : "+s.getAlIkhlas());
        
    }  
}
