package U4;

import B0.C0050o;
import B0.G0;
import C0.Z0;
import R4.C0468k1;
import R4.X1;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.webkit.WebView;
import androidx.work.WorkerKt;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.web2native.MainActivity;
import h.C1100b;
import i4.C1142b;
import java.util.Date;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements o2.k, androidx.concurrent.futures.l, S3.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f7721q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7722r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ E(Object obj, Object obj2) {
        this.f7721q = obj;
        this.f7722r = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o2.k
    public void a() {
        C0468k1 c0468k1 = (C0468k1) this.f7721q;
        X1 x12 = (X1) this.f7722r;
        WebView webView = c0468k1.f7084k;
        if (webView != null) {
            webView.reload();
        }
        x12.setRefreshing(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.concurrent.futures.l
    public Object b(androidx.concurrent.futures.k kVar) {
        return WorkerKt.future$lambda$2((Executor) this.f7721q, (B5.a) this.f7722r, kVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.a
    public void onComplete(S3.d task) {
        S3.k kVar;
        C0050o c0050o = (C0050o) this.f7721q;
        final G0 g02 = (G0) this.f7722r;
        kotlin.jvm.internal.m.e(task, "task");
        if (task.d()) {
            D4.a aVar = (D4.a) task.c();
            MainActivity mainActivity = (MainActivity) g02.f235s;
            D4.b bVar = (D4.b) aVar;
            if (bVar.f1456r) {
                kVar = new S3.k();
                kVar.g(null);
            } else {
                Intent intent = new Intent(mainActivity, (Class<?>) PlayCoreDialogWrapperActivity.class);
                intent.putExtra("confirmation_intent", bVar.f1455q);
                intent.putExtra("window_flags", mainActivity.getWindow().getDecorView().getWindowSystemUiVisibility());
                S3.e eVar = new S3.e();
                intent.putExtra("result_receiver", new D4.c((Handler) c0050o.f500r, eVar));
                mainActivity.startActivity(intent);
                kVar = eVar.f7306a;
            }
            kotlin.jvm.internal.m.d(kVar, "launchReviewFlow(...)");
            kVar.e(new Z0(17));
            kVar.f7317b.e(new S3.h((Executor) S3.f.f7307a, (S3.b) new Z0(18)));
            kVar.i();
        } else {
            Log.i("in app review not supported", "FallBack, in app review not supported");
            SharedPreferences sharedPreferences = (SharedPreferences) g02.f236t;
            kotlin.jvm.internal.m.b(sharedPreferences);
            if (sharedPreferences.getBoolean("inAppReviewPermission", true)) {
                long time = new Date().getTime();
                if ((time - sharedPreferences.getLong("inAppReview", 0L)) - 1296000000 > 0) {
                    Log.i("show rate app fall back dialog", "true");
                    C1142b c1142b = new C1142b((MainActivity) g02.f234r);
                    C1100b c1100b = (C1100b) c1142b.f7511r;
                    c1100b.f13250d = "Rate App";
                    c1100b.f = "If you enjoy using the app, kindly rate it on Play Store. Thanks!";
                    final int i = 0;
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l5.a
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i7) {
                            switch (i) {
                                case 0:
                                    MainActivity mainActivity2 = (MainActivity) g02.f235s;
                                    String packageName = mainActivity2.getPackageName();
                                    try {
                                        mainActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
                                    } catch (ActivityNotFoundException unused) {
                                        mainActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
                                        return;
                                    }
                                    break;
                                default:
                                    SharedPreferences sharedPreferences2 = (SharedPreferences) g02.f236t;
                                    SharedPreferences.Editor editorEdit = sharedPreferences2 != null ? sharedPreferences2.edit() : null;
                                    if (editorEdit != null) {
                                        editorEdit.putBoolean("inAppReviewPermission", false);
                                    }
                                    if (editorEdit != null) {
                                        editorEdit.commit();
                                    }
                                    break;
                            }
                        }
                    };
                    c1100b.f13252g = "RATE NOW";
                    c1100b.f13253h = onClickListener;
                    final int i7 = 1;
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: l5.a
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i72) {
                            switch (i7) {
                                case 0:
                                    MainActivity mainActivity2 = (MainActivity) g02.f235s;
                                    String packageName = mainActivity2.getPackageName();
                                    try {
                                        mainActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
                                    } catch (ActivityNotFoundException unused) {
                                        mainActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
                                        return;
                                    }
                                    break;
                                default:
                                    SharedPreferences sharedPreferences2 = (SharedPreferences) g02.f236t;
                                    SharedPreferences.Editor editorEdit = sharedPreferences2 != null ? sharedPreferences2.edit() : null;
                                    if (editorEdit != null) {
                                        editorEdit.putBoolean("inAppReviewPermission", false);
                                    }
                                    if (editorEdit != null) {
                                        editorEdit.commit();
                                    }
                                    break;
                            }
                        }
                    };
                    c1100b.i = "NO, THANKS";
                    c1100b.j = onClickListener2;
                    R4.K k7 = new R4.K(2);
                    c1100b.f13254k = "REMIND ME LATER";
                    c1100b.f13255l = k7;
                    c1100b.f13257n = new l5.b();
                    c1142b.f().show();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    kotlin.jvm.internal.m.d(editorEdit, "edit(...)");
                    editorEdit.putLong("inAppReview", time);
                    editorEdit.commit();
                }
            }
        }
        Log.i("review request", "complete");
    }
}
