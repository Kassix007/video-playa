package i3;

import a3.C0632k;
import a3.y;
import h3.C1122a;
import h3.C1123b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC1138c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1122a f13579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1122a f13580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1122a f13581e;
    public final C1122a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1123b f13582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13583h;
    public final int i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f13584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1123b f13585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f13586m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(String str, int i, C1122a c1122a, C1122a c1122a2, C1122a c1122a3, C1122a c1122a4, C1123b c1123b, int i7, int i8, float f, ArrayList arrayList, C1123b c1123b2, boolean z5) {
        this.f13577a = str;
        this.f13578b = i;
        this.f13579c = c1122a;
        this.f13580d = c1122a2;
        this.f13581e = c1122a3;
        this.f = c1122a4;
        this.f13582g = c1123b;
        this.f13583h = i7;
        this.i = i8;
        this.j = f;
        this.f13584k = arrayList;
        this.f13585l = c1123b2;
        this.f13586m = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i3.InterfaceC1138c
    public final c3.d a(y yVar, C0632k c0632k, j3.b bVar) {
        return new c3.j(yVar, bVar, this);
    }
}
