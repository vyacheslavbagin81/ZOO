public class Lion {
    public float height;
    public float weight;
    public Color color;
    public enum Color{Red, Green, Noir}

    public Lion(float height, float weight, Color color) {
        this.height = height;
        this.weight = weight;
        this.color=color;
    }

    public void growl(){
        System.out.println("G-R-R-R!!!");
    }
    public void eat (float food){
        weight += food;
    }
}
