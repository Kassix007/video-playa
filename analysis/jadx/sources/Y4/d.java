package Y4;

import R4.L0;
import R4.Z0;
import S3.f;
import S3.k;
import U.l;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentSender;
import android.content.SharedPreferences;
import com.web2native.MainActivity;
import e.C1014g;
import e.C1015h;
import h.C1100b;
import i1.C1134a;
import java.util.Locale;
import org.json.JSONObject;
import y4.AbstractC1918b;
import y4.C1917a;
import y4.C1919c;
import y4.e;
import y4.m;
import z4.InterfaceC1969c;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f8273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1918b f8274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z0 f8275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f8276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f8277e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f8278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k3.c f8279h;
    public boolean i;
    public m j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(MainActivity mainActivity, C1014g c1014g, Z0 z02) {
        C1134a c1134a;
        this.f8273a = mainActivity;
        this.f8274b = c1014g;
        this.f8275c = z02;
        c cVar = new c(this);
        this.f8276d = cVar;
        this.f8277e = new JSONObject();
        synchronized (AbstractC1918b.class) {
            try {
                if (AbstractC1918b.f18623a == null) {
                    Context applicationContext = mainActivity.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = mainActivity;
                    }
                    AbstractC1918b.f18623a = new C1134a(new C3.b(applicationContext));
                }
                c1134a = AbstractC1918b.f18623a;
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = (e) ((InterfaceC1969c) c1134a.f13535r).zza();
        kotlin.jvm.internal.m.d(eVar, "create(...)");
        this.f8278g = eVar;
        k3.c cVar2 = new k3.c();
        SharedPreferences sharedPreferences = mainActivity.getSharedPreferences(mainActivity.getPackageName(), 0);
        kotlin.jvm.internal.m.d(sharedPreferences, "getSharedPreferences(...)");
        cVar2.f14120q = sharedPreferences;
        this.f8279h = cVar2;
        String lowerCase = "flexible".toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        this.j = lowerCase.equals("immediate") ? m.a(1).a() : m.a(0).a();
        k kVarB = eVar.b();
        L0 l02 = new L0(5, new b(this, 1));
        kVarB.getClass();
        kVarB.a(f.f7307a, l02);
        synchronized (eVar) {
            C1919c c1919c = eVar.f18634b;
            synchronized (c1919c) {
                c1919c.f18626a.e("registerListener", new Object[0]);
                c1919c.f18629d.add(cVar);
                c1919c.a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        l lVar = new l(this.f8273a);
        C1100b c1100b = (C1100b) lVar.f7511r;
        c1100b.f = "An update has just been downloaded.";
        final int i = 0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: Y4.a

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d f8269r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8269r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                switch (i) {
                    case 0:
                        this.f8269r.f8278g.a();
                        break;
                    default:
                        this.f8269r.i = true;
                        break;
                }
            }
        };
        c1100b.f13252g = "RESTART";
        c1100b.f13253h = onClickListener;
        final int i7 = 1;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener(this) { // from class: Y4.a

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d f8269r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8269r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i72) {
                switch (i7) {
                    case 0:
                        this.f8269r.f8278g.a();
                        break;
                    default:
                        this.f8269r.i = true;
                        break;
                }
            }
        };
        c1100b.i = "LATER";
        c1100b.j = onClickListener2;
        c1100b.f13256m = false;
        lVar.f().show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(C1917a c1917a, m mVar) {
        AbstractC1918b abstractC1918b = this.f8274b;
        if (abstractC1918b != null) {
            this.f8278g.getClass();
            if (c1917a == null || mVar == null || c1917a.a(mVar) == null || c1917a.f) {
                return;
            }
            c1917a.f = true;
            IntentSender intentSender = c1917a.a(mVar).getIntentSender();
            kotlin.jvm.internal.m.e(intentSender, "intentSender");
            abstractC1918b.u(new C1015h(intentSender, null, 0, 0));
        }
    }
}
