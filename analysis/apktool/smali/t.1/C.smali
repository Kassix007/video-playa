.class public final Lt/C;
.super Lt/I;
.source "SourceFile"


# instance fields
.field public E:Lu/v0;

.field public F:Lt/E;

.field public G:LB5/a;

.field public H:Lt/u;

.field public I:J

.field public J:Lc0/e;


# virtual methods
.method public final c(LB0/T;Lz0/B;J)Lz0/D;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lt/C;->E:Lu/v0;

    .line 6
    .line 7
    iget-object v2, v2, Lu/v0;->a:LO3/D0;

    .line 8
    .line 9
    invoke-virtual {v2}, LO3/D0;->j()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, v0, Lt/C;->E:Lu/v0;

    .line 14
    .line 15
    iget-object v3, v3, Lu/v0;->d:LP/f0;

    .line 16
    .line 17
    invoke-virtual {v3}, LP/f0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-ne v2, v3, :cond_0

    .line 23
    .line 24
    iput-object v4, v0, Lt/C;->J:Lc0/e;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    iget-object v2, v0, Lt/C;->J:Lc0/e;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    iget-object v2, v0, Lt/C;->E:Lu/v0;

    .line 32
    .line 33
    invoke-virtual {v2}, Lu/v0;->f()Lu/q0;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget-object v3, Lt/t;->q:Lt/t;

    .line 38
    .line 39
    sget-object v5, Lt/t;->r:Lt/t;

    .line 40
    .line 41
    invoke-interface {v2, v3, v5}, Lu/q0;->b(Lt/t;Lt/t;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget-object v2, v0, Lt/C;->F:Lt/E;

    .line 48
    .line 49
    iget-object v2, v2, Lt/E;->a:Lt/L;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v2, v0, Lt/C;->F:Lt/E;

    .line 53
    .line 54
    iget-object v2, v2, Lt/E;->a:Lt/L;

    .line 55
    .line 56
    :goto_0
    sget-object v2, Lc0/b;->q:Lc0/e;

    .line 57
    .line 58
    iput-object v2, v0, Lt/C;->J:Lc0/e;

    .line 59
    .line 60
    :cond_2
    :goto_1
    invoke-interface {v1}, Lz0/E;->r()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    sget-object v3, Ln5/t;->q:Ln5/t;

    .line 65
    .line 66
    const-wide v5, 0xffffffffL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    const/16 v7, 0x20

    .line 72
    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    invoke-interface/range {p2 .. p4}, Lz0/B;->a(J)Lz0/J;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iget v4, v2, Lz0/J;->q:I

    .line 80
    .line 81
    iget v8, v2, Lz0/J;->r:I

    .line 82
    .line 83
    int-to-long v9, v4

    .line 84
    shl-long/2addr v9, v7

    .line 85
    int-to-long v11, v8

    .line 86
    and-long/2addr v11, v5

    .line 87
    or-long v8, v9, v11

    .line 88
    .line 89
    iput-wide v8, v0, Lt/C;->I:J

    .line 90
    .line 91
    shr-long v10, v8, v7

    .line 92
    .line 93
    long-to-int v4, v10

    .line 94
    and-long/2addr v5, v8

    .line 95
    long-to-int v5, v5

    .line 96
    new-instance v6, LA/z;

    .line 97
    .line 98
    const/4 v7, 0x6

    .line 99
    invoke-direct {v6, v2, v7}, LA/z;-><init>(Lz0/J;I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v1, v4, v5, v3, v6}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    return-object v1

    .line 107
    :cond_3
    iget-object v2, v0, Lt/C;->G:LB5/a;

    .line 108
    .line 109
    invoke-interface {v2}, LB5/a;->invoke()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_a

    .line 120
    .line 121
    iget-object v2, v0, Lt/C;->H:Lt/u;

    .line 122
    .line 123
    iget-object v8, v2, Lt/u;->a:Lu/p0;

    .line 124
    .line 125
    iget-object v9, v2, Lt/u;->b:Lu/p0;

    .line 126
    .line 127
    iget-object v10, v2, Lt/u;->c:Lu/v0;

    .line 128
    .line 129
    iget-object v11, v2, Lt/u;->d:Lt/D;

    .line 130
    .line 131
    iget-object v12, v2, Lt/u;->e:Lt/E;

    .line 132
    .line 133
    iget-object v2, v2, Lt/u;->f:Lu/p0;

    .line 134
    .line 135
    if-eqz v8, :cond_4

    .line 136
    .line 137
    new-instance v13, Lt/w;

    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    invoke-direct {v13, v11, v12, v14}, Lt/w;-><init>(Lt/D;Lt/E;I)V

    .line 141
    .line 142
    .line 143
    new-instance v14, Lt/w;

    .line 144
    .line 145
    const/4 v15, 0x1

    .line 146
    invoke-direct {v14, v11, v12, v15}, Lt/w;-><init>(Lt/D;Lt/E;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v8, v13, v14}, Lu/p0;->a(LB5/c;LB5/c;)Lu/o0;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    goto :goto_2

    .line 154
    :cond_4
    move-object v8, v4

    .line 155
    :goto_2
    if-eqz v9, :cond_5

    .line 156
    .line 157
    new-instance v13, Lt/w;

    .line 158
    .line 159
    const/4 v14, 0x2

    .line 160
    invoke-direct {v13, v11, v12, v14}, Lt/w;-><init>(Lt/D;Lt/E;I)V

    .line 161
    .line 162
    .line 163
    new-instance v14, Lt/w;

    .line 164
    .line 165
    const/4 v15, 0x3

    .line 166
    invoke-direct {v14, v11, v12, v15}, Lt/w;-><init>(Lt/D;Lt/E;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v13, v14}, Lu/p0;->a(LB5/c;LB5/c;)Lu/o0;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    goto :goto_3

    .line 174
    :cond_5
    move-object v9, v4

    .line 175
    :goto_3
    iget-object v10, v10, Lu/v0;->a:LO3/D0;

    .line 176
    .line 177
    invoke-virtual {v10}, LO3/D0;->j()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    sget-object v13, Lt/t;->q:Lt/t;

    .line 182
    .line 183
    if-ne v10, v13, :cond_6

    .line 184
    .line 185
    iget-object v10, v12, Lt/E;->a:Lt/L;

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_6
    iget-object v10, v12, Lt/E;->a:Lt/L;

    .line 189
    .line 190
    :goto_4
    if-eqz v2, :cond_7

    .line 191
    .line 192
    sget-object v10, Lt/v;->t:Lt/v;

    .line 193
    .line 194
    new-instance v13, LA/J;

    .line 195
    .line 196
    const/16 v14, 0xc

    .line 197
    .line 198
    invoke-direct {v13, v4, v11, v12, v14}, LA/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v10, v13}, Lu/p0;->a(LB5/c;LB5/c;)Lu/o0;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    :cond_7
    new-instance v2, LA/J;

    .line 206
    .line 207
    const/16 v10, 0xb

    .line 208
    .line 209
    invoke-direct {v2, v8, v9, v4, v10}, LA/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 210
    .line 211
    .line 212
    invoke-interface/range {p2 .. p4}, Lz0/B;->a(J)Lz0/J;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    iget v4, v11, Lz0/J;->q:I

    .line 217
    .line 218
    iget v8, v11, Lz0/J;->r:I

    .line 219
    .line 220
    int-to-long v9, v4

    .line 221
    shl-long/2addr v9, v7

    .line 222
    int-to-long v12, v8

    .line 223
    and-long/2addr v12, v5

    .line 224
    or-long v8, v9, v12

    .line 225
    .line 226
    iget-wide v12, v0, Lt/C;->I:J

    .line 227
    .line 228
    sget-wide v14, Lt/r;->a:J

    .line 229
    .line 230
    invoke-static {v12, v13, v14, v15}, LW0/k;->a(JJ)Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-nez v4, :cond_8

    .line 235
    .line 236
    iget-wide v12, v0, Lt/C;->I:J

    .line 237
    .line 238
    move-wide v15, v12

    .line 239
    :goto_5
    move-wide/from16 v12, p3

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_8
    move-wide v15, v8

    .line 243
    goto :goto_5

    .line 244
    :goto_6
    invoke-static {v12, v13, v8, v9}, LW0/b;->d(JJ)J

    .line 245
    .line 246
    .line 247
    move-result-wide v17

    .line 248
    iget-object v14, v0, Lt/C;->J:Lc0/e;

    .line 249
    .line 250
    const-wide/16 v8, 0x0

    .line 251
    .line 252
    if-eqz v14, :cond_9

    .line 253
    .line 254
    sget-object v19, LW0/l;->q:LW0/l;

    .line 255
    .line 256
    invoke-virtual/range {v14 .. v19}, Lc0/e;->a(JJLW0/l;)J

    .line 257
    .line 258
    .line 259
    move-result-wide v12

    .line 260
    goto :goto_7

    .line 261
    :cond_9
    move-wide v12, v8

    .line 262
    :goto_7
    invoke-static {v12, v13, v8, v9}, LW0/i;->c(JJ)J

    .line 263
    .line 264
    .line 265
    move-result-wide v12

    .line 266
    shr-long v14, v17, v7

    .line 267
    .line 268
    long-to-int v4, v14

    .line 269
    and-long v5, v17, v5

    .line 270
    .line 271
    long-to-int v5, v5

    .line 272
    new-instance v10, Lt/A;

    .line 273
    .line 274
    const/16 v17, 0x0

    .line 275
    .line 276
    move-object/from16 v16, v2

    .line 277
    .line 278
    move-wide v14, v8

    .line 279
    invoke-direct/range {v10 .. v17}, Lt/A;-><init>(Ljava/lang/Object;JJLjava/lang/Object;I)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v1, v4, v5, v3, v10}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    return-object v1

    .line 287
    :cond_a
    move-wide/from16 v12, p3

    .line 288
    .line 289
    invoke-interface/range {p2 .. p4}, Lz0/B;->a(J)Lz0/J;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    iget v4, v2, Lz0/J;->q:I

    .line 294
    .line 295
    iget v5, v2, Lz0/J;->r:I

    .line 296
    .line 297
    new-instance v6, LA/z;

    .line 298
    .line 299
    const/4 v7, 0x7

    .line 300
    invoke-direct {v6, v2, v7}, LA/z;-><init>(Lz0/J;I)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v1, v4, v5, v3, v6}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    return-object v1
.end method

.method public final p0()V
    .locals 2

    .line 1
    sget-wide v0, Lt/r;->a:J

    .line 2
    .line 3
    iput-wide v0, p0, Lt/C;->I:J

    .line 4
    .line 5
    return-void
.end method
