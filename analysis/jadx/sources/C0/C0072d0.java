package C0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: renamed from: C0.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0072d0 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1003a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [E5.b.<init>():void, n3.i.<clinit>():void] */
    public /* synthetic */ C0072d0(int i) {
        this.f1003a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1003a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                C0076f0 c0076f0 = new C0076f0(choreographer, AbstractC0836n2.k(looperMyLooper));
                return c0076f0.plus(c0076f0.f1037z);
            case 1:
                return 0L;
            case 2:
                return new Random();
            case 3:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(e6.b.f12676d);
                return simpleDateFormat;
            case 4:
                return new PathMeasure();
            case 5:
                return new Path();
            case 6:
                return new Path();
            case 7:
                return new float[4];
            default:
                return Boolean.FALSE;
        }
    }
}
