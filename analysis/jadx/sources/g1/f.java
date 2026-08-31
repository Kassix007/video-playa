package G1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f extends l6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1990c = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(TextView textView) {
        this.f1988a = textView;
        this.f1989b = new d(textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d
    public final void C(boolean z5) {
        if (z5) {
            I();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d
    public final void D(boolean z5) {
        this.f1990c = z5;
        I();
        TextView textView = this.f1988a;
        textView.setFilters(o(textView.getFilters()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I() {
        TextView textView = this.f1988a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f1990c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f1996q;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d
    public final InputFilter[] o(InputFilter[] inputFilterArr) {
        if (!this.f1990c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                if (sparseArray.indexOfKey(i8) < 0) {
                    inputFilterArr2[i7] = inputFilterArr[i8];
                    i7++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i9 = 0;
        while (true) {
            d dVar = this.f1989b;
            if (i9 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i9] == dVar) {
                return inputFilterArr;
            }
            i9++;
        }
    }
}
