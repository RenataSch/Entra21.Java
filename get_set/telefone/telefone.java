public class Telefone {
    
    private int DDD;
    private int prim;
    private int ult;
    
    public void setDDD (int DDD) {
        this.DDD = DDD;
    }
    public void setPrim (int prim) {
        this.prim = prim;
    }
    public void setUlt (int ult) {
        this.ult = ult;
    }
    public int getDDD(){
        return this.DDD;
    }
    public int getPrim(){
        return this.prim;
    }
    public int getUlt(){
        return this.ult;
    }
    public String toString(){
        return "(" + this.DDD + ")" + this.prim + "-" + this.ult;
    }
}
