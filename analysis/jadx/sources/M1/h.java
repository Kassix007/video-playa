package m1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f15031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f15032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15033c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f15031a = colorStateList;
        this.f15032b = configuration;
        this.f15033c = theme == null ? 0 : theme.hashCode();
    }
}
