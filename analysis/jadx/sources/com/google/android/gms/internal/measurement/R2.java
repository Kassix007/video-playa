package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y1 f10697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f10699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10700d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public R2(Y1 y12, String str, Object[] objArr) {
        this.f10697a = y12;
        this.f10698b = str;
        this.f10699c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f10700d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i7 = 1;
        int i8 = 13;
        while (true) {
            int i9 = i7 + 1;
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 55296) {
                this.f10700d = i | (cCharAt2 << i8);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i8;
                i8 += 13;
                i7 = i9;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        int i = this.f10700d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
