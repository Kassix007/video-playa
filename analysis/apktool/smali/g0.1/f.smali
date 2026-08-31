.class public final Lg0/f;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/z;
.implements LB0/p;


# instance fields
.field public E:Lo0/b;

.field public F:Z

.field public G:Lc0/e;

.field public H:Lz0/j;

.field public I:F

.field public J:Lj0/j;


# direct methods
.method public static x0(J)Z
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, v0, v1}, Li0/e;->a(JJ)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide v0, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    and-long/2addr p0, v0

    .line 18
    long-to-int p0, p0

    .line 19
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    const p1, 0x7fffffff

    .line 28
    .line 29
    .line 30
    and-int/2addr p0, p1

    .line 31
    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 32
    .line 33
    if-ge p0, p1, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static y0(J)Z
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, v0, v1}, Li0/e;->a(JJ)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x20

    .line 13
    .line 14
    shr-long/2addr p0, v0

    .line 15
    long-to-int p0, p0

    .line 16
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    const p1, 0x7fffffff

    .line 25
    .line 26
    .line 27
    and-int/2addr p0, p1

    .line 28
    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 29
    .line 30
    if-ge p0, p1, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0
.end method


# virtual methods
.method public final J(LB0/N;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-object v8, v3, LB0/N;->q:Ll0/b;

    .line 6
    .line 7
    iget-object v0, v1, Lg0/f;->E:Lo0/b;

    .line 8
    .line 9
    invoke-virtual {v0}, Lo0/b;->h()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    invoke-static {v4, v5}, Lg0/f;->y0(J)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v2, 0x20

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    shr-long v6, v4, v2

    .line 22
    .line 23
    long-to-int v0, v6

    .line 24
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {v8}, Ll0/d;->d()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    shr-long/2addr v6, v2

    .line 34
    long-to-int v0, v6

    .line 35
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    :goto_0
    invoke-static {v4, v5}, Lg0/f;->x0(J)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    const-wide v9, 0xffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    if-eqz v6, :cond_1

    .line 49
    .line 50
    and-long/2addr v4, v9

    .line 51
    long-to-int v4, v4

    .line 52
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-interface {v8}, Ll0/d;->d()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    and-long/2addr v4, v9

    .line 62
    long-to-int v4, v4

    .line 63
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    :goto_1
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    int-to-long v5, v0

    .line 72
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    int-to-long v11, v0

    .line 77
    shl-long v4, v5, v2

    .line 78
    .line 79
    and-long v6, v11, v9

    .line 80
    .line 81
    or-long/2addr v4, v6

    .line 82
    invoke-interface {v8}, Ll0/d;->d()J

    .line 83
    .line 84
    .line 85
    move-result-wide v6

    .line 86
    shr-long/2addr v6, v2

    .line 87
    long-to-int v0, v6

    .line 88
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    const/4 v6, 0x0

    .line 93
    cmpg-float v0, v0, v6

    .line 94
    .line 95
    if-nez v0, :cond_2

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    invoke-interface {v8}, Ll0/d;->d()J

    .line 99
    .line 100
    .line 101
    move-result-wide v11

    .line 102
    and-long/2addr v11, v9

    .line 103
    long-to-int v0, v11

    .line 104
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    cmpg-float v0, v0, v6

    .line 109
    .line 110
    if-nez v0, :cond_3

    .line 111
    .line 112
    :goto_2
    const-wide/16 v4, 0x0

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_3
    iget-object v0, v1, Lg0/f;->H:Lz0/j;

    .line 116
    .line 117
    invoke-interface {v8}, Ll0/d;->d()J

    .line 118
    .line 119
    .line 120
    move-result-wide v6

    .line 121
    invoke-interface {v0, v4, v5, v6, v7}, Lz0/j;->a(JJ)J

    .line 122
    .line 123
    .line 124
    move-result-wide v6

    .line 125
    invoke-static {v4, v5, v6, v7}, Lz0/O;->h(JJ)J

    .line 126
    .line 127
    .line 128
    move-result-wide v4

    .line 129
    :goto_3
    iget-object v11, v1, Lg0/f;->G:Lc0/e;

    .line 130
    .line 131
    shr-long v6, v4, v2

    .line 132
    .line 133
    long-to-int v0, v6

    .line 134
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    and-long v6, v4, v9

    .line 143
    .line 144
    long-to-int v6, v6

    .line 145
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    int-to-long v12, v0

    .line 154
    shl-long/2addr v12, v2

    .line 155
    int-to-long v6, v6

    .line 156
    and-long/2addr v6, v9

    .line 157
    or-long/2addr v12, v6

    .line 158
    invoke-interface {v8}, Ll0/d;->d()J

    .line 159
    .line 160
    .line 161
    move-result-wide v6

    .line 162
    shr-long/2addr v6, v2

    .line 163
    long-to-int v0, v6

    .line 164
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-interface {v8}, Ll0/d;->d()J

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    and-long/2addr v6, v9

    .line 177
    long-to-int v6, v6

    .line 178
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    int-to-long v14, v0

    .line 187
    shl-long/2addr v14, v2

    .line 188
    int-to-long v6, v6

    .line 189
    and-long/2addr v6, v9

    .line 190
    or-long/2addr v14, v6

    .line 191
    invoke-virtual {v3}, LB0/N;->getLayoutDirection()LW0/l;

    .line 192
    .line 193
    .line 194
    move-result-object v16

    .line 195
    invoke-virtual/range {v11 .. v16}, Lc0/e;->a(JJLW0/l;)J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    shr-long v11, v6, v2

    .line 200
    .line 201
    long-to-int v0, v11

    .line 202
    int-to-float v11, v0

    .line 203
    and-long/2addr v6, v9

    .line 204
    long-to-int v0, v6

    .line 205
    int-to-float v9, v0

    .line 206
    iget-object v0, v8, Ll0/b;->r:LB0/G0;

    .line 207
    .line 208
    iget-object v0, v0, LB0/G0;->r:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v0, Li1/a;

    .line 211
    .line 212
    invoke-virtual {v0, v11, v9}, Li1/a;->A(FF)V

    .line 213
    .line 214
    .line 215
    :try_start_0
    iget-object v2, v1, Lg0/f;->E:Lo0/b;

    .line 216
    .line 217
    iget v6, v1, Lg0/f;->I:F

    .line 218
    .line 219
    iget-object v7, v1, Lg0/f;->J:Lj0/j;

    .line 220
    .line 221
    invoke-virtual/range {v2 .. v7}, Lo0/b;->g(LB0/N;JFLj0/j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    .line 223
    .line 224
    iget-object v0, v8, Ll0/b;->r:LB0/G0;

    .line 225
    .line 226
    iget-object v0, v0, LB0/G0;->r:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Li1/a;

    .line 229
    .line 230
    neg-float v2, v11

    .line 231
    neg-float v3, v9

    .line 232
    invoke-virtual {v0, v2, v3}, Li1/a;->A(FF)V

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {p1 .. p1}, LB0/N;->a()V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :catchall_0
    move-exception v0

    .line 240
    iget-object v2, v8, Ll0/b;->r:LB0/G0;

    .line 241
    .line 242
    iget-object v2, v2, LB0/G0;->r:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v2, Li1/a;

    .line 245
    .line 246
    neg-float v3, v11

    .line 247
    neg-float v4, v9

    .line 248
    invoke-virtual {v2, v3, v4}, Li1/a;->A(FF)V

    .line 249
    .line 250
    .line 251
    throw v0
.end method

.method public final c(LB0/T;Lz0/B;J)Lz0/D;
    .locals 13

    .line 1
    move-wide/from16 v4, p3

    .line 2
    .line 3
    invoke-static {v4, v5}, LW0/a;->d(J)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v4, v5}, LW0/a;->c(J)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move v0, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    invoke-static {v4, v5}, LW0/a;->f(J)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-static {v4, v5}, LW0/a;->e(J)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    move v1, v2

    .line 33
    :cond_1
    iget-boolean v2, p0, Lg0/f;->F:Z

    .line 34
    .line 35
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    iget-object v2, p0, Lg0/f;->E:Lo0/b;

    .line 43
    .line 44
    invoke-virtual {v2}, Lo0/b;->h()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    cmp-long v2, v2, v6

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    if-nez v0, :cond_b

    .line 54
    .line 55
    :goto_1
    if-eqz v1, :cond_3

    .line 56
    .line 57
    goto/16 :goto_8

    .line 58
    .line 59
    :cond_3
    iget-object v0, p0, Lg0/f;->E:Lo0/b;

    .line 60
    .line 61
    invoke-virtual {v0}, Lo0/b;->h()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    invoke-static {v0, v1}, Lg0/f;->y0(J)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    const/16 v3, 0x20

    .line 70
    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    shr-long v8, v0, v3

    .line 74
    .line 75
    long-to-int v2, v8

    .line 76
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    invoke-static {v4, v5}, LW0/a;->j(J)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :goto_2
    invoke-static {v0, v1}, Lg0/f;->x0(J)Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    const-wide v9, 0xffffffffL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    if-eqz v8, :cond_5

    .line 99
    .line 100
    and-long/2addr v0, v9

    .line 101
    long-to-int v0, v0

    .line 102
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    goto :goto_3

    .line 111
    :cond_5
    invoke-static {v4, v5}, LW0/a;->i(J)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    :goto_3
    invoke-static {v2, v4, v5}, LW0/b;->f(IJ)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-static {v0, v4, v5}, LW0/b;->e(IJ)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    int-to-float v1, v1

    .line 124
    int-to-float v0, v0

    .line 125
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    int-to-long v1, v1

    .line 130
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    int-to-long v11, v0

    .line 135
    shl-long v0, v1, v3

    .line 136
    .line 137
    and-long/2addr v11, v9

    .line 138
    or-long/2addr v0, v11

    .line 139
    iget-boolean v2, p0, Lg0/f;->F:Z

    .line 140
    .line 141
    if-eqz v2, :cond_a

    .line 142
    .line 143
    iget-object v2, p0, Lg0/f;->E:Lo0/b;

    .line 144
    .line 145
    invoke-virtual {v2}, Lo0/b;->h()J

    .line 146
    .line 147
    .line 148
    move-result-wide v11

    .line 149
    cmp-long v2, v11, v6

    .line 150
    .line 151
    if-eqz v2, :cond_a

    .line 152
    .line 153
    iget-object v2, p0, Lg0/f;->E:Lo0/b;

    .line 154
    .line 155
    invoke-virtual {v2}, Lo0/b;->h()J

    .line 156
    .line 157
    .line 158
    move-result-wide v6

    .line 159
    invoke-static {v6, v7}, Lg0/f;->y0(J)Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-nez v2, :cond_6

    .line 164
    .line 165
    shr-long v6, v0, v3

    .line 166
    .line 167
    long-to-int v2, v6

    .line 168
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    goto :goto_4

    .line 173
    :cond_6
    iget-object v2, p0, Lg0/f;->E:Lo0/b;

    .line 174
    .line 175
    invoke-virtual {v2}, Lo0/b;->h()J

    .line 176
    .line 177
    .line 178
    move-result-wide v6

    .line 179
    shr-long/2addr v6, v3

    .line 180
    long-to-int v2, v6

    .line 181
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    :goto_4
    iget-object v6, p0, Lg0/f;->E:Lo0/b;

    .line 186
    .line 187
    invoke-virtual {v6}, Lo0/b;->h()J

    .line 188
    .line 189
    .line 190
    move-result-wide v6

    .line 191
    invoke-static {v6, v7}, Lg0/f;->x0(J)Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-nez v6, :cond_7

    .line 196
    .line 197
    and-long v6, v0, v9

    .line 198
    .line 199
    long-to-int v6, v6

    .line 200
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    goto :goto_5

    .line 205
    :cond_7
    iget-object v6, p0, Lg0/f;->E:Lo0/b;

    .line 206
    .line 207
    invoke-virtual {v6}, Lo0/b;->h()J

    .line 208
    .line 209
    .line 210
    move-result-wide v6

    .line 211
    and-long/2addr v6, v9

    .line 212
    long-to-int v6, v6

    .line 213
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    :goto_5
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    int-to-long v7, v2

    .line 222
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    int-to-long v11, v2

    .line 227
    shl-long v6, v7, v3

    .line 228
    .line 229
    and-long/2addr v11, v9

    .line 230
    or-long/2addr v6, v11

    .line 231
    shr-long v11, v0, v3

    .line 232
    .line 233
    long-to-int v2, v11

    .line 234
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    const/4 v8, 0x0

    .line 239
    cmpg-float v2, v2, v8

    .line 240
    .line 241
    if-nez v2, :cond_8

    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_8
    and-long v11, v0, v9

    .line 245
    .line 246
    long-to-int v2, v11

    .line 247
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    cmpg-float v2, v2, v8

    .line 252
    .line 253
    if-nez v2, :cond_9

    .line 254
    .line 255
    :goto_6
    const-wide/16 v0, 0x0

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_9
    iget-object v2, p0, Lg0/f;->H:Lz0/j;

    .line 259
    .line 260
    invoke-interface {v2, v6, v7, v0, v1}, Lz0/j;->a(JJ)J

    .line 261
    .line 262
    .line 263
    move-result-wide v0

    .line 264
    invoke-static {v6, v7, v0, v1}, Lz0/O;->h(JJ)J

    .line 265
    .line 266
    .line 267
    move-result-wide v0

    .line 268
    :cond_a
    :goto_7
    shr-long v2, v0, v3

    .line 269
    .line 270
    long-to-int v2, v2

    .line 271
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    invoke-static {v2, v4, v5}, LW0/b;->f(IJ)I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    and-long/2addr v0, v9

    .line 284
    long-to-int v0, v0

    .line 285
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    invoke-static {v0, v4, v5}, LW0/b;->e(IJ)I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    move v0, v2

    .line 298
    const/4 v2, 0x0

    .line 299
    const/16 v3, 0xa

    .line 300
    .line 301
    invoke-static/range {v0 .. v5}, LW0/a;->a(IIIIJ)J

    .line 302
    .line 303
    .line 304
    move-result-wide v0

    .line 305
    goto :goto_9

    .line 306
    :cond_b
    :goto_8
    invoke-static/range {p3 .. p4}, LW0/a;->h(J)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    invoke-static/range {p3 .. p4}, LW0/a;->g(J)I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    const/4 v2, 0x0

    .line 315
    const/16 v3, 0xa

    .line 316
    .line 317
    move-wide/from16 v4, p3

    .line 318
    .line 319
    invoke-static/range {v0 .. v5}, LW0/a;->a(IIIIJ)J

    .line 320
    .line 321
    .line 322
    move-result-wide v0

    .line 323
    :goto_9
    invoke-interface {p2, v0, v1}, Lz0/B;->a(J)Lz0/J;

    .line 324
    .line 325
    .line 326
    move-result-object p2

    .line 327
    iget v0, p2, Lz0/J;->q:I

    .line 328
    .line 329
    iget v1, p2, Lz0/J;->r:I

    .line 330
    .line 331
    new-instance v2, LA/z;

    .line 332
    .line 333
    const/4 v3, 0x5

    .line 334
    invoke-direct {v2, p2, v3}, LA/z;-><init>(Lz0/J;I)V

    .line 335
    .line 336
    .line 337
    sget-object p2, Ln5/t;->q:Ln5/t;

    .line 338
    .line 339
    invoke-interface {p1, v0, v1, p2, v2}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    return-object p1
.end method

.method public final m0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PainterModifier(painter="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lg0/f;->E:Lo0/b;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", sizeToIntrinsics="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lg0/f;->F:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", alignment="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lg0/f;->G:Lc0/e;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", alpha="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Lg0/f;->I:F

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", colorFilter="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lg0/f;->J:Lj0/j;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const/16 v1, 0x29

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method
