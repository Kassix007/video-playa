package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.wnapp.smspariaz.R;

/* JADX INFO: renamed from: m.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1328r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f14861b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1328r f14862c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1262J0 f14863a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized C1328r a() {
        try {
            if (f14862c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14862c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return C1262J0.e(i, mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized void d() {
        if (f14862c == null) {
            C1328r c1328r = new C1328r();
            f14862c = c1328r;
            c1328r.f14863a = C1262J0.b();
            C1262J0 c1262j0 = f14862c.f14863a;
            p3.z0 z0Var = new p3.z0();
            z0Var.f15875a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
            z0Var.f15876b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            z0Var.f15877c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
            z0Var.f15878d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
            z0Var.f15879e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            z0Var.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (c1262j0) {
                c1262j0.f14673e = z0Var;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(Drawable drawable, d6.h hVar, int[] iArr) {
        PorterDuff.Mode mode = C1262J0.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z5 = hVar.f12338b;
        if (!z5 && !hVar.f12337a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z5 ? (ColorStateList) hVar.f12339c : null;
        PorterDuff.Mode mode2 = hVar.f12337a ? (PorterDuff.Mode) hVar.f12340d : C1262J0.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = C1262J0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Drawable b(Context context, int i) {
        return this.f14863a.c(context, i);
    }
}
