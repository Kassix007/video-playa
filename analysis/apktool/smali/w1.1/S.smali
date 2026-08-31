.class public final Lw1/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lw1/Z;

.field public final synthetic b:Lw1/o0;

.field public final synthetic c:Lw1/o0;

.field public final synthetic d:I

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public constructor <init>(Lw1/Z;Lw1/o0;Lw1/o0;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw1/S;->a:Lw1/Z;

    .line 5
    .line 6
    iput-object p2, p0, Lw1/S;->b:Lw1/o0;

    .line 7
    .line 8
    iput-object p3, p0, Lw1/S;->c:Lw1/o0;

    .line 9
    .line 10
    iput p4, p0, Lw1/S;->d:I

    .line 11
    .line 12
    iput-object p5, p0, Lw1/S;->e:Landroid/view/View;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lw1/S;->a:Lw1/Z;

    .line 6
    .line 7
    iget-object v1, v0, Lw1/Z;->a:Lw1/Y;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lw1/Y;->d(F)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lw1/S;->b:Lw1/o0;

    .line 13
    .line 14
    iget-object v1, p1, Lw1/o0;->a:Lw1/l0;

    .line 15
    .line 16
    iget-object v2, v0, Lw1/Z;->a:Lw1/Y;

    .line 17
    .line 18
    invoke-virtual {v2}, Lw1/Y;->b()F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    sget-object v3, Lw1/U;->e:Landroid/view/animation/PathInterpolator;

    .line 23
    .line 24
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v4, 0x22

    .line 27
    .line 28
    if-lt v3, v4, :cond_0

    .line 29
    .line 30
    new-instance v3, Lw1/d0;

    .line 31
    .line 32
    invoke-direct {v3, p1}, Lw1/d0;-><init>(Lw1/o0;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/16 v4, 0x1e

    .line 37
    .line 38
    if-lt v3, v4, :cond_1

    .line 39
    .line 40
    new-instance v3, Lw1/c0;

    .line 41
    .line 42
    invoke-direct {v3, p1}, Lw1/c0;-><init>(Lw1/o0;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/16 v4, 0x1d

    .line 47
    .line 48
    if-lt v3, v4, :cond_2

    .line 49
    .line 50
    new-instance v3, Lw1/b0;

    .line 51
    .line 52
    invoke-direct {v3, p1}, Lw1/b0;-><init>(Lw1/o0;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    new-instance v3, Lw1/a0;

    .line 57
    .line 58
    invoke-direct {v3, p1}, Lw1/a0;-><init>(Lw1/o0;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    const/4 p1, 0x1

    .line 62
    :goto_1
    const/16 v4, 0x200

    .line 63
    .line 64
    if-gt p1, v4, :cond_4

    .line 65
    .line 66
    iget v4, p0, Lw1/S;->d:I

    .line 67
    .line 68
    and-int/2addr v4, p1

    .line 69
    if-nez v4, :cond_3

    .line 70
    .line 71
    invoke-virtual {v1, p1}, Lw1/l0;->g(I)Ln1/b;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v3, p1, v4}, Lw1/e0;->c(ILn1/b;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-virtual {v1, p1}, Lw1/l0;->g(I)Ln1/b;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iget-object v5, p0, Lw1/S;->c:Lw1/o0;

    .line 84
    .line 85
    iget-object v5, v5, Lw1/o0;->a:Lw1/l0;

    .line 86
    .line 87
    invoke-virtual {v5, p1}, Lw1/l0;->g(I)Ln1/b;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    iget v6, v4, Ln1/b;->a:I

    .line 92
    .line 93
    iget v7, v5, Ln1/b;->a:I

    .line 94
    .line 95
    sub-int/2addr v6, v7

    .line 96
    int-to-float v6, v6

    .line 97
    const/high16 v7, 0x3f800000    # 1.0f

    .line 98
    .line 99
    sub-float/2addr v7, v2

    .line 100
    mul-float/2addr v6, v7

    .line 101
    float-to-double v8, v6

    .line 102
    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    .line 103
    .line 104
    add-double/2addr v8, v10

    .line 105
    double-to-int v6, v8

    .line 106
    iget v8, v4, Ln1/b;->b:I

    .line 107
    .line 108
    iget v9, v5, Ln1/b;->b:I

    .line 109
    .line 110
    sub-int/2addr v8, v9

    .line 111
    int-to-float v8, v8

    .line 112
    mul-float/2addr v8, v7

    .line 113
    float-to-double v8, v8

    .line 114
    add-double/2addr v8, v10

    .line 115
    double-to-int v8, v8

    .line 116
    iget v9, v4, Ln1/b;->c:I

    .line 117
    .line 118
    iget v12, v5, Ln1/b;->c:I

    .line 119
    .line 120
    sub-int/2addr v9, v12

    .line 121
    int-to-float v9, v9

    .line 122
    mul-float/2addr v9, v7

    .line 123
    float-to-double v12, v9

    .line 124
    add-double/2addr v12, v10

    .line 125
    double-to-int v9, v12

    .line 126
    iget v12, v4, Ln1/b;->d:I

    .line 127
    .line 128
    iget v5, v5, Ln1/b;->d:I

    .line 129
    .line 130
    sub-int/2addr v12, v5

    .line 131
    int-to-float v5, v12

    .line 132
    mul-float/2addr v5, v7

    .line 133
    float-to-double v12, v5

    .line 134
    add-double/2addr v12, v10

    .line 135
    double-to-int v5, v12

    .line 136
    invoke-static {v4, v6, v8, v9, v5}, Lw1/o0;->e(Ln1/b;IIII)Ln1/b;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {v3, p1, v4}, Lw1/e0;->c(ILn1/b;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    shl-int/lit8 p1, p1, 0x1

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_4
    invoke-virtual {v3}, Lw1/e0;->b()Lw1/o0;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iget-object v1, p0, Lw1/S;->e:Landroid/view/View;

    .line 155
    .line 156
    invoke-static {v1, p1, v0}, Lw1/U;->g(Landroid/view/View;Lw1/o0;Ljava/util/List;)V

    .line 157
    .line 158
    .line 159
    return-void
.end method
