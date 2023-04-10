public class Movies {
    public int movie_id;
    public String mvNme;
    public String mvLang;
    public String mvtpe;
    public float mvDrtn;
    public String mvDscp;
    public Movies(int mvID,String mvNme,String mvLang,String mvTpe,float mvDrtn,String mvDscp){
        this.movie_id =mvID;
        this.mvNme = mvNme;
        this.mvLang = mvLang;
        this.mvtpe = mvTpe;
        this.mvDrtn = mvDrtn;
        this.mvDscp = mvDscp;

    }
    public void editMovie(){}
    public void searchMovie(){}

    @Override
    public String toString() {
        return "Movies{" +
                "movie_id=" + movie_id +
                ", mvNme='" + mvNme + '\'' +
                ", mvLang='" + mvLang + '\'' +
                ", mvtpe='" + mvtpe + '\'' +
                ", mvDrtn=" + mvDrtn +
                ", mvDscp='" + mvDscp + '\'' +
                '}';
    }
}
