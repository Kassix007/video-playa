package R4;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.web2native.MainActivity;

/* JADX INFO: renamed from: R4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0462j {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 com.web2native.MainActivity), (r2v0 java.lang.String) A[MD:(android.content.Context, java.lang.String):void (c)] (LINE:1) call: android.content.pm.ShortcutInfo.Builder.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ShortcutInfo.Builder d(MainActivity mainActivity, String str) {
        return new ShortcutInfo.Builder(mainActivity, str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.content.pm.ShortcutManager) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ ShortcutManager f(Object obj) {
        return (ShortcutManager) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONST_CLASS  (LINE:1) android.content.pm.ShortcutManager.class */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ Class g() {
        return ShortcutManager.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void i() {
    }
}
