package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0782c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f10816a;

    public AbstractC0782c3(Unsafe unsafe) {
        this.f10816a = unsafe;
    }

    public abstract void a(Object obj, long j, byte b7);

    public abstract boolean b(long j, Object obj);

    public abstract void c(Object obj, long j, boolean z5);

    public abstract float d(long j, Object obj);

    public abstract void e(Object obj, long j, float f);

    public abstract double f(long j, Object obj);

    public abstract void g(Object obj, long j, double d5);
}
