package Khodro;
public class Mashin {
    boolean AyaRoshanAst;
    boolean AyaDarBazAst;
    String mark;
    ranande ranande;
    public Mashin(){

    }
    public Mashin(String mark) {
        this.mark = mark;
    }

    public void roshan(){
        AyaRoshanAst = true ;
    }

    void khamoush(){
        AyaRoshanAst = false;
    }
    void bazkardanedar(){
        AyaDarBazAst = true;
    }

    void bastanedar(){
        AyaDarBazAst = false;
    }

    public boolean ayaDarHaleHarkatAst(){
        if (!AyaDarBazAst && AyaRoshanAst){
            return true;
        }
        else {
            return false;
        }

    }
}
