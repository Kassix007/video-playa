package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0914i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f11272a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f11273b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f11273b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw C0922m0.b();
            }
            if (length > Integer.MAX_VALUE) {
                throw C0922m0.a();
            }
        } catch (C0922m0 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0906e0 b(Object obj, Object obj2) {
        AbstractC0906e0 abstractC0906e0 = (AbstractC0906e0) ((K) obj);
        AbstractC0902c0 abstractC0902c0 = (AbstractC0902c0) abstractC0906e0.e(5);
        abstractC0902c0.a(abstractC0906e0);
        K k7 = (K) obj2;
        if (!abstractC0902c0.f11262q.getClass().isInstance(k7)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC0902c0.a((AbstractC0906e0) k7);
        return abstractC0902c0.e();
    }
}
