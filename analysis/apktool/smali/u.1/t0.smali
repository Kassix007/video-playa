.class public final Lu/t0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Lu/v0;

.field public final synthetic r:F


# direct methods
.method public constructor <init>(Lu/v0;F)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/t0;->q:Lu/v0;

    .line 2
    .line 3
    iput p2, p0, Lu/t0;->r:F

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object p1, p0, Lu/t0;->q:Lu/v0;

    .line 8
    .line 9
    invoke-virtual {p1}, Lu/v0;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p1, Lu/v0;->g:LP/d0;

    .line 14
    .line 15
    if-nez v2, :cond_3

    .line 16
    .line 17
    iget-object v2, v3, LP/d0;->r:LP/G0;

    .line 18
    .line 19
    invoke-static {v2, v3}, La0/n;->t(La0/w;La0/u;)La0/w;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, LP/G0;

    .line 24
    .line 25
    iget-wide v4, v2, LP/G0;->c:J

    .line 26
    .line 27
    const-wide/high16 v6, -0x8000000000000000L

    .line 28
    .line 29
    cmp-long v2, v4, v6

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3, v0, v1}, LP/d0;->e(J)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p1, Lu/v0;->a:LO3/D0;

    .line 37
    .line 38
    iget-object v2, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, LP/f0;

    .line 41
    .line 42
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v2, v4}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object v2, v3, LP/d0;->r:LP/G0;

    .line 48
    .line 49
    invoke-static {v2, v3}, La0/n;->t(La0/w;La0/u;)La0/w;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, LP/G0;

    .line 54
    .line 55
    iget-wide v2, v2, LP/G0;->c:J

    .line 56
    .line 57
    sub-long/2addr v0, v2

    .line 58
    const/4 v2, 0x0

    .line 59
    iget v3, p0, Lu/t0;->r:F

    .line 60
    .line 61
    cmpg-float v2, v3, v2

    .line 62
    .line 63
    if-nez v2, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    long-to-double v0, v0

    .line 67
    float-to-double v3, v3

    .line 68
    div-double/2addr v0, v3

    .line 69
    invoke-static {v0, v1}, LD5/a;->H(D)J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    :goto_0
    invoke-virtual {p1, v0, v1}, Lu/v0;->n(J)V

    .line 74
    .line 75
    .line 76
    if-nez v2, :cond_2

    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    const/4 v2, 0x0

    .line 81
    :goto_1
    invoke-virtual {p1, v2, v0, v1}, Lu/v0;->h(ZJ)V

    .line 82
    .line 83
    .line 84
    :cond_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 85
    .line 86
    return-object p1
.end method
