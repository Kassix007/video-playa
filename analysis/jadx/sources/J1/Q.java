package J1;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends Writer {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final StringBuilder f2594r = new StringBuilder(128);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f2593q = "FragmentManager";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        StringBuilder sb = this.f2594r;
        if (sb.length() > 0) {
            Log.d(this.f2593q, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            char c7 = cArr[i + i8];
            if (c7 == '\n') {
                a();
            } else {
                this.f2594r.append(c7);
            }
        }
    }
}
