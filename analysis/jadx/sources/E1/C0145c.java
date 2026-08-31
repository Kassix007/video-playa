package E1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: renamed from: E1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0145c extends s4.e {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.e
    public final Signature[] h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
