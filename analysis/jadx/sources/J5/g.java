package J5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CharSequence f2825q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2826r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2827s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2828t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2829u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(CharSequence string) {
        kotlin.jvm.internal.m.e(string, "string");
        this.f2825q = string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i7;
        int i8 = this.f2826r;
        if (i8 != 0) {
            return i8 == 1;
        }
        if (this.f2829u < 0) {
            this.f2826r = 2;
            return false;
        }
        CharSequence charSequence = this.f2825q;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i9 = this.f2827s; i9 < length2; i9++) {
            char cCharAt = charSequence.charAt(i9);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i7 = i9 + 1) < charSequence.length() && charSequence.charAt(i7) == '\n') ? 2 : 1;
                length = i9;
                this.f2826r = 1;
                this.f2829u = i;
                this.f2828t = length;
                return true;
            }
        }
        i = -1;
        this.f2826r = 1;
        this.f2829u = i;
        this.f2828t = length;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2826r = 0;
        int i = this.f2828t;
        int i7 = this.f2827s;
        this.f2827s = this.f2829u + i;
        return this.f2825q.subSequence(i7, i).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
