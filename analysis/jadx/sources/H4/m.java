package H4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Map, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m f2194w = new m(0, null, new Object[0]);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient j f2195q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public transient k f2196r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient l f2197s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient Object f2198t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient Object[] f2199u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f2200v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(int i, Object obj, Object[] objArr) {
        this.f2198t = obj;
        this.f2199u = objArr;
        this.f2200v = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0118 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0199  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static H4.m a(int r19, java.lang.Object[] r20, E.Y r21) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            if (r0 != 0) goto Lb
            H4.m r0 = H4.m.f2194w
            return r0
        Lb:
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 != r5) goto L20
            r0 = r1[r4]
            java.util.Objects.requireNonNull(r0)
            r0 = r1[r5]
            java.util.Objects.requireNonNull(r0)
            H4.m r0 = new H4.m
            r0.<init>(r5, r3, r1)
            return r0
        L20:
            int r6 = r1.length
            int r6 = r6 >> r5
            y4.AbstractC1918b.h(r0, r6)
            int r6 = H4.f.k(r0)
            r7 = 2
            if (r0 != r5) goto L3e
            r6 = r1[r4]
            java.util.Objects.requireNonNull(r6)
            r6 = r1[r5]
            java.util.Objects.requireNonNull(r6)
            r16 = r4
            r17 = r5
        L3a:
            r18 = r7
            goto L195
        L3e:
            int r8 = r6 + (-1)
            r9 = 128(0x80, float:1.794E-43)
            r10 = 3
            r11 = -1
            if (r6 > r9) goto Lba
            byte[] r6 = new byte[r6]
            java.util.Arrays.fill(r6, r11)
            r9 = r4
            r11 = r9
        L4d:
            if (r9 >= r0) goto La4
            int r12 = r9 * 2
            int r13 = r11 * 2
            r14 = r1[r12]
            java.util.Objects.requireNonNull(r14)
            r12 = r12 ^ r5
            r12 = r1[r12]
            java.util.Objects.requireNonNull(r12)
            int r15 = r14.hashCode()
            int r15 = n5.AbstractC1397A.D(r15)
        L66:
            r15 = r15 & r8
            r16 = r4
            r4 = r6[r15]
            r17 = r5
            r5 = 255(0xff, float:3.57E-43)
            r4 = r4 & r5
            if (r4 != r5) goto L80
            byte r4 = (byte) r13
            r6[r15] = r4
            if (r11 >= r9) goto L7d
            r1[r13] = r14
            r4 = r13 ^ 1
            r1[r4] = r12
        L7d:
            int r11 = r11 + 1
            goto L96
        L80:
            r5 = r1[r4]
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L9d
            H4.e r3 = new H4.e
            r4 = r4 ^ 1
            r5 = r1[r4]
            java.util.Objects.requireNonNull(r5)
            r3.<init>(r14, r12, r5)
            r1[r4] = r12
        L96:
            int r9 = r9 + 1
            r4 = r16
            r5 = r17
            goto L4d
        L9d:
            int r15 = r15 + 1
            r4 = r16
            r5 = r17
            goto L66
        La4:
            r16 = r4
            r17 = r5
            if (r11 != r0) goto Lac
            r3 = r6
            goto L3a
        Lac:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            r4[r16] = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r4[r17] = r5
            r4[r7] = r3
        Lb8:
            r3 = r4
            goto L3a
        Lba:
            r16 = r4
            r17 = r5
            r4 = 32768(0x8000, float:4.5918E-41)
            if (r6 > r4) goto L12a
            short[] r4 = new short[r6]
            java.util.Arrays.fill(r4, r11)
            r5 = r16
            r6 = r5
        Lcb:
            if (r5 >= r0) goto L118
            int r9 = r5 * 2
            int r11 = r6 * 2
            r12 = r1[r9]
            java.util.Objects.requireNonNull(r12)
            r9 = r9 ^ 1
            r9 = r1[r9]
            java.util.Objects.requireNonNull(r9)
            int r13 = r12.hashCode()
            int r13 = n5.AbstractC1397A.D(r13)
        Le5:
            r13 = r13 & r8
            short r14 = r4[r13]
            r15 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r15
            if (r14 != r15) goto Lfc
            short r14 = (short) r11
            r4[r13] = r14
            if (r6 >= r5) goto Lf9
            r1[r11] = r12
            r11 = r11 ^ 1
            r1[r11] = r9
        Lf9:
            int r6 = r6 + 1
            goto L112
        Lfc:
            r15 = r1[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L115
            H4.e r3 = new H4.e
            r11 = r14 ^ 1
            r13 = r1[r11]
            java.util.Objects.requireNonNull(r13)
            r3.<init>(r12, r9, r13)
            r1[r11] = r9
        L112:
            int r5 = r5 + 1
            goto Lcb
        L115:
            int r13 = r13 + 1
            goto Le5
        L118:
            if (r6 != r0) goto L11b
            goto Lb8
        L11b:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r16] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r5[r17] = r4
            r5[r7] = r3
            r3 = r5
            goto L3a
        L12a:
            int[] r4 = new int[r6]
            java.util.Arrays.fill(r4, r11)
            r5 = r16
            r6 = r5
        L132:
            if (r5 >= r0) goto L182
            int r9 = r5 * 2
            int r12 = r6 * 2
            r13 = r1[r9]
            java.util.Objects.requireNonNull(r13)
            r9 = r9 ^ 1
            r9 = r1[r9]
            java.util.Objects.requireNonNull(r9)
            int r14 = r13.hashCode()
            int r14 = n5.AbstractC1397A.D(r14)
        L14c:
            r14 = r14 & r8
            r15 = r4[r14]
            if (r15 != r11) goto L160
            r4[r14] = r12
            if (r6 >= r5) goto L15b
            r1[r12] = r13
            r12 = r12 ^ 1
            r1[r12] = r9
        L15b:
            int r6 = r6 + 1
            r18 = r7
            goto L178
        L160:
            r18 = r7
            r7 = r1[r15]
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L17d
            H4.e r3 = new H4.e
            r7 = r15 ^ 1
            r12 = r1[r7]
            java.util.Objects.requireNonNull(r12)
            r3.<init>(r13, r9, r12)
            r1[r7] = r9
        L178:
            int r5 = r5 + 1
            r7 = r18
            goto L132
        L17d:
            int r14 = r14 + 1
            r7 = r18
            goto L14c
        L182:
            r18 = r7
            if (r6 != r0) goto L188
            r3 = r4
            goto L195
        L188:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r16] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r5[r17] = r4
            r5[r18] = r3
            r3 = r5
        L195:
            boolean r4 = r3 instanceof java.lang.Object[]
            if (r4 == 0) goto L1bb
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = r3[r18]
            H4.e r0 = (H4.e) r0
            if (r2 == 0) goto L1b6
            r2.f1521d = r0
            r0 = r3[r16]
            r2 = r3[r17]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r2 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r3 = r0
            r0 = r2
            goto L1bb
        L1b6:
            java.lang.IllegalArgumentException r0 = r0.a()
            throw r0
        L1bb:
            H4.m r2 = new H4.m
            r2.<init>(r0, r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.m.a(int, java.lang.Object[], E.Y):H4.m");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        l lVar = this.f2197s;
        if (lVar == null) {
            lVar = new l(this.f2199u, 1, this.f2200v);
            this.f2197s = lVar;
        }
        return lVar.contains(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set entrySet() {
        j jVar = this.f2195q;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, this.f2199u, this.f2200v);
        this.f2195q = jVar2;
        return jVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((f) entrySet()).equals(((Map) obj).entrySet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0037->B:22:0x004d], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0062->B:32:0x0079], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0088->B:43:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r9 = r0
            goto L9c
        L6:
            java.lang.Object[] r1 = r8.f2199u
            int r2 = r8.f2200v
            r3 = 1
            if (r2 != r3) goto L20
            r2 = 0
            r2 = r1[r2]
            java.util.Objects.requireNonNull(r2)
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L3
            r9 = r1[r3]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L20:
            java.lang.Object r2 = r8.f2198t
            if (r2 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L50
            r4 = r2
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            int r5 = r2 + (-1)
            int r2 = r9.hashCode()
            int r2 = n5.AbstractC1397A.D(r2)
        L37:
            r2 = r2 & r5
            r6 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L3
        L40:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L4d:
            int r2 = r2 + 1
            goto L37
        L50:
            boolean r4 = r2 instanceof short[]
            if (r4 == 0) goto L7c
            r4 = r2
            short[] r4 = (short[]) r4
            int r2 = r4.length
            int r5 = r2 + (-1)
            int r2 = r9.hashCode()
            int r2 = n5.AbstractC1397A.D(r2)
        L62:
            r2 = r2 & r5
            short r6 = r4[r2]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L3
        L6c:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L79:
            int r2 = r2 + 1
            goto L62
        L7c:
            int[] r2 = (int[]) r2
            int r4 = r2.length
            int r4 = r4 - r3
            int r5 = r9.hashCode()
            int r5 = n5.AbstractC1397A.D(r5)
        L88:
            r5 = r5 & r4
            r6 = r2[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L3
        L90:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r0
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.m.get(java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int hashCode() {
        j jVar = this.f2195q;
        if (jVar == null) {
            jVar = new j(this, this.f2199u, this.f2200v);
            this.f2195q = jVar;
        }
        Iterator it = jVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set keySet() {
        k kVar = this.f2196r;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, new l(this.f2199u, 0, this.f2200v));
        this.f2196r = kVar2;
        return kVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int size() {
        return this.f2200v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i = this.f2200v;
        if (i < 0) {
            throw new IllegalArgumentException(k1.i.i(i, "size cannot be negative but was: "));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        p pVarO = ((j) entrySet()).iterator();
        boolean z5 = true;
        while (true) {
            b bVar = (b) pVarO;
            if (!bVar.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            if (!z5) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z5 = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Collection values() {
        l lVar = this.f2197s;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.f2199u, 1, this.f2200v);
        this.f2197s = lVar2;
        return lVar2;
    }
}
