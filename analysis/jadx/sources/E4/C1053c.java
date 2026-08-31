package e4;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: e4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1053c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f12639c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1053c(int i) {
        this.f12637a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        switch (this.f12638b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f12639c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f11987n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1053c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f12638b = i;
        switch (i) {
            case 1:
                this.f12639c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f12639c = carouselLayoutManager;
                break;
        }
    }
}
