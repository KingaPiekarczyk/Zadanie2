public class Fruit {
    float weight;
    String type;
    public Fruit(String type, float weight){
        this.weight=weight;
        this.type=type;
    }
// getInfo
    public String getInfo(){
        return "Rodzaj: " +type+" " + "waga "+weight;}
    public String toString(){
        return getInfo();
    }
}
