import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.VFS;

public class Sample {

    public static void main(String[] args) throws FileSystemException {
        String filePath = args[0];
        FileSystemManager fsManager = VFS.getManager();
        FileObject file = fsManager.resolveFile(filePath);
        System.out.println(file.exists());
    }
}
