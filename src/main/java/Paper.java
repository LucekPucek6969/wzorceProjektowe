public class Paper implements WonIInterface {


    public POSIBILE_CASES wonIthisBattle(int i)  {
        if(i==0){
            System.out.println(POSIBILE_CASES.LOSE);
            return POSIBILE_CASES.LOSE;
        }
        if(i==1){
            System.out.println(POSIBILE_CASES.WIN);
            return POSIBILE_CASES.WIN;
        }
        else{
            System.out.println(POSIBILE_CASES.DRAW);
            return POSIBILE_CASES.DRAW;
        }
    }
}
