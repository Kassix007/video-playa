package C0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.graphics.ColorSpace;
import android.view.autofill.AutofillId;
import com.web2native.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class U {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CONSTRUCTOR (r2v0 com.web2native.MainActivity), ("MYCHANNEL") A[MD:(android.content.Context, java.lang.String):void (c)] (LINE:1) call: android.app.Notification.Builder.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Notification.Builder b(MainActivity mainActivity) {
        return new Notification.Builder(mainActivity, "MYCHANNEL");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0007: CONSTRUCTOR ("MYCHANNEL"), ("name"), (2 int) A[MD:(java.lang.String, java.lang.CharSequence, int):void (c)] (LINE:1) call: android.app.NotificationChannel.<init>(java.lang.String, java.lang.CharSequence, int):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ NotificationChannel c() {
        return new NotificationChannel("MYCHANNEL", "name", 2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR ("com.google.android.gms.availability"), (r3v0 java.lang.String), (4 int) A[MD:(java.lang.String, java.lang.CharSequence, int):void (c)] (LINE:1) call: android.app.NotificationChannel.<init>(java.lang.String, java.lang.CharSequence, int):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.graphics.ColorSpace) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ ColorSpace g(Object obj) {
        return (ColorSpace) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.autofill.AutofillId) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ AutofillId h(Object obj) {
        return (AutofillId) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void m() {
    }
}
