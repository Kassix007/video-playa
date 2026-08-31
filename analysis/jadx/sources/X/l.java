package X;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f8158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f8159c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(int i, long[] jArr, Object[] objArr) {
        this.f8157a = i;
        this.f8158b = jArr;
        this.f8159c = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(long j) {
        int i = this.f8157a - 1;
        if (i != -1) {
            long[] jArr = this.f8158b;
            int i7 = 0;
            if (i != 0) {
                while (i7 <= i) {
                    int i8 = (i7 + i) >>> 1;
                    long j7 = jArr[i8] - j;
                    if (j7 < 0) {
                        i7 = i8 + 1;
                    } else {
                        if (j7 <= 0) {
                            return i8;
                        }
                        i = i8 - 1;
                    }
                }
                return -(i7 + 1);
            }
            long j8 = jArr[0];
            if (j8 == j) {
                return 0;
            }
            if (j8 > j) {
                return -2;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l b(long j, Object obj) {
        long[] jArr;
        int i;
        Object[] objArr = this.f8159c;
        int i7 = 0;
        int i8 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i8++;
            }
        }
        int i9 = i8 + 1;
        long[] jArr2 = new long[i9];
        Object[] objArr2 = new Object[i9];
        if (i9 > 1) {
            int i10 = 0;
            while (true) {
                jArr = this.f8158b;
                i = this.f8157a;
                if (i7 >= i9 || i10 >= i) {
                    break;
                }
                long j7 = jArr[i10];
                Object obj3 = objArr[i10];
                if (j7 > j) {
                    jArr2[i7] = j;
                    objArr2[i7] = obj;
                    i7++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i7] = j7;
                    objArr2[i7] = obj3;
                    i7++;
                }
                i10++;
            }
            if (i10 == i) {
                jArr2[i8] = j;
                objArr2[i8] = obj;
            } else {
                while (i7 < i9) {
                    long j8 = jArr[i10];
                    Object obj4 = objArr[i10];
                    if (obj4 != null) {
                        jArr2[i7] = j8;
                        objArr2[i7] = obj4;
                        i7++;
                    }
                    i10++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new l(i9, jArr2, objArr2);
    }
}
