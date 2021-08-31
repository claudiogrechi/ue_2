package day02.test2;

import java.io.File;
import java.io.FilenameFilter;

public class Photo {
    private File basedir;

    public Photo(File basedir) {
        this.basedir = basedir;
    }

    public File[] getPictures() {
        FilenameFilter picFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String s) {
                return s.toLowerCase().endsWith(".jpg") || s.toLowerCase().endsWith(".jpeg");
            }
        };
        return basedir.listFiles(picFilter);
    }

    //Aufgabe: Diese "innere Klasse" in der Methode getPictures() als anonyme Klasse implementieren.
    //class PicFilter implements FilenameFilter {
      //  public boolean accept(File f, String s) {
        //    return s.toLowerCase().endsWith(".jpg" ) || s.toLowerCase().endsWith(".jpeg" );
        //}
    //}

    public static void main(String[] args) {
        //Mac
        //Photo photo = new Photo(new File("./src/day02/test2"));
        //Windows
        Photo photo = new Photo(new File(".\\src\\day02\\test2"));
        for (File f: photo.getPictures()) {
            System.out.println(f.getName());
        }
    }
}
