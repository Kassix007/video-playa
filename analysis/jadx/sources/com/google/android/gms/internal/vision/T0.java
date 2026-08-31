package com.google.android.gms.internal.vision;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f11230a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T0(Unsafe unsafe) {
        this.f11230a = unsafe;
    }

    public abstract byte a(long j, Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, long j, Object obj) {
        this.f11230a.putInt(obj, j, i);
    }

    public abstract void c(Object obj, long j, byte b7);

    public abstract void d(Object obj, long j, double d5);

    public abstract void e(Object obj, long j, float f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(Object obj, long j, long j7) {
        this.f11230a.putLong(obj, j, j7);
    }

    public abstract void g(Object obj, long j, boolean z5);

    public abstract boolean h(long j, Object obj);

    public abstract float i(long j, Object obj);

    public abstract double j(long j, Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int k(long j, Object obj) {
        return this.f11230a.getInt(obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long l(long j, Object obj) {
        return this.f11230a.getLong(obj, j);
    }
}
