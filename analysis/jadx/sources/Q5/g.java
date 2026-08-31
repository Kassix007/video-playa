package Q5;

import C0.S;
import M5.AbstractC0263y;
import M5.EnumC0262x;
import M5.InterfaceC0261w;
import P5.InterfaceC0397h;
import P5.InterfaceC0398i;
import java.util.ArrayList;
import m5.C1386y;
import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements v {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1529h f6613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final O5.a f6615s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(InterfaceC1529h interfaceC1529h, int i, O5.a aVar) {
        this.f6613q = interfaceC1529h;
        this.f6614r = i;
        this.f6615s = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // Q5.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final P5.InterfaceC0397h a(q5.InterfaceC1529h r5, int r6, O5.a r7) {
        /*
            r4 = this;
            q5.h r0 = r4.f6613q
            q5.h r5 = r5.plus(r0)
            O5.a r1 = O5.a.f5206q
            O5.a r2 = r4.f6615s
            int r3 = r4.f6614r
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.m.a(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            Q5.g r5 = r4.d(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.g.a(q5.h, int, O5.a):P5.h");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String b() {
        return null;
    }

    public abstract Object c(O5.t tVar, InterfaceC1524c interfaceC1524c);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.InterfaceC0397h
    public Object collect(InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c) {
        Object objG = AbstractC0263y.g(new C0425e(interfaceC0398i, this, null), interfaceC1524c);
        return objG == EnumC1580a.f16356q ? objG : C1386y.f15098a;
    }

    public abstract g d(InterfaceC1529h interfaceC1529h, int i, O5.a aVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0397h e() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O5.v f(InterfaceC0261w interfaceC0261w) {
        int i = this.f6614r;
        if (i == -3) {
            i = -2;
        }
        B5.e fVar = new f(this, null);
        O5.s sVar = new O5.s(AbstractC0263y.u(interfaceC0261w, this.f6613q), l6.d.e(i, this.f6615s, 4));
        sVar.d0(EnumC0262x.f3897s, sVar, fVar);
        return sVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        C1530i c1530i = C1530i.f16022q;
        InterfaceC1529h interfaceC1529h = this.f6613q;
        if (interfaceC1529h != c1530i) {
            arrayList.add("context=" + interfaceC1529h);
        }
        int i = this.f6614r;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        O5.a aVar = O5.a.f5206q;
        O5.a aVar2 = this.f6615s;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return S.p(sb, n5.l.q0(arrayList, ", ", null, null, null, 62), ']');
    }
}
