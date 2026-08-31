package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f11241a = new V();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f11242b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        V v6 = null;
        try {
            v6 = (V) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f11242b = v6;
    }
}
