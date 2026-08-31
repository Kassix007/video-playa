package K5;

/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2990b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ h(long j, int i) {
        this.f2990b = j;
        this.f2989a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h a(String str, int i, int i7) {
        if (i >= i7) {
            return null;
        }
        long j = 0;
        int i8 = i;
        while (i8 < i7) {
            char cCharAt = str.charAt(i8);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i8++;
        }
        if (i8 == i) {
            return null;
        }
        return new h(j, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // K5.i
    public d toInstant() {
        d dVar = d.f2978s;
        d dVar2 = d.f2978s;
        long j = dVar2.f2980q;
        long j7 = this.f2990b;
        if (j7 >= j) {
            d dVar3 = d.f2979t;
            if (j7 <= dVar3.f2980q) {
                long j8 = this.f2989a;
                long j9 = j8 / 1000000000;
                if ((j8 ^ 1000000000) < 0 && j9 * 1000000000 != j8) {
                    j9--;
                }
                long j10 = j7 + j9;
                if ((j7 ^ j10) < 0 && (j9 ^ j7) >= 0) {
                    return j7 > 0 ? dVar3 : dVar2;
                }
                if (j10 >= -31557014167219200L) {
                    if (j10 <= 31556889864403199L) {
                        long j11 = j8 % 1000000000;
                        return new d(j10, (int) (j11 + ((((j11 ^ 1000000000) & ((-j11) | j11)) >> 63) & 1000000000)));
                    }
                }
            }
        }
        throw new e("The parsed date is outside the range representable by Instant (Unix epoch second " + j7 + ')');
    }
}
