package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f10506a;

    public h0(Unsafe unsafe) {
        this.f10506a = unsafe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a(Field field) {
        return this.f10506a.objectFieldOffset(field);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, long j, Object obj) {
        this.f10506a.putInt(obj, j, i);
    }

    public abstract void c(Object obj, long j, double d5);

    public abstract void d(Object obj, long j, float f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(Object obj, long j, long j7) {
        this.f10506a.putLong(obj, j, j7);
    }

    public abstract void f(Object obj, long j, boolean z5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g(long j, Object obj) {
        return this.f10506a.getInt(obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long h(long j, Object obj) {
        return this.f10506a.getLong(obj, j);
    }

    public abstract boolean i(long j, Object obj);

    public abstract float j(long j, Object obj);

    public abstract double k(long j, Object obj);

    public abstract byte l(long j, Object obj);
}
