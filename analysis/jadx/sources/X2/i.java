package x2;

import D2.n;
import android.net.Uri;
import m5.C1376o;

/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1376o f18360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1376o f18361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18362c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(C1376o c1376o, C1376o c1376o2, boolean z5) {
        this.f18360a = c1376o;
        this.f18361b = c1376o2;
        this.f18362c = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x2.f
    public final g a(Object obj, n nVar) {
        Uri uri = (Uri) obj;
        if (!kotlin.jvm.internal.m.a(uri.getScheme(), "http") && !kotlin.jvm.internal.m.a(uri.getScheme(), "https")) {
            return null;
        }
        return new l(uri.toString(), nVar, this.f18360a, this.f18361b, this.f18362c);
    }
}
