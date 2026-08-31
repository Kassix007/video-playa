.class public Lcom/mikepenz/iconics/animation/SpinProcessor;
.super Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;
.source "SourceFile"


# static fields
.field public static final Companion:LL4/j;

.field public static DEFAULT_DURATION:J = 0x7d0L


# instance fields
.field private final animationTag:Ljava/lang/String;

.field private direction:LL4/k;

.field private duration:J

.field private interpolator:Landroid/animation/TimeInterpolator;

.field private isDrawableShadowCleared:Z

.field private isStartImmediately:Z

.field private repeatCount:I

.field private repeatMode:LL4/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LL4/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/mikepenz/iconics/animation/SpinProcessor;->Companion:LL4/j;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/mikepenz/iconics/animation/SpinProcessor;-><init>(LL4/k;Landroid/animation/TimeInterpolator;JILL4/g;ZILkotlin/jvm/internal/g;)V

    return-void
.end method

.method public constructor <init>(LL4/k;Landroid/animation/TimeInterpolator;JILL4/g;Z)V
    .locals 8

    const-string v0, "direction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interpolator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repeatMode"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    move-object v6, p6

    move v7, p7

    .line 7
    invoke-direct/range {v1 .. v7}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;-><init>(Landroid/animation/TimeInterpolator;JILL4/g;Z)V

    .line 8
    iput-object p1, v1, Lcom/mikepenz/iconics/animation/SpinProcessor;->direction:LL4/k;

    .line 9
    iput-object v2, v1, Lcom/mikepenz/iconics/animation/SpinProcessor;->interpolator:Landroid/animation/TimeInterpolator;

    .line 10
    iput-wide v3, v1, Lcom/mikepenz/iconics/animation/SpinProcessor;->duration:J

    .line 11
    iput v5, v1, Lcom/mikepenz/iconics/animation/SpinProcessor;->repeatCount:I

    .line 12
    iput-object v6, v1, Lcom/mikepenz/iconics/animation/SpinProcessor;->repeatMode:LL4/g;

    .line 13
    iput-boolean v7, v1, Lcom/mikepenz/iconics/animation/SpinProcessor;->isStartImmediately:Z

    .line 14
    const-string p1, "spin"

    iput-object p1, v1, Lcom/mikepenz/iconics/animation/SpinProcessor;->animationTag:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LL4/k;Landroid/animation/TimeInterpolator;JILL4/g;ZILkotlin/jvm/internal/g;)V
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    .line 2
    sget-object p1, LL4/k;->r:LL4/k;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    .line 3
    sget-object p2, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->DEFAULT_INTERPOLATOR:Landroid/view/animation/LinearInterpolator;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    .line 4
    sget-wide p3, Lcom/mikepenz/iconics/animation/SpinProcessor;->DEFAULT_DURATION:J

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    const/4 p5, -0x1

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    .line 5
    sget-object p6, LL4/g;->r:LL4/g;

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    const/4 p7, 0x1

    :cond_5
    move-object p8, p6

    move p9, p7

    move p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 6
    invoke-direct/range {p2 .. p9}, Lcom/mikepenz/iconics/animation/SpinProcessor;-><init>(LL4/k;Landroid/animation/TimeInterpolator;JILL4/g;Z)V

    return-void
.end method


# virtual methods
.method public getAnimationTag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->animationTag:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDirection()LL4/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->direction:LL4/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->duration:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getInterpolator()Landroid/animation/TimeInterpolator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->interpolator:Landroid/animation/TimeInterpolator;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRepeatCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->repeatCount:I

    .line 2
    .line 3
    return v0
.end method

.method public getRepeatMode()LL4/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->repeatMode:LL4/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public isStartImmediately()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->isStartImmediately:Z

    .line 2
    .line 3
    return v0
.end method

.method public onDrawableDetached()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->isDrawableShadowCleared:Z

    .line 3
    .line 4
    return-void
.end method

.method public processPostDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public processPreDraw(Landroid/graphics/Canvas;LK4/b;LK4/b;LK4/b;LK4/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "LK4/b;",
            "LK4/b;",
            "LK4/b;",
            "LK4/b;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "iconBrush"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "iconContourBrush"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p3, "backgroundBrush"

    .line 17
    .line 18
    invoke-static {p4, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p3, "backgroundContourBrush"

    .line 22
    .line 23
    invoke-static {p5, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-boolean p3, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->isDrawableShadowCleared:Z

    .line 27
    .line 28
    if-nez p3, :cond_0

    .line 29
    .line 30
    iget-object p2, p2, LK4/b;->a:Landroid/graphics/Paint;

    .line 31
    .line 32
    check-cast p2, Landroid/text/TextPaint;

    .line 33
    .line 34
    invoke-virtual {p2}, Landroid/graphics/Paint;->clearShadowLayer()V

    .line 35
    .line 36
    .line 37
    const/4 p2, 0x1

    .line 38
    iput-boolean p2, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->isDrawableShadowCleared:Z

    .line 39
    .line 40
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->getDrawableBounds()Landroid/graphics/Rect;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->getAnimatedPercent()F

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    const p4, 0x40666666    # 3.6f

    .line 52
    .line 53
    .line 54
    mul-float/2addr p3, p4

    .line 55
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/SpinProcessor;->getDirection()LL4/k;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    iget p4, p4, LL4/k;->q:I

    .line 60
    .line 61
    int-to-float p4, p4

    .line 62
    mul-float/2addr p3, p4

    .line 63
    if-eqz p2, :cond_1

    .line 64
    .line 65
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 66
    .line 67
    .line 68
    move-result p4

    .line 69
    div-int/lit8 p4, p4, 0x2

    .line 70
    .line 71
    int-to-float p4, p4

    .line 72
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    div-int/lit8 p2, p2, 0x2

    .line 77
    .line 78
    int-to-float p2, p2

    .line 79
    invoke-virtual {p1, p3, p4, p2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 80
    .line 81
    .line 82
    :cond_1
    return-void
.end method

.method public setDirection(LL4/k;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->direction:LL4/k;

    .line 7
    .line 8
    return-void
.end method

.method public setDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->duration:J

    .line 2
    .line 3
    return-void
.end method

.method public setInterpolator(Landroid/animation/TimeInterpolator;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->interpolator:Landroid/animation/TimeInterpolator;

    .line 7
    .line 8
    return-void
.end method

.method public setRepeatCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->repeatCount:I

    .line 2
    .line 3
    return-void
.end method

.method public setRepeatMode(LL4/g;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->repeatMode:LL4/g;

    .line 7
    .line 8
    return-void
.end method

.method public setStartImmediately(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mikepenz/iconics/animation/SpinProcessor;->isStartImmediately:Z

    .line 2
    .line 3
    return-void
.end method
