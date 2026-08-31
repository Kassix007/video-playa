package C0;

/* JADX INFO: renamed from: C0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0073e extends AbstractC0067b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0073e f1024c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0067b
    public final int[] f(int i) {
        int length = j().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && j().charAt(i) == '\n' && (j().charAt(i) == '\n' || (i != 0 && j().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i7 = i + 1;
        while (i7 < length && !n(i7)) {
            i7++;
        }
        return i(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0067b
    public final int[] l(int i) {
        int length = j().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && j().charAt(i - 1) == '\n' && !n(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i7 = i - 1;
        while (i7 > 0 && (j().charAt(i7) == '\n' || (i7 != 0 && j().charAt(i7 - 1) != '\n'))) {
            i7--;
        }
        return i(i7, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean n(int i) {
        if (i <= 0 || j().charAt(i - 1) == '\n') {
            return false;
        }
        return i == j().length() || j().charAt(i) == '\n';
    }
}
