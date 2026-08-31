package V0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f7923b = 66305;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7924a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i7 = i & 255;
        String str = "Invalid";
        sb.append((Object) (i7 == 1 ? "Strategy.Simple" : i7 == 2 ? "Strategy.HighQuality" : i7 == 3 ? "Strategy.Balanced" : i7 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i8 = (i >> 8) & 255;
        sb.append((Object) (i8 == 1 ? "Strictness.None" : i8 == 2 ? "Strictness.Loose" : i8 == 3 ? "Strictness.Normal" : i8 == 4 ? "Strictness.Strict" : i8 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i9 = (i >> 16) & 255;
        if (i9 == 1) {
            str = "WordBreak.None";
        } else if (i9 == 2) {
            str = "WordBreak.Phrase";
        } else if (i9 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f7924a == ((e) obj).f7924a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f7924a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return a(this.f7924a);
    }
}
