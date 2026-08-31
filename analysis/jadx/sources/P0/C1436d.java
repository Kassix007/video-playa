package p0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: p0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1436d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15545e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15547h;
    public final List i;
    public final ArrayList j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1436d(String str, float f, float f7, float f8, float f9, float f10, float f11, float f12, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f7 = (i & 4) != 0 ? 0.0f : f7;
        f8 = (i & 8) != 0 ? 0.0f : f8;
        f9 = (i & 16) != 0 ? 1.0f : f9;
        f10 = (i & 32) != 0 ? 1.0f : f10;
        f11 = (i & 64) != 0 ? 0.0f : f11;
        f12 = (i & 128) != 0 ? 0.0f : f12;
        if ((i & 256) != 0) {
            int i7 = AbstractC1432F.f15497a;
            list = n5.s.f15299q;
        }
        ArrayList arrayList = new ArrayList();
        this.f15541a = str;
        this.f15542b = f;
        this.f15543c = f7;
        this.f15544d = f8;
        this.f15545e = f9;
        this.f = f10;
        this.f15546g = f11;
        this.f15547h = f12;
        this.i = list;
        this.j = arrayList;
    }
}
