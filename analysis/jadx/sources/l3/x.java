package l3;

import android.graphics.PointF;
import g3.C1082a;
import java.util.ArrayList;
import java.util.Collections;
import m3.AbstractC1360a;

/* JADX INFO: loaded from: classes.dex */
public final class x implements D {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final x f14495q = new x();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Z.m f14496r = Z.m.s("c", "v", "i", "o");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l3.D
    public final Object a(AbstractC1360a abstractC1360a, float f) {
        if (abstractC1360a.M() == 1) {
            abstractC1360a.a();
        }
        abstractC1360a.b();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zV = false;
        while (abstractC1360a.n()) {
            int iA0 = abstractC1360a.a0(f14496r);
            if (iA0 == 0) {
                zV = abstractC1360a.v();
            } else if (iA0 == 1) {
                arrayListC = n.c(abstractC1360a, f);
            } else if (iA0 == 2) {
                arrayListC2 = n.c(abstractC1360a, f);
            } else if (iA0 != 3) {
                abstractC1360a.b0();
                abstractC1360a.c0();
            } else {
                arrayListC3 = n.c(abstractC1360a, f);
            }
        }
        abstractC1360a.e();
        if (abstractC1360a.M() == 2) {
            abstractC1360a.c();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new i3.l(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i7 = i - 1;
            arrayList.add(new C1082a(n3.g.a((PointF) arrayListC.get(i7), (PointF) arrayListC3.get(i7)), n3.g.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zV) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i8 = size - 1;
            arrayList.add(new C1082a(n3.g.a((PointF) arrayListC.get(i8), (PointF) arrayListC3.get(i8)), n3.g.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new i3.l(pointF, zV, arrayList);
    }
}
