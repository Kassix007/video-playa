package i6;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import d6.p;
import d6.w;
import java.util.regex.Pattern;
import q6.A;
import q6.InterfaceC1540i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f13655q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f13656r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final A f13657s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(String str, long j, A a7) {
        this.f13655q = str;
        this.f13656r = j;
        this.f13657s = a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.w
    public final InterfaceC1540i O() {
        return this.f13657s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.w
    public final long a() {
        return this.f13656r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.w
    public final p b() {
        String str = this.f13655q;
        if (str == null) {
            return null;
        }
        Pattern pattern = p.f12375b;
        try {
            return AbstractC0836n2.o(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
