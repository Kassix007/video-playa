package d3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import o3.C1415a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends e {
    public final PointF i;
    public final PointF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f12253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f12254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Z.m f12255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Z.m f12256n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(i iVar, i iVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.f12253k = iVar;
        this.f12254l = iVar2;
        i(this.f12233d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final Object e() {
        return l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final /* bridge */ /* synthetic */ Object f(C1415a c1415a, float f) {
        return l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final void i(float f) {
        i iVar = this.f12253k;
        iVar.i(f);
        i iVar2 = this.f12254l;
        iVar2.i(f);
        this.i.set(((Float) iVar.e()).floatValue(), ((Float) iVar2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f12230a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC1001a) arrayList.get(i)).b();
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF l() {
        /*
            r12 = this;
            Z.m r0 = r12.f12255m
            r1 = 0
            if (r0 == 0) goto L39
            d3.i r0 = r12.f12253k
            d3.b r2 = r0.f12232c
            o3.a r2 = r2.f()
            if (r2 == 0) goto L39
            java.lang.Float r3 = r2.f15418h
            Z.m r4 = r12.f12255m
            float r5 = r2.f15417g
            if (r3 != 0) goto L19
            r6 = r5
            goto L1e
        L19:
            float r3 = r3.floatValue()
            r6 = r3
        L1e:
            java.lang.Object r3 = r2.f15413b
            r7 = r3
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r2 = r2.f15414c
            r8 = r2
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r0.c()
            float r10 = r0.d()
            float r11 = r0.f12233d
            java.lang.Object r0 = r4.o(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L3a
        L39:
            r0 = r1
        L3a:
            Z.m r2 = r12.f12256n
            if (r2 == 0) goto L71
            d3.i r2 = r12.f12254l
            d3.b r3 = r2.f12232c
            o3.a r3 = r3.f()
            if (r3 == 0) goto L71
            java.lang.Float r1 = r3.f15418h
            Z.m r4 = r12.f12256n
            float r5 = r3.f15417g
            if (r1 != 0) goto L52
            r6 = r5
            goto L57
        L52:
            float r1 = r1.floatValue()
            r6 = r1
        L57:
            java.lang.Object r1 = r3.f15413b
            r7 = r1
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r1 = r3.f15414c
            r8 = r1
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r2.c()
            float r10 = r2.d()
            float r11 = r2.f12233d
            java.lang.Object r1 = r4.o(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r1 = (java.lang.Float) r1
        L71:
            r2 = 0
            android.graphics.PointF r3 = r12.i
            android.graphics.PointF r4 = r12.j
            if (r0 != 0) goto L7e
            float r0 = r3.x
            r4.set(r0, r2)
            goto L85
        L7e:
            float r0 = r0.floatValue()
            r4.set(r0, r2)
        L85:
            if (r1 != 0) goto L8f
            float r0 = r4.x
            float r1 = r3.y
            r4.set(r0, r1)
            return r4
        L8f:
            float r0 = r4.x
            float r1 = r1.floatValue()
            r4.set(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.o.l():android.graphics.PointF");
    }
}
