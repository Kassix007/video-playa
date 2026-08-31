.class public abstract synthetic LB3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic A()Landroid/print/PrintAttributes$MediaSize;
    .locals 1

    .line 1
    sget-object v0, Landroid/print/PrintAttributes$MediaSize;->ANSI_E:Landroid/print/PrintAttributes$MediaSize;

    return-object v0
.end method

.method public static bridge synthetic B()Landroid/print/PrintAttributes$MediaSize;
    .locals 1

    .line 1
    sget-object v0, Landroid/print/PrintAttributes$MediaSize;->ANSI_F:Landroid/print/PrintAttributes$MediaSize;

    return-object v0
.end method

.method public static bridge synthetic C()Landroid/print/PrintAttributes$MediaSize;
    .locals 1

    .line 1
    sget-object v0, Landroid/print/PrintAttributes$MediaSize;->JPN_OE_PHOTO_L:Landroid/print/PrintAttributes$MediaSize;

    return-object v0
.end method

.method public static bridge synthetic D()Landroid/print/PrintAttributes$MediaSize;
    .locals 1

    .line 1
    sget-object v0, Landroid/print/PrintAttributes$MediaSize;->NA_ARCH_A:Landroid/print/PrintAttributes$MediaSize;

    return-object v0
.end method

.method public static bridge synthetic a(Landroid/content/res/Configuration;)I
    .locals 0

    .line 1
    iget p0, p0, Landroid/content/res/Configuration;->fontWeightAdjustment:I

    return p0
.end method

.method public static bridge synthetic b(Landroid/os/StrictMode$VmPolicy$Builder;)Landroid/os/StrictMode$VmPolicy$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/os/StrictMode$VmPolicy$Builder;->permitUnsafeIntentLaunch()Landroid/os/StrictMode$VmPolicy$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic c()Landroid/print/PrintAttributes$MediaSize;
    .locals 1

    .line 1
    sget-object v0, Landroid/print/PrintAttributes$MediaSize;->ANSI_C:Landroid/print/PrintAttributes$MediaSize;

    return-object v0
.end method

.method public static bridge synthetic d(Landroid/view/WindowInsets;)Landroid/view/RoundedCorner;
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/WindowInsets;->getRoundedCorner(I)Landroid/view/RoundedCorner;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;
    .locals 0

    .line 1
    check-cast p0, Landroid/view/ScrollCaptureSession;

    return-object p0
.end method

.method public static synthetic f(LC0/A;Landroid/graphics/Rect;Landroid/graphics/Point;Landroid/view/ScrollCaptureCallback;)Landroid/view/ScrollCaptureTarget;
    .locals 1

    .line 1
    new-instance v0, Landroid/view/ScrollCaptureTarget;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/view/ScrollCaptureTarget;-><init>(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;Landroid/view/ScrollCaptureCallback;)V

    return-object v0
.end method

.method public static bridge synthetic g(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/ScrollCaptureSession;->getSurface()Landroid/view/Surface;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic h(LC0/d1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setRenderEffect(Landroid/graphics/RenderEffect;)V

    return-void
.end method

.method public static bridge synthetic i(Landroid/app/job/JobInfo$Builder;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/job/JobInfo$Builder;->setExpedited(Z)Landroid/app/job/JobInfo$Builder;

    return-void
.end method

.method public static bridge synthetic j(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroid/graphics/Canvas;->drawPatch(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public static bridge synthetic k(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroid/graphics/Canvas;->drawPatch(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method public static bridge synthetic l(Landroid/graphics/Canvas;[II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p7}, Landroid/graphics/Canvas;->drawGlyphs([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V

    return-void
.end method

.method public static bridge synthetic m(Landroid/graphics/RenderNode;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/graphics/RenderNode;->setRenderEffect(Landroid/graphics/RenderEffect;)Z

    return-void
.end method

.method public static bridge synthetic n(Landroid/view/ScrollCaptureTarget;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ScrollCaptureTarget;->setScrollBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public static bridge synthetic o(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->clearViewTranslationCallback()V

    return-void
.end method

.method public static bridge synthetic p(Landroid/view/View;Landroid/view/translation/ViewTranslationCallback;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setViewTranslationCallback(Landroid/view/translation/ViewTranslationCallback;)V

    return-void
.end method

.method public static bridge synthetic q(Landroid/net/NetworkRequest;)[I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/net/NetworkRequest;->getTransportTypes()[I

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic r()Landroid/print/PrintAttributes$MediaSize;
    .locals 1

    .line 1
    sget-object v0, Landroid/print/PrintAttributes$MediaSize;->NA_ARCH_D:Landroid/print/PrintAttributes$MediaSize;

    return-object v0
.end method

.method public static bridge synthetic s(Landroid/view/WindowInsets;)Landroid/view/RoundedCorner;
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/WindowInsets;->getRoundedCorner(I)Landroid/view/RoundedCorner;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic t(Landroid/net/NetworkRequest;)[I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/net/NetworkRequest;->getCapabilities()[I

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic u()Landroid/print/PrintAttributes$MediaSize;
    .locals 1

    .line 1
    sget-object v0, Landroid/print/PrintAttributes$MediaSize;->NA_ARCH_B:Landroid/print/PrintAttributes$MediaSize;

    return-object v0
.end method

.method public static bridge synthetic v()Landroid/print/PrintAttributes$MediaSize;
    .locals 1

    .line 1
    sget-object v0, Landroid/print/PrintAttributes$MediaSize;->NA_ARCH_C:Landroid/print/PrintAttributes$MediaSize;

    return-object v0
.end method

.method public static bridge synthetic w()Landroid/print/PrintAttributes$MediaSize;
    .locals 1

    .line 1
    sget-object v0, Landroid/print/PrintAttributes$MediaSize;->NA_ARCH_E:Landroid/print/PrintAttributes$MediaSize;

    return-object v0
.end method

.method public static bridge synthetic x()Landroid/print/PrintAttributes$MediaSize;
    .locals 1

    .line 1
    sget-object v0, Landroid/print/PrintAttributes$MediaSize;->NA_ARCH_E1:Landroid/print/PrintAttributes$MediaSize;

    return-object v0
.end method

.method public static bridge synthetic y()Landroid/print/PrintAttributes$MediaSize;
    .locals 1

    .line 1
    sget-object v0, Landroid/print/PrintAttributes$MediaSize;->NA_SUPER_B:Landroid/print/PrintAttributes$MediaSize;

    return-object v0
.end method

.method public static bridge synthetic z()Landroid/print/PrintAttributes$MediaSize;
    .locals 1

    .line 1
    sget-object v0, Landroid/print/PrintAttributes$MediaSize;->ANSI_D:Landroid/print/PrintAttributes$MediaSize;

    return-object v0
.end method
