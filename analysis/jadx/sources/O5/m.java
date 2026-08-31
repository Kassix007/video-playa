package O5;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class m extends R5.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f5252e;
    public final /* synthetic */ AtomicReferenceArray f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(long j, m mVar, e eVar, int i) {
        super(j, mVar, i);
        this.f5252e = eVar;
        this.f = new AtomicReferenceArray(g.f5231b * 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // R5.s
    public final int f() {
        return g.f5231b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        kotlin.jvm.internal.m.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // R5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r5, q5.InterfaceC1529h r6) {
        /*
            r4 = this;
            int r6 = O5.g.f5231b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.k(r5)
            boolean r1 = r6 instanceof M5.A0
            O5.e r2 = r4.f5252e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof O5.x
            if (r1 == 0) goto L21
            goto L62
        L21:
            E4.f r1 = O5.g.j
            if (r6 == r1) goto L59
            E4.f r1 = O5.g.f5237k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            E4.f r1 = O5.g.f5235g
            if (r6 == r1) goto L11
            E4.f r1 = O5.g.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            E4.f r5 = O5.g.i
            if (r6 == r5) goto L7c
            E4.f r5 = O5.g.f5233d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            E4.f r5 = O5.g.f5238l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.m(r5, r3)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.m.b(r2)
            return
        L62:
            if (r0 == 0) goto L67
            E4.f r1 = O5.g.j
            goto L69
        L67:
            E4.f r1 = O5.g.f5237k
        L69:
            boolean r6 = r4.j(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.m(r5, r3)
            r6 = r0 ^ 1
            r4.l(r5, r6)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.m.b(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.m.g(int, q5.h):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i7 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i7, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i7) == obj);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object k(int i) {
        return this.f.get((i * 2) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i, boolean z5) {
        if (z5) {
            e eVar = this.f5252e;
            kotlin.jvm.internal.m.b(eVar);
            eVar.J((this.f7268c * ((long) g.f5231b)) + ((long) i));
        }
        h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}
