.class public final LS0/e;
.super Landroid/text/TextPaint;
.source "SourceFile"


# instance fields
.field public a:LW1/d;

.field public b:LV0/l;

.field public c:I

.field public d:Lj0/D;

.field public e:Lj0/o;

.field public f:Lj0/B;

.field public g:LP/C;

.field public h:Li0/e;

.field public i:Ll0/c;


# virtual methods
.method public final a()LW1/d;
    .locals 1

    .line 1
    iget-object v0, p0, LS0/e;->a:LW1/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, LW1/d;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LW1/d;-><init>(Landroid/graphics/Paint;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LS0/e;->a:LW1/d;

    .line 12
    .line 13
    return-object v0
.end method

.method public final b(I)V
    .locals 1

    .line 1
    iget v0, p0, LS0/e;->c:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, LS0/e;->a()LW1/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, LW1/d;->d(I)V

    .line 11
    .line 12
    .line 13
    iput p1, p0, LS0/e;->c:I

    .line 14
    .line 15
    return-void
.end method

.method public final c(Lj0/B;JF)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iput-object v0, p0, LS0/e;->g:LP/C;

    .line 5
    .line 6
    iput-object v0, p0, LS0/e;->f:Lj0/B;

    .line 7
    .line 8
    iput-object v0, p0, LS0/e;->h:Li0/e;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    instance-of v1, p1, Lj0/G;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    check-cast p1, Lj0/G;

    .line 19
    .line 20
    iget-wide p1, p1, Lj0/G;->e:J

    .line 21
    .line 22
    invoke-static {p1, p2, p4}, Ln5/A;->w(JF)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    invoke-virtual {p0, p1, p2}, LS0/e;->d(J)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    instance-of v1, p1, Lj0/l;

    .line 31
    .line 32
    if-eqz v1, :cond_7

    .line 33
    .line 34
    iget-object v1, p0, LS0/e;->f:Lj0/B;

    .line 35
    .line 36
    invoke-static {v1, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    iget-object v1, p0, LS0/e;->h:Li0/e;

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    move v1, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iget-wide v3, v1, Li0/e;->a:J

    .line 50
    .line 51
    invoke-static {v3, v4, p2, p3}, Li0/e;->a(JJ)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    :goto_0
    if-nez v1, :cond_5

    .line 56
    .line 57
    :cond_3
    const-wide v3, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    cmp-long v1, p2, v3

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    :cond_4
    if-eqz v2, :cond_5

    .line 68
    .line 69
    iput-object p1, p0, LS0/e;->f:Lj0/B;

    .line 70
    .line 71
    new-instance v1, Li0/e;

    .line 72
    .line 73
    invoke-direct {v1, p2, p3}, Li0/e;-><init>(J)V

    .line 74
    .line 75
    .line 76
    iput-object v1, p0, LS0/e;->h:Li0/e;

    .line 77
    .line 78
    new-instance v1, LA0/d;

    .line 79
    .line 80
    invoke-direct {v1, p1, p2, p3}, LA0/d;-><init>(Lj0/B;J)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, LP/b;->m(LB5/a;)LP/C;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, LS0/e;->g:LP/C;

    .line 88
    .line 89
    :cond_5
    invoke-virtual {p0}, LS0/e;->a()LW1/d;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p2, p0, LS0/e;->g:LP/C;

    .line 94
    .line 95
    if-eqz p2, :cond_6

    .line 96
    .line 97
    invoke-virtual {p2}, LP/C;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Landroid/graphics/Shader;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    move-object p2, v0

    .line 105
    :goto_1
    invoke-virtual {p1, p2}, LW1/d;->g(Landroid/graphics/Shader;)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, LS0/e;->e:Lj0/o;

    .line 109
    .line 110
    invoke-static {p0, p4}, LS0/j;->a(Landroid/text/TextPaint;F)V

    .line 111
    .line 112
    .line 113
    :cond_7
    return-void
.end method

.method public final d(J)V
    .locals 4

    .line 1
    iget-object v0, p0, LS0/e;->e:Lj0/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-wide v2, v0, Lj0/o;->a:J

    .line 9
    .line 10
    invoke-static {v2, v3, p1, p2}, Lj0/o;->c(JJ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    :goto_0
    if-nez v0, :cond_2

    .line 15
    .line 16
    const-wide/16 v2, 0x10

    .line 17
    .line 18
    cmp-long v0, p1, v2

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    :cond_1
    if-eqz v1, :cond_2

    .line 24
    .line 25
    new-instance v0, Lj0/o;

    .line 26
    .line 27
    invoke-direct {v0, p1, p2}, Lj0/o;-><init>(J)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, LS0/e;->e:Lj0/o;

    .line 31
    .line 32
    invoke-static {p1, p2}, Lj0/B;->v(J)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    iput-object p1, p0, LS0/e;->g:LP/C;

    .line 41
    .line 42
    iput-object p1, p0, LS0/e;->f:Lj0/B;

    .line 43
    .line 44
    iput-object p1, p0, LS0/e;->h:Li0/e;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
.end method

.method public final e(Ll0/c;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LS0/e;->i:Ll0/c;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    iput-object p1, p0, LS0/e;->i:Ll0/c;

    .line 13
    .line 14
    sget-object v0, Ll0/f;->b:Ll0/f;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    instance-of v0, p1, Ll0/g;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, LS0/e;->a()LW1/d;

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
    invoke-virtual {p0}, LS0/e;->a()LW1/d;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast p1, Ll0/g;

    .line 45
    .line 46
    iget v1, p1, Ll0/g;->b:F

    .line 47
    .line 48
    iget-object v0, v0, LW1/d;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Landroid/graphics/Paint;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, LS0/e;->a()LW1/d;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget v1, p1, Ll0/g;->c:F

    .line 60
    .line 61
    iget-object v0, v0, LW1/d;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Landroid/graphics/Paint;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, LS0/e;->a()LW1/d;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget v1, p1, Ll0/g;->e:I

    .line 73
    .line 74
    invoke-virtual {v0, v1}, LW1/d;->i(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, LS0/e;->a()LW1/d;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget p1, p1, Ll0/g;->d:I

    .line 82
    .line 83
    invoke-virtual {v0, p1}, LW1/d;->h(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, LS0/e;->a()LW1/d;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object p1, p1, LW1/d;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Landroid/graphics/Paint;

    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 96
    .line 97
    .line 98
    :cond_2
    :goto_0
    return-void
.end method

.method public final f(Lj0/D;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LS0/e;->d:Lj0/D;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iput-object p1, p0, LS0/e;->d:Lj0/D;

    .line 13
    .line 14
    sget-object v0, Lj0/D;->d:Lj0/D;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lj0/D;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/Paint;->clearShadowLayer()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object p1, p0, LS0/e;->d:Lj0/D;

    .line 27
    .line 28
    iget v0, p1, Lj0/D;->c:F

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    cmpg-float v1, v0, v1

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    :cond_2
    iget-wide v1, p1, Lj0/D;->b:J

    .line 37
    .line 38
    const/16 p1, 0x20

    .line 39
    .line 40
    shr-long/2addr v1, p1

    .line 41
    long-to-int p1, v1

    .line 42
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iget-object v1, p0, LS0/e;->d:Lj0/D;

    .line 47
    .line 48
    iget-wide v1, v1, Lj0/D;->b:J

    .line 49
    .line 50
    const-wide v3, 0xffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    and-long/2addr v1, v3

    .line 56
    long-to-int v1, v1

    .line 57
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget-object v2, p0, LS0/e;->d:Lj0/D;

    .line 62
    .line 63
    iget-wide v2, v2, Lj0/D;->a:J

    .line 64
    .line 65
    invoke-static {v2, v3}, Lj0/B;->v(J)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {p0, v0, p1, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_0
    return-void
.end method

.method public final g(LV0/l;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, LS0/e;->b:LV0/l;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iput-object p1, p0, LS0/e;->b:LV0/l;

    .line 13
    .line 14
    iget p1, p1, LV0/l;->a:I

    .line 15
    .line 16
    or-int/lit8 v0, p1, 0x1

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne v0, p1, :cond_1

    .line 21
    .line 22
    move p1, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move p1, v1

    .line 25
    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, LS0/e;->b:LV0/l;

    .line 29
    .line 30
    iget p1, p1, LV0/l;->a:I

    .line 31
    .line 32
    or-int/lit8 v0, p1, 0x2

    .line 33
    .line 34
    if-ne v0, p1, :cond_2

    .line 35
    .line 36
    move v1, v2

    .line 37
    :cond_2
    invoke-virtual {p0, v1}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    .line 38
    .line 39
    .line 40
    :cond_3
    :goto_1
    return-void
.end method
