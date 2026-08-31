package G1;

import E1.l;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;
import x3.C1899k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f1980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1899k f1981b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C1899k c1899k = new C1899k(7);
        super(inputConnection, false);
        this.f1980a = editText;
        this.f1981b = c1899k;
        if (l.c()) {
            l lVarA = l.a();
            if (lVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            E1.f fVar = lVarA.f1643e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            F1.b bVar = (F1.b) fVar.f1631c.f1552q;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f1944t).getInt(iA + bVar.f1941q) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i7) {
        Editable editableText = this.f1980a.getEditableText();
        this.f1981b.getClass();
        return C1899k.g(this, editableText, i, i7, false) || super.deleteSurroundingText(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i7) {
        Editable editableText = this.f1980a.getEditableText();
        this.f1981b.getClass();
        return C1899k.g(this, editableText, i, i7, true) || super.deleteSurroundingTextInCodePoints(i, i7);
    }
}
