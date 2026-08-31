package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import h.C1100b;
import h.DialogInterfaceC1104f;

/* JADX INFO: renamed from: m.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1257H implements InterfaceC1269N, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public DialogInterfaceC1104f f14657q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1259I f14658r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f14659s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1271O f14660t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogInterfaceOnClickListenerC1257H(C1271O c1271o) {
        this.f14660t = c1271o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final boolean a() {
        DialogInterfaceC1104f dialogInterfaceC1104f = this.f14657q;
        if (dialogInterfaceC1104f != null) {
            return dialogInterfaceC1104f.isShowing();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final int b() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final Drawable d() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final void dismiss() {
        DialogInterfaceC1104f dialogInterfaceC1104f = this.f14657q;
        if (dialogInterfaceC1104f != null) {
            dialogInterfaceC1104f.dismiss();
            this.f14657q = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final void f(CharSequence charSequence) {
        this.f14659s = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final void k(int i, int i7) {
        if (this.f14658r == null) {
            return;
        }
        C1271O c1271o = this.f14660t;
        U.l lVar = new U.l(c1271o.getPopupContext());
        C1100b c1100b = (C1100b) lVar.f7511r;
        CharSequence charSequence = this.f14659s;
        if (charSequence != null) {
            c1100b.f13250d = charSequence;
        }
        C1259I c1259i = this.f14658r;
        int selectedItemPosition = c1271o.getSelectedItemPosition();
        c1100b.f13259p = c1259i;
        c1100b.f13260q = this;
        c1100b.f13262s = selectedItemPosition;
        c1100b.f13261r = true;
        DialogInterfaceC1104f dialogInterfaceC1104fF = lVar.f();
        this.f14657q = dialogInterfaceC1104fF;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC1104fF.f13293v.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i7);
        this.f14657q.show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final int m() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final CharSequence o() {
        return this.f14659s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1271O c1271o = this.f14660t;
        c1271o.setSelection(i);
        if (c1271o.getOnItemClickListener() != null) {
            c1271o.performItemClick(null, i, this.f14658r.getItemId(i));
        }
        dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1269N
    public final void p(ListAdapter listAdapter) {
        this.f14658r = (C1259I) listAdapter;
    }
}
