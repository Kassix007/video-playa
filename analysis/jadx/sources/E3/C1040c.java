package e3;

import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: e3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1040c extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ EnumC1050m f12553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0241b0 f12554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1044g f12556u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040c(EnumC1050m enumC1050m, InterfaceC0241b0 interfaceC0241b0, int i, C1044g c1044g, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f12553r = enumC1050m;
        this.f12554s = interfaceC0241b0;
        this.f12555t = i;
        this.f12556u = c1044g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1040c(this.f12553r, this.f12554s, this.f12555t, this.f12556u, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1040c) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Path cross not found for [B:11:0x0025, B:13:0x002d], limit reached: 26 */
    /* JADX WARN: Path cross not found for [B:13:0x002d, B:11:0x0025], limit reached: 26 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:22:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f12552q
            r1 = 1
            if (r0 == 0) goto L13
            if (r0 != r1) goto Lb
            m5.AbstractC1362a.e(r5)
            goto L5c
        Lb:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L13:
            m5.AbstractC1362a.e(r5)
        L16:
            int[] r5 = e3.AbstractC1039b.f12551a
            e3.m r0 = r4.f12553r
            int r0 = r0.ordinal()
            r5 = r5[r0]
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r1) goto L2d
            M5.b0 r5 = r4.f12554s
            boolean r5 = r5.b()
            if (r5 == 0) goto L2f
        L2d:
            r5 = r0
            goto L31
        L2f:
            int r5 = r4.f12555t
        L31:
            r4.f12552q = r1
            e3.g r2 = r4.f12556u
            r2.getClass()
            if (r5 != r0) goto L45
            e3.e r0 = new e3.e
            r3 = 0
            r0.<init>(r2, r5, r3)
            java.lang.Object r5 = u.AbstractC1644d.r(r0, r4)
            goto L57
        L45:
            e3.e r0 = new e3.e
            r3 = 1
            r0.<init>(r2, r5, r3)
            q5.h r5 = r4.getContext()
            P.T r5 = P.C0345b.o(r5)
            java.lang.Object r5 = r5.e(r0, r4)
        L57:
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r5 != r0) goto L5c
            return r0
        L5c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L16
            m5.y r5 = m5.C1386y.f15098a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.C1040c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
