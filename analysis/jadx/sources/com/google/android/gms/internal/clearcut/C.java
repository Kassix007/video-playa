package com.google.android.gms.internal.clearcut;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum C {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0754m.class, C0754m.f10530s),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f10395q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    C(Class cls, Serializable serializable) {
        this.f10395q = serializable;
    }
}
