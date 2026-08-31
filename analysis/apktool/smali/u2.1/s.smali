.class public final Lu2/s;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/p;
.implements LB0/z;


# instance fields
.field public E:Lo0/b;

.field public F:Lc0/e;

.field public G:Lz0/j;

.field public H:F


# virtual methods
.method public final J(LB0/N;)V
    .locals 13

    .line 1
    iget-object v0, p1, LB0/N;->q:Ll0/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ll0/d;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {p0, v1, v2}, Lu2/s;->x0(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v5

    .line 11
    iget-object v7, p0, Lu2/s;->F:Lc0/e;

    .line 12
    .line 13
    sget-object v1, Lu2/w;->b:LE2/e;

    .line 14
    .line 15
    invoke-static {v5, v6}, Li0/e;->d(J)F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v1}, LD5/a;->G(F)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v5, v6}, Li0/e;->b(J)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v2}, LD5/a;->G(F)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->a(II)J

    .line 32
    .line 33
    .line 34
    move-result-wide v8

    .line 35
    invoke-interface {v0}, Ll0/d;->d()J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    invoke-static {v1, v2}, Li0/e;->d(J)F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-static {v3}, LD5/a;->G(F)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v1, v2}, Li0/e;->b(J)F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v1}, LD5/a;->G(F)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/P1;->a(II)J

    .line 56
    .line 57
    .line 58
    move-result-wide v10

    .line 59
    invoke-virtual {p1}, LB0/N;->getLayoutDirection()LW0/l;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    invoke-virtual/range {v7 .. v12}, Lc0/e;->a(JJLW0/l;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v1

    .line 67
    const/16 v3, 0x20

    .line 68
    .line 69
    shr-long v3, v1, v3

    .line 70
    .line 71
    long-to-int v3, v3

    .line 72
    const-wide v7, 0xffffffffL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    and-long/2addr v1, v7

    .line 78
    long-to-int v1, v1

    .line 79
    int-to-float v2, v3

    .line 80
    int-to-float v1, v1

    .line 81
    iget-object v3, v0, Ll0/b;->r:LB0/G0;

    .line 82
    .line 83
    iget-object v3, v3, LB0/G0;->r:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, Li1/a;

    .line 86
    .line 87
    invoke-virtual {v3, v2, v1}, Li1/a;->A(FF)V

    .line 88
    .line 89
    .line 90
    iget-object v3, p0, Lu2/s;->E:Lo0/b;

    .line 91
    .line 92
    iget v7, p0, Lu2/s;->H:F

    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    move-object v4, p1

    .line 96
    invoke-virtual/range {v3 .. v8}, Lo0/b;->g(LB0/N;JFLj0/j;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, v0, Ll0/b;->r:LB0/G0;

    .line 100
    .line 101
    iget-object p1, p1, LB0/G0;->r:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Li1/a;

    .line 104
    .line 105
    neg-float v0, v2

    .line 106
    neg-float v1, v1

    .line 107
    invoke-virtual {p1, v0, v1}, Li1/a;->A(FF)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, LB0/N;->a()V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final c(LB0/T;Lz0/B;J)Lz0/D;
    .locals 9

    .line 1
    invoke-static {p3, p4}, LW0/a;->f(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p3, p4}, LW0/a;->e(J)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v6, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {p3, p4}, LW0/a;->d(J)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-static {p3, p4}, LW0/a;->c(J)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    move v2, v6

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v2, 0x0

    .line 30
    :goto_0
    iget-object v3, p0, Lu2/s;->E:Lo0/b;

    .line 31
    .line 32
    invoke-virtual {v3}, Lo0/b;->h()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmp-long v5, v3, v7

    .line 42
    .line 43
    if-nez v5, :cond_3

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-static {p3, p4}, LW0/a;->h(J)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {p3, p4}, LW0/a;->g(J)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x0

    .line 56
    const/16 v3, 0xa

    .line 57
    .line 58
    move-wide v4, p3

    .line 59
    invoke-static/range {v0 .. v5}, LW0/a;->a(IIIIJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_2
    :goto_1
    move-wide v0, p3

    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_3
    if-eqz v2, :cond_5

    .line 69
    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    :cond_4
    invoke-static {p3, p4}, LW0/a;->h(J)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    int-to-float v0, v0

    .line 79
    invoke-static {p3, p4}, LW0/a;->g(J)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    :goto_2
    int-to-float v1, v1

    .line 84
    goto :goto_4

    .line 85
    :cond_5
    invoke-static {v3, v4}, Li0/e;->d(J)F

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-static {v3, v4}, Li0/e;->b(J)F

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_6

    .line 98
    .line 99
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_6

    .line 104
    .line 105
    sget-object v2, Lu2/w;->b:LE2/e;

    .line 106
    .line 107
    invoke-static {p3, p4}, LW0/a;->j(J)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    int-to-float v2, v2

    .line 112
    invoke-static {p3, p4}, LW0/a;->h(J)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    int-to-float v3, v3

    .line 117
    invoke-static {v0, v2, v3}, LD5/a;->p(FFF)F

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    goto :goto_3

    .line 122
    :cond_6
    invoke-static {p3, p4}, LW0/a;->j(J)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    int-to-float v0, v0

    .line 127
    :goto_3
    invoke-static {v1}, Ljava/lang/Float;->isInfinite(F)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-nez v2, :cond_7

    .line 132
    .line 133
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-nez v2, :cond_7

    .line 138
    .line 139
    sget-object v2, Lu2/w;->b:LE2/e;

    .line 140
    .line 141
    invoke-static {p3, p4}, LW0/a;->i(J)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    int-to-float v2, v2

    .line 146
    invoke-static {p3, p4}, LW0/a;->g(J)I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    int-to-float v3, v3

    .line 151
    invoke-static {v1, v2, v3}, LD5/a;->p(FFF)F

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    goto :goto_4

    .line 156
    :cond_7
    invoke-static {p3, p4}, LW0/a;->i(J)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    goto :goto_2

    .line 161
    :goto_4
    invoke-static {v0, v1}, Ln5/A;->g(FF)J

    .line 162
    .line 163
    .line 164
    move-result-wide v0

    .line 165
    invoke-virtual {p0, v0, v1}, Lu2/s;->x0(J)J

    .line 166
    .line 167
    .line 168
    move-result-wide v0

    .line 169
    invoke-static {v0, v1}, Li0/e;->d(J)F

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    invoke-static {v0, v1}, Li0/e;->b(J)F

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-static {v2}, LD5/a;->G(F)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    invoke-static {v1, p3, p4}, LW0/b;->f(IJ)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    invoke-static {v0}, LD5/a;->G(F)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    invoke-static {v0, p3, p4}, LW0/b;->e(IJ)I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    const/4 v2, 0x0

    .line 194
    const/16 v3, 0xa

    .line 195
    .line 196
    move v4, v1

    .line 197
    move v1, v0

    .line 198
    move v0, v4

    .line 199
    move-wide v4, p3

    .line 200
    invoke-static/range {v0 .. v5}, LW0/a;->a(IIIIJ)J

    .line 201
    .line 202
    .line 203
    move-result-wide v0

    .line 204
    :goto_5
    invoke-interface {p2, v0, v1}, Lz0/B;->a(J)Lz0/J;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iget v1, v0, Lz0/J;->q:I

    .line 209
    .line 210
    iget v2, v0, Lz0/J;->r:I

    .line 211
    .line 212
    new-instance v3, Lu2/p;

    .line 213
    .line 214
    invoke-direct {v3, v0, v6}, Lu2/p;-><init>(Lz0/J;I)V

    .line 215
    .line 216
    .line 217
    sget-object v0, Ln5/t;->q:Ln5/t;

    .line 218
    .line 219
    invoke-interface {p1, v1, v2, v0, v3}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    return-object v0
.end method

.method public final m0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final x0(J)J
    .locals 6

    .line 1
    invoke-static {p1, p2}, Li0/e;->e(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-wide/16 p1, 0x0

    .line 8
    .line 9
    return-wide p1

    .line 10
    :cond_0
    iget-object v0, p0, Lu2/s;->E:Lo0/b;

    .line 11
    .line 12
    invoke-virtual {v0}, Lo0/b;->h()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long v2, v0, v2

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    invoke-static {v0, v1}, Li0/e;->d(J)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {v2}, Ljava/lang/Float;->isInfinite(F)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {p1, p2}, Li0/e;->d(J)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    :goto_0
    invoke-static {v0, v1}, Li0/e;->b(J)F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p1, p2}, Li0/e;->b(J)F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    :goto_1
    invoke-static {v2, v0}, Ln5/A;->g(FF)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    iget-object v2, p0, Lu2/s;->G:Lz0/j;

    .line 73
    .line 74
    invoke-interface {v2, v0, v1, p1, p2}, Lz0/j;->a(JJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    sget v4, Lz0/N;->a:I

    .line 79
    .line 80
    const/16 v4, 0x20

    .line 81
    .line 82
    shr-long v4, v2, v4

    .line 83
    .line 84
    long-to-int v4, v4

    .line 85
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-static {v4}, Ljava/lang/Float;->isInfinite(F)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-nez v5, :cond_4

    .line 94
    .line 95
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-nez v4, :cond_4

    .line 100
    .line 101
    const-wide v4, 0xffffffffL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    and-long/2addr v4, v2

    .line 107
    long-to-int v4, v4

    .line 108
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-static {v4}, Ljava/lang/Float;->isInfinite(F)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-nez v5, :cond_4

    .line 117
    .line 118
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-nez v4, :cond_4

    .line 123
    .line 124
    invoke-static {v0, v1, v2, v3}, Lz0/O;->h(JJ)J

    .line 125
    .line 126
    .line 127
    move-result-wide p1

    .line 128
    :cond_4
    :goto_2
    return-wide p1
.end method
