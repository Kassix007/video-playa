package u1;

/* JADX INFO: renamed from: u1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1674a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f17114e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f17115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f17118d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        for (int i = 0; i < 1792; i++) {
            f17114e[i] = Character.getDirectionality(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1674a(CharSequence charSequence) {
        this.f17115a = charSequence;
        this.f17116b = charSequence.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte a() {
        int i = this.f17117c - 1;
        CharSequence charSequence = this.f17115a;
        char cCharAt = charSequence.charAt(i);
        this.f17118d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f17117c);
            this.f17117c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f17117c--;
        char c7 = this.f17118d;
        return c7 < 1792 ? f17114e[c7] : Character.getDirectionality(c7);
    }
}
