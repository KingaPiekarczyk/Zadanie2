public class Apple extends Fruit {
    String variety;
public static final String Typ_owocu="jabłkowaty";
public Apple (float weight, String variety){
    super(Typ_owocu,weight);
this.variety=variety;
}
public String getInfo(){
    return super.getInfo()+ " typ owocu: "+variety;
}
public String toString(){
    return getInfo();

}
}
