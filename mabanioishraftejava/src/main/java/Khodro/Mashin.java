package Khodro;
public class Mashin extends khodro{
       boolean AyaDarBazAst;
    String mark;
    ranande ranande;
    public Mashin(){

    }
    public Mashin(String mark) {
        this.mark = mark;
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
