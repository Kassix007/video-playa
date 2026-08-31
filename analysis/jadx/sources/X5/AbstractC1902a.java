package x5;

import com.google.android.gms.internal.measurement.K1;
import java.io.File;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: x5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1902a extends K1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static File Q(File file) {
        int length;
        int iR0;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        m.d(path, "getPath(...)");
        char c7 = File.separatorChar;
        int iR02 = J5.m.R0(path, c7, 0, 4);
        if (iR02 != 0) {
            length = (iR02 <= 0 || path.charAt(iR02 + (-1)) != ':') ? (iR02 == -1 && J5.m.M0(path, ':')) ? path.length() : 0 : iR02 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c7 || (iR0 = J5.m.R0(path, c7, 2, 4)) < 0) {
            length = 1;
        } else {
            int iR03 = J5.m.R0(path, c7, iR0 + 1, 4);
            length = iR03 >= 0 ? iR03 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        m.d(string, "toString(...)");
        if ((string.length() == 0) || J5.m.M0(string, c7)) {
            return new File(string + file2);
        }
        return new File(string + c7 + file2);
    }
}
