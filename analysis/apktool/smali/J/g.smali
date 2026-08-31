.class public final LJ/g;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/z;
.implements LB0/p;
.implements LB0/A0;


# instance fields
.field public E:Ljava/lang/String;

.field public F:LL0/F;

.field public G:LO0/d;

.field public H:I

.field public I:Z

.field public J:I

.field public K:I

.field public L:Ljava/util/HashMap;

.field public M:LJ/d;

.field public N:LJ/f;

.field public O:LJ/e;


# virtual methods
.method public final A(LI0/i;)V
    .locals 6

    .line 1
    iget-object v0, p0, LJ/g;->N:LJ/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LJ/f;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, LJ/f;-><init>(LJ/g;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LJ/g;->N:LJ/f;

    .line 12
    .line 13
    :cond_0
    new-instance v1, LL0/d;

    .line 14
    .line 15
    iget-object v2, p0, LJ/g;->E:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v1, v2}, LL0/d;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v2, LI0/r;->a:[LH5/k;

    .line 21
    .line 22
    sget-object v2, LI0/p;->y:LI0/s;

    .line 23
    .line 24
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p1, v2, v1}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, LJ/g;->O:LJ/e;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-boolean v2, v1, LJ/e;->c:Z

    .line 36
    .line 37
    sget-object v3, LI0/p;->A:LI0/s;

    .line 38
    .line 39
    sget-object v4, LI0/r;->a:[LH5/k;

    .line 40
    .line 41
    const/16 v5, 0xf

    .line 42
    .line 43
    aget-object v5, v4, v5

    .line 44
    .line 45
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v3, p1, v2}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, LL0/d;

    .line 53
    .line 54
    iget-object v1, v1, LJ/e;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v2, v1}, LL0/d;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v1, LI0/p;->z:LI0/s;

    .line 60
    .line 61
    const/16 v3, 0xe

    .line 62
    .line 63
    aget-object v3, v4, v3

    .line 64
    .line 65
    invoke-virtual {v1, p1, v2}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    new-instance v1, LJ/f;

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    invoke-direct {v1, p0, v2}, LJ/f;-><init>(LJ/g;I)V

    .line 72
    .line 73
    .line 74
    sget-object v2, LI0/h;->k:LI0/s;

    .line 75
    .line 76
    new-instance v3, LI0/a;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-direct {v3, v4, v1}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v2, v3}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v1, LJ/f;

    .line 86
    .line 87
    const/4 v2, 0x2

    .line 88
    invoke-direct {v1, p0, v2}, LJ/f;-><init>(LJ/g;I)V

    .line 89
    .line 90
    .line 91
    sget-object v2, LI0/h;->l:LI0/s;

    .line 92
    .line 93
    new-instance v3, LI0/a;

    .line 94
    .line 95
    invoke-direct {v3, v4, v1}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v2, v3}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v1, LA0/d;

    .line 102
    .line 103
    const/4 v2, 0x3

    .line 104
    invoke-direct {v1, v2, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object v2, LI0/h;->m:LI0/s;

    .line 108
    .line 109
    new-instance v3, LI0/a;

    .line 110
    .line 111
    invoke-direct {v3, v4, v1}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v2, v3}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    sget-object v1, LI0/h;->a:LI0/s;

    .line 118
    .line 119
    new-instance v2, LI0/a;

    .line 120
    .line 121
    invoke-direct {v2, v4, v0}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v1, v2}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final J(LB0/N;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-boolean v0, v1, Lc0/l;->D:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    iget-object v0, v1, LJ/g;->O:LJ/e;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-boolean v2, v0, LJ/e;->c:Z

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, v0, LJ/e;->d:LJ/d;

    .line 22
    .line 23
    if-nez v0, :cond_3

    .line 24
    .line 25
    :cond_2
    invoke-virtual {v1}, LJ/g;->x0()LJ/d;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_3
    iget-object v2, v0, LJ/d;->j:LL0/a;

    .line 30
    .line 31
    if-eqz v2, :cond_d

    .line 32
    .line 33
    move-object/from16 v3, p1

    .line 34
    .line 35
    iget-object v3, v3, LB0/N;->q:Ll0/b;

    .line 36
    .line 37
    iget-object v3, v3, Ll0/b;->r:LB0/G0;

    .line 38
    .line 39
    invoke-virtual {v3}, LB0/G0;->t()Lj0/m;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-boolean v3, v0, LJ/d;->k:Z

    .line 44
    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    iget-wide v5, v0, LJ/d;->l:J

    .line 48
    .line 49
    const/16 v0, 0x20

    .line 50
    .line 51
    shr-long v7, v5, v0

    .line 52
    .line 53
    long-to-int v0, v7

    .line 54
    int-to-float v7, v0

    .line 55
    const-wide v8, 0xffffffffL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    and-long/2addr v5, v8

    .line 61
    long-to-int v0, v5

    .line 62
    int-to-float v8, v0

    .line 63
    invoke-interface {v4}, Lj0/m;->k()V

    .line 64
    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v9, 0x1

    .line 68
    const/4 v5, 0x0

    .line 69
    invoke-interface/range {v4 .. v9}, Lj0/m;->g(FFFFI)V

    .line 70
    .line 71
    .line 72
    :cond_4
    :try_start_0
    iget-object v0, v1, LJ/g;->F:LL0/F;

    .line 73
    .line 74
    iget-object v0, v0, LL0/F;->a:LL0/y;

    .line 75
    .line 76
    iget-object v5, v0, LL0/y;->m:LV0/l;

    .line 77
    .line 78
    if-nez v5, :cond_5

    .line 79
    .line 80
    sget-object v5, LV0/l;->b:LV0/l;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    goto/16 :goto_5

    .line 85
    .line 86
    :cond_5
    :goto_1
    iget-object v6, v0, LL0/y;->n:Lj0/D;

    .line 87
    .line 88
    if-nez v6, :cond_6

    .line 89
    .line 90
    sget-object v6, Lj0/D;->d:Lj0/D;

    .line 91
    .line 92
    :cond_6
    iget-object v7, v0, LL0/y;->o:Ll0/c;

    .line 93
    .line 94
    if-nez v7, :cond_7

    .line 95
    .line 96
    sget-object v7, Ll0/f;->b:Ll0/f;

    .line 97
    .line 98
    :cond_7
    iget-object v0, v0, LL0/y;->a:LV0/p;

    .line 99
    .line 100
    invoke-interface {v0}, LV0/p;->b()Lj0/B;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eqz v0, :cond_8

    .line 105
    .line 106
    iget-object v8, v1, LJ/g;->F:LL0/F;

    .line 107
    .line 108
    iget-object v8, v8, LL0/F;->a:LL0/y;

    .line 109
    .line 110
    iget-object v8, v8, LL0/y;->a:LV0/p;

    .line 111
    .line 112
    invoke-interface {v8}, LV0/p;->c()F

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    iget-object v9, v2, LL0/a;->a:LS0/d;

    .line 117
    .line 118
    iget-object v9, v9, LS0/d;->g:LS0/e;

    .line 119
    .line 120
    iget v10, v9, LS0/e;->c:I

    .line 121
    .line 122
    invoke-virtual {v2}, LL0/a;->c()F

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    invoke-virtual {v2}, LL0/a;->b()F

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    int-to-long v13, v11

    .line 135
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    int-to-long v11, v11

    .line 140
    const/16 v15, 0x20

    .line 141
    .line 142
    shl-long/2addr v13, v15

    .line 143
    const-wide v15, 0xffffffffL

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    and-long/2addr v11, v15

    .line 149
    or-long/2addr v11, v13

    .line 150
    invoke-virtual {v9, v0, v11, v12, v8}, LS0/e;->c(Lj0/B;JF)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9, v6}, LS0/e;->f(Lj0/D;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v9, v5}, LS0/e;->g(LV0/l;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v9, v7}, LS0/e;->e(Ll0/c;)V

    .line 160
    .line 161
    .line 162
    const/4 v0, 0x3

    .line 163
    invoke-virtual {v9, v0}, LS0/e;->b(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v4}, LL0/a;->d(Lj0/m;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v10}, LS0/e;->b(I)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_8
    sget-wide v8, Lj0/o;->g:J

    .line 174
    .line 175
    const-wide/16 v10, 0x10

    .line 176
    .line 177
    cmp-long v0, v8, v10

    .line 178
    .line 179
    if-eqz v0, :cond_9

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_9
    iget-object v0, v1, LJ/g;->F:LL0/F;

    .line 183
    .line 184
    invoke-virtual {v0}, LL0/F;->b()J

    .line 185
    .line 186
    .line 187
    move-result-wide v8

    .line 188
    cmp-long v0, v8, v10

    .line 189
    .line 190
    if-eqz v0, :cond_a

    .line 191
    .line 192
    iget-object v0, v1, LJ/g;->F:LL0/F;

    .line 193
    .line 194
    invoke-virtual {v0}, LL0/F;->b()J

    .line 195
    .line 196
    .line 197
    move-result-wide v8

    .line 198
    goto :goto_2

    .line 199
    :cond_a
    sget-wide v8, Lj0/o;->b:J

    .line 200
    .line 201
    :goto_2
    iget-object v0, v2, LL0/a;->a:LS0/d;

    .line 202
    .line 203
    iget-object v0, v0, LS0/d;->g:LS0/e;

    .line 204
    .line 205
    iget v10, v0, LS0/e;->c:I

    .line 206
    .line 207
    invoke-virtual {v0, v8, v9}, LS0/e;->d(J)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v6}, LS0/e;->f(Lj0/D;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v5}, LS0/e;->g(LV0/l;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v7}, LS0/e;->e(Ll0/c;)V

    .line 217
    .line 218
    .line 219
    const/4 v5, 0x3

    .line 220
    invoke-virtual {v0, v5}, LS0/e;->b(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v4}, LL0/a;->d(Lj0/m;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v10}, LS0/e;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    .line 228
    .line 229
    :goto_3
    if-eqz v3, :cond_b

    .line 230
    .line 231
    invoke-interface {v4}, Lj0/m;->i()V

    .line 232
    .line 233
    .line 234
    :cond_b
    :goto_4
    return-void

    .line 235
    :goto_5
    if-eqz v3, :cond_c

    .line 236
    .line 237
    invoke-interface {v4}, Lj0/m;->i()V

    .line 238
    .line 239
    .line 240
    :cond_c
    throw v0

    .line 241
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v2, "no paragraph (layoutCache="

    .line 244
    .line 245
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    iget-object v2, v1, LJ/g;->M:LJ/d;

    .line 249
    .line 250
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string v2, ", textSubstitution="

    .line 254
    .line 255
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    iget-object v2, v1, LJ/g;->O:LJ/e;

    .line 259
    .line 260
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const/16 v2, 0x29

    .line 264
    .line 265
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v0}, Lz/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 273
    .line 274
    .line 275
    new-instance v0, LC2/e;

    .line 276
    .line 277
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 278
    .line 279
    .line 280
    throw v0
.end method

.method public final c(LB0/T;Lz0/B;J)Lz0/D;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LJ/g;->O:LJ/e;

    .line 6
    .line 7
    if-eqz v2, :cond_1

    .line 8
    .line 9
    iget-boolean v3, v2, LJ/e;->c:Z

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-object v2, v2, LJ/e;->d:LJ/d;

    .line 18
    .line 19
    if-nez v2, :cond_2

    .line 20
    .line 21
    :cond_1
    invoke-virtual {v0}, LJ/g;->x0()LJ/d;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :cond_2
    invoke-virtual {v2, v1}, LJ/d;->b(LW0/c;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget v4, v2, LJ/d;->g:I

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-le v4, v5, :cond_a

    .line 36
    .line 37
    iget-object v4, v2, LJ/d;->b:LL0/F;

    .line 38
    .line 39
    iget-object v6, v2, LJ/d;->m:LJ/b;

    .line 40
    .line 41
    iget-object v7, v2, LJ/d;->i:LW0/c;

    .line 42
    .line 43
    invoke-static {v7}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v8, v2, LJ/d;->c:LO0/d;

    .line 47
    .line 48
    if-eqz v6, :cond_3

    .line 49
    .line 50
    iget-object v9, v6, LJ/b;->a:LW0/l;

    .line 51
    .line 52
    if-ne v3, v9, :cond_3

    .line 53
    .line 54
    invoke-static {v4, v3}, LE3/h;->N(LL0/F;LW0/l;)LL0/F;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    iget-object v10, v6, LJ/b;->b:LL0/F;

    .line 59
    .line 60
    invoke-virtual {v9, v10}, LL0/F;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-eqz v9, :cond_3

    .line 65
    .line 66
    invoke-interface {v7}, LW0/c;->b()F

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    iget-object v10, v6, LJ/b;->c:LW0/d;

    .line 71
    .line 72
    iget v10, v10, LW0/d;->q:F

    .line 73
    .line 74
    cmpg-float v9, v9, v10

    .line 75
    .line 76
    if-nez v9, :cond_3

    .line 77
    .line 78
    iget-object v9, v6, LJ/b;->d:LO0/d;

    .line 79
    .line 80
    if-ne v8, v9, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    sget-object v6, LJ/b;->h:LJ/b;

    .line 84
    .line 85
    if-eqz v6, :cond_4

    .line 86
    .line 87
    iget-object v9, v6, LJ/b;->a:LW0/l;

    .line 88
    .line 89
    if-ne v3, v9, :cond_4

    .line 90
    .line 91
    invoke-static {v4, v3}, LE3/h;->N(LL0/F;LW0/l;)LL0/F;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    iget-object v10, v6, LJ/b;->b:LL0/F;

    .line 96
    .line 97
    invoke-virtual {v9, v10}, LL0/F;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-eqz v9, :cond_4

    .line 102
    .line 103
    invoke-interface {v7}, LW0/c;->b()F

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    iget-object v10, v6, LJ/b;->c:LW0/d;

    .line 108
    .line 109
    iget v10, v10, LW0/d;->q:F

    .line 110
    .line 111
    cmpg-float v9, v9, v10

    .line 112
    .line 113
    if-nez v9, :cond_4

    .line 114
    .line 115
    iget-object v9, v6, LJ/b;->d:LO0/d;

    .line 116
    .line 117
    if-ne v8, v9, :cond_4

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    new-instance v6, LJ/b;

    .line 121
    .line 122
    invoke-static {v4, v3}, LE3/h;->N(LL0/F;LW0/l;)LL0/F;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-interface {v7}, LW0/c;->b()F

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    invoke-interface {v7}, LW0/c;->l()F

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    new-instance v10, LW0/d;

    .line 135
    .line 136
    invoke-direct {v10, v9, v7}, LW0/d;-><init>(FF)V

    .line 137
    .line 138
    .line 139
    invoke-direct {v6, v3, v4, v10, v8}, LJ/b;-><init>(LW0/l;LL0/F;LW0/d;LO0/d;)V

    .line 140
    .line 141
    .line 142
    sput-object v6, LJ/b;->h:LJ/b;

    .line 143
    .line 144
    :goto_1
    iput-object v6, v2, LJ/d;->m:LJ/b;

    .line 145
    .line 146
    iget v4, v2, LJ/d;->g:I

    .line 147
    .line 148
    iget-object v11, v6, LJ/b;->c:LW0/d;

    .line 149
    .line 150
    iget v7, v6, LJ/b;->g:F

    .line 151
    .line 152
    iget v8, v6, LJ/b;->f:F

    .line 153
    .line 154
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    const/4 v14, 0x0

    .line 159
    if-nez v9, :cond_5

    .line 160
    .line 161
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    if-eqz v9, :cond_6

    .line 166
    .line 167
    :cond_5
    sget-object v7, LJ/c;->a:Ljava/lang/String;

    .line 168
    .line 169
    iget-object v8, v6, LJ/b;->e:LL0/F;

    .line 170
    .line 171
    const/16 v15, 0xf

    .line 172
    .line 173
    invoke-static {v14, v14, v15}, LW0/b;->b(III)J

    .line 174
    .line 175
    .line 176
    move-result-wide v9

    .line 177
    iget-object v12, v6, LJ/b;->d:LO0/d;

    .line 178
    .line 179
    const/4 v13, 0x1

    .line 180
    invoke-static/range {v7 .. v13}, LC3/a;->i(Ljava/lang/String;LL0/F;JLW0/d;LO0/d;I)LL0/a;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-virtual {v7}, LL0/a;->b()F

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    move v8, v7

    .line 189
    sget-object v7, LJ/c;->b:Ljava/lang/String;

    .line 190
    .line 191
    move v9, v8

    .line 192
    iget-object v8, v6, LJ/b;->e:LL0/F;

    .line 193
    .line 194
    invoke-static {v14, v14, v15}, LW0/b;->b(III)J

    .line 195
    .line 196
    .line 197
    move-result-wide v12

    .line 198
    move-wide/from16 v21, v12

    .line 199
    .line 200
    move v13, v9

    .line 201
    move-wide/from16 v9, v21

    .line 202
    .line 203
    iget-object v12, v6, LJ/b;->d:LO0/d;

    .line 204
    .line 205
    move v15, v13

    .line 206
    const/4 v13, 0x2

    .line 207
    invoke-static/range {v7 .. v13}, LC3/a;->i(Ljava/lang/String;LL0/F;JLW0/d;LO0/d;I)LL0/a;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-virtual {v7}, LL0/a;->b()F

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    sub-float v8, v7, v15

    .line 216
    .line 217
    iput v15, v6, LJ/b;->g:F

    .line 218
    .line 219
    iput v8, v6, LJ/b;->f:F

    .line 220
    .line 221
    move v7, v15

    .line 222
    :cond_6
    const/4 v6, 0x1

    .line 223
    if-eq v4, v6, :cond_8

    .line 224
    .line 225
    sub-int/2addr v4, v6

    .line 226
    int-to-float v4, v4

    .line 227
    mul-float/2addr v8, v4

    .line 228
    add-float/2addr v8, v7

    .line 229
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    if-gez v4, :cond_7

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_7
    move v14, v4

    .line 237
    :goto_2
    invoke-static/range {p3 .. p4}, LW0/a;->g(J)I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-le v14, v4, :cond_9

    .line 242
    .line 243
    move v14, v4

    .line 244
    goto :goto_3

    .line 245
    :cond_8
    invoke-static/range {p3 .. p4}, LW0/a;->i(J)I

    .line 246
    .line 247
    .line 248
    move-result v14

    .line 249
    :cond_9
    :goto_3
    invoke-static/range {p3 .. p4}, LW0/a;->g(J)I

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    invoke-static/range {p3 .. p4}, LW0/a;->j(J)I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    invoke-static/range {p3 .. p4}, LW0/a;->h(J)I

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    invoke-static {v6, v7, v14, v4}, LW0/b;->a(IIII)J

    .line 262
    .line 263
    .line 264
    move-result-wide v6

    .line 265
    goto :goto_4

    .line 266
    :cond_a
    move-wide/from16 v6, p3

    .line 267
    .line 268
    :goto_4
    iget-object v4, v2, LJ/d;->j:LL0/a;

    .line 269
    .line 270
    const/4 v8, 0x0

    .line 271
    const/4 v9, 0x2

    .line 272
    const/4 v10, 0x3

    .line 273
    const/16 v13, 0x20

    .line 274
    .line 275
    if-nez v4, :cond_b

    .line 276
    .line 277
    :goto_5
    const-wide p3, 0xffffffffL

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    goto/16 :goto_a

    .line 283
    .line 284
    :cond_b
    iget-object v14, v2, LJ/d;->n:LL0/p;

    .line 285
    .line 286
    if-nez v14, :cond_c

    .line 287
    .line 288
    goto :goto_5

    .line 289
    :cond_c
    invoke-interface {v14}, LL0/p;->a()Z

    .line 290
    .line 291
    .line 292
    move-result v14

    .line 293
    if-eqz v14, :cond_d

    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_d
    iget-object v14, v2, LJ/d;->o:LW0/l;

    .line 297
    .line 298
    if-eq v3, v14, :cond_e

    .line 299
    .line 300
    goto :goto_5

    .line 301
    :cond_e
    iget-wide v14, v2, LJ/d;->p:J

    .line 302
    .line 303
    invoke-static {v6, v7, v14, v15}, LW0/a;->b(JJ)Z

    .line 304
    .line 305
    .line 306
    move-result v14

    .line 307
    if-eqz v14, :cond_f

    .line 308
    .line 309
    const-wide p3, 0xffffffffL

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_f
    invoke-static {v6, v7}, LW0/a;->h(J)I

    .line 316
    .line 317
    .line 318
    move-result v14

    .line 319
    const-wide p3, 0xffffffffL

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    iget-wide v11, v2, LJ/d;->p:J

    .line 325
    .line 326
    invoke-static {v11, v12}, LW0/a;->h(J)I

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    if-eq v14, v11, :cond_10

    .line 331
    .line 332
    goto/16 :goto_a

    .line 333
    .line 334
    :cond_10
    invoke-static {v6, v7}, LW0/a;->j(J)I

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    iget-wide v14, v2, LJ/d;->p:J

    .line 339
    .line 340
    invoke-static {v14, v15}, LW0/a;->j(J)I

    .line 341
    .line 342
    .line 343
    move-result v12

    .line 344
    if-eq v11, v12, :cond_11

    .line 345
    .line 346
    goto/16 :goto_a

    .line 347
    .line 348
    :cond_11
    invoke-static {v6, v7}, LW0/a;->g(J)I

    .line 349
    .line 350
    .line 351
    move-result v11

    .line 352
    int-to-float v11, v11

    .line 353
    invoke-virtual {v4}, LL0/a;->b()F

    .line 354
    .line 355
    .line 356
    move-result v12

    .line 357
    cmpg-float v11, v11, v12

    .line 358
    .line 359
    if-ltz v11, :cond_17

    .line 360
    .line 361
    iget-object v4, v4, LL0/a;->d:LM0/j;

    .line 362
    .line 363
    iget-boolean v4, v4, LM0/j;->d:Z

    .line 364
    .line 365
    if-eqz v4, :cond_12

    .line 366
    .line 367
    goto :goto_a

    .line 368
    :cond_12
    :goto_6
    iget-wide v3, v2, LJ/d;->p:J

    .line 369
    .line 370
    invoke-static {v6, v7, v3, v4}, LW0/a;->b(JJ)Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    if-nez v3, :cond_16

    .line 375
    .line 376
    iget-object v3, v2, LJ/d;->j:LL0/a;

    .line 377
    .line 378
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    iget-object v4, v3, LL0/a;->a:LS0/d;

    .line 382
    .line 383
    iget-object v4, v4, LS0/d;->i:LM0/e;

    .line 384
    .line 385
    invoke-virtual {v4}, LM0/e;->c()F

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    invoke-virtual {v3}, LL0/a;->c()F

    .line 390
    .line 391
    .line 392
    move-result v11

    .line 393
    invoke-static {v4, v11}, Ljava/lang/Math;->min(FF)F

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    invoke-static {v4}, LE3/h;->l(F)I

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    invoke-virtual {v3}, LL0/a;->b()F

    .line 402
    .line 403
    .line 404
    move-result v11

    .line 405
    invoke-static {v11}, LE3/h;->l(F)I

    .line 406
    .line 407
    .line 408
    move-result v11

    .line 409
    int-to-long v14, v4

    .line 410
    shl-long/2addr v14, v13

    .line 411
    int-to-long v11, v11

    .line 412
    and-long v11, v11, p3

    .line 413
    .line 414
    or-long/2addr v11, v14

    .line 415
    invoke-static {v6, v7, v11, v12}, LW0/b;->d(JJ)J

    .line 416
    .line 417
    .line 418
    move-result-wide v11

    .line 419
    iput-wide v11, v2, LJ/d;->l:J

    .line 420
    .line 421
    iget v4, v2, LJ/d;->d:I

    .line 422
    .line 423
    if-ne v4, v10, :cond_13

    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_13
    shr-long v14, v11, v13

    .line 427
    .line 428
    long-to-int v4, v14

    .line 429
    int-to-float v4, v4

    .line 430
    invoke-virtual {v3}, LL0/a;->c()F

    .line 431
    .line 432
    .line 433
    move-result v10

    .line 434
    cmpg-float v4, v4, v10

    .line 435
    .line 436
    if-ltz v4, :cond_15

    .line 437
    .line 438
    and-long v10, v11, p3

    .line 439
    .line 440
    long-to-int v4, v10

    .line 441
    int-to-float v4, v4

    .line 442
    invoke-virtual {v3}, LL0/a;->b()F

    .line 443
    .line 444
    .line 445
    move-result v3

    .line 446
    cmpg-float v3, v4, v3

    .line 447
    .line 448
    if-gez v3, :cond_14

    .line 449
    .line 450
    goto :goto_8

    .line 451
    :cond_14
    :goto_7
    move v3, v8

    .line 452
    goto :goto_9

    .line 453
    :cond_15
    :goto_8
    move v3, v5

    .line 454
    :goto_9
    iput-boolean v3, v2, LJ/d;->k:Z

    .line 455
    .line 456
    iput-wide v6, v2, LJ/d;->p:J

    .line 457
    .line 458
    :cond_16
    move v3, v8

    .line 459
    goto/16 :goto_13

    .line 460
    .line 461
    :cond_17
    :goto_a
    iget-object v4, v2, LJ/d;->n:LL0/p;

    .line 462
    .line 463
    if-eqz v4, :cond_18

    .line 464
    .line 465
    iget-object v11, v2, LJ/d;->o:LW0/l;

    .line 466
    .line 467
    if-ne v3, v11, :cond_18

    .line 468
    .line 469
    invoke-interface {v4}, LL0/p;->a()Z

    .line 470
    .line 471
    .line 472
    move-result v11

    .line 473
    if-eqz v11, :cond_19

    .line 474
    .line 475
    :cond_18
    iput-object v3, v2, LJ/d;->o:LW0/l;

    .line 476
    .line 477
    iget-object v15, v2, LJ/d;->a:Ljava/lang/String;

    .line 478
    .line 479
    iget-object v4, v2, LJ/d;->b:LL0/F;

    .line 480
    .line 481
    invoke-static {v4, v3}, LE3/h;->N(LL0/F;LW0/l;)LL0/F;

    .line 482
    .line 483
    .line 484
    move-result-object v16

    .line 485
    iget-object v3, v2, LJ/d;->i:LW0/c;

    .line 486
    .line 487
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    iget-object v4, v2, LJ/d;->c:LO0/d;

    .line 491
    .line 492
    new-instance v14, LS0/d;

    .line 493
    .line 494
    sget-object v17, Ln5/s;->q:Ln5/s;

    .line 495
    .line 496
    move-object/from16 v18, v17

    .line 497
    .line 498
    move-object/from16 v20, v3

    .line 499
    .line 500
    move-object/from16 v19, v4

    .line 501
    .line 502
    invoke-direct/range {v14 .. v20}, LS0/d;-><init>(Ljava/lang/String;LL0/F;Ljava/util/List;Ljava/util/List;LO0/d;LW0/c;)V

    .line 503
    .line 504
    .line 505
    move-object v4, v14

    .line 506
    :cond_19
    iput-object v4, v2, LJ/d;->n:LL0/p;

    .line 507
    .line 508
    iget-boolean v3, v2, LJ/d;->e:Z

    .line 509
    .line 510
    iget v11, v2, LJ/d;->d:I

    .line 511
    .line 512
    invoke-interface {v4}, LL0/p;->b()F

    .line 513
    .line 514
    .line 515
    move-result v12

    .line 516
    if-nez v3, :cond_1c

    .line 517
    .line 518
    const/4 v3, 0x2

    .line 519
    if-ne v11, v3, :cond_1a

    .line 520
    .line 521
    goto :goto_b

    .line 522
    :cond_1a
    const/4 v3, 0x4

    .line 523
    if-ne v11, v3, :cond_1b

    .line 524
    .line 525
    goto :goto_b

    .line 526
    :cond_1b
    const/4 v3, 0x5

    .line 527
    if-ne v11, v3, :cond_1d

    .line 528
    .line 529
    :cond_1c
    :goto_b
    invoke-static {v6, v7}, LW0/a;->d(J)Z

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    if-eqz v3, :cond_1d

    .line 534
    .line 535
    invoke-static {v6, v7}, LW0/a;->h(J)I

    .line 536
    .line 537
    .line 538
    move-result v3

    .line 539
    goto :goto_c

    .line 540
    :cond_1d
    const v3, 0x7fffffff

    .line 541
    .line 542
    .line 543
    :goto_c
    invoke-static {v6, v7}, LW0/a;->j(J)I

    .line 544
    .line 545
    .line 546
    move-result v11

    .line 547
    if-ne v11, v3, :cond_1e

    .line 548
    .line 549
    goto :goto_d

    .line 550
    :cond_1e
    invoke-static {v12}, LE3/h;->l(F)I

    .line 551
    .line 552
    .line 553
    move-result v11

    .line 554
    invoke-static {v6, v7}, LW0/a;->j(J)I

    .line 555
    .line 556
    .line 557
    move-result v12

    .line 558
    invoke-static {v11, v12, v3}, LD5/a;->q(III)I

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    :goto_d
    invoke-static {v6, v7}, LW0/a;->g(J)I

    .line 563
    .line 564
    .line 565
    move-result v11

    .line 566
    const/4 v12, 0x0

    .line 567
    invoke-static {v12, v3, v12, v11}, La/a;->x(IIII)J

    .line 568
    .line 569
    .line 570
    move-result-wide v18

    .line 571
    iget-boolean v3, v2, LJ/d;->e:Z

    .line 572
    .line 573
    iget v11, v2, LJ/d;->d:I

    .line 574
    .line 575
    iget v12, v2, LJ/d;->f:I

    .line 576
    .line 577
    if-nez v3, :cond_21

    .line 578
    .line 579
    if-ne v11, v9, :cond_1f

    .line 580
    .line 581
    goto :goto_e

    .line 582
    :cond_1f
    const/4 v3, 0x4

    .line 583
    if-ne v11, v3, :cond_20

    .line 584
    .line 585
    goto :goto_e

    .line 586
    :cond_20
    const/4 v3, 0x5

    .line 587
    if-ne v11, v3, :cond_21

    .line 588
    .line 589
    :goto_e
    move/from16 v16, v5

    .line 590
    .line 591
    goto :goto_f

    .line 592
    :cond_21
    if-ge v12, v5, :cond_22

    .line 593
    .line 594
    goto :goto_e

    .line 595
    :cond_22
    move/from16 v16, v12

    .line 596
    .line 597
    :goto_f
    new-instance v14, LL0/a;

    .line 598
    .line 599
    move-object v15, v4

    .line 600
    check-cast v15, LS0/d;

    .line 601
    .line 602
    move/from16 v17, v11

    .line 603
    .line 604
    invoke-direct/range {v14 .. v19}, LL0/a;-><init>(LS0/d;IIJ)V

    .line 605
    .line 606
    .line 607
    iput-wide v6, v2, LJ/d;->p:J

    .line 608
    .line 609
    invoke-virtual {v14}, LL0/a;->c()F

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    invoke-static {v3}, LE3/h;->l(F)I

    .line 614
    .line 615
    .line 616
    move-result v3

    .line 617
    invoke-virtual {v14}, LL0/a;->b()F

    .line 618
    .line 619
    .line 620
    move-result v4

    .line 621
    invoke-static {v4}, LE3/h;->l(F)I

    .line 622
    .line 623
    .line 624
    move-result v4

    .line 625
    int-to-long v11, v3

    .line 626
    shl-long/2addr v11, v13

    .line 627
    int-to-long v3, v4

    .line 628
    and-long v3, v3, p3

    .line 629
    .line 630
    or-long/2addr v3, v11

    .line 631
    invoke-static {v6, v7, v3, v4}, LW0/b;->d(JJ)J

    .line 632
    .line 633
    .line 634
    move-result-wide v3

    .line 635
    iput-wide v3, v2, LJ/d;->l:J

    .line 636
    .line 637
    iget v6, v2, LJ/d;->d:I

    .line 638
    .line 639
    if-ne v6, v10, :cond_23

    .line 640
    .line 641
    goto :goto_10

    .line 642
    :cond_23
    shr-long v6, v3, v13

    .line 643
    .line 644
    long-to-int v6, v6

    .line 645
    int-to-float v6, v6

    .line 646
    invoke-virtual {v14}, LL0/a;->c()F

    .line 647
    .line 648
    .line 649
    move-result v7

    .line 650
    cmpg-float v6, v6, v7

    .line 651
    .line 652
    if-ltz v6, :cond_25

    .line 653
    .line 654
    and-long v3, v3, p3

    .line 655
    .line 656
    long-to-int v3, v3

    .line 657
    int-to-float v3, v3

    .line 658
    invoke-virtual {v14}, LL0/a;->b()F

    .line 659
    .line 660
    .line 661
    move-result v4

    .line 662
    cmpg-float v3, v3, v4

    .line 663
    .line 664
    if-gez v3, :cond_24

    .line 665
    .line 666
    goto :goto_11

    .line 667
    :cond_24
    :goto_10
    move v3, v8

    .line 668
    goto :goto_12

    .line 669
    :cond_25
    :goto_11
    move v3, v5

    .line 670
    :goto_12
    iput-boolean v3, v2, LJ/d;->k:Z

    .line 671
    .line 672
    iput-object v14, v2, LJ/d;->j:LL0/a;

    .line 673
    .line 674
    move v3, v5

    .line 675
    :goto_13
    iget-object v4, v2, LJ/d;->n:LL0/p;

    .line 676
    .line 677
    if-eqz v4, :cond_26

    .line 678
    .line 679
    invoke-interface {v4}, LL0/p;->a()Z

    .line 680
    .line 681
    .line 682
    :cond_26
    iget-object v4, v2, LJ/d;->j:LL0/a;

    .line 683
    .line 684
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    iget-object v4, v4, LL0/a;->d:LM0/j;

    .line 688
    .line 689
    iget-wide v6, v2, LJ/d;->l:J

    .line 690
    .line 691
    if-eqz v3, :cond_28

    .line 692
    .line 693
    invoke-static {v0, v9}, LB0/g;->s(LB0/m;I)LB0/n0;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    invoke-virtual {v2}, LB0/n0;->I0()V

    .line 698
    .line 699
    .line 700
    iget-object v2, v0, LJ/g;->L:Ljava/util/HashMap;

    .line 701
    .line 702
    if-nez v2, :cond_27

    .line 703
    .line 704
    new-instance v2, Ljava/util/HashMap;

    .line 705
    .line 706
    invoke-direct {v2, v9}, Ljava/util/HashMap;-><init>(I)V

    .line 707
    .line 708
    .line 709
    iput-object v2, v0, LJ/g;->L:Ljava/util/HashMap;

    .line 710
    .line 711
    :cond_27
    sget-object v3, Lz0/c;->a:Lz0/l;

    .line 712
    .line 713
    invoke-virtual {v4, v8}, LM0/j;->c(I)F

    .line 714
    .line 715
    .line 716
    move-result v8

    .line 717
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 718
    .line 719
    .line 720
    move-result v8

    .line 721
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 722
    .line 723
    .line 724
    move-result-object v8

    .line 725
    invoke-interface {v2, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    sget-object v3, Lz0/c;->b:Lz0/l;

    .line 729
    .line 730
    iget v8, v4, LM0/j;->f:I

    .line 731
    .line 732
    sub-int/2addr v8, v5

    .line 733
    invoke-virtual {v4, v8}, LM0/j;->c(I)F

    .line 734
    .line 735
    .line 736
    move-result v4

    .line 737
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 738
    .line 739
    .line 740
    move-result v4

    .line 741
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 742
    .line 743
    .line 744
    move-result-object v4

    .line 745
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    :cond_28
    shr-long v2, v6, v13

    .line 749
    .line 750
    long-to-int v2, v2

    .line 751
    and-long v3, v6, p3

    .line 752
    .line 753
    long-to-int v3, v3

    .line 754
    invoke-static {v2, v2, v3, v3}, La/a;->x(IIII)J

    .line 755
    .line 756
    .line 757
    move-result-wide v4

    .line 758
    move-object/from16 v6, p2

    .line 759
    .line 760
    invoke-interface {v6, v4, v5}, Lz0/B;->a(J)Lz0/J;

    .line 761
    .line 762
    .line 763
    move-result-object v4

    .line 764
    iget-object v5, v0, LJ/g;->L:Ljava/util/HashMap;

    .line 765
    .line 766
    invoke-static {v5}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    new-instance v6, LA/z;

    .line 770
    .line 771
    const/4 v7, 0x3

    .line 772
    invoke-direct {v6, v4, v7}, LA/z;-><init>(Lz0/J;I)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v1, v2, v3, v5, v6}, LB0/T;->O(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    return-object v1
.end method

.method public final m0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final x0()LJ/d;
    .locals 9

    .line 1
    iget-object v0, p0, LJ/g;->M:LJ/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LJ/d;

    .line 6
    .line 7
    iget-object v2, p0, LJ/g;->E:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p0, LJ/g;->F:LL0/F;

    .line 10
    .line 11
    iget-object v4, p0, LJ/g;->G:LO0/d;

    .line 12
    .line 13
    iget v5, p0, LJ/g;->H:I

    .line 14
    .line 15
    iget-boolean v6, p0, LJ/g;->I:Z

    .line 16
    .line 17
    iget v7, p0, LJ/g;->J:I

    .line 18
    .line 19
    iget v8, p0, LJ/g;->K:I

    .line 20
    .line 21
    invoke-direct/range {v1 .. v8}, LJ/d;-><init>(Ljava/lang/String;LL0/F;LO0/d;IZII)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, LJ/g;->M:LJ/d;

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, LJ/g;->M:LJ/d;

    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method
