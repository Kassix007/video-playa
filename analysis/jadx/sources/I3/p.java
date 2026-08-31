package i3;

import a3.C0632k;
import a3.y;
import c3.t;
import h3.C1122a;
import h3.C1123b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p implements InterfaceC1138c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1123b f13623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f13624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1122a f13625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1122a f13626e;
    public final C1123b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13628h;
    public final float i;
    public final boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(String str, C1123b c1123b, ArrayList arrayList, C1122a c1122a, C1122a c1122a2, C1123b c1123b2, int i, int i7, float f, boolean z5) {
        this.f13622a = str;
        this.f13623b = c1123b;
        this.f13624c = arrayList;
        this.f13625d = c1122a;
        this.f13626e = c1122a2;
        this.f = c1123b2;
        this.f13627g = i;
        this.f13628h = i7;
        this.i = f;
        this.j = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i3.InterfaceC1138c
    public final c3.d a(y yVar, C0632k c0632k, j3.b bVar) {
        return new t(yVar, bVar, this);
    }
}
