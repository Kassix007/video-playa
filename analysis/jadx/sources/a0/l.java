package a0;

import com.google.android.gms.internal.measurement.K1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterable, C5.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l f8672u = new l(0, 0, 0, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f8673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f8674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f8675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long[] f8676t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(long j, long j7, long j8, long[] jArr) {
        this.f8673q = j;
        this.f8674r = j7;
        this.f8675s = j8;
        this.f8676t = jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l d(l lVar) {
        l lVarG;
        long j;
        long[] jArr;
        l lVar2 = f8672u;
        if (lVar == lVar2) {
            return this;
        }
        if (this == lVar2) {
            return lVar2;
        }
        long j7 = lVar.f8675s;
        long j8 = lVar.f8675s;
        long[] jArr2 = lVar.f8676t;
        long j9 = lVar.f8674r;
        long j10 = lVar.f8673q;
        long j11 = this.f8675s;
        if (j7 == j11 && jArr2 == (jArr = this.f8676t)) {
            return new l(this.f8673q & (~j10), this.f8674r & (~j9), j11, jArr);
        }
        if (jArr2 != null) {
            lVarG = this;
            for (long j12 : jArr2) {
                lVarG = lVarG.g(j12);
            }
        } else {
            lVarG = this;
        }
        long j13 = 0;
        if (j9 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j9) != j13) {
                    j = j13;
                    lVarG = lVarG.g(((long) i) + j8);
                } else {
                    j = j13;
                }
                i++;
                j13 = j;
            }
        }
        long j14 = j13;
        if (j10 != j14) {
            for (int i7 = 0; i7 < 64; i7++) {
                if (((1 << i7) & j10) != j14) {
                    lVarG = lVarG.g(((long) i7) + j8 + ((long) 64));
                }
            }
        }
        return lVarG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l g(long j) {
        long[] jArr;
        int iB;
        long[] jArr2;
        long j7 = this.f8675s;
        long j8 = j - j7;
        if (j8 >= 0 && j8 < 64) {
            long j9 = 1 << ((int) j8);
            long j10 = this.f8674r;
            if ((j10 & j9) != 0) {
                return new l(this.f8673q, j10 & (~j9), j7, this.f8676t);
            }
        } else if (j8 >= 64 && j8 < 128) {
            long j11 = 1 << (((int) j8) - 64);
            long j12 = this.f8673q;
            if ((j12 & j11) != 0) {
                return new l(j12 & (~j11), this.f8674r, j7, this.f8676t);
            }
        } else if (j8 < 0 && (jArr = this.f8676t) != null && (iB = r.b(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iB > 0) {
                    n5.k.E0(jArr, jArr3, 0, 0, iB);
                }
                if (iB < i) {
                    n5.k.E0(jArr, jArr3, iB, iB + 1, length);
                }
                jArr2 = jArr3;
            }
            return new l(this.f8673q, this.f8674r, this.f8675s, jArr2);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(long j) {
        long[] jArr;
        long j7 = j - this.f8675s;
        return (j7 < 0 || j7 >= 64) ? (j7 < 64 || j7 >= 128) ? j7 <= 0 && (jArr = this.f8676t) != null && r.b(jArr, j) >= 0 : ((1 << (((int) j7) + (-64))) & this.f8673q) != 0 : ((1 << ((int) j7)) & this.f8674r) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l i(l lVar) {
        l lVarJ;
        l lVarJ2;
        long[] jArr;
        l lVar2 = f8672u;
        if (lVar == lVar2) {
            return this;
        }
        if (this == lVar2) {
            return lVar;
        }
        long j = lVar.f8675s;
        long j7 = lVar.f8675s;
        long[] jArr2 = lVar.f8676t;
        long j8 = lVar.f8674r;
        long j9 = lVar.f8673q;
        long j10 = this.f8675s;
        long j11 = this.f8674r;
        long j12 = this.f8673q;
        if (j == j10 && jArr2 == (jArr = this.f8676t)) {
            return new l(j12 | j9, j11 | j8, j10, jArr);
        }
        int i = 0;
        long[] jArr3 = this.f8676t;
        if (jArr3 != null) {
            if (jArr2 != null) {
                lVarJ = this;
                for (long j13 : jArr2) {
                    lVarJ = lVarJ.j(j13);
                }
            } else {
                lVarJ = this;
            }
            if (j8 != 0) {
                for (int i7 = 0; i7 < 64; i7++) {
                    if (((1 << i7) & j8) != 0) {
                        lVarJ = lVarJ.j(((long) i7) + j7);
                    }
                }
            }
            if (j9 != 0) {
                while (i < 64) {
                    if (((1 << i) & j9) != 0) {
                        lVarJ = lVarJ.j(((long) i) + j7 + ((long) 64));
                    }
                    i++;
                }
            }
            return lVarJ;
        }
        if (jArr3 != null) {
            lVarJ2 = lVar;
            for (long j14 : jArr3) {
                lVarJ2 = lVarJ2.j(j14);
            }
        } else {
            lVarJ2 = lVar;
        }
        long j15 = this.f8675s;
        if (j11 != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                if (((1 << i8) & j11) != 0) {
                    lVarJ2 = lVarJ2.j(((long) i8) + j15);
                }
            }
        }
        if (j12 != 0) {
            while (i < 64) {
                if (((1 << i) & j12) != 0) {
                    lVarJ2 = lVarJ2.j(((long) i) + j15 + ((long) 64));
                }
                i++;
            }
        }
        return lVarJ2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return K1.w(new k(this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a0.l j(long r30) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            long r6 = r0.f8675s
            long r3 = r1 - r6
            r8 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            long r10 = r0.f8673q
            long r12 = r0.f8674r
            r14 = 64
            r16 = r8
            long[] r8 = r0.f8676t
            r18 = 1
            if (r5 < 0) goto L31
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 >= 0) goto L31
            int r1 = (int) r3
            long r1 = r18 << r1
            long r3 = r12 & r1
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 != 0) goto L18d
            r2 = r1
            a0.l r1 = new a0.l
            long r4 = r12 | r2
            r2 = r10
            r1.<init>(r2, r4, r6, r8)
            return r1
        L31:
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            r14 = 128(0x80, double:6.32E-322)
            r9 = 64
            if (r5 < 0) goto L50
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 >= 0) goto L50
            int r1 = (int) r3
            int r1 = r1 - r9
            long r1 = r18 << r1
            long r3 = r10 & r1
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 != 0) goto L18d
            r2 = r1
            a0.l r1 = new a0.l
            long r2 = r2 | r10
            r4 = r12
            r1.<init>(r2, r4, r6, r8)
            return r1
        L50:
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 < 0) goto L152
            boolean r3 = r29.h(r30)
            if (r3 != 0) goto L18d
            long r5 = r1 + r18
            long r14 = (long) r9
            long r5 = r5 / r14
            long r5 = r5 * r14
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 >= 0) goto L68
            r5 = 9223372036854775680(0x7fffffffffffff80, double:NaN)
        L68:
            r20 = r10
            long r9 = r0.f8675s
            r21 = r20
            r7 = 0
        L6f:
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 >= 0) goto L11e
            int r11 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r11 == 0) goto L102
            if (r7 != 0) goto Le3
            k3.c r7 = new k3.c
            r7.<init>()
            if (r8 == 0) goto Ld3
            int r11 = r8.length
            long[] r11 = java.util.Arrays.copyOf(r8, r11)
            r23 = 0
            r.x r3 = new r.x
            int r4 = r11.length
            r3.<init>(r4)
            int r4 = r3.f16259b
            if (r4 < 0) goto Lcd
            r25 = r5
            int r5 = r11.length
            if (r5 != 0) goto L99
            r27 = r9
            goto Le0
        L99:
            int r5 = r11.length
            int r5 = r5 + r4
            long[] r6 = r3.f16258a
            r27 = r9
            int r9 = r6.length
            if (r9 >= r5) goto Lb6
            int r9 = r6.length
            int r9 = r9 * 3
            int r9 = r9 / 2
            int r5 = java.lang.Math.max(r5, r9)
            long[] r5 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r6 = "copyOf(...)"
            kotlin.jvm.internal.m.d(r5, r6)
            r3.f16258a = r5
        Lb6:
            long[] r5 = r3.f16258a
            int r6 = r3.f16259b
            if (r4 == r6) goto Lc1
            int r9 = r11.length
            int r9 = r9 + r4
            n5.k.E0(r5, r5, r9, r4, r6)
        Lc1:
            int r6 = r11.length
            r9 = 0
            n5.k.E0(r11, r5, r4, r9, r6)
            int r4 = r3.f16259b
            int r5 = r11.length
            int r4 = r4 + r5
            r3.f16259b = r4
            goto Le0
        Lcd:
            java.lang.String r1 = ""
            s.AbstractC1585a.d(r1)
            throw r23
        Ld3:
            r25 = r5
            r27 = r9
            r23 = 0
            r.x r3 = new r.x
            r4 = 16
            r3.<init>(r4)
        Le0:
            r7.f14120q = r3
            goto Le9
        Le3:
            r25 = r5
            r27 = r9
            r23 = 0
        Le9:
            r3 = 64
            r9 = 0
        Lec:
            if (r9 >= r3) goto L10a
            long r4 = r18 << r9
            long r4 = r4 & r12
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto Lff
            long r4 = (long) r9
            long r4 = r27 + r4
            java.lang.Object r6 = r7.f14120q
            r.x r6 = (r.x) r6
            r6.a(r4)
        Lff:
            int r9 = r9 + 1
            goto Lec
        L102:
            r25 = r5
            r27 = r9
            r3 = 64
            r23 = 0
        L10a:
            int r4 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r4 != 0) goto L114
            r3 = r23
            r23 = r16
        L112:
            r9 = 0
            goto L126
        L114:
            long r9 = r27 + r14
            r12 = r21
            r5 = r25
            r21 = r16
            goto L6f
        L11e:
            r27 = r9
            r23 = r12
            r25 = r27
            r3 = 0
            goto L112
        L126:
            a0.l r20 = new a0.l
            if (r7 == 0) goto L146
            java.lang.Object r4 = r7.f14120q
            r.x r4 = (r.x) r4
            int r5 = r4.f16259b
            if (r5 != 0) goto L133
            goto L140
        L133:
            long[] r3 = new long[r5]
            long[] r4 = r4.f16258a
        L137:
            if (r9 >= r5) goto L140
            r6 = r4[r9]
            r3[r9] = r6
            int r9 = r9 + 1
            goto L137
        L140:
            if (r3 != 0) goto L143
            goto L146
        L143:
            r27 = r3
            goto L148
        L146:
            r27 = r8
        L148:
            r20.<init>(r21, r23, r25, r27)
            r3 = r20
            a0.l r1 = r3.j(r1)
            return r1
        L152:
            r20 = r10
            r9 = 0
            r3 = 1
            if (r8 != 0) goto L166
            r4 = r1
            a0.l r1 = new a0.l
            long[] r8 = new long[r3]
            r8[r9] = r4
            r4 = r12
            r2 = r20
            r1.<init>(r2, r4, r6, r8)
            return r1
        L166:
            r4 = r1
            int r1 = a0.r.b(r8, r4)
            if (r1 >= 0) goto L18d
            int r1 = r1 + r3
            int r1 = -r1
            int r2 = r8.length
            int r3 = r2 + 1
            long[] r3 = new long[r3]
            n5.k.E0(r8, r3, r9, r9, r1)
            int r6 = r1 + 1
            n5.k.E0(r8, r3, r6, r1, r2)
            r3[r1] = r4
            a0.l r10 = new a0.l
            long r13 = r0.f8674r
            long r1 = r0.f8675s
            long r11 = r0.f8673q
            r15 = r1
            r17 = r3
            r10.<init>(r11, r13, r15, r17)
            return r10
        L18d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.l.j(long):a0.l");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(n5.m.c0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = arrayList.get(i7);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
