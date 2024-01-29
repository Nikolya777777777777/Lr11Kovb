public class Flower implements Petal{

    private String color;

    public Flower(String color){
        this.color = color;
    }



    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public void toBlossom(){
        print("The flower is blossoming");
    }

    @Override
    public void fadeAway(){
        print("The flower is fading away");
    }

    private void print(String str){
        System.out.println(str);
    }
}
