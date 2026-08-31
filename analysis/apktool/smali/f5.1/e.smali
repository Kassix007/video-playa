.class public final synthetic Lf5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lf5/e;->q:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Ll0/d;

    .line 4
    .line 5
    const-string v1, "$this$Canvas"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lj0/i;->a()Lj0/g;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v0}, Ll0/d;->d()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    const/16 v4, 0x20

    .line 19
    .line 20
    shr-long/2addr v2, v4

    .line 21
    long-to-int v2, v2

    .line 22
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/high16 v3, 0x40000000    # 2.0f

    .line 27
    .line 28
    div-float/2addr v2, v3

    .line 29
    iget-object v5, v1, Lj0/g;->a:Landroid/graphics/Path;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-virtual {v5, v2, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ll0/d;->d()J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    shr-long/2addr v6, v4

    .line 40
    long-to-int v2, v6

    .line 41
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/high16 v6, 0x40800000    # 4.0f

    .line 46
    .line 47
    div-float/2addr v2, v6

    .line 48
    invoke-interface {v0}, Ll0/d;->d()J

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    shr-long/2addr v6, v4

    .line 53
    long-to-int v6, v6

    .line 54
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    div-float/2addr v6, v3

    .line 59
    const/4 v7, 0x0

    .line 60
    :goto_0
    const/16 v8, 0xc

    .line 61
    .line 62
    if-ge v7, v8, :cond_2

    .line 63
    .line 64
    const-wide v8, 0x400921fb54442d18L    # Math.PI

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    int-to-double v10, v7

    .line 70
    mul-double/2addr v10, v8

    .line 71
    const/4 v8, 0x6

    .line 72
    int-to-double v8, v8

    .line 73
    div-double/2addr v10, v8

    .line 74
    rem-int/lit8 v8, v7, 0x2

    .line 75
    .line 76
    if-nez v8, :cond_0

    .line 77
    .line 78
    move v8, v6

    .line 79
    goto :goto_1

    .line 80
    :cond_0
    move v8, v2

    .line 81
    :goto_1
    invoke-interface {v0}, Ll0/d;->d()J

    .line 82
    .line 83
    .line 84
    move-result-wide v12

    .line 85
    shr-long/2addr v12, v4

    .line 86
    long-to-int v9, v12

    .line 87
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    div-float/2addr v9, v3

    .line 92
    float-to-double v12, v8

    .line 93
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 94
    .line 95
    .line 96
    move-result-wide v14

    .line 97
    mul-double/2addr v14, v12

    .line 98
    double-to-float v8, v14

    .line 99
    add-float/2addr v9, v8

    .line 100
    invoke-interface {v0}, Ll0/d;->d()J

    .line 101
    .line 102
    .line 103
    move-result-wide v14

    .line 104
    const-wide v16, 0xffffffffL

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    and-long v14, v14, v16

    .line 110
    .line 111
    long-to-int v8, v14

    .line 112
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    div-float/2addr v8, v3

    .line 117
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 118
    .line 119
    .line 120
    move-result-wide v10

    .line 121
    mul-double/2addr v10, v12

    .line 122
    double-to-float v10, v10

    .line 123
    add-float/2addr v8, v10

    .line 124
    if-nez v7, :cond_1

    .line 125
    .line 126
    invoke-virtual {v5, v9, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_1
    invoke-virtual {v5, v9, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 131
    .line 132
    .line 133
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_2
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 137
    .line 138
    .line 139
    sget-object v2, Ll0/f;->b:Ll0/f;

    .line 140
    .line 141
    move-object/from16 v3, p0

    .line 142
    .line 143
    iget-wide v4, v3, Lf5/e;->q:J

    .line 144
    .line 145
    invoke-interface {v0, v1, v4, v5, v2}, Ll0/d;->w(Lj0/A;JLl0/c;)V

    .line 146
    .line 147
    .line 148
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 149
    .line 150
    return-object v0
.end method
