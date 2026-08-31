package J2;

import android.content.res.AssetFileDescriptor;
import androidx.work.impl.utils.IdGenerator;
import com.google.firebase.installations.FirebaseInstallations;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2804b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ x(int i, Object obj) {
        this.f2803a = i;
        this.f2804b = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.utils.IdGenerator.b(androidx.work.impl.utils.IdGenerator):java.lang.Integer */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2803a) {
            case 0:
                return (AssetFileDescriptor) this.f2804b;
            case 1:
                return a3.o.d((ByteArrayInputStream) this.f2804b, null);
            case 2:
                return IdGenerator.nextAlarmManagerId$lambda$1((IdGenerator) this.f2804b);
            default:
                return ((FirebaseInstallations) this.f2804b).deleteFirebaseInstallationId();
        }
    }
}
