.class public final synthetic Lf5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/O1;

.field public final synthetic r:LR4/k1;

.field public final synthetic s:LF/e;

.field public final synthetic t:LM5/w;

.field public final synthetic u:LB5/c;

.field public final synthetic v:LP/W;

.field public final synthetic w:LP/c0;

.field public final synthetic x:LP/W;


# direct methods
.method public synthetic constructor <init>(LR4/O1;LR4/k1;LF/e;LM5/w;LB5/c;LP/W;LP/c0;LP/W;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/g;->q:LR4/O1;

    iput-object p2, p0, Lf5/g;->r:LR4/k1;

    iput-object p3, p0, Lf5/g;->s:LF/e;

    iput-object p4, p0, Lf5/g;->t:LM5/w;

    iput-object p5, p0, Lf5/g;->u:LB5/c;

    iput-object p6, p0, Lf5/g;->v:LP/W;

    iput-object p7, p0, Lf5/g;->w:LP/c0;

    iput-object p8, p0, Lf5/g;->x:LP/W;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lf5/g;->q:LR4/O1;

    .line 4
    .line 5
    iget-object v3, v1, LR4/O1;->b:Ljava/lang/String;

    .line 6
    .line 7
    move-object/from16 v15, p1

    .line 8
    .line 9
    check-cast v15, LP/o;

    .line 10
    .line 11
    move-object/from16 v1, p2

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    and-int/lit8 v2, v1, 0x3

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    const/4 v8, 0x1

    .line 23
    const/4 v9, 0x0

    .line 24
    if-eq v2, v4, :cond_0

    .line 25
    .line 26
    move v2, v8

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v2, v9

    .line 29
    :goto_0
    and-int/2addr v1, v8

    .line 30
    invoke-virtual {v15, v1, v2}, LP/o;->K(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_f

    .line 35
    .line 36
    sget-object v1, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    const-string v2, "#FFFFFF"

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v2, v3

    .line 44
    :goto_1
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-static {v2}, Lj0/B;->b(I)J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    sget-object v2, Lj0/B;->a:LO3/D;

    .line 53
    .line 54
    invoke-static {v1, v4, v5, v2}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2, v8}, LU4/a;->A(Lc0/m;Z)Lc0/m;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    sget-object v4, LA/i;->e:LA/c;

    .line 63
    .line 64
    sget-object v5, Lc0/b;->C:Lc0/c;

    .line 65
    .line 66
    const/16 v6, 0x36

    .line 67
    .line 68
    invoke-static {v4, v5, v15, v6}, LA/r;->a(LA/g;Lc0/c;LP/o;I)LA/t;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget v5, v15, LP/o;->P:I

    .line 73
    .line 74
    invoke-virtual {v15}, LP/o;->m()LP/i0;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-static {v15, v2}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    sget-object v7, LB0/k;->a:LB0/j;

    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    sget-object v7, LB0/j;->b:LB0/D;

    .line 88
    .line 89
    invoke-virtual {v15}, LP/o;->W()V

    .line 90
    .line 91
    .line 92
    iget-boolean v10, v15, LP/o;->O:Z

    .line 93
    .line 94
    if-eqz v10, :cond_2

    .line 95
    .line 96
    invoke-virtual {v15, v7}, LP/o;->l(LB5/a;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    invoke-virtual {v15}, LP/o;->g0()V

    .line 101
    .line 102
    .line 103
    :goto_2
    sget-object v7, LB0/j;->e:LB0/i;

    .line 104
    .line 105
    invoke-static {v7, v15, v4}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v4, LB0/j;->d:LB0/i;

    .line 109
    .line 110
    invoke-static {v4, v15, v6}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object v4, LB0/j;->f:LB0/i;

    .line 114
    .line 115
    iget-boolean v6, v15, LP/o;->O:Z

    .line 116
    .line 117
    if-nez v6, :cond_3

    .line 118
    .line 119
    invoke-virtual {v15}, LP/o;->H()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    invoke-static {v6, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-nez v6, :cond_4

    .line 132
    .line 133
    :cond_3
    invoke-static {v5, v15, v5, v4}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 134
    .line 135
    .line 136
    :cond_4
    sget-object v4, LB0/j;->c:LB0/i;

    .line 137
    .line 138
    invoke-static {v4, v15, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    const/4 v6, 0x0

    .line 145
    const/4 v7, 0x5

    .line 146
    const/4 v2, 0x0

    .line 147
    const/4 v4, 0x0

    .line 148
    move-object v5, v15

    .line 149
    invoke-static/range {v2 .. v7}, LU4/a;->t(ILjava/lang/String;ZLP/o;II)V

    .line 150
    .line 151
    .line 152
    invoke-static {v1}, LA/u;->a(Lc0/m;)Lc0/m;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    new-instance v1, Lf5/h;

    .line 157
    .line 158
    iget-object v2, v0, Lf5/g;->r:LR4/k1;

    .line 159
    .line 160
    iget-object v3, v0, Lf5/g;->u:LB5/c;

    .line 161
    .line 162
    iget-object v4, v0, Lf5/g;->v:LP/W;

    .line 163
    .line 164
    invoke-direct {v1, v2, v3, v4}, Lf5/h;-><init>(LR4/k1;LB5/c;LP/W;)V

    .line 165
    .line 166
    .line 167
    const v6, -0x6f229729

    .line 168
    .line 169
    .line 170
    invoke-static {v6, v1, v15}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    .line 171
    .line 172
    .line 173
    move-result-object v14

    .line 174
    const/16 v16, 0xc00

    .line 175
    .line 176
    move-object v1, v4

    .line 177
    iget-object v4, v0, Lf5/g;->s:LF/e;

    .line 178
    .line 179
    const/4 v6, 0x0

    .line 180
    const/4 v7, 0x0

    .line 181
    move v10, v8

    .line 182
    const/4 v8, 0x0

    .line 183
    move v11, v9

    .line 184
    const/4 v9, 0x0

    .line 185
    move v12, v10

    .line 186
    const/4 v10, 0x0

    .line 187
    move v13, v11

    .line 188
    const/4 v11, 0x0

    .line 189
    move/from16 v17, v12

    .line 190
    .line 191
    const/4 v12, 0x0

    .line 192
    move/from16 v18, v13

    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    move-object/from16 p1, v1

    .line 196
    .line 197
    move/from16 v1, v18

    .line 198
    .line 199
    invoke-static/range {v4 .. v16}, LE3/h;->c(LF/e;Lc0/m;LA/L;FLc0/d;Lx/h;ZLu0/a;Lx/m;Lv/l;LX/e;LP/o;I)V

    .line 200
    .line 201
    .line 202
    invoke-interface/range {p1 .. p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    check-cast v5, LR4/O1;

    .line 207
    .line 208
    iget-object v5, v5, LR4/O1;->c:LR4/U1;

    .line 209
    .line 210
    sget-object v12, LP/k;->a:LP/S;

    .line 211
    .line 212
    if-eqz v5, :cond_b

    .line 213
    .line 214
    const v5, -0x64c3ea9c

    .line 215
    .line 216
    .line 217
    invoke-virtual {v15, v5}, LP/o;->S(I)V

    .line 218
    .line 219
    .line 220
    iget-object v5, v0, Lf5/g;->w:LP/c0;

    .line 221
    .line 222
    invoke-virtual {v5}, LP/c0;->e()I

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    invoke-interface/range {p1 .. p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    check-cast v6, LR4/O1;

    .line 231
    .line 232
    iget-object v6, v6, LR4/O1;->c:LR4/U1;

    .line 233
    .line 234
    const/4 v7, 0x0

    .line 235
    if-eqz v6, :cond_5

    .line 236
    .line 237
    iget-object v6, v6, LR4/U1;->a:Ljava/lang/String;

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_5
    move-object v6, v7

    .line 241
    :goto_3
    invoke-interface/range {p1 .. p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    check-cast v8, LR4/O1;

    .line 246
    .line 247
    iget-object v8, v8, LR4/O1;->c:LR4/U1;

    .line 248
    .line 249
    if-eqz v8, :cond_6

    .line 250
    .line 251
    iget-object v7, v8, LR4/U1;->b:Ljava/lang/String;

    .line 252
    .line 253
    :cond_6
    invoke-interface/range {p1 .. p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    check-cast v8, LR4/O1;

    .line 258
    .line 259
    iget-object v8, v8, LR4/O1;->c:LR4/U1;

    .line 260
    .line 261
    if-eqz v8, :cond_7

    .line 262
    .line 263
    iget-object v8, v8, LR4/U1;->d:Ljava/lang/String;

    .line 264
    .line 265
    if-nez v8, :cond_8

    .line 266
    .line 267
    :cond_7
    const-string v8, "circle"

    .line 268
    .line 269
    :cond_8
    iget-object v9, v0, Lf5/g;->t:LM5/w;

    .line 270
    .line 271
    invoke-virtual {v15, v9}, LP/o;->i(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    invoke-virtual {v15, v4}, LP/o;->g(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v11

    .line 279
    or-int/2addr v10, v11

    .line 280
    invoke-virtual {v15}, LP/o;->H()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    if-nez v10, :cond_9

    .line 285
    .line 286
    if-ne v11, v12, :cond_a

    .line 287
    .line 288
    :cond_9
    new-instance v11, LN5/d;

    .line 289
    .line 290
    const/16 v10, 0xb

    .line 291
    .line 292
    invoke-direct {v11, v10, v9, v4}, LN5/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v15, v11}, LP/o;->d0(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    :cond_a
    move-object v9, v11

    .line 299
    check-cast v9, LB5/c;

    .line 300
    .line 301
    const/4 v11, 0x0

    .line 302
    move v10, v5

    .line 303
    move-object v5, v4

    .line 304
    move v4, v10

    .line 305
    move-object v10, v15

    .line 306
    invoke-static/range {v4 .. v11}, LE3/h;->g(ILF/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LB5/c;LP/o;I)V

    .line 307
    .line 308
    .line 309
    :goto_4
    invoke-virtual {v15, v1}, LP/o;->p(Z)V

    .line 310
    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_b
    const v4, -0x652d2694

    .line 314
    .line 315
    .line 316
    invoke-virtual {v15, v4}, LP/o;->S(I)V

    .line 317
    .line 318
    .line 319
    goto :goto_4

    .line 320
    :goto_5
    invoke-interface/range {p1 .. p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    check-cast v4, LR4/O1;

    .line 325
    .line 326
    iget-object v4, v4, LR4/O1;->a:Ljava/util/List;

    .line 327
    .line 328
    if-nez v4, :cond_c

    .line 329
    .line 330
    const v3, -0x64ba653d

    .line 331
    .line 332
    .line 333
    invoke-virtual {v15, v3}, LP/o;->S(I)V

    .line 334
    .line 335
    .line 336
    :goto_6
    invoke-virtual {v15, v1}, LP/o;->p(Z)V

    .line 337
    .line 338
    .line 339
    const/4 v10, 0x1

    .line 340
    goto :goto_7

    .line 341
    :cond_c
    const v5, -0x64ba653c

    .line 342
    .line 343
    .line 344
    invoke-virtual {v15, v5}, LP/o;->S(I)V

    .line 345
    .line 346
    .line 347
    invoke-static {v4, v3, v15, v1}, LE3/h;->a(Ljava/util/List;LB5/c;LP/o;I)V

    .line 348
    .line 349
    .line 350
    goto :goto_6

    .line 351
    :goto_7
    invoke-virtual {v15, v10}, LP/o;->p(Z)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v15, v2}, LP/o;->i(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    invoke-virtual {v15}, LP/o;->H()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    if-nez v3, :cond_d

    .line 363
    .line 364
    if-ne v4, v12, :cond_e

    .line 365
    .line 366
    :cond_d
    new-instance v4, LU4/n;

    .line 367
    .line 368
    const/4 v3, 0x5

    .line 369
    iget-object v5, v0, Lf5/g;->x:LP/W;

    .line 370
    .line 371
    invoke-direct {v4, v2, v5, v3}, LU4/n;-><init>(LR4/k1;LP/W;I)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v15, v4}, LP/o;->d0(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    :cond_e
    check-cast v4, LB5/a;

    .line 378
    .line 379
    invoke-static {v1, v4, v15, v1}, Ll6/d;->d(ZLB5/a;LP/o;I)V

    .line 380
    .line 381
    .line 382
    goto :goto_8

    .line 383
    :cond_f
    invoke-virtual {v15}, LP/o;->N()V

    .line 384
    .line 385
    .line 386
    :goto_8
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 387
    .line 388
    return-object v1
.end method
