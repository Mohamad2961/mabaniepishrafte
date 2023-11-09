package Khodro;
public class Mashin extends khodro implements SandoghDar,Geabox{
       boolean AyaDarBazAst;
    String mark;
    int gonjayeshsandogh;
    String noedande;
    ranande ranande;
    public Mashin(){

    }
    public Mashin(String mark) {
        this.mark = mark;
    }

    public Mashin(String mark, int gonjayeshsandogh, String noedande) {
        this.mark = mark;
        this.gonjayeshsandogh= gonjayeshsandogh;
        this.noedande = noedande;
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

    @Override
    public String typedande() {
        return "Automatic";
    }

    @Override
    public int gonjayeshesabdogh() {
        return 100;
    }
}
