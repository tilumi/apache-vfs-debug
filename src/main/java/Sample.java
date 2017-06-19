import java.io.File;
import java.io.IOException;

import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.VFS;

public class Sample {

    public static void main(String[] args) throws IOException {
        String filePathWithScheme = args[0];
        FileSystemManager fsManager = VFS.getManager();
        FileObject file = fsManager.resolveFile(filePathWithScheme);
        System.out.println(file.exists());
        String filePath = filePathWithScheme.substring(7);
        File f = new File(filePath);
        System.out.println(
                "f exists" + f.exists() +
                        ", is dir " + f.isDirectory() +
                        ", is file " + f.isFile() +
                        ", norm " + f.getCanonicalPath() +
                        ", len " + f.length());
    }
}
