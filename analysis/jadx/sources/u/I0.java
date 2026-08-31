package u;

import java.util.LinkedHashMap;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public abstract class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f16803a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Float fValueOf = Float.valueOf(0.5f);
        Z.m mVar = A0.f16747b;
        Float fValueOf2 = Float.valueOf(1.0f);
        C1371j c1371j = new C1371j(mVar, fValueOf2);
        C1371j c1371j2 = new C1371j(A0.f16752h, fValueOf2);
        C1371j c1371j3 = new C1371j(A0.f16751g, fValueOf2);
        C1371j c1371j4 = new C1371j(A0.f16746a, Float.valueOf(0.01f));
        C1371j c1371j5 = new C1371j(A0.i, fValueOf);
        C1371j c1371j6 = new C1371j(A0.f16750e, fValueOf);
        C1371j c1371j7 = new C1371j(A0.f, fValueOf);
        Z.m mVar2 = A0.f16748c;
        Float fValueOf3 = Float.valueOf(0.1f);
        C1371j[] c1371jArr = {c1371j, c1371j2, c1371j3, c1371j4, c1371j5, c1371j6, c1371j7, new C1371j(mVar2, fValueOf3), new C1371j(A0.f16749d, fValueOf3)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(n5.y.I(9));
        n5.x.L(linkedHashMap, c1371jArr);
        f16803a = linkedHashMap;
    }
}
