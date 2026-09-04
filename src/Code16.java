class computer{
    public void playMusic(){
        System.out.println("Paying the Musics .....");
    }

    public String getMeAPen(int num){
        if (num > 9) {
            return "pen";
        }else {
            return "no pen";
        }
    }
}


public class Code16 {
    public static void main ( String[ ] a){

    computer obj = new computer();
    obj.playMusic();
    String str = obj.getMeAPen(324);
    System.out.println(str);


    }
}
