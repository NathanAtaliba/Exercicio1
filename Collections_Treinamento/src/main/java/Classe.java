public abstract class Classe implements Comparable<Classe>{
    private String string;
    private int num;
    public Classe(String string,int num){
this.num= num;
this.string = string;
    }
@Override
    public int compareTo(Classe classe){
      if(this.num < classe.num){
          return 1;
      }
      if(this.num > classe.num){
          return -1;
      }
      return 0;
    }
    public int getNum() {
        return num;
    }
}
