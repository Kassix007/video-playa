package com.google.android.gms.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f10354c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ l(boolean z5, String str, o oVar) {
        this.f10352a = z5;
        this.f10353b = str;
        this.f10354c = oVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z5 = this.f10352a;
        String str = this.f10353b;
        o oVar = this.f10354c;
        String str2 = (z5 || !q.a(str, oVar, true, false).f10371a) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        AbstractC1887A.g(messageDigest);
        byte[] bArrDigest = messageDigest.digest(oVar.f10358e);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i7 = 0;
        for (byte b7 : bArrDigest) {
            char[] cArr2 = B3.b.f553b;
            cArr[i7] = cArr2[(b7 & 255) >>> 4];
            cArr[i7 + 1] = cArr2[b7 & 15];
            i7 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z5 + ", ver=12451000.false";
    }
}
