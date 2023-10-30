package Khodro;

public class Motor {
    boolean AyaRoshanAst;
    public void roshan(){
        AyaRoshanAst = true ;
    }
    public void khamoush(){
        AyaRoshanAst = false;
    }
    public boolean ayaDarHaleHarkatAst() {
        return  AyaRoshanAst;
    }
}

