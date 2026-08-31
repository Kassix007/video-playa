package com.google.android.gms.internal.vision;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0926o0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(P.class, P.f11218s),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f11298q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC0926o0(Class cls, Serializable serializable) {
        this.f11298q = serializable;
    }
}
