package b2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: b2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0697h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9997d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0697h(int i, int i7, long j, long j7) {
        this.f9994a = i;
        this.f9995b = i7;
        this.f9996c = j;
        this.f9997d = j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static C0697h a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0697h c0697h = new C0697h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0697h;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f9994a);
            dataOutputStream.writeInt(this.f9995b);
            dataOutputStream.writeLong(this.f9996c);
            dataOutputStream.writeLong(this.f9997d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0697h)) {
            C0697h c0697h = (C0697h) obj;
            if (this.f9995b == c0697h.f9995b && this.f9996c == c0697h.f9996c && this.f9994a == c0697h.f9994a && this.f9997d == c0697h.f9997d) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9995b), Long.valueOf(this.f9996c), Integer.valueOf(this.f9994a), Long.valueOf(this.f9997d));
    }
}
