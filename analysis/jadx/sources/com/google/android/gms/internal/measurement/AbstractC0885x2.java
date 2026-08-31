package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0885x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f11122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f11123b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Charset.forName("US-ASCII");
        f11122a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f11123b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
