
package extra;

import java.io.File;
import java.io.FileInputStream;

public class Foto {
    
    private final FileInputStream fis;
    private final File fich;

    public Foto(FileInputStream fis, File fich) {
        this.fis = fis;
        this.fich = fich;
    }

    public FileInputStream getFis() {
        return fis;
    }

    public File getFich() {
        return fich;
    }

    
}
