.class public Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;
.super Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;
.source "SourceFile"


# static fields
.field public static final Companion:LL4/a;

.field public static DEFAULT_DURATION:J = 0x1f4L


# instance fields
.field private final animationTag:Ljava/lang/String;

.field private duration:J

.field private interpolator:Landroid/animation/TimeInterpolator;

.field private isStartImmediately:Z

.field private maximumAlpha:I

.field private minimumAlpha:I

.field private repeatCount:I

.field private repeatMode:LL4/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LL4/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->Companion:LL4/a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;-><init>(IILandroid/animation/TimeInterpolator;JILL4/g;ZILkotlin/jvm/internal/g;)V

    return-void
.end method

.method public constructor <init>(IILandroid/animation/TimeInterpolator;JILL4/g;Z)V
    .locals 7

    const-string v0, "interpolator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repeatMode"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p3

    move-wide v2, p4

    move v4, p6

    move-object v5, p7

    move v6, p8

    .line 6
    invoke-direct/range {v0 .. v6}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;-><init>(Landroid/animation/TimeInterpolator;JILL4/g;Z)V

    .line 7
    iput p1, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->minimumAlpha:I

    .line 8
    iput p2, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->maximumAlpha:I

    .line 9
    iput-object p3, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->interpolator:Landroid/animation/TimeInterpolator;

    .line 10
    iput-wide p4, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->duration:J

    .line 11
    iput p6, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->repeatCount:I

    .line 12
    iput-object p7, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->repeatMode:LL4/g;

    .line 13
    iput-boolean p8, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->isStartImmediately:Z

    .line 14
    const-string v1, "blink_alpha"

    iput-object v1, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->animationTag:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IILandroid/animation/TimeInterpolator;JILL4/g;ZILkotlin/jvm/internal/g;)V
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    const/16 p2, 0xff

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    .line 2
    sget-object p3, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->DEFAULT_INTERPOLATOR:Landroid/view/animation/LinearInterpolator;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    .line 3
    sget-wide p4, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->DEFAULT_DURATION:J

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    const/4 p6, -0x1

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    .line 4
    sget-object p7, LL4/g;->s:LL4/g;

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    const/4 p8, 0x1

    :cond_6
    move-object p9, p7

    move p10, p8

    move p8, p6

    move-wide p6, p4

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    .line 5
    invoke-direct/range {p2 .. p10}, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;-><init>(IILandroid/animation/TimeInterpolator;JILL4/g;Z)V

    return-void
.end method


# virtual methods
.method public getAnimationTag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->animationTag:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->duration:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getInterpolator()Landroid/animation/TimeInterpolator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->interpolator:Landroid/animation/TimeInterpolator;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaximumAlpha()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->maximumAlpha:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinimumAlpha()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->minimumAlpha:I

    .line 2
    .line 3
    return v0
.end method

.method public getRepeatCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->repeatCount:I

    .line 2
    .line 3
    return v0
.end method

.method public getRepeatMode()LL4/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->repeatMode:LL4/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public isStartImmediately()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->isStartImmediately:Z

    .line 2
    .line 3
    return v0
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
    const-string p1, "iconBrush"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "iconContourBrush"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "backgroundBrush"

    .line 17
    .line 18
    invoke-static {p4, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p1, "backgroundContourBrush"

    .line 22
    .line 23
    invoke-static {p5, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->getMaximumAlpha()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->getMinimumAlpha()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sub-int/2addr p1, v0

    .line 35
    div-int/lit8 p1, p1, 0x64

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->getAnimatedPercent()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    int-to-float p1, p1

    .line 42
    mul-float/2addr v0, p1

    .line 43
    float-to-int p1, v0

    .line 44
    invoke-virtual {p2, p1}, LK4/b;->c(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, p1}, LK4/b;->c(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p4, p1}, LK4/b;->c(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p5, p1}, LK4/b;->c(I)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public setDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->duration:J

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
    iput-object p1, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->interpolator:Landroid/animation/TimeInterpolator;

    .line 7
    .line 8
    return-void
.end method

.method public setMaximumAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->maximumAlpha:I

    .line 2
    .line 3
    return-void
.end method

.method public setMinimumAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->minimumAlpha:I

    .line 2
    .line 3
    return-void
.end method

.method public setRepeatCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->repeatCount:I

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
    iput-object p1, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->repeatMode:LL4/g;

    .line 7
    .line 8
    return-void
.end method

.method public setStartImmediately(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;->isStartImmediately:Z

    .line 2
    .line 3
    return-void
.end method
