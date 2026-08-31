package R4;

import android.content.res.Resources;
import android.util.TypedValue;
import com.web2native.MainActivity;
import com.wnapp.smspariaz.R;

/* JADX INFO: loaded from: classes.dex */
public class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MainActivity f6862a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [R4.l3.pickDateTime(java.lang.String):void, com.web2native.MainActivity.onCreate(android.os.Bundle):void] */
    public /* synthetic */ U(MainActivity mainActivity) {
        this.f6862a = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = this.f6862a.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        b(theme, typedValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(Resources.Theme theme, TypedValue typedValue) {
        int i;
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        this.f6862a.setTheme(i);
    }
}
