package C0;

import android.content.Context;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.model.WorkSpec;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import p.InterfaceC1426a;
import q2.AbstractC1509n;
import q2.InterfaceC1507l;
import q2.InterfaceC1508m;
import u.InterfaceC1669x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z0 implements G4.d, androidx.concurrent.futures.l, InterfaceC1426a, LibraryVersionComponent.VersionExtractor, k0.i, S3.b, S3.a, InterfaceC1508m, InterfaceC1669x, v4.x {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f979q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [androidx.work.ListenableWorker.getForegroundInfoAsync():I4.b, androidx.work.impl.model.WorkSpec.<clinit>():void, com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void, com.google.firebase.FirebaseCommonRegistrar.getComponents():java.util.List<com.google.firebase.components.Component<?>>, d6.q.<init>():void, k0.d.<clinit>():void, k0.q.<clinit>():void, q2.m.<clinit>():void, u.y.<clinit>():void] */
    public /* synthetic */ Z0(int i) {
        this.f979q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.InterfaceC1508m
    public void a(InterfaceC1507l interfaceC1507l, AbstractC1509n abstractC1509n) {
        switch (this.f979q) {
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                interfaceC1507l.c(abstractC1509n);
                break;
            case 20:
                interfaceC1507l.d(abstractC1509n);
                break;
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                interfaceC1507l.e(abstractC1509n);
                break;
            case 22:
                interfaceC1507l.a();
                break;
            default:
                interfaceC1507l.b();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p.InterfaceC1426a
    public Object apply(Object obj) {
        return WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.concurrent.futures.l
    public Object b(androidx.concurrent.futures.k kVar) {
        return ListenableWorker.lambda$getForegroundInfoAsync$0(kVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1669x
    public float c(float f) {
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.i
    public double d(double d5) {
        switch (this.f979q) {
            case 9:
                double d7 = d5 < 0.0d ? -d5 : d5;
                return Math.copySign(d7 >= 0.0031308049535603718d ? (Math.pow(d7, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d7 / 0.07739938080495357d, d5);
            case 10:
                double d8 = d5 < 0.0d ? -d5 : d5;
                return Math.copySign(d8 >= 0.04045d ? Math.pow((0.9478672985781991d * d8) + 0.05213270142180095d, 2.4d) : d8 * 0.07739938080495357d, d5);
            case 11:
                float[] fArr = k0.d.f13982a;
                return k0.d.b(k0.d.f13984c, d5);
            case 12:
                float[] fArr2 = k0.d.f13982a;
                return k0.d.a(k0.d.f13984c, d5);
            case 13:
                float[] fArr3 = k0.d.f13982a;
                return k0.d.d(k0.d.f13985d, d5);
            case 14:
                float[] fArr4 = k0.d.f13982a;
                return k0.d.c(k0.d.f13985d, d5);
            default:
                return d5;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.FirebaseCommonRegistrar.a(android.content.Context):java.lang.String */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        Context context = (Context) obj;
        switch (this.f979q) {
            case 4:
                return FirebaseCommonRegistrar.lambda$getComponents$0(context);
            case 5:
                return FirebaseCommonRegistrar.lambda$getComponents$1(context);
            case 6:
                return FirebaseCommonRegistrar.lambda$getComponents$2(context);
            default:
                return FirebaseCommonRegistrar.lambda$getComponents$3(context);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // G4.d
    public Object get() {
        throw new IllegalStateException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.a
    public void onComplete(S3.d it) {
        kotlin.jvm.internal.m.e(it, "it");
        Log.i("review flow complete", "addOnCompleteListener");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.b
    public void q(Exception exc) {
        switch (this.f979q) {
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                Log.i("review request", "failure");
                break;
            default:
                Log.i("review flow failure", "addOnFailureListener");
                break;
        }
    }
}
