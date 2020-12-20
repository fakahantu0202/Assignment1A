/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Fakhruddin
 */
public class surah {
    String alFatihah;
    String anNas;
    String alFalaq;
    String alIkhlas;
    
    public surah(String alFatihah,String anNas,String alFalaq,String alIkhlas){
        this.alFatihah = alFatihah;
        this.anNas = anNas;
        this.alFalaq = alFalaq;
        this.alIkhlas = alIkhlas;
    }
    public void setAlFatihah(String alFatihah){
        this.alFatihah = alFatihah;
    }
    public void setAnNas(String anNas){
        this.anNas = anNas;
    }
    public void setAlFalaq(String alFalaq){
        this.alFalaq = alFalaq;
    }
    public void setAlIkhlas(String alIkhlas){
        this.alIkhlas = alIkhlas;
    }
    public String getAlFatihah(){
        return alFatihah;
    }
    public String getAnNas(){
        return anNas;
    }
    public String getAlFalaq(){
        return alFalaq;
    }
    public String getAlIkhlas(){
        return alIkhlas;
    }

    void setSurah(String alFatihah, String anNas, String alFalaq, String alIkhlas) {
    }
}
