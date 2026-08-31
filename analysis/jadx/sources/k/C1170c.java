package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.wnapp.smspariaz.R;

/* JADX INFO: renamed from: k.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1170c extends ContextWrapper {
    public static Configuration f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f13915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f13916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f13917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f13918e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1170c(Context context, int i) {
        super(context);
        this.f13914a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Configuration configuration) {
        if (this.f13918e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f13917d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f13917d = new Configuration(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        if (this.f13915b == null) {
            this.f13915b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f13915b.setTo(theme);
            }
        }
        this.f13915b.applyStyle(this.f13914a, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f13918e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f13917d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = k.C1170c.f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            k.C1170c.f = r1
        L1c:
            android.content.res.Configuration r1 = k.C1170c.f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f13917d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f13918e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f13918e = r0
        L38:
            android.content.res.Resources r0 = r3.f13918e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C1170c.getResources():android.content.res.Resources");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f13916c == null) {
            this.f13916c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f13916c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f13915b;
        if (theme != null) {
            return theme;
        }
        if (this.f13914a == 0) {
            this.f13914a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f13915b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f13914a != i) {
            this.f13914a = i;
            b();
        }
    }
}
