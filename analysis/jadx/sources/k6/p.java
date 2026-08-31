package k6;

import C0.S;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(int i, int i7, int i8) throws IOException {
        if ((i7 & 8) != 0) {
            i--;
        }
        if (i8 <= i) {
            return i - i8;
        }
        throw new IOException(S.j(i8, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
