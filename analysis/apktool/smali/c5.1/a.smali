.class public final synthetic Lc5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:LR4/k1;

.field public final synthetic s:LR4/Y0;

.field public final synthetic t:LB5/c;

.field public final synthetic u:LP/W;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;LR4/k1;LR4/Y0;LB5/c;LP/W;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/a;->q:Ljava/lang/String;

    iput-object p2, p0, Lc5/a;->r:LR4/k1;

    iput-object p3, p0, Lc5/a;->s:LR4/Y0;

    iput-object p4, p0, Lc5/a;->t:LB5/c;

    iput-object p5, p0, Lc5/a;->u:LP/W;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    check-cast v4, LP/o;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v7, 0x1

    .line 19
    const/4 v8, 0x0

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v7

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v8

    .line 25
    :goto_0
    and-int/2addr v1, v7

    .line 26
    invoke-virtual {v4, v1, v2}, LP/o;->K(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_f

    .line 31
    .line 32
    sget-object v9, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 33
    .line 34
    iget-object v2, v0, Lc5/a;->q:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v1}, Lj0/B;->b(I)J

    .line 41
    .line 42
    .line 43
    move-result-wide v5

    .line 44
    sget-object v1, Lj0/B;->a:LO3/D;

    .line 45
    .line 46
    invoke-static {v9, v5, v6, v1}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v3, "<this>"

    .line 51
    .line 52
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sget-object v3, LA/i;->e:LA/c;

    .line 56
    .line 57
    sget-object v5, Lc0/b;->C:Lc0/c;

    .line 58
    .line 59
    const/16 v6, 0x36

    .line 60
    .line 61
    invoke-static {v3, v5, v4, v6}, LA/r;->a(LA/g;Lc0/c;LP/o;I)LA/t;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    iget v5, v4, LP/o;->P:I

    .line 66
    .line 67
    invoke-virtual {v4}, LP/o;->m()LP/i0;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-static {v4, v1}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    sget-object v10, LB0/k;->a:LB0/j;

    .line 76
    .line 77
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    sget-object v10, LB0/j;->b:LB0/D;

    .line 81
    .line 82
    invoke-virtual {v4}, LP/o;->W()V

    .line 83
    .line 84
    .line 85
    iget-boolean v11, v4, LP/o;->O:Z

    .line 86
    .line 87
    if-eqz v11, :cond_1

    .line 88
    .line 89
    invoke-virtual {v4, v10}, LP/o;->l(LB5/a;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    invoke-virtual {v4}, LP/o;->g0()V

    .line 94
    .line 95
    .line 96
    :goto_1
    sget-object v11, LB0/j;->e:LB0/i;

    .line 97
    .line 98
    invoke-static {v11, v4, v3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    sget-object v12, LB0/j;->d:LB0/i;

    .line 102
    .line 103
    invoke-static {v12, v4, v6}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    sget-object v13, LB0/j;->f:LB0/i;

    .line 107
    .line 108
    iget-boolean v3, v4, LP/o;->O:Z

    .line 109
    .line 110
    if-nez v3, :cond_2

    .line 111
    .line 112
    invoke-virtual {v4}, LP/o;->H()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-static {v3, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_3

    .line 125
    .line 126
    :cond_2
    invoke-static {v5, v4, v5, v13}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    sget-object v14, LB0/j;->c:LB0/i;

    .line 130
    .line 131
    invoke-static {v14, v4, v1}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    const/4 v6, 0x5

    .line 136
    const/4 v1, 0x0

    .line 137
    const/4 v3, 0x0

    .line 138
    invoke-static/range {v1 .. v6}, LU4/a;->t(ILjava/lang/String;ZLP/o;II)V

    .line 139
    .line 140
    .line 141
    invoke-static {v9}, LA/u;->a(Lc0/m;)Lc0/m;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    sget-object v2, LA/i;->c:LA/b;

    .line 146
    .line 147
    sget-object v3, Lc0/b;->B:Lc0/c;

    .line 148
    .line 149
    invoke-static {v2, v3, v4, v8}, LA/r;->a(LA/g;Lc0/c;LP/o;I)LA/t;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget v3, v4, LP/o;->P:I

    .line 154
    .line 155
    invoke-virtual {v4}, LP/o;->m()LP/i0;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-static {v4, v1}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v4}, LP/o;->W()V

    .line 164
    .line 165
    .line 166
    iget-boolean v6, v4, LP/o;->O:Z

    .line 167
    .line 168
    if-eqz v6, :cond_4

    .line 169
    .line 170
    invoke-virtual {v4, v10}, LP/o;->l(LB5/a;)V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_4
    invoke-virtual {v4}, LP/o;->g0()V

    .line 175
    .line 176
    .line 177
    :goto_2
    invoke-static {v11, v4, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v12, v4, v5}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iget-boolean v2, v4, LP/o;->O:Z

    .line 184
    .line 185
    if-nez v2, :cond_5

    .line 186
    .line 187
    invoke-virtual {v4}, LP/o;->H()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-static {v2, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-nez v2, :cond_6

    .line 200
    .line 201
    :cond_5
    invoke-static {v3, v4, v3, v13}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 202
    .line 203
    .line 204
    :cond_6
    invoke-static {v14, v4, v1}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    iget-object v1, v0, Lc5/a;->s:LR4/Y0;

    .line 208
    .line 209
    iget-object v2, v1, LR4/Y0;->e:Ljava/util/List;

    .line 210
    .line 211
    if-eqz v2, :cond_7

    .line 212
    .line 213
    invoke-static {v2}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, LR4/V0;

    .line 218
    .line 219
    if-eqz v2, :cond_7

    .line 220
    .line 221
    iget-object v2, v2, LR4/V0;->a:Ljava/util/List;

    .line 222
    .line 223
    if-eqz v2, :cond_7

    .line 224
    .line 225
    check-cast v2, Ljava/lang/Iterable;

    .line 226
    .line 227
    check-cast v2, Ljava/util/List;

    .line 228
    .line 229
    invoke-static {v2}, Ln5/l;->j0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    goto :goto_3

    .line 234
    :cond_7
    sget-object v2, Ln5/s;->q:Ln5/s;

    .line 235
    .line 236
    :goto_3
    iget-object v3, v1, LR4/Y0;->e:Ljava/util/List;

    .line 237
    .line 238
    if-eqz v3, :cond_8

    .line 239
    .line 240
    invoke-static {v3}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    check-cast v3, LR4/V0;

    .line 245
    .line 246
    if-eqz v3, :cond_8

    .line 247
    .line 248
    iget-object v3, v3, LR4/V0;->b:Ljava/lang/Integer;

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_8
    const/4 v3, 0x0

    .line 252
    :goto_4
    invoke-static {v2, v3, v4, v8}, LU4/a;->o(Ljava/util/List;Ljava/lang/Integer;LP/o;I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4, v7}, LP/o;->p(Z)V

    .line 256
    .line 257
    .line 258
    const/16 v2, 0x14

    .line 259
    .line 260
    int-to-float v2, v2

    .line 261
    const/16 v20, 0x7

    .line 262
    .line 263
    sget-object v15, Lc0/j;->q:Lc0/j;

    .line 264
    .line 265
    const/16 v16, 0x0

    .line 266
    .line 267
    const/16 v17, 0x0

    .line 268
    .line 269
    const/16 v18, 0x0

    .line 270
    .line 271
    move/from16 v19, v2

    .line 272
    .line 273
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/b;->d(Lc0/m;FFFFI)Lc0/m;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    sget-object v3, Lc0/b;->q:Lc0/e;

    .line 278
    .line 279
    invoke-static {v3, v8}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    iget v5, v4, LP/o;->P:I

    .line 284
    .line 285
    invoke-virtual {v4}, LP/o;->m()LP/i0;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    invoke-static {v4, v2}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-virtual {v4}, LP/o;->W()V

    .line 294
    .line 295
    .line 296
    iget-boolean v9, v4, LP/o;->O:Z

    .line 297
    .line 298
    if-eqz v9, :cond_9

    .line 299
    .line 300
    invoke-virtual {v4, v10}, LP/o;->l(LB5/a;)V

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_9
    invoke-virtual {v4}, LP/o;->g0()V

    .line 305
    .line 306
    .line 307
    :goto_5
    invoke-static {v11, v4, v3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v12, v4, v6}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    iget-boolean v3, v4, LP/o;->O:Z

    .line 314
    .line 315
    if-nez v3, :cond_a

    .line 316
    .line 317
    invoke-virtual {v4}, LP/o;->H()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    invoke-static {v3, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-nez v3, :cond_b

    .line 330
    .line 331
    :cond_a
    invoke-static {v5, v4, v5, v13}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 332
    .line 333
    .line 334
    :cond_b
    invoke-static {v14, v4, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    iget-object v1, v1, LR4/Y0;->f:Ljava/util/List;

    .line 338
    .line 339
    if-nez v1, :cond_c

    .line 340
    .line 341
    const v1, -0x1b31fef0

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4, v1}, LP/o;->S(I)V

    .line 345
    .line 346
    .line 347
    :goto_6
    invoke-virtual {v4, v8}, LP/o;->p(Z)V

    .line 348
    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_c
    const v2, -0x1b31feef

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4, v2}, LP/o;->S(I)V

    .line 355
    .line 356
    .line 357
    iget-object v2, v0, Lc5/a;->t:LB5/c;

    .line 358
    .line 359
    invoke-static {v1, v2, v4, v8}, LE3/h;->a(Ljava/util/List;LB5/c;LP/o;I)V

    .line 360
    .line 361
    .line 362
    goto :goto_6

    .line 363
    :goto_7
    invoke-virtual {v4, v7}, LP/o;->p(Z)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v4, v7}, LP/o;->p(Z)V

    .line 367
    .line 368
    .line 369
    iget-object v1, v0, Lc5/a;->r:LR4/k1;

    .line 370
    .line 371
    invoke-virtual {v4, v1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    invoke-virtual {v4}, LP/o;->H()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    if-nez v2, :cond_d

    .line 380
    .line 381
    sget-object v2, LP/k;->a:LP/S;

    .line 382
    .line 383
    if-ne v3, v2, :cond_e

    .line 384
    .line 385
    :cond_d
    new-instance v3, LU4/n;

    .line 386
    .line 387
    const/4 v2, 0x4

    .line 388
    iget-object v5, v0, Lc5/a;->u:LP/W;

    .line 389
    .line 390
    invoke-direct {v3, v1, v5, v2}, LU4/n;-><init>(LR4/k1;LP/W;I)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v4, v3}, LP/o;->d0(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    :cond_e
    check-cast v3, LB5/a;

    .line 397
    .line 398
    invoke-static {v8, v3, v4, v8}, Ll6/d;->d(ZLB5/a;LP/o;I)V

    .line 399
    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_f
    invoke-virtual {v4}, LP/o;->N()V

    .line 403
    .line 404
    .line 405
    :goto_8
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 406
    .line 407
    return-object v1
.end method
