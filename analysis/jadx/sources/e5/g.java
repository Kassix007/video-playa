package e5;

import M5.InterfaceC0261w;
import P.C0348c0;
import P.W;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12661q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0348c0 f12662r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f12663s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f12664t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0348c0 c0348c0, W w3, W w6, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f12662r = c0348c0;
        this.f12663s = w3;
        this.f12664t = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new g(this.f12662r, this.f12663s, this.f12664t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        ((g) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
        return EnumC1580a.f16356q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:12:0x0023). Please report as a decompilation issue!!! */
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
            int r0 = r4.f12661q
            r1 = 1
            if (r0 == 0) goto L13
            if (r0 != r1) goto Lb
            m5.AbstractC1362a.e(r5)
            goto L23
        Lb:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L13:
            m5.AbstractC1362a.e(r5)
        L16:
            r4.f12661q = r1
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r5 = M5.AbstractC0263y.h(r2, r4)
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r5 != r0) goto L23
            return r0
        L23:
            P.c0 r5 = r4.f12662r
            int r0 = r5.e()
            P.W r2 = r4.f12663s
            java.lang.Object r3 = r2.getValue()
            e5.a r3 = (e5.C1056a) r3
            android.database.Cursor r3 = r3.a()
            int r3 = r3.getCount()
            if (r0 == r3) goto L16
            java.lang.Object r0 = r2.getValue()
            e5.a r0 = (e5.C1056a) r0
            android.database.Cursor r0 = r0.a()
            P.W r3 = r4.f12664t
            r3.setValue(r0)
            java.lang.Object r0 = r2.getValue()
            e5.a r0 = (e5.C1056a) r0
            android.database.Cursor r0 = r0.a()
            int r0 = r0.getCount()
            r5.f(r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
