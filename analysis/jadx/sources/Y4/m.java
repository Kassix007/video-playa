package y4;

import C0.S;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18651a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(int i) {
        this.f18651a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static l a(int i) {
        l lVar = new l();
        lVar.f18649a = i;
        lVar.f18650b = (byte) (((byte) (lVar.f18650b | 1)) | 2);
        return lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof m) && this.f18651a == ((m) obj).f18651a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((this.f18651a ^ 1000003) * 1000003) ^ 1237;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return S.m("AppUpdateOptions{appUpdateType=", ", allowAssetPackDeletion=false}", this.f18651a);
    }
}
