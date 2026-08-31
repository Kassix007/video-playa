package v;

import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: v.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1716k extends s5.h implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1717l f17353t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1716k(C1717l c1717l, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17353t = c1717l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1716k c1716k = new C1716k(this.f17353t, interfaceC1524c);
        c1716k.f17352s = obj;
        return c1716k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1716k) create((v0.y) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r12 == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r12 != r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        return r4;
     */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004d -> B:17:0x0050). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f17351r
            r1 = 2
            v.l r2 = r11.f17353t
            r3 = 1
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L26
            if (r0 == r3) goto L1e
            if (r0 != r1) goto L16
            java.lang.Object r0 = r11.f17352s
            v0.y r0 = (v0.y) r0
            m5.AbstractC1362a.e(r12)
            goto L50
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            java.lang.Object r0 = r11.f17352s
            v0.y r0 = (v0.y) r0
            m5.AbstractC1362a.e(r12)
            goto L39
        L26:
            m5.AbstractC1362a.e(r12)
            java.lang.Object r12 = r11.f17352s
            r0 = r12
            v0.y r0 = (v0.y) r0
            r11.f17352s = r0
            r11.f17351r = r3
            java.lang.Object r12 = w.g1.c(r0, r11, r1)
            if (r12 != r4) goto L39
            goto L4f
        L39:
            v0.l r12 = (v0.C1743l) r12
            long r5 = r12.f17460a
            r2.f17360h = r5
            long r5 = r12.f17462c
            r2.f17355b = r5
        L43:
            r11.f17352s = r0
            r11.f17351r = r1
            v0.g r12 = v0.EnumC1738g.f17455r
            java.lang.Object r12 = r0.a(r12, r11)
            if (r12 != r4) goto L50
        L4f:
            return r4
        L50:
            v0.f r12 = (v0.C1737f) r12
            java.lang.Object r12 = r12.f17451a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r12.size()
            r3.<init>(r5)
            r5 = r12
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = 0
            r7 = r6
        L66:
            if (r7 >= r5) goto L79
            java.lang.Object r8 = r12.get(r7)
            r9 = r8
            v0.l r9 = (v0.C1743l) r9
            boolean r9 = r9.f17463d
            if (r9 == 0) goto L76
            r3.add(r8)
        L76:
            int r7 = r7 + 1
            goto L66
        L79:
            int r12 = r3.size()
        L7d:
            if (r6 >= r12) goto L94
            java.lang.Object r5 = r3.get(r6)
            r7 = r5
            v0.l r7 = (v0.C1743l) r7
            long r7 = r7.f17460a
            long r9 = r2.f17360h
            boolean r7 = v0.v.d(r7, r9)
            if (r7 == 0) goto L91
            goto L95
        L91:
            int r6 = r6 + 1
            goto L7d
        L94:
            r5 = 0
        L95:
            v0.l r5 = (v0.C1743l) r5
            if (r5 != 0) goto La0
            java.lang.Object r12 = n5.l.m0(r3)
            r5 = r12
            v0.l r5 = (v0.C1743l) r5
        La0:
            if (r5 == 0) goto Laa
            long r6 = r5.f17460a
            r2.f17360h = r6
            long r5 = r5.f17462c
            r2.f17355b = r5
        Laa:
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto L43
            r0 = -1
            r2.f17360h = r0
            m5.y r12 = m5.C1386y.f15098a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C1716k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
