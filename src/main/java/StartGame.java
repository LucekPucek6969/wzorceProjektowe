import java.util.Random;

public class StartGame {
    public static void start(String type){
        Random random=new Random();
        int randomNumber = random.nextInt(3);

        if(type.equals("s")){
            Scissors scissors=new Scissors();
            scissors.wonIthisBattle(randomNumber);

        }
        if(type.equals("p")){
            Paper paper=new Paper();
            paper.wonIthisBattle(randomNumber);


        }
        if (type.equals("r")){
            Rock rock=new Rock();
            rock.wonIthisBattle(randomNumber);
        }
    }
    }

