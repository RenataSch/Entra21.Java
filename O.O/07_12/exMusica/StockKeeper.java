public class StockKeeper {
    private String name;
    StockKeeper(String name){
        setName(name);
    }
    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies){
        album.setName(name);
        album.setArtist(artist);
        album.setPrice(price);
        album.setNumberOfCopies(numberOfCopies);
        System.out.println("Album gerenciado por:" +getName());
        System.out.println("Detalhes do album");
        System.out.println("Nome do album " + album.getName());
        System.out.println("Artista do album: " +album.getArtist());
        System.out.println("Preço do Album: " + album.getPrice());
        System.out.println("Número de cópias do album: " + album.getNumberOfCopies());
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
}