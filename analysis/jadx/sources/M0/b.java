package M0;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements CharacterIterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CharSequence f3691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f3692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3693s = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(CharSequence charSequence, int i) {
        this.f3691q = charSequence;
        this.f3692r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f3693s;
        if (i == this.f3692r) {
            return (char) 65535;
        }
        return this.f3691q.charAt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char first() {
        this.f3693s = 0;
        return current();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f3692r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f3693s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f3692r;
        if (i == 0) {
            this.f3693s = i;
            return (char) 65535;
        }
        int i7 = i - 1;
        this.f3693s = i7;
        return this.f3691q.charAt(i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f3693s + 1;
        this.f3693s = i;
        int i7 = this.f3692r;
        if (i < i7) {
            return this.f3691q.charAt(i);
        }
        this.f3693s = i7;
        return (char) 65535;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f3693s;
        if (i <= 0) {
            return (char) 65535;
        }
        int i7 = i - 1;
        this.f3693s = i7;
        return this.f3691q.charAt(i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f3692r || i < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f3693s = i;
        return current();
    }
}
