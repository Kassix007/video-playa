package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0765y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f10579a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f10580b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f10580b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw new B("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if ((0 - 0) + length > Integer.MAX_VALUE) {
                throw B.a();
            }
        } catch (B e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0764x a(Object obj, Object obj2) {
        AbstractC0764x abstractC0764x = (AbstractC0764x) ((AbstractC0748g) obj);
        AbstractC0762v abstractC0762v = (AbstractC0762v) abstractC0764x.a(5);
        abstractC0762v.a(abstractC0764x);
        AbstractC0748g abstractC0748g = (AbstractC0748g) obj2;
        if (!abstractC0762v.f10560q.getClass().isInstance(abstractC0748g)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC0762v.a((AbstractC0764x) abstractC0748g);
        return abstractC0762v.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
