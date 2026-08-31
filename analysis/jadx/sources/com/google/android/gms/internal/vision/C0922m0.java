package com.google.android.gms.internal.vision;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0922m0 extends IOException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f11286q = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0922m0 a() {
        return new C0922m0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0922m0 b() {
        return new C0922m0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0922m0 c() {
        return new C0922m0("Protocol message had invalid UTF-8.");
    }
}
