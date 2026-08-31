.class public final Lv/p;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/p;
.implements LB0/p0;


# instance fields
.field public E:J

.field public F:Lj0/E;

.field public G:J

.field public H:LW0/l;

.field public I:Lj0/B;

.field public J:Lj0/E;

.field public K:Lj0/B;


# virtual methods
.method public final E()V
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lv/p;->G:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lv/p;->H:LW0/l;

    .line 10
    .line 11
    iput-object v0, p0, Lv/p;->I:Lj0/B;

    .line 12
    .line 13
    iput-object v0, p0, Lv/p;->J:Lj0/E;

    .line 14
    .line 15
    invoke-static {p0}, LB0/g;->l(LB0/p;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final J(LB0/N;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, LB0/N;->q:Ll0/b;

    .line 6
    .line 7
    iget-object v3, v0, Lv/p;->F:Lj0/E;

    .line 8
    .line 9
    sget-object v4, Lj0/B;->a:LO3/D;

    .line 10
    .line 11
    if-ne v3, v4, :cond_1

    .line 12
    .line 13
    iget-wide v2, v0, Lv/p;->E:J

    .line 14
    .line 15
    sget-wide v4, Lj0/o;->g:J

    .line 16
    .line 17
    invoke-static {v2, v3, v4, v5}, Lj0/o;->c(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-wide v2, v0, Lv/p;->E:J

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    const/16 v9, 0x7e

    .line 27
    .line 28
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    invoke-static/range {v1 .. v9}, Ll0/d;->g0(Ll0/d;JJJFI)V

    .line 33
    .line 34
    .line 35
    :cond_0
    :goto_0
    move-object v8, v1

    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_1
    invoke-interface {v2}, Ll0/d;->d()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    iget-wide v5, v0, Lv/p;->G:J

    .line 43
    .line 44
    invoke-static {v3, v4, v5, v6}, Li0/e;->a(JJ)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    invoke-virtual {v1}, LB0/N;->getLayoutDirection()LW0/l;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iget-object v4, v0, Lv/p;->H:LW0/l;

    .line 55
    .line 56
    if-ne v3, v4, :cond_2

    .line 57
    .line 58
    iget-object v3, v0, Lv/p;->J:Lj0/E;

    .line 59
    .line 60
    iget-object v4, v0, Lv/p;->F:Lj0/E;

    .line 61
    .line 62
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    iget-object v3, v0, Lv/p;->I:Lj0/B;

    .line 69
    .line 70
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    new-instance v3, LB0/K;

    .line 75
    .line 76
    const/16 v4, 0x11

    .line 77
    .line 78
    invoke-direct {v3, v4, v0, v1}, LB0/K;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v3}, LB0/g;->r(Lc0/l;LB5/a;)V

    .line 82
    .line 83
    .line 84
    iget-object v3, v0, Lv/p;->K:Lj0/B;

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    iput-object v4, v0, Lv/p;->K:Lj0/B;

    .line 88
    .line 89
    :goto_1
    iput-object v3, v0, Lv/p;->I:Lj0/B;

    .line 90
    .line 91
    invoke-interface {v2}, Ll0/d;->d()J

    .line 92
    .line 93
    .line 94
    move-result-wide v4

    .line 95
    iput-wide v4, v0, Lv/p;->G:J

    .line 96
    .line 97
    invoke-virtual {v1}, LB0/N;->getLayoutDirection()LW0/l;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    iput-object v4, v0, Lv/p;->H:LW0/l;

    .line 102
    .line 103
    iget-object v4, v0, Lv/p;->F:Lj0/E;

    .line 104
    .line 105
    iput-object v4, v0, Lv/p;->J:Lj0/E;

    .line 106
    .line 107
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-wide v4, v0, Lv/p;->E:J

    .line 111
    .line 112
    sget-wide v6, Lj0/o;->g:J

    .line 113
    .line 114
    invoke-static {v4, v5, v6, v7}, Lj0/o;->c(JJ)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-nez v4, :cond_0

    .line 119
    .line 120
    iget-wide v4, v0, Lv/p;->E:J

    .line 121
    .line 122
    instance-of v6, v3, Lj0/y;

    .line 123
    .line 124
    const/16 v7, 0x20

    .line 125
    .line 126
    const-wide v8, 0xffffffffL

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    move-wide v10, v8

    .line 132
    sget-object v9, Ll0/f;->b:Ll0/f;

    .line 133
    .line 134
    if-eqz v6, :cond_3

    .line 135
    .line 136
    check-cast v3, Lj0/y;

    .line 137
    .line 138
    iget-object v2, v3, Lj0/y;->e:Li0/c;

    .line 139
    .line 140
    iget v3, v2, Li0/c;->a:F

    .line 141
    .line 142
    iget v6, v2, Li0/c;->b:F

    .line 143
    .line 144
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    int-to-long v12, v3

    .line 149
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    int-to-long v14, v3

    .line 154
    shl-long v6, v12, v7

    .line 155
    .line 156
    and-long/2addr v10, v14

    .line 157
    or-long/2addr v6, v10

    .line 158
    iget v3, v2, Li0/c;->c:F

    .line 159
    .line 160
    iget v8, v2, Li0/c;->a:F

    .line 161
    .line 162
    sub-float/2addr v3, v8

    .line 163
    iget v8, v2, Li0/c;->d:F

    .line 164
    .line 165
    iget v2, v2, Li0/c;->b:F

    .line 166
    .line 167
    sub-float/2addr v8, v2

    .line 168
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    int-to-long v2, v2

    .line 173
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    int-to-long v10, v8

    .line 178
    const/16 v8, 0x20

    .line 179
    .line 180
    shl-long/2addr v2, v8

    .line 181
    const-wide v12, 0xffffffffL

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    and-long/2addr v10, v12

    .line 187
    or-long/2addr v2, v10

    .line 188
    const/high16 v8, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v10, 0x3

    .line 191
    move-wide/from16 v27, v6

    .line 192
    .line 193
    move-wide v6, v2

    .line 194
    move-wide v2, v4

    .line 195
    move-wide/from16 v4, v27

    .line 196
    .line 197
    invoke-virtual/range {v1 .. v10}, LB0/N;->R(JJJFLl0/c;I)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_3
    move-object v8, v1

    .line 203
    instance-of v1, v3, Lj0/z;

    .line 204
    .line 205
    if-eqz v1, :cond_5

    .line 206
    .line 207
    check-cast v3, Lj0/z;

    .line 208
    .line 209
    iget-object v1, v3, Lj0/z;->f:Lj0/g;

    .line 210
    .line 211
    if-eqz v1, :cond_4

    .line 212
    .line 213
    :goto_2
    invoke-virtual {v8, v1, v4, v5, v9}, LB0/N;->w(Lj0/A;JLl0/c;)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_3

    .line 217
    .line 218
    :cond_4
    iget-object v1, v3, Lj0/z;->e:Li0/d;

    .line 219
    .line 220
    iget-wide v12, v1, Li0/d;->h:J

    .line 221
    .line 222
    shr-long/2addr v12, v7

    .line 223
    long-to-int v3, v12

    .line 224
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    iget v6, v1, Li0/d;->a:F

    .line 229
    .line 230
    iget v12, v1, Li0/d;->b:F

    .line 231
    .line 232
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    int-to-long v13, v6

    .line 237
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 238
    .line 239
    .line 240
    move-result v6

    .line 241
    move-wide v15, v10

    .line 242
    int-to-long v10, v6

    .line 243
    shl-long v12, v13, v7

    .line 244
    .line 245
    and-long/2addr v10, v15

    .line 246
    or-long/2addr v10, v12

    .line 247
    invoke-virtual {v1}, Li0/d;->b()F

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    invoke-virtual {v1}, Li0/d;->a()F

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    int-to-long v12, v6

    .line 260
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    move v6, v7

    .line 265
    int-to-long v7, v1

    .line 266
    shl-long/2addr v12, v6

    .line 267
    and-long/2addr v7, v15

    .line 268
    or-long/2addr v7, v12

    .line 269
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    int-to-long v12, v1

    .line 274
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    move v3, v6

    .line 279
    move-wide/from16 v17, v7

    .line 280
    .line 281
    int-to-long v6, v1

    .line 282
    shl-long/2addr v12, v3

    .line 283
    and-long/2addr v6, v15

    .line 284
    or-long/2addr v6, v12

    .line 285
    iget-object v1, v2, Ll0/b;->q:Ll0/a;

    .line 286
    .line 287
    iget-object v8, v1, Ll0/a;->c:Lj0/m;

    .line 288
    .line 289
    shr-long v12, v10, v3

    .line 290
    .line 291
    long-to-int v1, v12

    .line 292
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 293
    .line 294
    .line 295
    move-result v20

    .line 296
    and-long/2addr v10, v15

    .line 297
    long-to-int v10, v10

    .line 298
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 299
    .line 300
    .line 301
    move-result v21

    .line 302
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    shr-long v11, v17, v3

    .line 307
    .line 308
    long-to-int v11, v11

    .line 309
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 310
    .line 311
    .line 312
    move-result v11

    .line 313
    add-float v22, v11, v1

    .line 314
    .line 315
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    and-long v10, v17, v15

    .line 320
    .line 321
    long-to-int v10, v10

    .line 322
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    add-float v23, v10, v1

    .line 327
    .line 328
    shr-long v10, v6, v3

    .line 329
    .line 330
    long-to-int v1, v10

    .line 331
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 332
    .line 333
    .line 334
    move-result v24

    .line 335
    and-long/2addr v6, v15

    .line 336
    long-to-int v1, v6

    .line 337
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 338
    .line 339
    .line 340
    move-result v25

    .line 341
    move-object v1, v2

    .line 342
    move-wide v2, v4

    .line 343
    const/high16 v5, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/4 v6, 0x3

    .line 346
    move-object v4, v9

    .line 347
    invoke-static/range {v1 .. v6}, Ll0/b;->a(Ll0/b;JLl0/c;FI)LW1/d;

    .line 348
    .line 349
    .line 350
    move-result-object v26

    .line 351
    move-object/from16 v19, v8

    .line 352
    .line 353
    invoke-interface/range {v19 .. v26}, Lj0/m;->e(FFFFFFLW1/d;)V

    .line 354
    .line 355
    .line 356
    move-object/from16 v8, p1

    .line 357
    .line 358
    goto :goto_3

    .line 359
    :cond_5
    instance-of v1, v3, Lj0/x;

    .line 360
    .line 361
    if-eqz v1, :cond_6

    .line 362
    .line 363
    check-cast v3, Lj0/x;

    .line 364
    .line 365
    iget-object v1, v3, Lj0/x;->e:Lj0/A;

    .line 366
    .line 367
    move-object/from16 v8, p1

    .line 368
    .line 369
    goto/16 :goto_2

    .line 370
    .line 371
    :cond_6
    new-instance v1, LC2/e;

    .line 372
    .line 373
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 374
    .line 375
    .line 376
    throw v1

    .line 377
    :goto_3
    invoke-virtual {v8}, LB0/N;->a()V

    .line 378
    .line 379
    .line 380
    return-void
.end method
