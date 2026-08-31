.class public final Lp0/g;
.super Lp0/B;
.source "SourceFile"


# instance fields
.field public b:Lj0/B;

.field public c:F

.field public d:Ljava/util/List;

.field public e:F

.field public f:F

.field public g:Lj0/B;

.field public h:I

.field public i:I

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Ll0/g;

.field public final r:Lj0/g;

.field public s:Lj0/g;

.field public final t:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lp0/g;->c:F

    .line 7
    .line 8
    sget v1, Lp0/F;->a:I

    .line 9
    .line 10
    sget-object v1, Ln5/s;->q:Ln5/s;

    .line 11
    .line 12
    iput-object v1, p0, Lp0/g;->d:Ljava/util/List;

    .line 13
    .line 14
    iput v0, p0, Lp0/g;->e:F

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, p0, Lp0/g;->h:I

    .line 18
    .line 19
    iput v1, p0, Lp0/g;->i:I

    .line 20
    .line 21
    const/high16 v1, 0x40800000    # 4.0f

    .line 22
    .line 23
    iput v1, p0, Lp0/g;->j:F

    .line 24
    .line 25
    iput v0, p0, Lp0/g;->l:F

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lp0/g;->n:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lp0/g;->o:Z

    .line 31
    .line 32
    invoke-static {}, Lj0/i;->a()Lj0/g;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lp0/g;->r:Lj0/g;

    .line 37
    .line 38
    iput-object v0, p0, Lp0/g;->s:Lj0/g;

    .line 39
    .line 40
    sget-object v0, Lm5/i;->r:Lm5/i;

    .line 41
    .line 42
    sget-object v1, Lp0/f;->r:Lp0/f;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lm5/a;->c(Lm5/i;LB5/a;)Lm5/h;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lp0/g;->t:Ljava/lang/Object;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a(Ll0/d;)V
    .locals 13

    .line 1
    iget-boolean v0, p0, Lp0/g;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lp0/g;->d:Ljava/util/List;

    .line 6
    .line 7
    iget-object v1, p0, Lp0/g;->r:Lj0/g;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lp0/b;->c(Ljava/util/List;Lj0/A;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lp0/g;->e()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-boolean v0, p0, Lp0/g;->p:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lp0/g;->e()V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Lp0/g;->n:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lp0/g;->p:Z

    .line 27
    .line 28
    iget-object v3, p0, Lp0/g;->b:Lj0/B;

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    iget-object v2, p0, Lp0/g;->s:Lj0/g;

    .line 33
    .line 34
    iget v4, p0, Lp0/g;->c:F

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/16 v6, 0x38

    .line 38
    .line 39
    move-object v1, p1

    .line 40
    invoke-static/range {v1 .. v6}, Ll0/d;->j(Ll0/d;Lj0/A;Lj0/B;FLl0/g;I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v1, p1

    .line 45
    :goto_1
    iget-object v9, p0, Lp0/g;->g:Lj0/B;

    .line 46
    .line 47
    if-eqz v9, :cond_5

    .line 48
    .line 49
    iget-object p1, p0, Lp0/g;->q:Ll0/g;

    .line 50
    .line 51
    iget-boolean v2, p0, Lp0/g;->o:Z

    .line 52
    .line 53
    if-nez v2, :cond_4

    .line 54
    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    move-object v11, p1

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    :goto_2
    new-instance v3, Ll0/g;

    .line 61
    .line 62
    iget v4, p0, Lp0/g;->f:F

    .line 63
    .line 64
    iget v5, p0, Lp0/g;->j:F

    .line 65
    .line 66
    iget v6, p0, Lp0/g;->h:I

    .line 67
    .line 68
    iget v7, p0, Lp0/g;->i:I

    .line 69
    .line 70
    const/16 v8, 0x10

    .line 71
    .line 72
    invoke-direct/range {v3 .. v8}, Ll0/g;-><init>(FFIII)V

    .line 73
    .line 74
    .line 75
    iput-object v3, p0, Lp0/g;->q:Ll0/g;

    .line 76
    .line 77
    iput-boolean v0, p0, Lp0/g;->o:Z

    .line 78
    .line 79
    move-object v11, v3

    .line 80
    :goto_3
    iget-object v8, p0, Lp0/g;->s:Lj0/g;

    .line 81
    .line 82
    iget v10, p0, Lp0/g;->e:F

    .line 83
    .line 84
    const/16 v12, 0x30

    .line 85
    .line 86
    move-object v7, v1

    .line 87
    invoke-static/range {v7 .. v12}, Ll0/d;->j(Ll0/d;Lj0/A;Lj0/B;FLl0/g;I)V

    .line 88
    .line 89
    .line 90
    :cond_5
    return-void
.end method

.method public final e()V
    .locals 8

    .line 1
    iget v0, p0, Lp0/g;->k:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v0, v0, v1

    .line 5
    .line 6
    iget-object v2, p0, Lp0/g;->r:Lj0/g;

    .line 7
    .line 8
    const/high16 v3, 0x3f800000    # 1.0f

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lp0/g;->l:F

    .line 13
    .line 14
    cmpg-float v0, v0, v3

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iput-object v2, p0, Lp0/g;->s:Lj0/g;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lp0/g;->s:Lj0/g;

    .line 22
    .line 23
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {}, Lj0/i;->a()Lj0/g;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lp0/g;->s:Lj0/g;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    iget-object v0, p0, Lp0/g;->s:Lj0/g;

    .line 38
    .line 39
    iget-object v0, v0, Lj0/g;->a:Landroid/graphics/Path;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/graphics/Path;->getFillType()Landroid/graphics/Path$FillType;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    if-ne v0, v5, :cond_2

    .line 49
    .line 50
    move v0, v6

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move v0, v4

    .line 53
    :goto_0
    iget-object v7, p0, Lp0/g;->s:Lj0/g;

    .line 54
    .line 55
    iget-object v7, v7, Lj0/g;->a:Landroid/graphics/Path;

    .line 56
    .line 57
    invoke-virtual {v7}, Landroid/graphics/Path;->rewind()V

    .line 58
    .line 59
    .line 60
    iget-object v7, p0, Lp0/g;->s:Lj0/g;

    .line 61
    .line 62
    iget-object v7, v7, Lj0/g;->a:Landroid/graphics/Path;

    .line 63
    .line 64
    if-ne v0, v6, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    sget-object v5, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 68
    .line 69
    :goto_1
    invoke-virtual {v7, v5}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 70
    .line 71
    .line 72
    :goto_2
    iget-object v0, p0, Lp0/g;->t:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Lj0/h;

    .line 79
    .line 80
    iget-object v5, v5, Lj0/h;->a:Landroid/graphics/PathMeasure;

    .line 81
    .line 82
    if-eqz v2, :cond_4

    .line 83
    .line 84
    iget-object v2, v2, Lj0/g;->a:Landroid/graphics/Path;

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    const/4 v2, 0x0

    .line 88
    :goto_3
    invoke-virtual {v5, v2, v4}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Lj0/h;

    .line 96
    .line 97
    iget-object v2, v2, Lj0/h;->a:Landroid/graphics/PathMeasure;

    .line 98
    .line 99
    invoke-virtual {v2}, Landroid/graphics/PathMeasure;->getLength()F

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    iget v4, p0, Lp0/g;->k:F

    .line 104
    .line 105
    iget v5, p0, Lp0/g;->m:F

    .line 106
    .line 107
    add-float/2addr v4, v5

    .line 108
    rem-float/2addr v4, v3

    .line 109
    mul-float/2addr v4, v2

    .line 110
    iget v6, p0, Lp0/g;->l:F

    .line 111
    .line 112
    add-float/2addr v6, v5

    .line 113
    rem-float/2addr v6, v3

    .line 114
    mul-float/2addr v6, v2

    .line 115
    cmpl-float v3, v4, v6

    .line 116
    .line 117
    if-lez v3, :cond_5

    .line 118
    .line 119
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Lj0/h;

    .line 124
    .line 125
    iget-object v5, p0, Lp0/g;->s:Lj0/g;

    .line 126
    .line 127
    invoke-virtual {v3, v4, v2, v5}, Lj0/h;->a(FFLj0/g;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Lj0/h;

    .line 135
    .line 136
    iget-object v2, p0, Lp0/g;->s:Lj0/g;

    .line 137
    .line 138
    invoke-virtual {v0, v1, v6, v2}, Lj0/h;->a(FFLj0/g;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_5
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Lj0/h;

    .line 147
    .line 148
    iget-object v1, p0, Lp0/g;->s:Lj0/g;

    .line 149
    .line 150
    invoke-virtual {v0, v4, v6, v1}, Lj0/h;->a(FFLj0/g;)V

    .line 151
    .line 152
    .line 153
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/g;->r:Lj0/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
