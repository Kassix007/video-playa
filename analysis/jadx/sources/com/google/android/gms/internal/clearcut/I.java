package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0761u f10420b = new C0761u(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f10421a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I() {
        N n7;
        try {
            n7 = (N) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            n7 = f10420b;
        }
        N[] nArr = {C0761u.f10557b, n7};
        J j = new J();
        j.f10422a = nArr;
        Charset charset = AbstractC0765y.f10579a;
        this.f10421a = j;
    }
}
