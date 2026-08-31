.class public final Lu/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/h;


# instance fields
.field public final a:LE/c0;

.field public final b:LZ/m;

.field public final c:Ljava/lang/Object;

.field public final d:Lu/q;

.field public final e:Lu/q;

.field public final f:Lu/q;

.field public final g:Ljava/lang/Object;

.field public final h:J


# direct methods
.method public constructor <init>(Lu/v;LZ/m;Ljava/lang/Object;Lu/q;)V
    .locals 10

    .line 1
    new-instance v0, LE/c0;

    .line 2
    .line 3
    iget-object p1, p1, Lu/v;->a:Li3/a;

    .line 4
    .line 5
    invoke-direct {v0, p1}, LE/c0;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lu/u;->a:LE/c0;

    .line 12
    .line 13
    iput-object p2, p0, Lu/u;->b:LZ/m;

    .line 14
    .line 15
    iput-object p3, p0, Lu/u;->c:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object p1, p2, LZ/m;->s:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, LB5/c;

    .line 20
    .line 21
    invoke-interface {p1, p3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lu/q;

    .line 26
    .line 27
    iput-object p1, p0, Lu/u;->d:Lu/q;

    .line 28
    .line 29
    invoke-static {p4}, Lu/d;->j(Lu/q;)Lu/q;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    iput-object p3, p0, Lu/u;->e:Lu/q;

    .line 34
    .line 35
    iget-object p2, p2, LZ/m;->r:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p2, LB5/c;

    .line 38
    .line 39
    invoke-virtual {v0, p1, p4}, LE/c0;->t(Lu/q;Lu/q;)Lu/q;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-interface {p2, p3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iput-object p2, p0, Lu/u;->g:Ljava/lang/Object;

    .line 48
    .line 49
    iget-object p2, v0, LE/c0;->s:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, Lu/q;

    .line 52
    .line 53
    if-nez p2, :cond_0

    .line 54
    .line 55
    invoke-virtual {p1}, Lu/q;->c()Lu/q;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iput-object p2, v0, LE/c0;->s:Ljava/lang/Object;

    .line 60
    .line 61
    :cond_0
    iget-object p2, v0, LE/c0;->s:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p2, Lu/q;

    .line 64
    .line 65
    if-eqz p2, :cond_3

    .line 66
    .line 67
    invoke-virtual {p2}, Lu/q;->b()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    const/4 p3, 0x0

    .line 72
    const-wide/16 v1, 0x0

    .line 73
    .line 74
    move v3, p3

    .line 75
    :goto_0
    if-ge v3, p2, :cond_1

    .line 76
    .line 77
    iget-object v4, v0, LE/c0;->q:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v4, Li3/a;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p4, v3}, Lu/q;->a(I)F

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    iget-object v4, v4, Li3/a;->r:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Le4/e;

    .line 91
    .line 92
    invoke-virtual {v4, v5}, Le4/e;->b(F)D

    .line 93
    .line 94
    .line 95
    move-result-wide v4

    .line 96
    sget v6, Lt/H;->a:F

    .line 97
    .line 98
    float-to-double v6, v6

    .line 99
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 100
    .line 101
    sub-double/2addr v6, v8

    .line 102
    div-double/2addr v4, v6

    .line 103
    invoke-static {v4, v5}, Ljava/lang/Math;->exp(D)D

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    const-wide v6, 0x408f400000000000L    # 1000.0

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    mul-double/2addr v4, v6

    .line 113
    double-to-long v4, v4

    .line 114
    const-wide/32 v6, 0xf4240

    .line 115
    .line 116
    .line 117
    mul-long/2addr v4, v6

    .line 118
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 119
    .line 120
    .line 121
    move-result-wide v1

    .line 122
    add-int/lit8 v3, v3, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    iput-wide v1, p0, Lu/u;->h:J

    .line 126
    .line 127
    iget-object p1, p0, Lu/u;->a:LE/c0;

    .line 128
    .line 129
    iget-object p2, p0, Lu/u;->d:Lu/q;

    .line 130
    .line 131
    invoke-virtual {p1, v1, v2, p2, p4}, LE/c0;->u(JLu/q;Lu/q;)Lu/q;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {p1}, Lu/d;->j(Lu/q;)Lu/q;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iput-object p1, p0, Lu/u;->f:Lu/q;

    .line 140
    .line 141
    invoke-virtual {p1}, Lu/q;->b()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    :goto_1
    if-ge p3, p1, :cond_2

    .line 146
    .line 147
    iget-object p2, p0, Lu/u;->f:Lu/q;

    .line 148
    .line 149
    invoke-virtual {p2, p3}, Lu/q;->a(I)F

    .line 150
    .line 151
    .line 152
    move-result p4

    .line 153
    iget-object v0, p0, Lu/u;->a:LE/c0;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Lu/u;->a:LE/c0;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    const/4 v0, 0x0

    .line 164
    const/high16 v1, -0x80000000

    .line 165
    .line 166
    invoke-static {p4, v1, v0}, LD5/a;->p(FFF)F

    .line 167
    .line 168
    .line 169
    move-result p4

    .line 170
    invoke-virtual {p2, p3, p4}, Lu/q;->e(IF)V

    .line 171
    .line 172
    .line 173
    add-int/lit8 p3, p3, 0x1

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_2
    return-void

    .line 177
    :cond_3
    const-string p1, "velocityVector"

    .line 178
    .line 179
    invoke-static {p1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const/4 p1, 0x0

    .line 183
    throw p1
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final b(J)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p0 .. p2}, Lu/h;->g(J)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_6

    .line 8
    .line 9
    iget-object v1, v0, Lu/u;->b:LZ/m;

    .line 10
    .line 11
    iget-object v1, v1, LZ/m;->r:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, LB5/c;

    .line 14
    .line 15
    iget-object v2, v0, Lu/u;->a:LE/c0;

    .line 16
    .line 17
    iget-object v3, v2, LE/c0;->r:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lu/q;

    .line 20
    .line 21
    iget-object v4, v0, Lu/u;->d:Lu/q;

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {v4}, Lu/q;->c()Lu/q;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iput-object v3, v2, LE/c0;->r:Ljava/lang/Object;

    .line 30
    .line 31
    :cond_0
    iget-object v3, v2, LE/c0;->r:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Lu/q;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const-string v6, "valueVector"

    .line 37
    .line 38
    if-eqz v3, :cond_5

    .line 39
    .line 40
    invoke-virtual {v3}, Lu/q;->b()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/4 v7, 0x0

    .line 45
    :goto_0
    if-ge v7, v3, :cond_3

    .line 46
    .line 47
    iget-object v8, v2, LE/c0;->r:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v8, Lu/q;

    .line 50
    .line 51
    if-eqz v8, :cond_2

    .line 52
    .line 53
    iget-object v9, v2, LE/c0;->q:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v9, Li3/a;

    .line 56
    .line 57
    invoke-virtual {v4, v7}, Lu/q;->a(I)F

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    iget-object v11, v0, Lu/u;->e:Lu/q;

    .line 62
    .line 63
    invoke-virtual {v11, v7}, Lu/q;->a(I)F

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    const-wide/32 v12, 0xf4240

    .line 68
    .line 69
    .line 70
    div-long v12, p1, v12

    .line 71
    .line 72
    iget-object v9, v9, Li3/a;->r:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v9, Le4/e;

    .line 75
    .line 76
    invoke-virtual {v9, v11}, Le4/e;->a(F)Lt/G;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    iget-wide v14, v9, Lt/G;->c:J

    .line 81
    .line 82
    const-wide/16 v16, 0x0

    .line 83
    .line 84
    cmp-long v11, v14, v16

    .line 85
    .line 86
    if-lez v11, :cond_1

    .line 87
    .line 88
    long-to-float v11, v12

    .line 89
    long-to-float v12, v14

    .line 90
    div-float/2addr v11, v12

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    const/high16 v11, 0x3f800000    # 1.0f

    .line 93
    .line 94
    :goto_1
    iget v12, v9, Lt/G;->b:F

    .line 95
    .line 96
    iget v9, v9, Lt/G;->a:F

    .line 97
    .line 98
    invoke-static {v9}, Ljava/lang/Math;->signum(F)F

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    mul-float/2addr v9, v12

    .line 103
    invoke-static {v11}, Lt/b;->a(F)Lt/a;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    iget v11, v11, Lt/a;->a:F

    .line 108
    .line 109
    mul-float/2addr v9, v11

    .line 110
    add-float/2addr v9, v10

    .line 111
    invoke-virtual {v8, v7, v9}, Lu/q;->e(IF)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v7, v7, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    invoke-static {v6}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v5

    .line 121
    :cond_3
    iget-object v2, v2, LE/c0;->r:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v2, Lu/q;

    .line 124
    .line 125
    if-eqz v2, :cond_4

    .line 126
    .line 127
    invoke-interface {v1, v2}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    return-object v1

    .line 132
    :cond_4
    invoke-static {v6}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v5

    .line 136
    :cond_5
    invoke-static {v6}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v5

    .line 140
    :cond_6
    iget-object v1, v0, Lu/u;->g:Ljava/lang/Object;

    .line 141
    .line 142
    return-object v1
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lu/u;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()LZ/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lu/u;->b:LZ/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu/u;->g:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(J)Lu/q;
    .locals 3

    .line 1
    invoke-interface {p0, p1, p2}, Lu/h;->g(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lu/u;->d:Lu/q;

    .line 8
    .line 9
    iget-object v1, p0, Lu/u;->e:Lu/q;

    .line 10
    .line 11
    iget-object v2, p0, Lu/u;->a:LE/c0;

    .line 12
    .line 13
    invoke-virtual {v2, p1, p2, v0, v1}, LE/c0;->u(JLu/q;Lu/q;)Lu/q;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object p1, p0, Lu/u;->f:Lu/q;

    .line 19
    .line 20
    return-object p1
.end method
