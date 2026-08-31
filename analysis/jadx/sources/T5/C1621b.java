package t5;

import C0.S;
import java.io.Serializable;
import n5.AbstractC1401d;

/* JADX INFO: renamed from: t5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1621b extends AbstractC1401d implements InterfaceC1620a, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Enum[] f16745q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1621b(Enum[] enumArr) {
        this.f16745q = enumArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    @Override // n5.AbstractC1398a, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Enum
            if (r0 != 0) goto L5
            goto L1f
        L5:
            java.lang.Enum r4 = (java.lang.Enum) r4
            java.lang.String r0 = "element"
            kotlin.jvm.internal.m.e(r4, r0)
            int r0 = r4.ordinal()
            if (r0 < 0) goto L1a
            java.lang.Enum[] r1 = r3.f16745q
            int r2 = r1.length
            if (r0 >= r2) goto L1a
            r0 = r1[r0]
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 != r4) goto L1f
            r4 = 1
            return r4
        L1f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C1621b.contains(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a
    public final int d() {
        return this.f16745q.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f16745q;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(S.j(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    @Override // n5.AbstractC1401d, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int indexOf(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r5 = (java.lang.Enum) r5
            java.lang.String r0 = "element"
            kotlin.jvm.internal.m.e(r5, r0)
            int r0 = r5.ordinal()
            if (r0 < 0) goto L1b
            java.lang.Enum[] r2 = r4.f16745q
            int r3 = r2.length
            if (r0 >= r3) goto L1b
            r2 = r2[r0]
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 != r5) goto L1f
            return r0
        L1f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C1621b.indexOf(java.lang.Object):int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    @Override // n5.AbstractC1401d, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lastIndexOf(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r5 = (java.lang.Enum) r5
            java.lang.String r0 = "element"
            kotlin.jvm.internal.m.e(r5, r0)
            int r0 = r5.ordinal()
            if (r0 < 0) goto L1b
            java.lang.Enum[] r2 = r4.f16745q
            int r3 = r2.length
            if (r0 >= r3) goto L1b
            r2 = r2[r0]
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 != r5) goto L1f
            return r0
        L1f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C1621b.lastIndexOf(java.lang.Object):int");
    }
}
