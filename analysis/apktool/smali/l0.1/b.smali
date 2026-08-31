.class public final Ll0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/d;


# instance fields
.field public final q:Ll0/a;

.field public final r:LB0/G0;

.field public s:LW1/d;

.field public t:LW1/d;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ll0/a;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v1, Ll0/c;->a:LW0/d;

    .line 10
    .line 11
    iput-object v1, v0, Ll0/a;->a:LW0/c;

    .line 12
    .line 13
    sget-object v1, LW0/l;->q:LW0/l;

    .line 14
    .line 15
    iput-object v1, v0, Ll0/a;->b:LW0/l;

    .line 16
    .line 17
    sget-object v1, Ll0/e;->a:Ll0/e;

    .line 18
    .line 19
    iput-object v1, v0, Ll0/a;->c:Lj0/m;

    .line 20
    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    iput-wide v1, v0, Ll0/a;->d:J

    .line 24
    .line 25
    iput-object v0, p0, Ll0/b;->q:Ll0/a;

    .line 26
    .line 27
    new-instance v0, LB0/G0;

    .line 28
    .line 29
    invoke-direct {v0, p0}, LB0/G0;-><init>(Ll0/b;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Ll0/b;->r:LB0/G0;

    .line 33
    .line 34
    return-void
.end method

.method public static a(Ll0/b;JLl0/c;FI)LW1/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, Ll0/b;->e(Ll0/c;)LW1/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/high16 p3, 0x3f800000    # 1.0f

    .line 6
    .line 7
    cmpg-float p3, p4, p3

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p1, p2}, Lj0/o;->d(J)F

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    mul-float/2addr p3, p4

    .line 17
    invoke-static {p1, p2, p3}, Lj0/o;->b(JF)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    :goto_0
    iget-object p3, p0, LW1/d;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p3, Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/graphics/Paint;->getColor()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    invoke-static {p3}, Lj0/B;->b(I)J

    .line 30
    .line 31
    .line 32
    move-result-wide p3

    .line 33
    invoke-static {p3, p4, p1, p2}, Lj0/o;->c(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    if-nez p3, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, p1, p2}, LW1/d;->e(J)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object p1, p0, LW1/d;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Landroid/graphics/Shader;

    .line 45
    .line 46
    const/4 p2, 0x0

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0, p2}, LW1/d;->g(Landroid/graphics/Shader;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object p1, p0, LW1/d;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lj0/j;

    .line 55
    .line 56
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0, p2}, LW1/d;->f(Lj0/j;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    iget p1, p0, LW1/d;->a:I

    .line 66
    .line 67
    if-ne p1, p5, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    invoke-virtual {p0, p5}, LW1/d;->d(I)V

    .line 71
    .line 72
    .line 73
    :goto_1
    iget-object p1, p0, LW1/d;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Landroid/graphics/Paint;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    const/4 p2, 0x1

    .line 82
    if-ne p1, p2, :cond_5

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_5
    iget-object p1, p0, LW1/d;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Landroid/graphics/Paint;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 90
    .line 91
    .line 92
    return-object p0
.end method


# virtual methods
.method public final L(JJJFI)V
    .locals 6

    .line 1
    iget-object v0, p0, Ll0/b;->q:Ll0/a;

    .line 2
    .line 3
    iget-object v0, v0, Ll0/a;->c:Lj0/m;

    .line 4
    .line 5
    iget-object v1, p0, Ll0/b;->t:LW1/d;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lj0/B;->f()LW1/d;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, v2}, LW1/d;->j(I)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Ll0/b;->t:LW1/d;

    .line 18
    .line 19
    :cond_0
    iget-object v3, v1, LW1/d;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/graphics/Paint;->getColor()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-static {v4}, Lj0/B;->b(I)J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    invoke-static {v4, v5, p1, p2}, Lj0/o;->c(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1, p1, p2}, LW1/d;->e(J)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object p1, v1, LW1/d;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Landroid/graphics/Shader;

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1, p2}, LW1/d;->g(Landroid/graphics/Shader;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object p1, v1, LW1/d;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lj0/j;

    .line 53
    .line 54
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v1, p2}, LW1/d;->f(Lj0/j;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget p1, v1, LW1/d;->a:I

    .line 64
    .line 65
    const/4 p2, 0x3

    .line 66
    if-ne p1, p2, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    invoke-virtual {v1, p2}, LW1/d;->d(I)V

    .line 70
    .line 71
    .line 72
    :goto_0
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    cmpg-float p1, p1, p7

    .line 77
    .line 78
    if-nez p1, :cond_5

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    iget-object p1, v1, LW1/d;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, Landroid/graphics/Paint;

    .line 84
    .line 85
    invoke-virtual {p1, p7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeMiter()F

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    const/high16 p2, 0x40800000    # 4.0f

    .line 93
    .line 94
    cmpg-float p1, p1, p2

    .line 95
    .line 96
    if-nez p1, :cond_6

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_6
    iget-object p1, v1, LW1/d;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Landroid/graphics/Paint;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 104
    .line 105
    .line 106
    :goto_2
    invoke-virtual {v1}, LW1/d;->a()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-ne p1, p8, :cond_7

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_7
    invoke-virtual {v1, p8}, LW1/d;->h(I)V

    .line 114
    .line 115
    .line 116
    :goto_3
    invoke-virtual {v1}, LW1/d;->b()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-nez p1, :cond_8

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_8
    const/4 p1, 0x0

    .line 124
    invoke-virtual {v1, p1}, LW1/d;->i(I)V

    .line 125
    .line 126
    .line 127
    :goto_4
    invoke-virtual {v3}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-ne p1, v2, :cond_9

    .line 132
    .line 133
    :goto_5
    move-wide p2, p3

    .line 134
    move-wide p4, p5

    .line 135
    move-object p1, v0

    .line 136
    move-object p6, v1

    .line 137
    goto :goto_6

    .line 138
    :cond_9
    iget-object p1, v1, LW1/d;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p1, Landroid/graphics/Paint;

    .line 141
    .line 142
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :goto_6
    invoke-interface/range {p1 .. p6}, Lj0/m;->f(JJLW1/d;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public final R(JJJFLl0/c;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Ll0/b;->q:Ll0/a;

    .line 2
    .line 3
    iget-object v0, v0, Ll0/a;->c:Lj0/m;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    shr-long v2, p3, v1

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const-wide v4, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p3, v4

    .line 20
    long-to-int p3, p3

    .line 21
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    shr-long v6, p5, v1

    .line 30
    .line 31
    long-to-int v1, v6

    .line 32
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-float/2addr v1, v2

    .line 37
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    and-long/2addr v4, p5

    .line 42
    long-to-int v2, v4

    .line 43
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    add-float/2addr v2, p3

    .line 48
    move-object v4, p0

    .line 49
    move-wide v5, p1

    .line 50
    move/from16 v8, p7

    .line 51
    .line 52
    move-object/from16 v7, p8

    .line 53
    .line 54
    move/from16 v9, p9

    .line 55
    .line 56
    invoke-static/range {v4 .. v9}, Ll0/b;->a(Ll0/b;JLl0/c;FI)LW1/d;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    move-object/from16 p6, p1

    .line 61
    .line 62
    move p3, p4

    .line 63
    move-object p1, v0

    .line 64
    move p4, v1

    .line 65
    move p5, v2

    .line 66
    move p2, v3

    .line 67
    invoke-interface/range {p1 .. p6}, Lj0/m;->j(FFFFLW1/d;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/b;->q:Ll0/a;

    .line 2
    .line 3
    iget-object v0, v0, Ll0/a;->a:LW0/c;

    .line 4
    .line 5
    invoke-interface {v0}, LW0/c;->b()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final c(Lj0/B;Ll0/c;FLj0/j;II)LW1/d;
    .locals 4

    .line 1
    invoke-virtual {p0, p2}, Ll0/b;->e(Ll0/c;)LW1/d;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Ll0/d;->d()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p1, p3, v0, v1, p2}, Lj0/B;->h(FJLW1/d;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p2, LW1/d;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Landroid/graphics/Shader;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p2, p1}, LW1/d;->g(Landroid/graphics/Shader;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object p1, p2, LW1/d;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Landroid/graphics/Paint;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p1}, Lj0/B;->b(I)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    sget-wide v2, Lj0/o;->b:J

    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, Lj0/o;->c(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    invoke-virtual {p2, v2, v3}, LW1/d;->e(J)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object p1, p2, LW1/d;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Landroid/graphics/Paint;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/graphics/Paint;->getAlpha()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    int-to-float p1, p1

    .line 57
    const/high16 v0, 0x437f0000    # 255.0f

    .line 58
    .line 59
    div-float/2addr p1, v0

    .line 60
    cmpg-float p1, p1, p3

    .line 61
    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-virtual {p2, p3}, LW1/d;->c(F)V

    .line 66
    .line 67
    .line 68
    :goto_0
    iget-object p1, p2, LW1/d;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lj0/j;

    .line 71
    .line 72
    invoke-static {p1, p4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_4

    .line 77
    .line 78
    invoke-virtual {p2, p4}, LW1/d;->f(Lj0/j;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    iget p1, p2, LW1/d;->a:I

    .line 82
    .line 83
    if-ne p1, p5, :cond_5

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    invoke-virtual {p2, p5}, LW1/d;->d(I)V

    .line 87
    .line 88
    .line 89
    :goto_1
    iget-object p1, p2, LW1/d;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p1, Landroid/graphics/Paint;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-ne p1, p6, :cond_6

    .line 98
    .line 99
    return-object p2

    .line 100
    :cond_6
    iget-object p1, p2, LW1/d;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Landroid/graphics/Paint;

    .line 103
    .line 104
    const/4 p3, 0x1

    .line 105
    if-nez p6, :cond_7

    .line 106
    .line 107
    move p4, p3

    .line 108
    goto :goto_2

    .line 109
    :cond_7
    const/4 p4, 0x0

    .line 110
    :goto_2
    xor-int/2addr p3, p4

    .line 111
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 112
    .line 113
    .line 114
    return-object p2
.end method

.method public final e(Ll0/c;)LW1/d;
    .locals 4

    .line 1
    sget-object v0, Ll0/f;->b:Ll0/f;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Ll0/b;->s:LW1/d;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lj0/B;->f()LW1/d;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, LW1/d;->j(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ll0/b;->s:LW1/d;

    .line 22
    .line 23
    :cond_0
    return-object p1

    .line 24
    :cond_1
    instance-of v0, p1, Ll0/g;

    .line 25
    .line 26
    if-eqz v0, :cond_7

    .line 27
    .line 28
    iget-object v0, p0, Ll0/b;->t:LW1/d;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    invoke-static {}, Lj0/B;->f()LW1/d;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {v0, v1}, LW1/d;->j(I)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Ll0/b;->t:LW1/d;

    .line 41
    .line 42
    :cond_2
    iget-object v1, v0, LW1/d;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Landroid/graphics/Paint;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    check-cast p1, Ll0/g;

    .line 51
    .line 52
    iget v3, p1, Ll0/g;->b:F

    .line 53
    .line 54
    cmpg-float v2, v2, v3

    .line 55
    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    iget-object v2, v0, LW1/d;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Landroid/graphics/Paint;

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v0}, LW1/d;->a()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    iget v3, p1, Ll0/g;->d:I

    .line 71
    .line 72
    if-ne v2, v3, :cond_4

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    invoke-virtual {v0, v3}, LW1/d;->h(I)V

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeMiter()F

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    iget v2, p1, Ll0/g;->c:F

    .line 83
    .line 84
    cmpg-float v1, v1, v2

    .line 85
    .line 86
    if-nez v1, :cond_5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    iget-object v1, v0, LW1/d;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Landroid/graphics/Paint;

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 94
    .line 95
    .line 96
    :goto_2
    invoke-virtual {v0}, LW1/d;->b()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iget p1, p1, Ll0/g;->e:I

    .line 101
    .line 102
    if-ne v1, p1, :cond_6

    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_6
    invoke-virtual {v0, p1}, LW1/d;->i(I)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_7
    new-instance p1, LC2/e;

    .line 110
    .line 111
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 112
    .line 113
    .line 114
    throw p1
.end method

.method public final getLayoutDirection()LW0/l;
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/b;->q:Ll0/a;

    .line 2
    .line 3
    iget-object v0, v0, Ll0/a;->b:LW0/l;

    .line 4
    .line 5
    return-object v0
.end method

.method public final i(Lj0/e;JJJFLj0/j;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Ll0/b;->q:Ll0/a;

    .line 2
    .line 3
    iget-object v1, v0, Ll0/a;->c:Lj0/m;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Ll0/f;->b:Ll0/f;

    .line 7
    .line 8
    const/4 v7, 0x3

    .line 9
    move-object v2, p0

    .line 10
    move/from16 v5, p8

    .line 11
    .line 12
    move-object/from16 v6, p9

    .line 13
    .line 14
    move/from16 v8, p10

    .line 15
    .line 16
    invoke-virtual/range {v2 .. v8}, Ll0/b;->c(Lj0/B;Ll0/c;FLj0/j;II)LW1/d;

    .line 17
    .line 18
    .line 19
    move-result-object v9

    .line 20
    move-object v2, p1

    .line 21
    move-wide v3, p2

    .line 22
    move-wide v5, p4

    .line 23
    move-wide/from16 v7, p6

    .line 24
    .line 25
    invoke-interface/range {v1 .. v9}, Lj0/m;->b(Lj0/e;JJJLW1/d;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final l()F
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/b;->q:Ll0/a;

    .line 2
    .line 3
    iget-object v0, v0, Ll0/a;->a:LW0/c;

    .line 4
    .line 5
    invoke-interface {v0}, LW0/c;->l()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final m(Lj0/A;Lj0/B;FLl0/c;I)V
    .locals 8

    .line 1
    iget-object v0, p0, Ll0/b;->q:Ll0/a;

    .line 2
    .line 3
    iget-object v0, v0, Ll0/a;->c:Lj0/m;

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v7, 0x1

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p2

    .line 9
    move v4, p3

    .line 10
    move-object v3, p4

    .line 11
    move v6, p5

    .line 12
    invoke-virtual/range {v1 .. v7}, Ll0/b;->c(Lj0/B;Ll0/c;FLj0/j;II)LW1/d;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-interface {v0, p1, p2}, Lj0/m;->m(Lj0/A;LW1/d;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final p(FJJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Ll0/b;->q:Ll0/a;

    .line 2
    .line 3
    iget-object v0, v0, Ll0/a;->c:Lj0/m;

    .line 4
    .line 5
    sget-object v4, Ll0/f;->b:Ll0/f;

    .line 6
    .line 7
    const/high16 v5, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/4 v6, 0x3

    .line 10
    move-object v1, p0

    .line 11
    move-wide v2, p2

    .line 12
    invoke-static/range {v1 .. v6}, Ll0/b;->a(Ll0/b;JLl0/c;FI)LW1/d;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-interface {v0, p1, p4, p5, p2}, Lj0/m;->q(FJLW1/d;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final v(JFFJJLl0/c;)V
    .locals 11

    .line 1
    iget-object v1, p0, Ll0/b;->q:Ll0/a;

    .line 2
    .line 3
    iget-object v6, v1, Ll0/a;->c:Lj0/m;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    shr-long v2, p5, v1

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v7

    .line 14
    const-wide v3, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long v8, p5, v3

    .line 20
    .line 21
    long-to-int v5, v8

    .line 22
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    shr-long v9, p7, v1

    .line 31
    .line 32
    long-to-int v1, v9

    .line 33
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-float v9, v1, v2

    .line 38
    .line 39
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    and-long v2, p7, v3

    .line 44
    .line 45
    long-to-int v2, v2

    .line 46
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-float v10, v2, v1

    .line 51
    .line 52
    const/high16 v4, 0x3f800000    # 1.0f

    .line 53
    .line 54
    const/4 v5, 0x3

    .line 55
    move-object v0, p0

    .line 56
    move-wide v1, p1

    .line 57
    move-object/from16 v3, p9

    .line 58
    .line 59
    invoke-static/range {v0 .. v5}, Ll0/b;->a(Ll0/b;JLl0/c;FI)LW1/d;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    move-object v2, v6

    .line 64
    move v3, v7

    .line 65
    move v4, v8

    .line 66
    move v5, v9

    .line 67
    move v6, v10

    .line 68
    move v7, p3

    .line 69
    move v8, p4

    .line 70
    move-object v9, v1

    .line 71
    invoke-interface/range {v2 .. v9}, Lj0/m;->d(FFFFFFLW1/d;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final w(Lj0/A;JLl0/c;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ll0/b;->q:Ll0/a;

    .line 2
    .line 3
    iget-object v0, v0, Ll0/a;->c:Lj0/m;

    .line 4
    .line 5
    const/high16 v5, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v6, 0x3

    .line 8
    move-object v1, p0

    .line 9
    move-wide v2, p2

    .line 10
    move-object v4, p4

    .line 11
    invoke-static/range {v1 .. v6}, Ll0/b;->a(Ll0/b;JLl0/c;FI)LW1/d;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {v0, p1, p2}, Lj0/m;->m(Lj0/A;LW1/d;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final z()LB0/G0;
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/b;->r:LB0/G0;

    .line 2
    .line 3
    return-object v0
.end method
