package k2;

import E.Y;
import android.content.Context;
import j2.InterfaceC1155a;
import j2.InterfaceC1158d;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1376o;
import m5.C1383v;

/* JADX INFO: renamed from: k2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1183g implements InterfaceC1158d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f14104q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f14105r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Y f14106s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f14107t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14108u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1376o f14109v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14110w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1183g(Context context, String str, Y callback, boolean z5, boolean z6) {
        m.e(callback, "callback");
        this.f14104q = context;
        this.f14105r = str;
        this.f14106s = callback;
        this.f14107t = z5;
        this.f14108u = z6;
        this.f14109v = AbstractC1362a.d(new A0.d(23, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1155a a() {
        return ((C1182f) this.f14109v.getValue()).a(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f14109v.f15087r != C1383v.f15095a) {
            ((C1182f) this.f14109v.getValue()).close();
        }
    }
}
