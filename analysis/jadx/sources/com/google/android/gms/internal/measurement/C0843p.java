package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0843p implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11008r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f11009s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0843p(int i, Object obj) {
        this.f11007q = i;
        this.f11009s = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11007q) {
            case 0:
                if (this.f11008r < ((C0848q) this.f11009s).f11014q.length()) {
                }
                break;
            case 1:
                if (this.f11008r < ((C0848q) this.f11009s).f11014q.length()) {
                }
                break;
            default:
                if (this.f11008r < ((C0783d) this.f11009s).p()) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f11007q) {
            case 0:
                String str = ((C0848q) this.f11009s).f11014q;
                int i = this.f11008r;
                if (i >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.f11008r = i + 1;
                return new C0848q(String.valueOf(i));
            case 1:
                C0848q c0848q = (C0848q) this.f11009s;
                String str2 = c0848q.f11014q;
                int i7 = this.f11008r;
                if (i7 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.f11008r = i7 + 1;
                return new C0848q(String.valueOf(c0848q.f11014q.charAt(i7)));
            default:
                C0783d c0783d = (C0783d) this.f11009s;
                if (this.f11008r < c0783d.p()) {
                    int i8 = this.f11008r;
                    this.f11008r = i8 + 1;
                    return c0783d.q(i8);
                }
                int i9 = this.f11008r;
                StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i9);
                throw new NoSuchElementException(sb.toString());
        }
    }
}
