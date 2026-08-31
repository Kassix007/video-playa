package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes.dex */
public final class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f11197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f11199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11200d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public J0(K k7, String str, Object[] objArr) {
        this.f11197a = k7;
        this.f11198b = str;
        this.f11199c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f11200d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i7 = 13;
        int i8 = 1;
        while (true) {
            int i9 = i8 + 1;
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 < 55296) {
                this.f11200d = i | (cCharAt2 << i7);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i7;
                i7 += 13;
                i8 = i9;
            }
        }
    }
}
