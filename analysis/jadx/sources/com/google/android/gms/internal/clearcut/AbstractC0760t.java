package com.google.android.gms.internal.clearcut;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0760t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f10556b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = new int[C.values().length];
        f10556b = iArr;
        try {
            iArr[C.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10556b[C.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            int[] iArr2 = f10556b;
            C c7 = C.VOID;
            iArr2[6] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr3 = new int[O.c.b(4).length];
        f10555a = iArr3;
        try {
            iArr3[3] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f10555a[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f10555a[0] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
