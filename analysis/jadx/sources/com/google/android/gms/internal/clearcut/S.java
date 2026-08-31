package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f10442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q f10443b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Q q7 = null;
        try {
            q7 = (Q) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f10442a = q7;
        f10443b = new Q();
    }
}
