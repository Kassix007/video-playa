package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.measurement.C0796f2;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0752k implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f10519q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10520r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10522t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0752k(C0754m c0754m) {
        this.f10522t = c0754m;
        this.f10521s = c0754m.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10519q) {
            case 0:
                if (this.f10520r < this.f10521s) {
                }
                break;
            case 1:
                if (this.f10520r < this.f10521s) {
                }
                break;
            default:
                if (this.f10520r < this.f10521s) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10519q) {
            case 0:
                try {
                    C0754m c0754m = (C0754m) this.f10522t;
                    int i = this.f10520r;
                    this.f10520r = i + 1;
                    return Byte.valueOf(c0754m.h(i));
                } catch (IndexOutOfBoundsException e7) {
                    throw new NoSuchElementException(e7.getMessage());
                }
            case 1:
                int i7 = this.f10520r;
                if (i7 >= this.f10521s) {
                    throw new NoSuchElementException();
                }
                this.f10520r = i7 + 1;
                return Byte.valueOf(((C0796f2) this.f10522t).g(i7));
            default:
                int i8 = this.f10520r;
                if (i8 >= this.f10521s) {
                    throw new NoSuchElementException();
                }
                this.f10520r = i8 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.vision.P) this.f10522t).i(i8));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10519q) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0752k(C0796f2 c0796f2) {
        this.f10522t = c0796f2;
        this.f10521s = c0796f2.h();
    }

    public C0752k(com.google.android.gms.internal.vision.P p7) {
        this.f10522t = p7;
        this.f10521s = p7.g();
    }
}
