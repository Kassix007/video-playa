.class public final Lf6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld6/o;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a(Li6/f;)Ld6/u;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Li6/f;->e:Ld6/s;

    .line 7
    .line 8
    const-string v2, "request"

    .line 9
    .line 10
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, LZ/m;

    .line 14
    .line 15
    const/16 v3, 0xa

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct {v2, v3, v1, v4}, LZ/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ld6/s;->a()Ld6/c;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-boolean v3, v3, Ld6/c;->j:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    new-instance v2, LZ/m;

    .line 30
    .line 31
    const/16 v3, 0xa

    .line 32
    .line 33
    invoke-direct {v2, v3, v4, v4}, LZ/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v3, v2, LZ/m;->r:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Ld6/s;

    .line 39
    .line 40
    iget-object v2, v2, LZ/m;->s:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Ld6/u;

    .line 43
    .line 44
    const/16 v5, 0x14

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    if-nez v3, :cond_1

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    sget-object v7, Le6/b;->c:Ld6/v;

    .line 57
    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v13

    .line 62
    new-instance v2, Ld6/l;

    .line 63
    .line 64
    new-array v3, v6, [Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, [Ljava/lang/String;

    .line 71
    .line 72
    invoke-direct {v2, v0}, Ld6/l;-><init>([Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Ld6/u;

    .line 76
    .line 77
    move-object v6, v2

    .line 78
    sget-object v2, Ld6/r;->s:Ld6/r;

    .line 79
    .line 80
    const-string v3, "Unsatisfiable Request (only-if-cached)"

    .line 81
    .line 82
    const/16 v4, 0x1f8

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    const/4 v10, 0x0

    .line 88
    const-wide/16 v11, -0x1

    .line 89
    .line 90
    const/4 v15, 0x0

    .line 91
    invoke-direct/range {v0 .. v15}, Ld6/u;-><init>(Ld6/s;Ld6/r;Ljava/lang/String;ILd6/k;Ld6/l;Ld6/w;Ld6/u;Ld6/u;Ld6/u;JJLL/s;)V

    .line 92
    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_1
    const-string v1, "cacheResponse"

    .line 96
    .line 97
    if-nez v3, :cond_2

    .line 98
    .line 99
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ld6/u;->b()Ld6/t;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v2}, Lf6/a;->a(Ld6/u;)Ld6/u;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-static {v2, v1}, Ld6/t;->b(Ld6/u;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iput-object v2, v0, Ld6/t;->i:Ld6/u;

    .line 114
    .line 115
    invoke-virtual {v0}, Ld6/t;->a()Ld6/u;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    return-object v0

    .line 120
    :cond_2
    invoke-virtual {v0, v3}, Li6/f;->b(Ld6/s;)Ld6/u;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const-string v3, "networkResponse"

    .line 125
    .line 126
    if-eqz v2, :cond_d

    .line 127
    .line 128
    iget v7, v0, Ld6/u;->t:I

    .line 129
    .line 130
    const/16 v8, 0x130

    .line 131
    .line 132
    if-ne v7, v8, :cond_c

    .line 133
    .line 134
    invoke-virtual {v2}, Ld6/u;->b()Ld6/t;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    iget-object v8, v2, Ld6/u;->v:Ld6/l;

    .line 139
    .line 140
    iget-object v9, v0, Ld6/u;->v:Ld6/l;

    .line 141
    .line 142
    new-instance v10, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v10, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v8}, Ld6/l;->size()I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    move v11, v6

    .line 152
    :goto_0
    const-string v12, "value"

    .line 153
    .line 154
    const-string v13, "name"

    .line 155
    .line 156
    const-string v14, "Content-Type"

    .line 157
    .line 158
    const-string v15, "Content-Encoding"

    .line 159
    .line 160
    move-object/from16 v16, v4

    .line 161
    .line 162
    const-string v4, "Content-Length"

    .line 163
    .line 164
    if-ge v11, v5, :cond_8

    .line 165
    .line 166
    invoke-virtual {v8, v11}, Ld6/l;->g(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    move/from16 p1, v5

    .line 171
    .line 172
    invoke-virtual {v8, v11}, Ld6/l;->i(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    move-object/from16 v17, v8

    .line 177
    .line 178
    const-string v8, "Warning"

    .line 179
    .line 180
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    if-eqz v8, :cond_3

    .line 185
    .line 186
    const-string v8, "1"

    .line 187
    .line 188
    move/from16 v18, v11

    .line 189
    .line 190
    const/4 v11, 0x0

    .line 191
    invoke-static {v5, v8, v11}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-eqz v8, :cond_4

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_3
    move/from16 v18, v11

    .line 199
    .line 200
    :cond_4
    invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-nez v4, :cond_6

    .line 205
    .line 206
    invoke-virtual {v15, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-nez v4, :cond_6

    .line 211
    .line 212
    invoke-virtual {v14, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_5

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_5
    invoke-static {v6}, Lf6/a;->b(Ljava/lang/String;)Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-eqz v4, :cond_6

    .line 224
    .line 225
    invoke-virtual {v9, v6}, Ld6/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    if-nez v4, :cond_7

    .line 230
    .line 231
    :cond_6
    :goto_1
    invoke-static {v6, v13}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-static {v5, v12}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    invoke-static {v5}, LJ5/m;->n1(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    :cond_7
    :goto_2
    add-int/lit8 v11, v18, 0x1

    .line 252
    .line 253
    move/from16 v5, p1

    .line 254
    .line 255
    move-object/from16 v4, v16

    .line 256
    .line 257
    move-object/from16 v8, v17

    .line 258
    .line 259
    const/4 v6, 0x0

    .line 260
    goto :goto_0

    .line 261
    :cond_8
    invoke-virtual {v9}, Ld6/l;->size()I

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    const/4 v11, 0x0

    .line 266
    :goto_3
    if-ge v11, v5, :cond_b

    .line 267
    .line 268
    invoke-virtual {v9, v11}, Ld6/l;->g(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    if-nez v8, :cond_a

    .line 277
    .line 278
    invoke-virtual {v15, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    if-nez v8, :cond_a

    .line 283
    .line 284
    invoke-virtual {v14, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result v8

    .line 288
    if-eqz v8, :cond_9

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_9
    invoke-static {v6}, Lf6/a;->b(Ljava/lang/String;)Z

    .line 292
    .line 293
    .line 294
    move-result v8

    .line 295
    if-eqz v8, :cond_a

    .line 296
    .line 297
    invoke-virtual {v9, v11}, Ld6/l;->i(I)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v8

    .line 301
    invoke-static {v6, v13}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-static {v8, v12}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    invoke-static {v8}, LJ5/m;->n1(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    :cond_a
    :goto_4
    add-int/lit8 v11, v11, 0x1

    .line 322
    .line 323
    goto :goto_3

    .line 324
    :cond_b
    new-instance v4, Ld6/l;

    .line 325
    .line 326
    const/4 v11, 0x0

    .line 327
    new-array v5, v11, [Ljava/lang/String;

    .line 328
    .line 329
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    check-cast v5, [Ljava/lang/String;

    .line 334
    .line 335
    invoke-direct {v4, v5}, Ld6/l;-><init>([Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v4}, Ld6/l;->h()Lc3/c;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    iput-object v4, v7, Ld6/t;->f:Lc3/c;

    .line 343
    .line 344
    iget-wide v4, v0, Ld6/u;->A:J

    .line 345
    .line 346
    iput-wide v4, v7, Ld6/t;->k:J

    .line 347
    .line 348
    iget-wide v4, v0, Ld6/u;->B:J

    .line 349
    .line 350
    iput-wide v4, v7, Ld6/t;->l:J

    .line 351
    .line 352
    invoke-static {v2}, Lf6/a;->a(Ld6/u;)Ld6/u;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-static {v2, v1}, Ld6/t;->b(Ld6/u;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    iput-object v2, v7, Ld6/t;->i:Ld6/u;

    .line 360
    .line 361
    invoke-static {v0}, Lf6/a;->a(Ld6/u;)Ld6/u;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-static {v1, v3}, Ld6/t;->b(Ld6/u;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    iput-object v1, v7, Ld6/t;->h:Ld6/u;

    .line 369
    .line 370
    invoke-virtual {v7}, Ld6/t;->a()Ld6/u;

    .line 371
    .line 372
    .line 373
    iget-object v0, v0, Ld6/u;->w:Ld6/w;

    .line 374
    .line 375
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, Ld6/w;->close()V

    .line 379
    .line 380
    .line 381
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    throw v16

    .line 385
    :cond_c
    iget-object v4, v2, Ld6/u;->w:Ld6/w;

    .line 386
    .line 387
    if-eqz v4, :cond_d

    .line 388
    .line 389
    invoke-static {v4}, Le6/b;->b(Ljava/io/Closeable;)V

    .line 390
    .line 391
    .line 392
    :cond_d
    invoke-virtual {v0}, Ld6/u;->b()Ld6/t;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    invoke-static {v2}, Lf6/a;->a(Ld6/u;)Ld6/u;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-static {v2, v1}, Ld6/t;->b(Ld6/u;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    iput-object v2, v4, Ld6/t;->i:Ld6/u;

    .line 404
    .line 405
    invoke-static {v0}, Lf6/a;->a(Ld6/u;)Ld6/u;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0, v3}, Ld6/t;->b(Ld6/u;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    iput-object v0, v4, Ld6/t;->h:Ld6/u;

    .line 413
    .line 414
    invoke-virtual {v4}, Ld6/t;->a()Ld6/u;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    return-object v0
.end method
