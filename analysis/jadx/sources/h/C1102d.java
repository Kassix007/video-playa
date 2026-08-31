package h;

import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: h.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1102d extends ArrayAdapter {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
