package m3;

import C2.e;
import Z.m;
import com.google.android.gms.internal.clearcut.m0;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: renamed from: m3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1360a implements Closeable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String[] f15055u = new String[128];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15056q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f15057r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String[] f15058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f15059t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        for (int i = 0; i <= 31; i++) {
            f15055u[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f15055u;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract int G();

    public abstract String K();

    public abstract int M();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W(int i) {
        int i7 = this.f15056q;
        int[] iArr = this.f15057r;
        if (i7 == iArr.length) {
            if (i7 == 256) {
                throw new e("Nesting too deep at " + f());
            }
            this.f15057r = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f15058s;
            this.f15058s = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f15059t;
            this.f15059t = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f15057r;
        int i8 = this.f15056q;
        this.f15056q = i8 + 1;
        iArr3[i8] = i;
    }

    public abstract void a();

    public abstract int a0(m mVar);

    public abstract void b();

    public abstract void b0();

    public abstract void c();

    public abstract void c0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d0(String str) throws m0 {
        throw new m0(str + " at path " + f());
    }

    public abstract void e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String f() {
        int i = this.f15056q;
        int[] iArr = this.f15057r;
        String[] strArr = this.f15058s;
        int[] iArr2 = this.f15059t;
        StringBuilder sb = new StringBuilder("$");
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = iArr[i7];
            if (i8 == 1 || i8 == 2) {
                sb.append('[');
                sb.append(iArr2[i7]);
                sb.append(']');
            } else if (i8 == 3 || i8 == 4 || i8 == 5) {
                sb.append('.');
                String str = strArr[i7];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean n();

    public abstract boolean v();

    public abstract double z();
}
