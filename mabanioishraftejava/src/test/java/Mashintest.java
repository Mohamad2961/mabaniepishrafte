import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Mashintest {
    @Test
    void Mashin_Bayad_Harkat_konad_Vaghti_Dar_Baste_Ast_Va_Mashin_Roshan_Ast() {
        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("volvo");
        boolean ayaharkatmikonad = benz.AyaMashinDarHaleHarkatAst();
        volvo.roshan();
        boolean ayavolvoharkatmikonad = volvo.AyaMashinDarHaleHarkatAst();

        Assertions.assertTrue(ayaharkatmikonad);
        Assertions.assertFalse(ayavolvoharkatmikonad);

//        Mashin mashin = new Mashin();
//        mashin.bazkardanedar();
//        mashin.bastanedar();
//        System.out.println("dare mashin baz ast?"+mashin.AyaDarBazAst);
//        mashin.harkat();
//        System.out.println("----------------------------------------");
//        Mashin pride = new Mashin("pride");
//        pride.roshan();
//        pride.bazkardanedar();
//        pride.harkat();
    }


    class Mashin{
        boolean AyaMashinROshanAst;
        boolean AyaDarBazAst;
        String mark;
        Mashin(){
            System.out.println("yek mashin bedune dade sakhte shod");
        }
        Mashin(String mark) {
            this.mark = mark;
            System.out.println("yek mashine "+this.mark+" sakhte shod");
        }

        void roshan(){
            System.out.println("mashin roshan ast");
            AyaMashinROshanAst = true ;
        }

        void khamoush(){
            System.out.println("mashin khamoush ast");
            AyaMashinROshanAst = false;
        }
         void bazkardanedar(){
             System.out.println("dar baz ast");
             AyaDarBazAst = true;
         }

         void bastanedar(){
             System.out.println("dar baste ast");
             AyaDarBazAst = false;
         }

         boolean AyaMashinDarHaleHarkatAst(){
            if (!AyaDarBazAst && AyaMashinROshanAst){
                System.out.println("mashin dar hale harkat ast");
                return true;
            }
            else {
                System.out.println("mashin saken ast");
                return false;
            }

         }
    }
}
