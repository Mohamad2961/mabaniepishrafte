public class mashintest {

    boolean ayamashinroshanast;
    boolean ayadarbazast;
    void roshan(){

        System.out.println("mashin roshan ast");
        ayamashinroshanast = true;
    }
    void khamoush(){
        System.out.println("mashin khamoush ast");
        ayamashinroshanast = false;
    }
    void bazkardandar(){
        System.out.println("dar baz ast");
        ayadarbazast = true;
    }
    void bastanedar(){
        System.out.println("dar baste ast");
        ayadarbazast = false;
    }
    void harkat(){
        if(!ayadarbazast && ayamashinroshanast){
            System.out.println("mashin dar hale harkat ast");

        }else {
            System.out.println("mashin saken ast");
        }
    }
}
