package q6;

import e1.C1025e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class t extends l {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public C1025e K(x path) {
        kotlin.jvm.internal.m.e(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new C1025e(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final s M(x xVar) {
        return new s(new RandomAccessFile(xVar.toFile(), "r"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final E W(x file, boolean z5) throws IOException {
        kotlin.jvm.internal.m.e(file, "file");
        if (z5 && v(file)) {
            throw new IOException(file + " already exists.");
        }
        File file2 = file.toFile();
        Logger logger = v.f16090a;
        return new C1533b(1, new FileOutputStream(file2, false), new I());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final E a(x file) {
        kotlin.jvm.internal.m.e(file, "file");
        File file2 = file.toFile();
        Logger logger = v.f16090a;
        return new C1533b(1, new FileOutputStream(file2, true), new I());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final G a0(x file) {
        kotlin.jvm.internal.m.e(file, "file");
        File file2 = file.toFile();
        Logger logger = v.f16090a;
        return new C1534c(new FileInputStream(file2), I.f16040d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public void b(x source, x target) throws IOException {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final void e(x dir) throws IOException {
        kotlin.jvm.internal.m.e(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        C1025e c1025eK = K(dir);
        if (c1025eK == null || !c1025eK.f12513c) {
            throw new IOException("failed to create directory: " + dir);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final void f(x path) throws IOException {
        kotlin.jvm.internal.m.e(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "JvmSystemFileSystem";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final List z(x xVar) throws IOException {
        File file = xVar.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + xVar);
            }
            throw new FileNotFoundException("no such file: " + xVar);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            kotlin.jvm.internal.m.b(str);
            arrayList.add(xVar.e(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }
}
