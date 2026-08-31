package m;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import i1.C1134a;
import w1.AbstractC1835K;
import w1.C1841d;
import w1.InterfaceC1840c;

/* JADX INFO: renamed from: m.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1247C {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC1840c c1134a;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c1134a = new C1134a(clipData, 3);
            } else {
                C1841d c1841d = new C1841d();
                c1841d.f18191r = clipData;
                c1841d.f18192s = 3;
                c1134a = c1841d;
            }
            AbstractC1835K.i(textView, c1134a.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC1840c c1134a;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c1134a = new C1134a(clipData, 3);
        } else {
            C1841d c1841d = new C1841d();
            c1841d.f18191r = clipData;
            c1841d.f18192s = 3;
            c1134a = c1841d;
        }
        AbstractC1835K.i(view, c1134a.build());
        return true;
    }
}
