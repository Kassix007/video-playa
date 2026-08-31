.class public final LM/n0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:J

.field public final synthetic r:I


# direct methods
.method public constructor <init>(JI)V
    .locals 0

    .line 1
    iput-wide p1, p0, LM/n0;->q:J

    .line 2
    .line 3
    iput p3, p0, LM/n0;->r:I

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
    .locals 9

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ll0/d;

    .line 3
    .line 4
    sget p1, LM/j0;->a:F

    .line 5
    .line 6
    invoke-interface {v0, p1}, LW0/c;->u(F)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-interface {v0}, Ll0/d;->d()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-static {v1, v2}, Li0/e;->b(J)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-interface {v0}, Ll0/d;->d()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    invoke-static {v1, v2}, Li0/e;->b(J)F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    sub-float/2addr v1, p1

    .line 31
    const/4 v2, 0x2

    .line 32
    int-to-float v2, v2

    .line 33
    div-float/2addr v1, v2

    .line 34
    const/4 v2, 0x1

    .line 35
    move v3, v1

    .line 36
    move v4, v2

    .line 37
    iget-wide v1, p0, LM/n0;->q:J

    .line 38
    .line 39
    iget v5, p0, LM/n0;->r:I

    .line 40
    .line 41
    const/high16 v6, 0x40000000    # 2.0f

    .line 42
    .line 43
    if-ne v5, v4, :cond_0

    .line 44
    .line 45
    div-float/2addr p1, v6

    .line 46
    invoke-interface {v0}, Ll0/d;->d()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    invoke-static {v4, v5}, Li0/e;->d(J)F

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    sub-float/2addr v4, p1

    .line 55
    sub-float/2addr v4, v3

    .line 56
    invoke-interface {v0}, Ll0/d;->d()J

    .line 57
    .line 58
    .line 59
    move-result-wide v7

    .line 60
    invoke-static {v7, v8}, Li0/e;->b(J)F

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    div-float/2addr v3, v6

    .line 65
    invoke-static {v4, v3}, Lcom/google/android/gms/internal/measurement/P1;->b(FF)J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    const/16 v6, 0x78

    .line 70
    .line 71
    move v3, p1

    .line 72
    invoke-static/range {v0 .. v6}, Ll0/d;->V(Ll0/d;JFJI)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-interface {v0}, Ll0/d;->d()J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    invoke-static {v4, v5}, Li0/e;->d(J)F

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    sub-float/2addr v4, p1

    .line 85
    sub-float/2addr v4, v3

    .line 86
    invoke-interface {v0}, Ll0/d;->d()J

    .line 87
    .line 88
    .line 89
    move-result-wide v7

    .line 90
    invoke-static {v7, v8}, Li0/e;->b(J)F

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    sub-float/2addr v3, p1

    .line 95
    div-float/2addr v3, v6

    .line 96
    invoke-static {v4, v3}, Lcom/google/android/gms/internal/measurement/P1;->b(FF)J

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    invoke-static {p1, p1}, Ln5/A;->g(FF)J

    .line 101
    .line 102
    .line 103
    move-result-wide v5

    .line 104
    const/4 v7, 0x0

    .line 105
    const/16 v8, 0x78

    .line 106
    .line 107
    invoke-static/range {v0 .. v8}, Ll0/d;->g0(Ll0/d;JJJFI)V

    .line 108
    .line 109
    .line 110
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 111
    .line 112
    return-object p1
.end method
