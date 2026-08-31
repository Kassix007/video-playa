package E1;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.clearcut.AbstractC0738b;
import com.google.android.gms.internal.clearcut.E0;
import com.google.android.gms.internal.clearcut.InterfaceC0744e;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class t implements s, InterfaceC0744e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f1656q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [B0.G0.<init>(E.c0, x3.k, E1.d, java.util.Set):void, Z.m.a():java.lang.Object] */
    public /* synthetic */ t(String str, boolean z5) {
        this.f1656q = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e7) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e7);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.InterfaceC0744e
    public Object a() {
        Object obj;
        boolean zBooleanValue;
        String str = this.f1656q;
        ContentResolver contentResolver = AbstractC0738b.f10486g.getContentResolver();
        Uri uri = E0.f10406a;
        synchronized (E0.class) {
            E0.c(contentResolver);
            obj = E0.f10413k;
        }
        HashMap map = E0.f10411g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) E0.a(map, str, bool);
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            String strB = E0.b(contentResolver, str);
            boolean z5 = false;
            if (strB == null || strB.equals("")) {
                bool = bool2;
                E0.d(obj, map, str, bool);
                zBooleanValue = z5;
            } else {
                if (E0.f10408c.matcher(strB).matches()) {
                    bool = Boolean.TRUE;
                    z5 = true;
                } else if (!E0.f10409d.matcher(strB).matches()) {
                    Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + strB + "\") as boolean");
                    bool = bool2;
                }
                E0.d(obj, map, str, bool);
                zBooleanValue = z5;
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", f(this.f1656q, str, objArr));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f1656q, str, objArr), remoteException);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.s
    public boolean d(CharSequence charSequence, int i, int i7, A a7) {
        if (!TextUtils.equals(charSequence.subSequence(i, i7), this.f1656q)) {
            return true;
        }
        a7.f1617c = (a7.f1617c & 3) | 4;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", f(this.f1656q, str, objArr));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public t(String str) {
        this.f1656q = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    @Override // E1.s
    public Object getResult() {
        return this;
    }
}
