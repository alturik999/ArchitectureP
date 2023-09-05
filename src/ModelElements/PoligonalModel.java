package ModelElements;

public class PoligonalModel {
    public List<Texture> textures;
    public List<Poligon> poligonas;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        poligonas = new ArrayList<>();
    }
}
