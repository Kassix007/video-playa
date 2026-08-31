package U;

import P.AbstractC0362j0;
import a.AbstractC0597a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f7512e = new m(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W.b f7515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f7516d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(int i, int i7, Object[] objArr, W.b bVar) {
        this.f7513a = i;
        this.f7514b = i7;
        this.f7515c = bVar;
        this.f7516d = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m j(int i, Object obj, Object obj2, int i7, Object obj3, Object obj4, int i8, W.b bVar) {
        if (i8 > 30) {
            return new m(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iF = AbstractC0597a.F(i, i8);
        int iF2 = AbstractC0597a.F(i7, i8);
        if (iF != iF2) {
            return new m((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new m(0, 1 << iF, new Object[]{j(i, obj, obj2, i7, obj3, obj4, i8 + 5, bVar)}, bVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] a(int i, int i7, int i8, Object obj, Object obj2, int i9, W.b bVar) {
        Object obj3 = this.f7516d[i];
        m mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i8, obj, obj2, i9 + 5, bVar);
        int iT = t(i7);
        int i10 = iT + 1;
        Object[] objArr = this.f7516d;
        Object[] objArr2 = new Object[objArr.length - 1];
        n5.k.G0(0, i, 6, objArr, objArr2);
        n5.k.D0(i, i + 2, i10, objArr, objArr2);
        objArr2[iT - 1] = mVarJ;
        n5.k.D0(iT, i10, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        if (this.f7514b == 0) {
            return this.f7516d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f7513a);
        int length = this.f7516d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(Object obj) {
        G5.b bVarM = D5.a.M(D5.a.O(0, this.f7516d.length), 2);
        int i = bVarM.f2017q;
        int i7 = bVarM.f2018r;
        int i8 = bVarM.f2019s;
        if ((i8 > 0 && i <= i7) || (i8 < 0 && i7 <= i)) {
            while (!kotlin.jvm.internal.m.a(obj, this.f7516d[i])) {
                if (i != i7) {
                    i += i8;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(int i, int i7, Object obj) {
        int iF = 1 << AbstractC0597a.F(i, i7);
        if (h(iF)) {
            return kotlin.jvm.internal.m.a(obj, this.f7516d[f(iF)]);
        }
        if (!i(iF)) {
            return false;
        }
        m mVarS = s(t(iF));
        return i7 == 30 ? mVarS.c(obj) : mVarS.d(i, i7 + 5, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(m mVar) {
        if (this == mVar) {
            return true;
        }
        if (this.f7514b == mVar.f7514b && this.f7513a == mVar.f7513a) {
            int length = this.f7516d.length;
            for (int i = 0; i < length; i++) {
                if (this.f7516d[i] == mVar.f7516d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.f7513a) * 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g(int i, int i7, Object obj) {
        int iF = 1 << AbstractC0597a.F(i, i7);
        if (h(iF)) {
            int iF2 = f(iF);
            if (kotlin.jvm.internal.m.a(obj, this.f7516d[iF2])) {
                return x(iF2);
            }
            return null;
        }
        if (!i(iF)) {
            return null;
        }
        m mVarS = s(t(iF));
        if (i7 != 30) {
            return mVarS.g(i, i7 + 5, obj);
        }
        G5.b bVarM = D5.a.M(D5.a.O(0, mVarS.f7516d.length), 2);
        int i8 = bVarM.f2017q;
        int i9 = bVarM.f2018r;
        int i10 = bVarM.f2019s;
        if ((i10 <= 0 || i8 > i9) && (i10 >= 0 || i9 > i8)) {
            return null;
        }
        while (!kotlin.jvm.internal.m.a(obj, mVarS.f7516d[i8])) {
            if (i8 == i9) {
                return null;
            }
            i8 += i10;
        }
        return mVarS.x(i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(int i) {
        return (i & this.f7513a) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i(int i) {
        return (i & this.f7514b) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m k(int i, X.h hVar) {
        hVar.e(hVar.f8146u - 1);
        hVar.f8144s = x(i);
        Object[] objArr = this.f7516d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f7515c != hVar.f8142q) {
            return new m(0, 0, AbstractC0597a.c(i, objArr), hVar.f8142q);
        }
        this.f7516d = AbstractC0597a.c(i, objArr);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m l(int i, Object obj, Object obj2, int i7, X.h hVar) {
        X.h hVar2;
        m mVarL;
        int iF = 1 << AbstractC0597a.F(i, i7);
        boolean zH = h(iF);
        W.b bVar = this.f7515c;
        if (zH) {
            int iF2 = f(iF);
            if (!kotlin.jvm.internal.m.a(obj, this.f7516d[iF2])) {
                hVar.e(hVar.f8146u + 1);
                W.b bVar2 = hVar.f8142q;
                if (bVar != bVar2) {
                    return new m(this.f7513a ^ iF, this.f7514b | iF, a(iF2, iF, i, obj, obj2, i7, bVar2), bVar2);
                }
                this.f7516d = a(iF2, iF, i, obj, obj2, i7, bVar2);
                this.f7513a ^= iF;
                this.f7514b |= iF;
                return this;
            }
            hVar.f8144s = x(iF2);
            if (x(iF2) == obj2) {
                return this;
            }
            if (bVar == hVar.f8142q) {
                this.f7516d[iF2 + 1] = obj2;
                return this;
            }
            hVar.f8145t++;
            Object[] objArr = this.f7516d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF2 + 1] = obj2;
            return new m(this.f7513a, this.f7514b, objArrCopyOf, hVar.f8142q);
        }
        if (!i(iF)) {
            hVar.e(hVar.f8146u + 1);
            W.b bVar3 = hVar.f8142q;
            int iF3 = f(iF);
            if (bVar != bVar3) {
                return new m(this.f7513a | iF, this.f7514b, AbstractC0597a.b(this.f7516d, iF3, obj, obj2), bVar3);
            }
            this.f7516d = AbstractC0597a.b(this.f7516d, iF3, obj, obj2);
            this.f7513a |= iF;
            return this;
        }
        int iT = t(iF);
        m mVarS = s(iT);
        if (i7 == 30) {
            G5.b bVarM = D5.a.M(D5.a.O(0, mVarS.f7516d.length), 2);
            int i8 = bVarM.f2017q;
            int i9 = bVarM.f2018r;
            int i10 = bVarM.f2019s;
            if ((i10 <= 0 || i8 > i9) && (i10 >= 0 || i9 > i8)) {
                hVar.e(hVar.f8146u + 1);
                mVarL = new m(0, 0, AbstractC0597a.b(mVarS.f7516d, 0, obj, obj2), hVar.f8142q);
                hVar2 = hVar;
            } else {
                while (!kotlin.jvm.internal.m.a(obj, mVarS.f7516d[i8])) {
                    if (i8 == i9) {
                        hVar.e(hVar.f8146u + 1);
                        mVarL = new m(0, 0, AbstractC0597a.b(mVarS.f7516d, 0, obj, obj2), hVar.f8142q);
                        break;
                    }
                    i8 += i10;
                }
                hVar.f8144s = mVarS.x(i8);
                if (mVarS.f7515c == hVar.f8142q) {
                    mVarS.f7516d[i8 + 1] = obj2;
                    mVarL = mVarS;
                } else {
                    hVar.f8145t++;
                    Object[] objArr2 = mVarS.f7516d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[i8 + 1] = obj2;
                    mVarL = new m(0, 0, objArrCopyOf2, hVar.f8142q);
                }
                hVar2 = hVar;
            }
        } else {
            hVar2 = hVar;
            mVarL = mVarS.l(i, obj, obj2, i7 + 5, hVar2);
        }
        return mVarS == mVarL ? this : r(iT, mVarL, hVar2.f8142q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m m(m mVar, int i, W.a aVar, X.h hVar) {
        Object[] objArr;
        m mVarJ;
        if (this == mVar) {
            aVar.f8005a += b();
            return this;
        }
        int i7 = 0;
        if (i > 30) {
            W.b bVar = hVar.f8142q;
            int i8 = mVar.f7514b;
            Object[] objArr2 = this.f7516d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + mVar.f7516d.length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            int length = this.f7516d.length;
            G5.b bVarM = D5.a.M(D5.a.O(0, mVar.f7516d.length), 2);
            int i9 = bVarM.f2017q;
            int i10 = bVarM.f2018r;
            int i11 = bVarM.f2019s;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (true) {
                    if (c(mVar.f7516d[i9])) {
                        aVar.f8005a++;
                    } else {
                        Object[] objArr3 = mVar.f7516d;
                        objArrCopyOf[length] = objArr3[i9];
                        objArrCopyOf[length + 1] = objArr3[i9 + 1];
                        length += 2;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9 += i11;
                }
            }
            if (length != this.f7516d.length) {
                if (length == mVar.f7516d.length) {
                    return mVar;
                }
                if (length == objArrCopyOf.length) {
                    return new m(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
                return new m(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i12 = this.f7514b | mVar.f7514b;
            int i13 = this.f7513a;
            int i14 = mVar.f7513a;
            int i15 = (i13 ^ i14) & (~i12);
            int i16 = i13 & i14;
            int i17 = i15;
            while (i16 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i16);
                if (kotlin.jvm.internal.m.a(this.f7516d[f(iLowestOneBit)], mVar.f7516d[mVar.f(iLowestOneBit)])) {
                    i17 |= iLowestOneBit;
                } else {
                    i12 |= iLowestOneBit;
                }
                i16 ^= iLowestOneBit;
            }
            if ((i12 & i17) != 0) {
                AbstractC0362j0.b("Check failed.");
            }
            m mVar2 = (kotlin.jvm.internal.m.a(this.f7515c, hVar.f8142q) && this.f7513a == i17 && this.f7514b == i12) ? this : new m(i17, i12, new Object[Integer.bitCount(i12) + (Integer.bitCount(i17) * 2)], null);
            int i18 = i12;
            int i19 = 0;
            while (i18 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i18);
                Object[] objArr4 = mVar2.f7516d;
                int length2 = (objArr4.length - 1) - i19;
                if (i(iLowestOneBit2)) {
                    mVarJ = s(t(iLowestOneBit2));
                    if (mVar.i(iLowestOneBit2)) {
                        mVarJ = mVarJ.m(mVar.s(mVar.t(iLowestOneBit2)), i + 5, aVar, hVar);
                        objArr = objArr4;
                    } else if (mVar.h(iLowestOneBit2)) {
                        int iF = mVar.f(iLowestOneBit2);
                        Object obj = mVar.f7516d[iF];
                        Object objX = mVar.x(iF);
                        int i20 = hVar.f8146u;
                        objArr = objArr4;
                        mVarJ = mVarJ.l(obj != null ? obj.hashCode() : i7, obj, objX, i + 5, hVar);
                        if (hVar.f8146u == i20) {
                            aVar.f8005a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (mVar.i(iLowestOneBit2)) {
                        m mVarS = mVar.s(mVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f7516d[iF2];
                            int i21 = i + 5;
                            if (mVarS.d(obj2 != null ? obj2.hashCode() : 0, i21, obj2)) {
                                aVar.f8005a++;
                                mVarJ = mVarS;
                            } else {
                                mVarJ = mVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i21, hVar);
                            }
                        } else {
                            mVarJ = mVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f7516d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = mVar.f(iLowestOneBit2);
                        Object obj4 = mVar.f7516d[iF4];
                        mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, mVar.x(iF4), i + 5, hVar.f8142q);
                    }
                }
                objArr[length2] = mVarJ;
                i19++;
                i18 ^= iLowestOneBit2;
                i7 = 0;
            }
            int i22 = 0;
            while (i17 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i17);
                int i23 = i22 * 2;
                if (mVar.h(iLowestOneBit3)) {
                    int iF5 = mVar.f(iLowestOneBit3);
                    Object[] objArr5 = mVar2.f7516d;
                    objArr5[i23] = mVar.f7516d[iF5];
                    objArr5[i23 + 1] = mVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f8005a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = mVar2.f7516d;
                    objArr6[i23] = this.f7516d[iF6];
                    objArr6[i23 + 1] = x(iF6);
                }
                i22++;
                i17 ^= iLowestOneBit3;
            }
            if (!e(mVar2)) {
                return mVar.e(mVar2) ? mVar : mVar2;
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m n(int i, Object obj, int i7, X.h hVar) {
        m mVarN;
        int iF = 1 << AbstractC0597a.F(i, i7);
        if (h(iF)) {
            int iF2 = f(iF);
            if (kotlin.jvm.internal.m.a(obj, this.f7516d[iF2])) {
                return p(iF2, iF, hVar);
            }
        } else if (i(iF)) {
            int iT = t(iF);
            m mVarS = s(iT);
            if (i7 == 30) {
                G5.b bVarM = D5.a.M(D5.a.O(0, mVarS.f7516d.length), 2);
                int i8 = bVarM.f2017q;
                int i9 = bVarM.f2018r;
                int i10 = bVarM.f2019s;
                if ((i10 <= 0 || i8 > i9) && (i10 >= 0 || i9 > i8)) {
                    mVarN = mVarS;
                    break;
                }
                while (!kotlin.jvm.internal.m.a(obj, mVarS.f7516d[i8])) {
                    if (i8 == i9) {
                        mVarN = mVarS;
                        break;
                    }
                    i8 += i10;
                }
                mVarN = mVarS.k(i8, hVar);
            } else {
                mVarN = mVarS.n(i, obj, i7 + 5, hVar);
            }
            return q(mVarS, mVarN, iT, iF, hVar.f8142q);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m o(int i, Object obj, Object obj2, int i7, X.h hVar) {
        m mVar;
        m mVarO;
        int iF = 1 << AbstractC0597a.F(i, i7);
        if (h(iF)) {
            int iF2 = f(iF);
            if (kotlin.jvm.internal.m.a(obj, this.f7516d[iF2]) && kotlin.jvm.internal.m.a(obj2, x(iF2))) {
                return p(iF2, iF, hVar);
            }
        } else if (i(iF)) {
            int iT = t(iF);
            m mVarS = s(iT);
            if (i7 == 30) {
                G5.b bVarM = D5.a.M(D5.a.O(0, mVarS.f7516d.length), 2);
                int i8 = bVarM.f2017q;
                int i9 = bVarM.f2018r;
                int i10 = bVarM.f2019s;
                if ((i10 <= 0 || i8 > i9) && (i10 >= 0 || i9 > i8)) {
                    mVarO = mVarS;
                    mVar = mVarS;
                } else {
                    while (true) {
                        if (!kotlin.jvm.internal.m.a(obj, mVarS.f7516d[i8]) || !kotlin.jvm.internal.m.a(obj2, mVarS.x(i8))) {
                            if (i8 == i9) {
                                break;
                            }
                            i8 += i10;
                        } else {
                            mVarO = mVarS.k(i8, hVar);
                            break;
                        }
                    }
                    mVarO = mVarS;
                    mVar = mVarS;
                }
            } else {
                mVar = mVarS;
                mVarO = mVar.o(i, obj, obj2, i7 + 5, hVar);
            }
            return q(mVar, mVarO, iT, iF, hVar.f8142q);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m p(int i, int i7, X.h hVar) {
        hVar.e(hVar.f8146u - 1);
        hVar.f8144s = x(i);
        Object[] objArr = this.f7516d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f7515c != hVar.f8142q) {
            return new m(i7 ^ this.f7513a, this.f7514b, AbstractC0597a.c(i, objArr), hVar.f8142q);
        }
        this.f7516d = AbstractC0597a.c(i, objArr);
        this.f7513a ^= i7;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m q(m mVar, m mVar2, int i, int i7, W.b bVar) {
        W.b bVar2 = this.f7515c;
        if (mVar2 != null) {
            return (bVar2 == bVar || mVar != mVar2) ? r(i, mVar2, bVar) : this;
        }
        Object[] objArr = this.f7516d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new m(this.f7513a, i7 ^ this.f7514b, AbstractC0597a.d(i, objArr), bVar);
        }
        this.f7516d = AbstractC0597a.d(i, objArr);
        this.f7514b ^= i7;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m r(int i, m mVar, W.b bVar) {
        Object[] objArr = this.f7516d;
        if (objArr.length == 1 && mVar.f7516d.length == 2 && mVar.f7514b == 0) {
            mVar.f7513a = this.f7514b;
            return mVar;
        }
        if (this.f7515c == bVar) {
            objArr[i] = mVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = mVar;
        return new m(this.f7513a, this.f7514b, objArrCopyOf, bVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m s(int i) {
        Object obj = this.f7516d[i];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (m) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int t(int i) {
        return (this.f7516d.length - 1) - Integer.bitCount((i - 1) & this.f7514b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        r14.f7511r = w(r12, r4, (U.m) r14.f7511r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final U.l u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r11 = this;
            int r0 = a.AbstractC0597a.F(r12, r13)
            r1 = 1
            int r4 = r1 << r0
            boolean r0 = r11.h(r4)
            r2 = 0
            java.lang.String r3 = "copyOf(...)"
            r10 = 0
            if (r0 == 0) goto L61
            r0 = r3
            int r3 = r11.f(r4)
            java.lang.Object[] r5 = r11.f7516d
            r5 = r5[r3]
            boolean r5 = kotlin.jvm.internal.m.a(r14, r5)
            if (r5 == 0) goto L45
            java.lang.Object r12 = r11.x(r3)
            if (r12 != r15) goto L29
            r13 = r11
            goto Ldc
        L29:
            java.lang.Object[] r12 = r11.f7516d
            int r13 = r12.length
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r13)
            kotlin.jvm.internal.m.d(r12, r0)
            int r3 = r3 + r1
            r12[r3] = r15
            U.m r13 = new U.m
            int r14 = r11.f7513a
            int r15 = r11.f7514b
            r13.<init>(r14, r15, r12, r10)
            U.l r12 = new U.l
            r12.<init>(r2, r13)
            return r12
        L45:
            r9 = 0
            r2 = r11
            r5 = r12
            r8 = r13
            r6 = r14
            r7 = r15
            java.lang.Object[] r12 = r2.a(r3, r4, r5, r6, r7, r8, r9)
            r13 = r2
            U.m r14 = new U.m
            int r15 = r13.f7513a
            r15 = r15 ^ r4
            int r0 = r13.f7514b
            r0 = r0 | r4
            r14.<init>(r15, r0, r12, r10)
            U.l r12 = new U.l
            r12.<init>(r1, r14)
            return r12
        L61:
            r5 = r12
            r8 = r13
            r6 = r14
            r7 = r15
            r0 = r3
            r13 = r11
            boolean r12 = r11.i(r4)
            if (r12 == 0) goto Le8
            int r12 = r11.t(r4)
            U.m r14 = r11.s(r12)
            r15 = 30
            if (r8 != r15) goto Ld4
            java.lang.Object[] r15 = r14.f7516d
            int r15 = r15.length
            G5.d r15 = D5.a.O(r2, r15)
            r3 = 2
            G5.b r15 = D5.a.M(r15, r3)
            int r3 = r15.f2017q
            int r5 = r15.f2018r
            int r15 = r15.f2019s
            if (r15 <= 0) goto L8f
            if (r3 <= r5) goto L93
        L8f:
            if (r15 >= 0) goto Lc1
            if (r5 > r3) goto Lc1
        L93:
            java.lang.Object[] r8 = r14.f7516d
            r8 = r8[r3]
            boolean r8 = kotlin.jvm.internal.m.a(r6, r8)
            if (r8 == 0) goto Lbd
            java.lang.Object r15 = r14.x(r3)
            if (r7 != r15) goto La5
            r14 = r10
            goto Ld1
        La5:
            java.lang.Object[] r14 = r14.f7516d
            int r15 = r14.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
            kotlin.jvm.internal.m.d(r14, r0)
            int r3 = r3 + r1
            r14[r3] = r7
            U.m r15 = new U.m
            r15.<init>(r2, r2, r14, r10)
            U.l r14 = new U.l
            r14.<init>(r2, r15)
            goto Ld1
        Lbd:
            if (r3 == r5) goto Lc1
            int r3 = r3 + r15
            goto L93
        Lc1:
            java.lang.Object[] r14 = r14.f7516d
            java.lang.Object[] r14 = a.AbstractC0597a.b(r14, r2, r6, r7)
            U.m r15 = new U.m
            r15.<init>(r2, r2, r14, r10)
            U.l r14 = new U.l
            r14.<init>(r1, r15)
        Ld1:
            if (r14 != 0) goto Ldd
            goto Ldc
        Ld4:
            int r15 = r8 + 5
            U.l r14 = r14.u(r5, r15, r6, r7)
            if (r14 != 0) goto Ldd
        Ldc:
            return r10
        Ldd:
            java.lang.Object r15 = r14.f7511r
            U.m r15 = (U.m) r15
            U.m r12 = r11.w(r12, r4, r15)
            r14.f7511r = r12
            return r14
        Le8:
            int r12 = r11.f(r4)
            java.lang.Object[] r14 = r13.f7516d
            java.lang.Object[] r12 = a.AbstractC0597a.b(r14, r12, r6, r7)
            U.m r14 = new U.m
            int r15 = r13.f7513a
            r15 = r15 | r4
            int r0 = r13.f7514b
            r14.<init>(r15, r0, r12, r10)
            U.l r12 = new U.l
            r12.<init>(r1, r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: U.m.u(int, int, java.lang.Object, java.lang.Object):U.l");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m v(int i, int i7, Object obj) {
        m mVarV;
        int iF = 1 << AbstractC0597a.F(i, i7);
        if (h(iF)) {
            int iF2 = f(iF);
            if (kotlin.jvm.internal.m.a(obj, this.f7516d[iF2])) {
                Object[] objArr = this.f7516d;
                if (objArr.length != 2) {
                    return new m(this.f7513a ^ iF, this.f7514b, AbstractC0597a.c(iF2, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iF)) {
            int iT = t(iF);
            m mVarS = s(iT);
            if (i7 == 30) {
                G5.b bVarM = D5.a.M(D5.a.O(0, mVarS.f7516d.length), 2);
                int i8 = bVarM.f2017q;
                int i9 = bVarM.f2018r;
                int i10 = bVarM.f2019s;
                if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                    while (!kotlin.jvm.internal.m.a(obj, mVarS.f7516d[i8])) {
                        if (i8 != i9) {
                            i8 += i10;
                        }
                    }
                    Object[] objArr2 = mVarS.f7516d;
                    mVarV = objArr2.length == 2 ? null : new m(0, 0, AbstractC0597a.c(i8, objArr2), null);
                }
                mVarV = mVarS;
                break;
            }
            mVarV = mVarS.v(i, i7 + 5, obj);
            if (mVarV == null) {
                Object[] objArr3 = this.f7516d;
                if (objArr3.length != 1) {
                    return new m(this.f7513a, iF ^ this.f7514b, AbstractC0597a.d(iT, objArr3), null);
                }
                return null;
            }
            if (mVarS != mVarV) {
                return w(iT, iF, mVarV);
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m w(int i, int i7, m mVar) {
        Object[] objArr = mVar.f7516d;
        if (objArr.length != 2 || mVar.f7514b != 0) {
            Object[] objArr2 = this.f7516d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i] = mVar;
            return new m(this.f7513a, this.f7514b, objArrCopyOf, null);
        }
        if (this.f7516d.length == 1) {
            mVar.f7513a = this.f7514b;
            return mVar;
        }
        int iF = f(i7);
        Object[] objArr3 = this.f7516d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
        n5.k.D0(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        n5.k.D0(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new m(this.f7513a ^ i7, i7 ^ this.f7514b, objArrCopyOf2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object x(int i) {
        return this.f7516d[i + 1];
    }
}
