package m;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: m.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1337v0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1248C0 f14902q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1337v0(C1248C0 c1248c0) {
        this.f14902q = c1248c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C1325p0 c1325p0;
        if (i == -1 || (c1325p0 = this.f14902q.f14639s) == null) {
            return;
        }
        c1325p0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
