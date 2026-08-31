package com.google.android.gms.internal.clearcut;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0758q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0757p f10540a = new C0757p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0757p f10541b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0757p c0757p = null;
        try {
            c0757p = (C0757p) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f10541b = c0757p;
    }
}
